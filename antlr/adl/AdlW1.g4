parser grammar AdlW1;
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
    : tok=Module (DOWN annotation* Import* tld* UP)?
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
;
nameBody
    : tok=Field (DOWN annotation* typeExpr_? jsonVal? UP)?               #Field
;
annotation
    : tok=Annotation (DOWN jsonVal UP)?
;
typeExpr_
    : tok=TypeExpr (DOWN typeExprElem_+ UP)?
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
;