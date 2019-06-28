parser grammar TronParser;

tokens {
    DOWN, UP, ROOT, ERROR,
    /* SYNTAX,*/ Import, Package, Option, Extend, Message, Enum, Service, 
    Oneof, Map, Field, Datastructure, Reserved, Rpc, Keytype, 
    EnumValue, EnumNum,
    INF, NAN, MAX, WEAK, PUBLIC, 
    Returns, Stream, To,
    TRUE, FALSE
}

options {
  tokenVocab = tronLexer;
}

proto  
    : syntax? top_level_statement* EOF
;
syntax
    : SYNTAX EQ_PRE PROTO3 ENDPRE
;
top_level_statement
    : imp=ID weakORpublic=ID? b=STR SEMI                                        #ImportStatement
    | pkg=ID a+=ID (DOT a+=ID)* SEMI                                            #PackageStatement
    | opt=ID optionName EQ constant SEMI                                        #OptionFileDef
    | mese=ID (/*fullname*/a+=ID (DOT a+=ID)*) LCUR msg_enum_svc_ext* RCUR      #Ext_Msg_Enum_Svc
    | SEMI                                                                      #EmptyStm
;
msg_enum_svc_ext
    : associaton                                                                #Assoc
    | msg=ID ID LCUR RCUR                                                       #EmptyTopLvl
    | mese=ID ID LCUR msg_enum_svc_ext+ RCUR                                    #MsgEnumSvcExt
    | msg=ID ID LCUR SEMI RCUR                                                  #EmptyTopLvlStm
    | res=ID ranges SEMI                                                        #Range
    // enum | opt=ID optionName EQ constant SEMI  #OptionEnumDef
    | ID EQ DASH? INT fieldOptions? SEMI                                        #TLIOption
    // service | opt=ID optionName EQ constant SEMI    #OptionSvcDef
    | rpcID=ID ID messageType rets=ID messageType rpcDelim                      #RPCSig
    // not defined in the protobuf specification | stream
    | SEMI                                                                      #EmptyStmStm
;
associaton
    : a=ID EQ v=INT fieldOptions? SEMI                                          #EnumLeft
    | left_assoc EQ right_assoc SEMI                                            #MsgSvcExt
;
left_assoc
    : a=ID b=ID                                                                 #Opt_Single //option or single
    | a=ID LPAREN ID (DOT ID)* RPAREN (DOT ID)*                                 #Opt //option
    | b+=ID DOT b+=ID DOT (b+=ID DOT)* b+=ID c=ID                               #SingleFull_RepLocal // single or repeated field
    | DOT (a+=ID DOT)* a+=ID ID                                                 #SingleLocal // single field
    | a=ID b+=ID (DOT (b+=ID DOT)+ b+=ID)? c=ID                                 #Repeated // repeated
    | mpt=ID LCHEVR kt=ID COMMA (v+=ID DOT)* v+=ID RCHEVR c=ID                  #MapLeft
    | mpt=ID LCHEVR kt=ID COMMA DOT (v+=ID DOT)* v+=ID RCHEVR c=ID              #MapLocalLeft
;
right_assoc
    : constant //option
    | INT fieldOptions?    // single field
;
constant
  : ID (DOT ID)+
  | id=ID     // include bool_lit, nan, inf, max
  | (DASH | PLUS)? INT
  | (DASH | PLUS)? FLT
  | STR
  | constantObj
;
fullname
    : ID (DOT ID)*
;
messageType
    : LPAREN (stream=ID /*{$stream.text == "stream"}?*/)? DOT? (ID DOT)* ID RPAREN
;
rpcDelim
    : LCUR (opt=ID optionName EQ constant SEMI )* RCUR SEMI* // emptyStatement
    | LCUR SEMI* RCUR SEMI* // emptyStatement
    | SEMI+
;
ranges
    : rangee (COMMA rangee)*
    | STR (COMMA STR)*
;
rangee
    : INT 
    | INT to=ID (INT | max=ID)
;
fieldOptions
    : LSB fieldOption (COMMA fieldOption)* RSB
;
fieldOption
    : optionName EQ constant
;
optionName
    : ID (DOT ID)*
    | LPAREN ID (DOT ID)* RPAREN (DOT ID)*
;
constantObj
    : LCUR constantObjElem RCUR                                             #TronObj
    | LCUR constantObjElem ((COMMA|SEMI)? constantObjElem)+ RCUR            #TronObjs
;
constantObjElem
    : id=ID COLON constant                                                  #PronSTR
    // | id=ID COLON constantObj        #PronOBJ
    | id=ID COLON LSB (constant COMMA?)* RSB                                #PronARRAY
    | id=ID COLON LSB (constantObj COMMA?)* RSB                             #PronARRAYOFOBJ
;
