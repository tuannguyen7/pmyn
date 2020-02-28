// Generated from Pmyn.g4 by ANTLR 4.8

package home.pmyn;

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
	 * Visit a parse tree produced by {@link PmynParser#varAssginment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarAssginment(PmynParser.VarAssginmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableAssignment(PmynParser.VariableAssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ReturnStatement}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(PmynParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PmynParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncDef}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(PmynParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code VarRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarRef(PmynParser.VarRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(PmynParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListRef(PmynParser.ListRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(PmynParser.MulDivContext ctx);
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
	 * Visit a parse tree produced by the {@code StringRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringRef(PmynParser.StringRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayIndex}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayIndex(PmynParser.ArrayIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NumRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumRef(PmynParser.NumRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncCall}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(PmynParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotExpr}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(PmynParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(PmynParser.ParenExprContext ctx);
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
	 * Visit a parse tree produced by {@link PmynParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(PmynParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#varArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarArgs(PmynParser.VarArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#funcBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncBody(PmynParser.FuncBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmynParser#exprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(PmynParser.ExprListContext ctx);
}