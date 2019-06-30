parser grammar AdlWi;
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
    | ERROR (DOWN .+? UP)? 
;
import_
    : ImportModule                     #ImportModule
    | ImportScopedName                 #ImportScopedModule
    | ERROR                            #ImportError
;
tld
    : tok=Struct  (DOWN annotation* TypeParam? nameBody* UP)?             #Struct
    | tok=Union   (DOWN annotation* TypeParam? nameBody* UP)?             #Union
    | tok=Type    (DOWN annotation* TypeParam? typeExpr_? jsonVal* UP)?   #Type
    | tok=Newtype (DOWN annotation* TypeParam? typeExpr_? jsonVal* UP)?   #Newtype
    | tok=ModuleAnno DOWN jsonVal UP                                      #ModAnno
    | tok=DeclAnno   DOWN jsonVal UP                                      #DeclAnno
    | tok=FieldAnno  DOWN jsonVal UP                                      #FieldAnno
    | (tok=Struct|tok=Union) DOWN annotation* ERROR nameBody* UP              #TypeParamError
    | (tok=Type|tok=Newtype) DOWN annotation* ERROR typeExpr_? jsonVal* UP?   #TypeParamError
    | ERROR (DOWN .+? UP)?                                                    #TLDError
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
    : tok=TypeExprPrimOrParam
    | tok=TypeExprTypeExpr (DOWN typeExprElem_+ UP)
;
typeExprElem_
    : tok=TypeExprElem (DOWN typeExprElem_+ UP)?                         #TypeParams
;
jsonVal
    : tok=JsonStr                                          #JsonStr
    | tok=JsonBool                                         #JsonBool
    | tok=JsonNull                                         #JsonNull
    | tok=JsonInt                                          #JsonInt
    | tok=JsonFloat                                        #JsonFloat
    | tok=JsonArray (DOWN jsonVal+ UP)?                    #JsonArray
    | tok=JsonObj (DOWN jsonVal+ UP)?                      #JsonObj
    | ERROR                                                #JsonError

;