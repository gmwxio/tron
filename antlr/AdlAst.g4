parser grammar AdlAst;

options {
  tokenVocab = AdlP;
}

adl  
    : module  EOF
;
module
    : Module DOWN moduleName=ID import_* (ID decl)* (scopedName json)* UP
;
import_
    : Import DOWN (moduleName=ID | scopedName) UP
; 
decl
    : Decl DOWN name=ID version=INT? type_=declType (scopedName json)* UP
;
scopedName
    : ScopedName DOWN moduleName=ID name=ID UP
;
declType
    : DeclType DOWN ( struct_ | union_ | typeDef | newType ) UP
;
struct_
    : Struct (DOWN typeParams+=ID* fields+=field* UP)?
;
union_
    : Union (DOWN typeParams+=ID* fields+=field* UP)?
;
typeDef
    : TypeDef DOWN typeParams+=ID* typeExpr UP
;
newType
    : NewType DOWN typeParams+=ID* typeExpr default_=json? UP
;
field
    : Field DOWN name=ID serializedName=ID typeExpr default_=json? (scopedName json)* UP
;
typeExpr
    : TypeExpr DOWN typeRef parameters+=typeExpr* UP
;
typeRef
    : Primitive ID | TypeParam ID | scopedName
;
json
    : tok=JsonStr                                          #JsonStr
    | tok=JsonBool                                         #JsonBool
    | tok=JsonNull                                         #JsonNull
    | tok=JsonInt                                          #JsonInt
    | tok=JsonFloat                                        #JsonFloat
    | tok=JsonArray (DOWN json+ UP)?                    #JsonArray
    | tok=JsonObj (DOWN json+ UP)?                      #JsonObj
    | ERROR                                                #JsonError
;