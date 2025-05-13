
grammar Roman;

// regras principais
root : (oneThousand)* hundreds? tens? units? ;

units : one ((one)* | five  | ten) | five (one)* ;
tens  : ten ((ten)* | fifty | oneHundred) | fifty (ten)* ;
hundreds : oneHundred ((oneHundred)* | fiveHundred | oneThousand) | fiveHundred (oneHundred)* ;

// tokens
one         : 'I';
five        : 'V';
ten         : 'X';
fifty       : 'L';
oneHundred  : 'C';
fiveHundred : 'D';
oneThousand : 'M';

// ignorar espaços
WS : [ \t\r\n]+ -> skip ;
