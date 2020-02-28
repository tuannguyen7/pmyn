/** Simple statically-typed programming language with functions and variables
 *  taken from "Language Implementation Patterns" book.
 */
grammar Pmyn;

@header {
package home.rule.lang1;
}


compilationUnit: stat+ ;

varAssginment
    :  ID ASSIGN expr
    ;

stat:   varAssginment  NEW_LINE                       #VariableAssignment
    //|   IF expr THEN stat (ELSE stat)?        #IfElseStatement
    |   RETURN expr?  NEW_LINE                        #ReturnStatement
        // func call
//    |   IF expr ':'
    |   expr NEW_LINE                                 #FunctionCall
    |   functionDecl NEW_LINE                         #FuncDef
    ;

expr:   // func call like f(), f(x), f(1,2)
        ID varArgs                                    #FuncCall
        // array index like a[i], a[i][j]
    |   OPEN_BRACK sublist CLOSE_BRACK                #ListRef
    |   ID OPEN_BRACK expr CLOSE_BRACK                #ArrayIndex
    |   '-' expr                                      #UnaryMinus
    |   NOT expr                                      #NotExpr
    |   expr (MOD_OPERATOR) expr                      #Mod
    |   expr op=(MUL_OPERATOR | DIV_OPERATOR) expr       #MulDiv
    |   expr op=(ADD_OPERATOR | SUB_OPERATOR) expr       #AddSub
        // equality comparison (lowest priority op)
    |   expr EQUALS expr                              #EqualityComparison
        // variable reference
    |   ID                                            #VarRef
    |   NUMBER                                        #NumRef
    |   STRING                                        #StringRef
    |   OPEN_PAREN expr CLOSE_PAREN                   #ParenExpr
    ;

//lambda: LAMBDA lambdaVararg ':' NEW_LINE lambdaBody ;

sublist : sub (',' sub)* ;

sub :   expr
    ;

functionDecl: DEF ID varArgs OPEN_BRACE NEW_LINE* funcBody NEW_LINE* CLOSE_BRACE;

varArgs : OPEN_PAREN exprList? CLOSE_PAREN ;

funcBody: stat* ;

exprList : expr (',' expr)* ;   // arg list

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
COLON : ':';
SEMI_COLON : ';';
ASSIGN : '=';

ID  :   LETTER (LETTER | DIGIT | '_')* ;

fragment
LETTER : [a-zA-Z] ;

fragment
DIGIT : [0-9] ;

fragment
INT :   DIGIT+ ;

fragment
FLOAT:  DIGIT+ '.' DIGIT+ ;

NUMBER: (INT | FLOAT) ;

STRING
    :   '"' ( ~[\\"] )*? '"'
    |   '\'' (~[\\'] )*? '\''
    ;

NEW_LINE: '\r'? '\n' ;

WS  :   [ \t\r]+ -> skip ;

SL_COMMENT
    :   '#' .*? NEW_LINE -> skip
    ;
