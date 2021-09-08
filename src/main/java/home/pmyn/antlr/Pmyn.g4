grammar Pmyn;

@header {
package home.pmyn.antlr;
}


// Grammar

compilationUnit: stat+ ;

stat:
        varAssignmentStmt     NEW_LINE           #VariableAssignmentStatement
    |   expr                  NEW_LINE           #ExprStatement
    |   'debug' '(' expr ')'  NEW_LINE           #PrintStatement
    |   NEW_LINE                                 #NewLine
    ;

expr:
        '(' expr ')'                                                 #ExprInsideParens
    |   '-' expr                                                     #UnaryMinus
    |   expr op=(ADD_OPERATOR | SUB_OPERATOR) expr                   #AddSub
    |   expr op=(MUL_OPERATOR | DIV_OPERATOR | MOD_OPERATOR) expr    #MulDivMod
    |   expr POW_OPERATOR expr                                       #Pow
    |   NOT expr                                                     #NotExpr
    |   expr op=(AND | OR) expr                                      #AndOrLogic
    |   expr op=(EQUALS | GREATER_THAN | GT_EQ | LESS_THAN | LT_EQ | NOT_EQ_1 | NOT_EQ_2) expr         #EqualityComparison
    |   ID                                            #VarRef
    |   STRING                                        #StringLiteral
    |   INT                                           #IntegerLiteral
    |   FLOAT                                         #DecimalLiteral
    |   TRUE                                          #BooleanTrueLiteral
    |   FALSE                                         #BooleanFalseLiteral
    ;

varAssignmentStmt :  ID ASSIGN expr ;

// Tokens
IF : 'if' ;
THEN : 'then' ;
ELSE : 'else' ;
RETURN : 'return' ;
LAMBDA: 'lambda'  ;
DEF: 'def'  ;
NOT: 'not'  ;
AND: 'and'  ;
OR: 'or'    ;

MUL_OPERATOR : '*'  ;
DIV_OPERATOR : '/'  ;
ADD_OPERATOR : '+'  ;
SUB_OPERATOR : '-'  ;
MOD_OPERATOR : '%'  ;
POW_OPERATOR : '**';

LESS_THAN : '<';
GREATER_THAN : '>';
EQUALS : '==';
GT_EQ : '>=';
LT_EQ : '<=';
NOT_EQ_1 : '<>';
NOT_EQ_2 : '!=';

OPEN_PAREN : '(' ;
CLOSE_PAREN : ')' ;
OPEN_BRACK : '[' ;
CLOSE_BRACK : ']' ;
OPEN_BRACE : '{' ;
CLOSE_BRACE : '}' ;

COMMA : ',';
DOT : '.';
COLON : ':';
SEMI_COLON : ';';
ASSIGN : '=';

TRUE: 'true' ;
FALSE: 'false' ;

ID  :   LETTER (LETTER | DIGIT | '_')* ;

fragment
LETTER : [a-zA-Z] ;

fragment
DIGIT : [0-9] ;

INT :   DIGIT+ ;

FLOAT:  DIGIT+ '.' DIGIT+ ;

STRING: '"' (ESC|.)*? '"'
      | '\'' (ESC|.)*? '\'' ;

fragment
ESC : '\\"' | '\\\\' ; // 2-char sequences \" and \\

NEW_LINE: '\r'? '\n' ;

WS  :   [ \t\r]+ -> skip ;

SL_COMMENT
    :   '#' .*? (NEW_LINE|EOF) -> skip
    ;
