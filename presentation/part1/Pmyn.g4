grammar Pmyn;


compilationUnit: stat+ ;

stat:
        varAssignmentStmt     NEW_LINE           #VariableAssignmentStatement
    |   ifElseStmt            NEW_LINE           #IfElseStatement
    |   RETURN expr?          NEW_LINE           #ReturnStatement
    |   functionDecl          NEW_LINE           #FuncDef
    |   expr                  NEW_LINE           #ExprStatement
    |   NEW_LINE                                 #NewLine
    ;

expr:
        '(' expr ')'                                                 #ExprInsideParens
    |   ID '(' funcArgs? ')'                                         #FuncCall       // func call like f(), f(x), f(1,2)
    |   '[' sublist ']'                                              #ListRef
    |   expr '[' expr ']'                                            #ListGetIndex   // array index like a[i], a[i][j]
    |   '-' expr                                                     #UnaryMinus
    |   expr op=(MUL_OPERATOR | DIV_OPERATOR | MOD_OPERATOR) expr    #MulDivMod
    |   expr op=(ADD_OPERATOR | SUB_OPERATOR) expr                   #AddSub
        // equality comparison (lowest priority op)
    |   NOT expr                                                     #NotExpr
    |   expr op=(AND | OR) expr                       #AndOrLogic
    |   expr op=(EQUALS | GREATER_THAN | GT_EQ | LESS_THAN | LT_EQ | NOT_EQ_1 | NOT_EQ_2) expr         #EqualityComparison
    |   expr '.' ID                                   #ObjectAttribute  // Reference object's attribute like student.name
    |   ID                                            #VarRef
    |   STRING                                        #StringLiteral
    |   INT                                           #IntegerLiteral
    |   FLOAT                                         #DecimalLiteral
    |   TRUE                                          #BooleanTrueLiteral
    |   FALSE                                         #BooleanFalseLiteral
    ;

sublist : sub (',' sub)* ;

sub :   expr
    ;

varAssignmentStmt
    :  ID ASSIGN expr
    ;

ifElseStmt : IF '(' expr ')' blockStmt (ELSE IF '(' expr ')' blockStmt)* elseStmt? ;

elseStmt : ELSE blockStmt ;

blockStmt : '{' stat* '}' ;

functionDecl: DEF ID '(' funcParams? ')' blockStmt;

funcParams : ID (',' ID)* ;

funcArgs : expr (',' expr)* ;

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
POWER_OPERATOR : '**';

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

ID  :   LETTER (LETTER | DIGIT | '_')* ;

fragment
LETTER : [a-zA-Z] ;

fragment
DIGIT : [0-9] ;

INT :   DIGIT+ ;

FLOAT:  DIGIT+ '.' DIGIT+ ;

STRING
    :   '"' ( ~[\\"] )*? '"'
    |   '\'' (~[\\'] )*? '\''
    ;

TRUE: 'true' ;
FALSE: 'false' ;

NEW_LINE: '\r'? '\n' ;

WS  :   [ \t\r]+ -> skip ;

SL_COMMENT
    :   '#' .*? (NEW_LINE|EOF) -> skip
    ;
