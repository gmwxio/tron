parser grammar AdlP;

tokens {
    DOWN, UP, ROOT, ERROR,
    ADL, Module, Import, Annotation, Struct, Union, Newtype, Type, TypeParam, TypeExpr, TypeExprElem, Field, 
    Json, JsonStr, JsonBool, JsonNull, JsonInt, JsonFloat, JsonArray, JsonObj,
    ModuleAnno, DeclAnno, FieldAnno
}

options {
  tokenVocab = AdlL;
}

adl  
    : module  EOF
;
module
    : annon* kw=ID name+=ID (DOT name+=ID)*  LCUR imports* top_level_statement* RCUR SEMI                           #ModuleStatement
;
imports
    : kw=ID a+=ID (DOT a+=ID)* (DOT s=STAR)? SEMI                       #ImportStatement
;
annon
    : AT a=ID jsonValue                                                   #LocalAnno
    | a=LINE_DOC                                                          #DocAnno
;
top_level_statement
    : annon* kw=ID a=ID typeParam? LCUR soruBody* RCUR SEMI                #StructOrUnion
    | annon* kw=ID a=ID typeParam? EQ b=ID typeExpr? (EQ jsonValue)? SEMI  #TypeOrNewtype
    | kw=ID a=ID jsonValue SEMI                                            #ModuleAnnotation
    | kw=ID a=ID b=ID  jsonValue SEMI                                      #DeclAnnotation
    | kw=ID a=ID DCOLON b=ID c=ID jsonValue SEMI                           #FieldAnnotation
;
typeParam
    : LCHEVR typep+=ID (COMMA typep+=ID)* RCHEVR                                #TypeParameter
    | LCHEVR typeParamError (COMMA ID)* RCHEVR                  #ErrorTypeParam
    | LCHEVR ID (COMMA typeParamError)+ RCHEVR                  #ErrorTypeParam
;
typeParamError
    : ID LCHEVR (ID|typeParamError) (COMMA (ID|typeParamError))* RCHEVR
;
typeExpr
    : LCHEVR typep+=typeExprElem (COMMA typep+=typeExprElem)* RCHEVR            #TypeExpression
;
typeExprElem
    : a=ID (LCHEVR typep+=typeExprElem (COMMA typep+=typeExprElem)* RCHEVR)?   #TypeExpressionElem
;
soruBody
    : annon* a=ID typeExpr? b=ID (EQ jsonValue)? SEMI                   #FieldStatement
;
jsonValue
    : s=STR                                                             #StringStatement
    | kw=ID                                                             #TrueFalseNull
    | n=INT                                                               #NumberStatement
    | f=FLT                                                               #FloatStatement
    | LSQ (jv+=jsonValue (COMMA jv+=jsonValue)*)? RSQ                           #ArrayStatement
    | LCUR (k+=STR COLON v+=jsonValue (COMMA k+=STR COLON v+=jsonValue)*)? RCUR     #ObjStatement
;
