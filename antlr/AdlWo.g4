parser grammar AdlWo;
tokens {
    DNAC, Name, Exnotation
}
options {  tokenVocab = AdlP; }

adl
    : DOWN tok=ADL DOWN module UP UP EOF
;
json
    : DOWN jsonVal UP EOF
;
module
    : tok=Module (DOWN annotation* import_* tld* UP)?
;
import_
    : ImportModule                     #ImportModule
    | ImportScopedName                 #ImportScopedModule
;
tld
    : tok=Struct  (DOWN annotation* TypeParam? nameBody* UP)?             #Struct
    | tok=Union   (DOWN annotation* TypeParam? nameBody* UP)?             #Union
    | tok=Type    (DOWN annotation* TypeParam? typeExpr_? jsonVal* UP)?   #Type
    | tok=Newtype (DOWN annotation* TypeParam? typeExpr_? jsonVal* UP)?   #Newtype
    | tok=ModuleAnno DOWN jsonVal UP                                      #ModAnno
    | tok=DeclAnno   DOWN jsonVal UP                                      #DeclAnno
    | tok=FieldAnno  DOWN jsonVal UP                                      #FieldAnno
;
nameBody
    : tok=Field (DOWN annotation* typeExpr_? jsonVal? UP)?               #Field
;
annotation
    : tok=Annotation (DOWN jsonVal UP)?
    | tok=AnnotationNotScoped (DOWN jsonVal UP)?
    | tok=AnnotationScoped (DOWN jsonVal UP)?
;
typeExpr_
    : tok=TypeExprSimple
    | tok=TypeExprGeneric (DOWN typeExpr_+ UP)
;
jsonVal
    : tok=JsonStr                                          #JsonStr
    | tok=JsonBool                                         #JsonBool
    | tok=JsonNull                                         #JsonNull
    | tok=JsonInt                                          #JsonInt
    | tok=JsonFloat                                        #JsonFloat
    | tok=JsonArray (DOWN jsonVal+ UP)?                    #JsonArray
    | tok=JsonObj (DOWN (JsonObjKey jsonVal)+ UP)?                      #JsonObj
;