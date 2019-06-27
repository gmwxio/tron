lexer grammar tronLexer;

// mode PRE;
PROTO3  : '"proto3"' | '\'proto3\'';
SYNTAX  : 'syntax';
EQ_PRE  : '=' ;
ENDPRE  : ';' -> mode(TOP);

PRE_WS           : [ \t\r\n\u000C]+ -> skip;
PRE_COMMENT      : '/*' .*? '*/' -> skip;
PRE_LINE_COMMENT : '//' ~[\r\n]* -> skip;

mode TOP;
LCUR    : '{';
RCUR    : '}';
EQ      : '=' ;
DQ      : '"' ;
SQ      : '\'';
SEMI    : ';';
COLON   : ':';
LPAREN  : '(';
RPAREN  : ')';
DOT     : '.';
LSB     : '[';
RSB     : ']';
COMMA   : ',';
LCHEVR  : '<';
RCHEVR  : '>';
DASH    : '-';
PLUS    : '+';

// Letters and digits
fragment Letter        : [A-Za-z_];
fragment DecimalDigit  : [0-9];
fragment OctalDigit    : [0-7];
fragment HexDigit      : [0-9A-Fa-f];

fragment DecimalLit    : [1-9] DecimalDigit*;
fragment OctalLit      : '0' OctalDigit*;
fragment HexLit        : '0' ('x' | 'X') HexDigit+;

// Floating-point literals
fragment Decimals      : DecimalDigit+;
fragment Exponent      : ('e' | 'E') ('+' | '-')? Decimals;

STR     : '\'' CharValue* '\'' | '"' CharValue* '"';
ID      : Letter (Letter | DecimalDigit)*;
INT     : DecimalLit | OctalLit | HexLit;
FLT
    : (
          Decimals DOT Decimals? Exponent?
        | Decimals Exponent
        | DOT Decimals Exponent?
      )
;

fragment CharValue
    : HexEscape
    | OctEscape
    | CharEscape
    | ~[\u0000\n\\]
;

fragment HexEscape  : '\\' ('x' | 'X') HexDigit HexDigit;
fragment OctEscape  : '\\' OctalDigit OctalDigit OctalDigit;
fragment CharEscape : '\\' [abfnrtv\\'"];

WS           : [ \t\r\n\u000C]+ -> skip;
COMMENT      : '/*' .*? '*/' -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip;