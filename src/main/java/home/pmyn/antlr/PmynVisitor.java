// Generated from src/main/java/home/pmyn/antlr/Pmyn.g4 by ANTLR 4.9.2

package home.pmyn.antlr;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmynParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmynVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmynParser#compilationUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompilationUnit(PmynParser.CompilationUnitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssignmentStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignmentStatement(PmynParser.VariableAssignmentStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(PmynParser.ExprStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(PmynParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NewLine}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewLine(PmynParser.NewLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(PmynParser.VarRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(PmynParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(PmynParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(PmynParser.MulDivModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(PmynParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInsideParens}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInsideParens(PmynParser.ExprInsideParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DecimalLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(PmynParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Pow}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPow(PmynParser.PowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanTrueLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanTrueLiteral(PmynParser.BooleanTrueLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PmynParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntegerLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(PmynParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanFalseLiteral}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanFalseLiteral(PmynParser.BooleanFalseLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AndOrLogic}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOrLogic(PmynParser.AndOrLogicContext ctx);
	/**
	 * Visit a parse tree produced by the {@code EqualityComparison}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityComparison(PmynParser.EqualityComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#varAssignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignmentStmt(PmynParser.VarAssignmentStmtContext ctx);
}