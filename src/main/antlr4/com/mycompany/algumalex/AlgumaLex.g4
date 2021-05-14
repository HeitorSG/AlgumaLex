
lexer grammar AlgumaLex;

PALAVRA_CHAVE 
	:	'ini' | 'fn' | 'int' | 'float' | 'char' | 'string' | 'boolean' | 'while' | 'if'
	; 
NUMINT	: ('+'|'-')?('0'..'9')+
	;
NUMREAL	: ('+'|'-')?('0'..'9')+ ('.' ('0'..'9')+)?
	;
VAR : ('a'..'z'|'A'..'Z') ('a'..'z'|'A'..'Z'|'0'..'9')*
	 ;
CADEIA 	: '\'' ( ESC_SEQ | ~('\''|'\\') )* '\''
	;
fragment
ESC_SEQ	: '\\\'';
COMENTARIO
    :   '~' ~('\n'|'\r')* '\r'? '\n' {skip();}
    ;
WS  :   ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {skip();}
    ;
OP_REL	:	'>' | '>=' | '<' | '<=' | '<>' | '='
	;
OP_ARIT	:	'+' | '-' | '*' | '/'|'//'|'**'
	;
DELIM	:	'->'|'<-'
	;
OPPAR :	'('
	;
CLPAR:	')'
	;
SEMICOMMA:	';' | ',' | '?' | '"'
	;
