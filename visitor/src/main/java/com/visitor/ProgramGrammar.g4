grammar ProgramGrammar;
program: (statement)*;

stringStatement: 
(QUOTES ID QUOTES) 
| (ID) | STRING;

string: stringStatement | LPAREN stringStatement RPAREN;

stringOperation: (string
PLUS string) | LPAREN string
PLUS string RPAREN;

asignStatement : ID EQ
(decimal 
| ID 
| INT 
| string
| bool 
| operation
| stringOperation
| infixExpr) 
SEMI;

asign: LPAREN asignStatement RPAREN
| asignStatement;

inputWriteStatement:
(string
| decimal
| ID
| INT
| bool
| operation
|stringOperation
|asignStatement);

inputWrite: 
(LPAREN inputWriteStatement RPAREN)
| inputWriteStatement;

write : WRITEKEY inputWrite SEMI;

statement : 
(write 
| asign 
| condition
| mientras);

mientras:
WHILEKEY
(bool | ID | INT)*
LCURLY
(statement)*
RCURLY;

floatStatement: INT DOT (INT)*;

decimal: LPAREN floatStatement RPAREN
| floatStatement;


// TODO: Operaciones permitidas con
// INT | float y permitidas con string
operationStatement: 
(INT| decimal | ID | FLOAT)
(PLUS | MINUS | TIMES | DIV | MOD | POW)
(INT | decimal | operation | ID | FLOAT);


operation: LPAREN 
operationStatement RPAREN
| operationStatement;

boolStatement: 
(
      ID 
    | INT 
    | operation 
    | string
    | decimal
)

( GREATER
| LESS
| GREATEREQ
| LESSEQ
| EQQ
| NOTEQ 
| AND 
| OR )

(ID 
| INT 
| operation 
| string
| decimal
| bool);


bool : 
(
LPAREN 
(boolStatement | TRUE | FALSE) 
RPAREN
) 
| (boolStatement | TRUE | FALSE);

condition : 
IF 
(bool)
LCURLY 
(statement)*
RCURLY
(ELSE LCURLY (statement)* RCURLY)*;

//----------------------------------------------------
//Expresiones infijas y operaciones
infixExpr: (MINUS)? additiveExpr ((POW) additiveExpr)*;
additiveExpr: multiplicativeExpr ((PLUS | MINUS) multiplicativeExpr)*;
multiplicativeExpr: primary ((TIMES | DIV | MOD) primary)*;
primary: INT | FLOAT |'(' infixExpr ')';



NOT : 'not' ;
COMMA : ',' ;
SEMI : ';' ;
LPAREN : '(' ;
RPAREN : ')' ;
LCURLY : '{' ;
RCURLY : '}' ;

DOT: '.';

IF : 'si';
ELSE: 'sino';

GREATER: '>';
LESS: '<';
GREATEREQ: '>=';
LESSEQ: '<=';
EQQ: '==';
NOTEQ: '!=';
AND: '&&';
OR: '||';

PLUS: '+';
MINUS: '-';
TIMES: '*';
DIV: '/';
MOD: '%';
POW: '^';

EQ: '=';

TRUE: 'true';
FALSE: 'false';

QUOTES: '"';

WRITEKEY: 'escribe';

WHILEKEY: 'mientras';

INT : [0-9]+ ;
FLOAT: [0-9]+ '.' [0-9]+;
ID: [a-zA-Z_][a-zA-Z0-9_]* ;
STRING: QUOTES (~["\r\n])* QUOTES;
WS: [ \t\n\r\f]+ -> skip ;
