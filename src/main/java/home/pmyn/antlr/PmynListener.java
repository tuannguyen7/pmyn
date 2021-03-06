// Generated from Pmyn.g4 by ANTLR 4.8

package home.pmyn.antlr;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PmynParser}.
 */
public interface PmynListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PmynParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void enterCompilationUnit(PmynParser.CompilationUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#compilationUnit}.
	 * @param ctx the parse tree
	 */
	void exitCompilationUnit(PmynParser.CompilationUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignment(PmynParser.VarAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#varAssignment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignment(PmynParser.VarAssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssignmentStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignmentStatement(PmynParser.VariableAssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignmentStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignmentStatement(PmynParser.VariableAssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(PmynParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(PmynParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterExprStatement(PmynParser.ExprStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitExprStatement(PmynParser.ExprStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFuncDef(PmynParser.FuncDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFuncDef(PmynParser.FuncDefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NewLine}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterNewLine(PmynParser.NewLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NewLine}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitNewLine(PmynParser.NewLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VarRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVarRef(PmynParser.VarRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VarRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVarRef(PmynParser.VarRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMod(PmynParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMod(PmynParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListRef(PmynParser.ListRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListRef(PmynParser.ListRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(PmynParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(PmynParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(PmynParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(PmynParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListGetIndex}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterListGetIndex(PmynParser.ListGetIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListGetIndex}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitListGetIndex(PmynParser.ListGetIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterUnaryMinus(PmynParser.UnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitUnaryMinus(PmynParser.UnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LiteralRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralRef(PmynParser.LiteralRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LiteralRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralRef(PmynParser.LiteralRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(PmynParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(PmynParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInsideParens}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInsideParens(PmynParser.ExprInsideParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInsideParens}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInsideParens(PmynParser.ExprInsideParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(PmynParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(PmynParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ObjectAttribute}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterObjectAttribute(PmynParser.ObjectAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ObjectAttribute}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitObjectAttribute(PmynParser.ObjectAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterEqualityComparison(PmynParser.EqualityComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitEqualityComparison(PmynParser.EqualityComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AndOrLogic}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAndOrLogic(PmynParser.AndOrLogicContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AndOrLogic}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAndOrLogic(PmynParser.AndOrLogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#sublist}.
	 * @param ctx the parse tree
	 */
	void enterSublist(PmynParser.SublistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#sublist}.
	 * @param ctx the parse tree
	 */
	void exitSublist(PmynParser.SublistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#sub}.
	 * @param ctx the parse tree
	 */
	void enterSub(PmynParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#sub}.
	 * @param ctx the parse tree
	 */
	void exitSub(PmynParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(PmynParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(PmynParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#varArgs}.
	 * @param ctx the parse tree
	 */
	void enterVarArgs(PmynParser.VarArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#varArgs}.
	 * @param ctx the parse tree
	 */
	void exitVarArgs(PmynParser.VarArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void enterFuncBody(PmynParser.FuncBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#funcBody}.
	 * @param ctx the parse tree
	 */
	void exitFuncBody(PmynParser.FuncBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(PmynParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(PmynParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(PmynParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(PmynParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(PmynParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(PmynParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(PmynParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(PmynParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(PmynParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(PmynParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link PmynParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(PmynParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(PmynParser.LiteralContext ctx);
}