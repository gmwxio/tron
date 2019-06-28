parser grammar TronWi;
tokens {
    Default
}
options {  tokenVocab = AdlWi; }

adl
    : DOWN ADL DOWN name UP UP EOF
;
name
    : Name  (DOWN annotation* TypeParam? tld* UP)?                  #NameNode
;
tld
    : name                                                          #NameRule
    | Type  (DOWN annotation* TypeParam? typeExpr_? jsonVal* UP)?   #TypeNode
    | Exnotation DOWN jsonVal UP                                    #ExnotationNode
    | Field (DOWN annotation* typeExpr_? jsonVal? UP)?              #NameBodyNode
;
annotation
    : Annotation (DOWN jsonVal UP)?
;
typeExpr_
    : TypeExpr (DOWN typeExprElem_+ UP)?
;
typeExprElem_
    : TypeExprElem (DOWN typeExprElem_+ UP)?                         #TypeParams
;
jsonVal
    : JsonStr                                          #JsonStr
    | JsonBool                                         #JsonBool
    | JsonNull                                         #JsonNull
    | JsonInt                                          #JsonInt
    | JsonFloat                                        #JsonFloat
    | JsonArray (DOWN jsonVal+ UP)?                    #JsonArray
    | JsonObj (DOWN jsonVal+ UP)?                      #JsonObj
;