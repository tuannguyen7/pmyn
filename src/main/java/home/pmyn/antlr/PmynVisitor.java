// Generated from Pmyn.g4 by ANTLR 4.9.2
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
	 * Visit a parse tree produced by the {@code IfElseStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStatement(PmynParser.IfElseStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(PmynParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ForStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForStatement(PmynParser.ForStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(PmynParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(PmynParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStatement(PmynParser.ExprStatementContext ctx);
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
	 * Visit a parse tree produced by the {@code ListRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRef(PmynParser.ListRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(PmynParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListGetIndex}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListGetIndex(PmynParser.ListGetIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code UnaryMinus}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryMinus(PmynParser.UnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(PmynParser.FuncCallContext ctx);
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
	 * Visit a parse tree produced by the {@code ObjectAttribute}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjectAttribute(PmynParser.ObjectAttributeContext ctx);
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
	 * Visit a parse tree produced by {@link PmynParser#sublist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSublist(PmynParser.SublistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#sub}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(PmynParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#varAssignmentStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssignmentStmt(PmynParser.VarAssignmentStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#ifElseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfElseStmt(PmynParser.IfElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#elseStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseStmt(PmynParser.ElseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#blockStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStmt(PmynParser.BlockStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(PmynParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forInStatement}
	 * labeled alternative in {@link PmynParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInStatement(PmynParser.ForInStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forIndexStatement}
	 * labeled alternative in {@link PmynParser#forStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForIndexStatement(PmynParser.ForIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(PmynParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#funcParams}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncParams(PmynParser.FuncParamsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#funcArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncArgs(PmynParser.FuncArgsContext ctx);
}