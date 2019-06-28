parser grammar TronWii;
options {  tokenVocab = TronWi; }

dnac
    : DOWN DNAC DOWN name UP UP EOF
;
name
    : Name       (DOWN Annotation*                               tld* UP)?    #NameNode
;
tld
    : Name       (DOWN Annotation* TypeParam?                    tld* UP)?    #NameRule
    | Type       (DOWN Annotation* TypeParam  TypeExpr?               UP)?    #TypeNode
    | Type       (DOWN Annotation*                      Default?      UP)?    #TypeNode
    | Field      (DOWN Annotation*            TypeExpr                UP)?    #NameBodyNode
    | Field      (DOWN Annotation*                      Default?      UP)?    #NameBodyNode
    | Exnotation (DOWN                                                UP)?    #ExnotationNode
;
