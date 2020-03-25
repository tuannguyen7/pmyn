/** Simple statically-typed programming language with functions and variables
 *  taken from "Language Implementation Patterns" book.
 */
grammar Pmyn;

@header {
package home.pmyn.antlr;
}


compilationUnit: stat+ ;

varAssignment
    :  ID ASSIGN expr
    ;

stat:   varAssignment  NEW_LINE                       #VariableAssignmentStatement
    //|   IF expr THEN stat (ELSE stat)?        #IfElseStatement
    |   RETURN expr?  NEW_LINE                        #ReturnStatement
        // func call
//    |   IF expr ':'
    |   expr NEW_LINE                                 #ExprStatement
    |   functionDecl NEW_LINE                         #FuncDef
    |   NEW_LINE                                      #NewLine
    ;

expr:
        '(' expr ')'                                  #ExprInsideParens
    // func call like f(), f(x), f(1,2)
    |   ID varArgs                                    #FuncCall
    |   '[' sublist ']'                               #ListRef
        // array index like a[i], a[i][j]
    |   expr '[' expr ']'                               #ListGetIndex
    |   '-' expr                                      #UnaryMinus
    |   NOT expr                                      #NotExpr
    |   expr (MOD_OPERATOR) expr                      #Mod
    |   expr op=(MUL_OPERATOR | DIV_OPERATOR) expr    #MulDiv
    |   expr op=(ADD_OPERATOR | SUB_OPERATOR) expr    #AddSub
        // equality comparison (lowest priority op)
    |   expr op=(EQUALS | GREATER_THAN | GT_EQ | LESS_THAN | LT_EQ | NOT_EQ_1 | NOT_EQ_2) expr         #EqualityComparison
    |   expr op=(AND | OR) expr                       #AndOrLogic
        // variable reference
//    |   mapInitializier                               #MapRef
    // Reference object's attribute like student.name
    |   expr '.' ID                                   #ObjectAttribute
    |   ID                                            #VarRef
    |   literal                                       #LiteralRef
    ;

//lambda: LAMBDA lambdaVararg ':' NEW_LINE lambdaBody ;

sublist : sub (',' sub)* ;

sub :   expr
    ;

//mapVarInitializier
//  : ID ':' expr
//  | ID ':' mapInitializier;
//
//mapInitializier: OPEN_BRACE (mapVarInitializier (',' mapVarInitializier)* (',')? )? CLOSE_BRACE;

functionDecl: DEF ID varArgs OPEN_BRACE NEW_LINE* funcBody NEW_LINE* CLOSE_BRACE;

varArgs : OPEN_PAREN exprList? CLOSE_PAREN ;

funcBody: stat* ;

exprList : expr (',' expr)* ;   // arg list

decimalLiteral : FLOAT ;

integerLiteral : INT ;

stringLiteral : STRING ;

booleanLiteral
    :   'true'
    |   'false'
    ;

literal
    : decimalLiteral
    | integerLiteral
    | booleanLiteral
    | stringLiteral
    ;

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

NEW_LINE: '\r'? '\n' ;

WS  :   [ \t\r]+ -> skip ;

SL_COMMENT
    :   '#' .*? NEW_LINE -> skip
    ;
