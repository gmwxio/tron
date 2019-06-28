lexer grammar AdlL;

LCUR    : '{';
RCUR    : '}';
LSQ     : '[';
RSQ     : ']';
EQ      : '=' ;
DQ      : '"' ;
SQ      : '\'';
SEMI    : ';';
DCOLON   : '::';
COLON   : ':';
DOT     : '.';
COMMA   : ',';
LCHEVR  : '<';
RCHEVR  : '>';
STAR    : '*';
AT      : '@';

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

STR     : '\'' SqChar* '\'' | '"' DqChar* '"';
ID      : Letter (Letter | DecimalDigit)*;
INT     : DecimalLit | OctalLit | HexLit;
FLT
    : (
          Decimals DOT Decimals? Exponent?
        | Decimals Exponent
        | DOT Decimals Exponent?
      )
;

fragment SqChar
    : '\\\''
    | ~[']
;
fragment DqChar
    : '\\"'
    | ~["]
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
// COMMENT      : '/*' .*? '*/' -> skip;
LINE_DOC : '///' ~[\r\n]*;
LINE_COMMENT : '//' ~[\r\n]* -> skip;