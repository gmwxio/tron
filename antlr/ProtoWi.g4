parser grammar TronWalker;

options {
  tokenVocab = TronParser;
}

proto
    : DOWN ROOT syntax? (DOWN tld* UP)? UP EOF
;
syntax
    : SYNTAX                        #SyntaxNode
;
tld
    : Package                       #PkgNode
    | Import                        #ImportNode
    | Message (DOWN msgBody* UP)?   #MsgNode
    | Enum (DOWN enumBody* UP)?     #EnumNode
    | Service (DOWN svcBody* UP)?   #SvcNode
    | Extend (DOWN extendBody* UP)? #ExtNode
;
msgBody
    : Option                        #MsgOptNode
    | Field Datastructure? Option?  #MsgFldNode
    | Message (DOWN msgBody* UP)?   #MsgMsgNode
    | Enum (DOWN enumBody* UP)?     #MsgEnumNode
    | Oneof (DOWN oneofBody* UP)?   #MsgOneofNode
;
oneofBody
    : Option                        #OneofOptNode
    | Field Option?                 #OneofFldNode
;
enumBody
    : Option                        #EnumOptNode
    | EnumValue EnumNum? Option?    #EnumValNode
;
svcBody
    : Option                        #SvcOptNode
    | Rpc                           #SvcRpcNode
;
extendBody
    : Option                        #ExtOptNode
    | Field Datastructure? Option?  #ExtFldNode
;