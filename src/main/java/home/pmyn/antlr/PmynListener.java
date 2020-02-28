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
	 * Enter a parse tree produced by {@link PmynParser#varAssginment}.
	 * @param ctx the parse tree
	 */
	void enterVarAssginment(PmynParser.VarAssginmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PmynParser#varAssginment}.
	 * @param ctx the parse tree
	 */
	void exitVarAssginment(PmynParser.VarAssginmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterVariableAssignment(PmynParser.VariableAssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code VariableAssignment}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitVariableAssignment(PmynParser.VariableAssignmentContext ctx);
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
	 * Enter a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PmynParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCall}
	 * labeled alternative in {@link PmynParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PmynParser.FunctionCallContext ctx);
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
	 * Enter a parse tree produced by the {@code StringRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringRef(PmynParser.StringRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringRef(PmynParser.StringRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayIndex}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterArrayIndex(PmynParser.ArrayIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayIndex}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitArrayIndex(PmynParser.ArrayIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NumRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumRef(PmynParser.NumRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NumRef}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumRef(PmynParser.NumRefContext ctx);
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
	 * Enter a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(PmynParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenExpr}
	 * labeled alternative in {@link PmynParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(PmynParser.ParenExprContext ctx);
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
}