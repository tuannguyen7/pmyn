grammar Pmyn;

@header {
package home.pmyn.antlr;
}


compilationUnit: stat+ ;

stat:
        varAssignmentStmt     NEW_LINE           #VariableAssignmentStatement
    |   expr                  NEW_LINE           #ExprStatement
    |   NEW_LINE                                 #NewLine
    ;

expr:
        '(' expr ')'                                                 #ExprInsideParens
    |   '[' sublist ']'                                              #ListRef
    |   expr '[' expr ']'                                            #ListGetIndex   // array index like a[i], a[i][j]
    |   '-' expr                                                     #UnaryMinus
    |<assoc=right>  expr POW_OPERATOR expr                           #Pow
    |   expr op=(MUL_OPERATOR | DIV_OPERATOR | MOD_OPERATOR) expr    #MulDivMod
    |   expr op=(ADD_OPERATOR | SUB_OPERATOR) expr                   #AddSub
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

sublist : sub (',' sub)* ;

sub :   expr ;

varAssignmentStmt :  ID ASSIGN expr ;

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
