// Generated from src/main/java/home/pmyn/antlr/Pmyn.g4 by ANTLR 4.9.2

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
	 * Enter a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(PmynParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(PmynParser.MulDivModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(PmynParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(PmynParser.StringLiteralContext ctx);
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
	 * Enter a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(PmynParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(PmynParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterPow(PmynParser.PowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitPow(PmynParser.PowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanTrueLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanTrueLiteral(PmynParser.BooleanTrueLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanTrueLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanTrueLiteral(PmynParser.BooleanTrueLiteralContext ctx);
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
	 * Enter a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(PmynParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(PmynParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanFalseLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterBooleanFalseLiteral(PmynParser.BooleanFalseLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanFalseLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitBooleanFalseLiteral(PmynParser.BooleanFalseLiteralContext ctx);
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
	 * Enter a parse tree produced by {@link PmynParser#varAssignmentStmt}.
	 * @param ctx the parse tree
	 */
	void enterVarAssignmentStmt(PmynParser.VarAssignmentStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#varAssignmentStmt}.
	 * @param ctx the parse tree
	 */
	void exitVarAssignmentStmt(PmynParser.VarAssignmentStmtContext ctx);
}