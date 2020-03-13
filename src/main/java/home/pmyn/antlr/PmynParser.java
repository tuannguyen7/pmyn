// Generated from Pmyn.g4 by ANTLR 4.8

package home.pmyn.antlr;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmynParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, IF=3, THEN=4, ELSE=5, RETURN=6, LAMBDA=7, DEF=8, NOT=9, 
		AND=10, OR=11, MUL_OPERATOR=12, DIV_OPERATOR=13, ADD_OPERATOR=14, SUB_OPERATOR=15, 
		MOD_OPERATOR=16, POWER_OPERATOR=17, LESS_THAN=18, GREATER_THAN=19, EQUALS=20, 
		GT_EQ=21, LT_EQ=22, NOT_EQ_1=23, NOT_EQ_2=24, OPEN_PAREN=25, CLOSE_PAREN=26, 
		OPEN_BRACK=27, CLOSE_BRACK=28, OPEN_BRACE=29, CLOSE_BRACE=30, COMMA=31, 
		DOT=32, COLON=33, SEMI_COLON=34, ASSIGN=35, ID=36, INT=37, FLOAT=38, STRING=39, 
		NEW_LINE=40, WS=41, SL_COMMENT=42;
	public static final int
		RULE_compilationUnit = 0, RULE_varAssignment = 1, RULE_stat = 2, RULE_expr = 3, 
		RULE_sublist = 4, RULE_sub = 5, RULE_functionDecl = 6, RULE_varArgs = 7, 
		RULE_funcBody = 8, RULE_exprList = 9, RULE_decimalLiteral = 10, RULE_integerLiteral = 11, 
		RULE_stringLiteral = 12, RULE_booleanLiteral = 13, RULE_literal = 14;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "varAssignment", "stat", "expr", "sublist", "sub", 
			"functionDecl", "varArgs", "funcBody", "exprList", "decimalLiteral", 
			"integerLiteral", "stringLiteral", "booleanLiteral", "literal"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'true'", "'false'", "'if'", "'then'", "'else'", "'return'", "'lambda'", 
			"'def'", "'not'", "'and'", "'or'", "'*'", "'/'", "'+'", "'-'", "'%'", 
			"'**'", "'<'", "'>'", "'=='", "'>='", "'<='", "'<>'", "'!='", "'('", 
			"')'", "'['", "']'", "'{'", "'}'", "','", "'.'", "':'", "';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, "IF", "THEN", "ELSE", "RETURN", "LAMBDA", "DEF", "NOT", 
			"AND", "OR", "MUL_OPERATOR", "DIV_OPERATOR", "ADD_OPERATOR", "SUB_OPERATOR", 
			"MOD_OPERATOR", "POWER_OPERATOR", "LESS_THAN", "GREATER_THAN", "EQUALS", 
			"GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "COMMA", "DOT", 
			"COLON", "SEMI_COLON", "ASSIGN", "ID", "INT", "FLOAT", "STRING", "NEW_LINE", 
			"WS", "SL_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Pmyn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PmynParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class CompilationUnitContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				stat();
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << RETURN) | (1L << DEF) | (1L << NOT) | (1L << SUB_OPERATOR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0) );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarAssignmentContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmynParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PmynParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterVarAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitVarAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentContext varAssignment() throws RecognitionException {
		VarAssignmentContext _localctx = new VarAssignmentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_varAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(ID);
			setState(36);
			match(ASSIGN);
			setState(37);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FuncDefContext extends StatContext {
		public FunctionDeclContext functionDecl() {
			return getRuleContext(FunctionDeclContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(PmynParser.NEW_LINE, 0); }
		public FuncDefContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterFuncDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitFuncDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitFuncDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReturnStatementContext extends StatContext {
		public TerminalNode RETURN() { return getToken(PmynParser.RETURN, 0); }
		public TerminalNode NEW_LINE() { return getToken(PmynParser.NEW_LINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprStatementContext extends StatContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(PmynParser.NEW_LINE, 0); }
		public ExprStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterExprStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitExprStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitExprStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableAssignmentStatementContext extends StatContext {
		public VarAssignmentContext varAssignment() {
			return getRuleContext(VarAssignmentContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(PmynParser.NEW_LINE, 0); }
		public VariableAssignmentStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterVariableAssignmentStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitVariableAssignmentStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitVariableAssignmentStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_stat);
		int _la;
		try {
			setState(53);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(39);
				varAssignment();
				setState(40);
				match(NEW_LINE);
				}
				break;
			case 2:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(42);
				match(RETURN);
				setState(44);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NOT) | (1L << SUB_OPERATOR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(43);
					expr(0);
					}
				}

				setState(46);
				match(NEW_LINE);
				}
				break;
			case 3:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				expr(0);
				setState(48);
				match(NEW_LINE);
				}
				break;
			case 4:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				functionDecl();
				setState(51);
				match(NEW_LINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class VarRefContext extends ExprContext {
		public TerminalNode ID() { return getToken(PmynParser.ID, 0); }
		public VarRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterVarRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitVarRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitVarRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ModContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MOD_OPERATOR() { return getToken(PmynParser.MOD_OPERATOR, 0); }
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListRefContext extends ExprContext {
		public TerminalNode OPEN_BRACK() { return getToken(PmynParser.OPEN_BRACK, 0); }
		public SublistContext sublist() {
			return getRuleContext(SublistContext.class,0);
		}
		public TerminalNode CLOSE_BRACK() { return getToken(PmynParser.CLOSE_BRACK, 0); }
		public ListRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterListRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitListRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitListRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL_OPERATOR() { return getToken(PmynParser.MUL_OPERATOR, 0); }
		public TerminalNode DIV_OPERATOR() { return getToken(PmynParser.DIV_OPERATOR, 0); }
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ADD_OPERATOR() { return getToken(PmynParser.ADD_OPERATOR, 0); }
		public TerminalNode SUB_OPERATOR() { return getToken(PmynParser.SUB_OPERATOR, 0); }
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListGetIndexContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode OPEN_BRACK() { return getToken(PmynParser.OPEN_BRACK, 0); }
		public TerminalNode CLOSE_BRACK() { return getToken(PmynParser.CLOSE_BRACK, 0); }
		public ListGetIndexContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterListGetIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitListGetIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitListGetIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryMinusContext extends ExprContext {
		public TerminalNode SUB_OPERATOR() { return getToken(PmynParser.SUB_OPERATOR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterUnaryMinus(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitUnaryMinus(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitUnaryMinus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LiteralRefContext extends ExprContext {
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public LiteralRefContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterLiteralRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitLiteralRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitLiteralRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FuncCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(PmynParser.ID, 0); }
		public VarArgsContext varArgs() {
			return getRuleContext(VarArgsContext.class,0);
		}
		public FuncCallContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterFuncCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitFuncCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitFuncCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExprInsideParensContext extends ExprContext {
		public TerminalNode OPEN_PAREN() { return getToken(PmynParser.OPEN_PAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CLOSE_PAREN() { return getToken(PmynParser.CLOSE_PAREN, 0); }
		public ExprInsideParensContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterExprInsideParens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitExprInsideParens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitExprInsideParens(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(PmynParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ObjectAttributeContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DOT() { return getToken(PmynParser.DOT, 0); }
		public TerminalNode ID() { return getToken(PmynParser.ID, 0); }
		public ObjectAttributeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterObjectAttribute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitObjectAttribute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitObjectAttribute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class EqualityComparisonContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(PmynParser.EQUALS, 0); }
		public TerminalNode GREATER_THAN() { return getToken(PmynParser.GREATER_THAN, 0); }
		public TerminalNode GT_EQ() { return getToken(PmynParser.GT_EQ, 0); }
		public TerminalNode LESS_THAN() { return getToken(PmynParser.LESS_THAN, 0); }
		public TerminalNode LT_EQ() { return getToken(PmynParser.LT_EQ, 0); }
		public TerminalNode NOT_EQ_1() { return getToken(PmynParser.NOT_EQ_1, 0); }
		public TerminalNode NOT_EQ_2() { return getToken(PmynParser.NOT_EQ_2, 0); }
		public EqualityComparisonContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterEqualityComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitEqualityComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitEqualityComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndOrLogicContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(PmynParser.AND, 0); }
		public TerminalNode OR() { return getToken(PmynParser.OR, 0); }
		public AndOrLogicContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterAndOrLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitAndOrLogic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitAndOrLogic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				_localctx = new ExprInsideParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(56);
				match(OPEN_PAREN);
				setState(57);
				expr(0);
				setState(58);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(60);
				match(ID);
				setState(61);
				varArgs();
				}
				break;
			case 3:
				{
				_localctx = new ListRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				match(OPEN_BRACK);
				setState(63);
				sublist();
				setState(64);
				match(CLOSE_BRACK);
				}
				break;
			case 4:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(66);
				match(SUB_OPERATOR);
				setState(67);
				expr(10);
				}
				break;
			case 5:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(NOT);
				setState(69);
				expr(9);
				}
				break;
			case 6:
				{
				_localctx = new VarRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new LiteralRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(71);
				literal();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(97);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
					case 1:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(74);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						{
						setState(75);
						match(MOD_OPERATOR);
						}
						setState(76);
						expr(9);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(77);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(78);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MUL_OPERATOR || _la==DIV_OPERATOR) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						expr(8);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(80);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(81);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==ADD_OPERATOR || _la==SUB_OPERATOR) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(82);
						expr(7);
						}
						break;
					case 4:
						{
						_localctx = new EqualityComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(83);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(84);
						((EqualityComparisonContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LESS_THAN) | (1L << GREATER_THAN) | (1L << EQUALS) | (1L << GT_EQ) | (1L << LT_EQ) | (1L << NOT_EQ_1) | (1L << NOT_EQ_2))) != 0)) ) {
							((EqualityComparisonContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(85);
						expr(6);
						}
						break;
					case 5:
						{
						_localctx = new AndOrLogicContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(86);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(87);
						((AndOrLogicContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==AND || _la==OR) ) {
							((AndOrLogicContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(88);
						expr(5);
						}
						break;
					case 6:
						{
						_localctx = new ListGetIndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(89);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(90);
						match(OPEN_BRACK);
						setState(91);
						expr(0);
						setState(92);
						match(CLOSE_BRACK);
						}
						break;
					case 7:
						{
						_localctx = new ObjectAttributeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(94);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(95);
						match(DOT);
						setState(96);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class SublistContext extends ParserRuleContext {
		public List<SubContext> sub() {
			return getRuleContexts(SubContext.class);
		}
		public SubContext sub(int i) {
			return getRuleContext(SubContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PmynParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PmynParser.COMMA, i);
		}
		public SublistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sublist; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterSublist(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitSublist(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitSublist(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SublistContext sublist() throws RecognitionException {
		SublistContext _localctx = new SublistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sublist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			sub();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(103);
				match(COMMA);
				setState(104);
				sub();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public SubContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sub; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubContext sub() throws RecognitionException {
		SubContext _localctx = new SubContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PmynParser.DEF, 0); }
		public TerminalNode ID() { return getToken(PmynParser.ID, 0); }
		public VarArgsContext varArgs() {
			return getRuleContext(VarArgsContext.class,0);
		}
		public TerminalNode OPEN_BRACE() { return getToken(PmynParser.OPEN_BRACE, 0); }
		public FuncBodyContext funcBody() {
			return getRuleContext(FuncBodyContext.class,0);
		}
		public TerminalNode CLOSE_BRACE() { return getToken(PmynParser.CLOSE_BRACE, 0); }
		public List<TerminalNode> NEW_LINE() { return getTokens(PmynParser.NEW_LINE); }
		public TerminalNode NEW_LINE(int i) {
			return getToken(PmynParser.NEW_LINE, i);
		}
		public FunctionDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDecl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterFunctionDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitFunctionDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitFunctionDecl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDeclContext functionDecl() throws RecognitionException {
		FunctionDeclContext _localctx = new FunctionDeclContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionDecl);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(DEF);
			setState(113);
			match(ID);
			setState(114);
			varArgs();
			setState(115);
			match(OPEN_BRACE);
			setState(119);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(116);
					match(NEW_LINE);
					}
					} 
				}
				setState(121);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(122);
			funcBody();
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEW_LINE) {
				{
				{
				setState(123);
				match(NEW_LINE);
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(CLOSE_BRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarArgsContext extends ParserRuleContext {
		public TerminalNode OPEN_PAREN() { return getToken(PmynParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PmynParser.CLOSE_PAREN, 0); }
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public VarArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterVarArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitVarArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitVarArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarArgsContext varArgs() throws RecognitionException {
		VarArgsContext _localctx = new VarArgsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_varArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(OPEN_PAREN);
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << NOT) | (1L << SUB_OPERATOR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				setState(132);
				exprList();
				}
			}

			setState(135);
			match(CLOSE_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncBodyContext extends ParserRuleContext {
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public FuncBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterFuncBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitFuncBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitFuncBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncBodyContext funcBody() throws RecognitionException {
		FuncBodyContext _localctx = new FuncBodyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_funcBody);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__1) | (1L << RETURN) | (1L << DEF) | (1L << NOT) | (1L << SUB_OPERATOR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
				{
				{
				setState(137);
				stat();
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PmynParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PmynParser.COMMA, i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterExprList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitExprList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitExprList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_exprList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			expr(0);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(144);
				match(COMMA);
				setState(145);
				expr(0);
				}
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DecimalLiteralContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(PmynParser.FLOAT, 0); }
		public DecimalLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decimalLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecimalLiteralContext decimalLiteral() throws RecognitionException {
		DecimalLiteralContext _localctx = new DecimalLiteralContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_decimalLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(FLOAT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntegerLiteralContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(PmynParser.INT, 0); }
		public IntegerLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_integerLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntegerLiteralContext integerLiteral() throws RecognitionException {
		IntegerLiteralContext _localctx = new IntegerLiteralContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_integerLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StringLiteralContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(PmynParser.STRING, 0); }
		public StringLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralContext stringLiteral() throws RecognitionException {
		StringLiteralContext _localctx = new StringLiteralContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_stringLiteral);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanLiteralContext extends ParserRuleContext {
		public BooleanLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralContext booleanLiteral() throws RecognitionException {
		BooleanLiteralContext _localctx = new BooleanLiteralContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_booleanLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			_la = _input.LA(1);
			if ( !(_la==T__0 || _la==T__1) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LiteralContext extends ParserRuleContext {
		public DecimalLiteralContext decimalLiteral() {
			return getRuleContext(DecimalLiteralContext.class,0);
		}
		public IntegerLiteralContext integerLiteral() {
			return getRuleContext(IntegerLiteralContext.class,0);
		}
		public BooleanLiteralContext booleanLiteral() {
			return getRuleContext(BooleanLiteralContext.class,0);
		}
		public StringLiteralContext stringLiteral() {
			return getRuleContext(StringLiteralContext.class,0);
		}
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_literal);
		try {
			setState(163);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(159);
				decimalLiteral();
				}
				break;
			case INT:
				enterOuterAlt(_localctx, 2);
				{
				setState(160);
				integerLiteral();
				}
				break;
			case T__0:
			case T__1:
				enterOuterAlt(_localctx, 3);
				{
				setState(161);
				booleanLiteral();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(162);
				stringLiteral();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 8);
		case 1:
			return precpred(_ctx, 7);
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u00a8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\3\2\6\2\"\n\2\r\2\16"+
		"\2#\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4/\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\48\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\5\5K\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\7\5d\n\5\f\5\16\5g\13\5"+
		"\3\6\3\6\3\6\7\6l\n\6\f\6\16\6o\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bx"+
		"\n\b\f\b\16\b{\13\b\3\b\3\b\7\b\177\n\b\f\b\16\b\u0082\13\b\3\b\3\b\3"+
		"\t\3\t\5\t\u0088\n\t\3\t\3\t\3\n\7\n\u008d\n\n\f\n\16\n\u0090\13\n\3\13"+
		"\3\13\3\13\7\13\u0095\n\13\f\13\16\13\u0098\13\13\3\f\3\f\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\20\3\20\5\20\u00a6\n\20\3\20\2\3\b\21\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36\2\7\3\2\16\17\3\2\20\21\3\2\24\32"+
		"\3\2\f\r\3\2\3\4\2\u00b3\2!\3\2\2\2\4%\3\2\2\2\6\67\3\2\2\2\bJ\3\2\2\2"+
		"\nh\3\2\2\2\fp\3\2\2\2\16r\3\2\2\2\20\u0085\3\2\2\2\22\u008e\3\2\2\2\24"+
		"\u0091\3\2\2\2\26\u0099\3\2\2\2\30\u009b\3\2\2\2\32\u009d\3\2\2\2\34\u009f"+
		"\3\2\2\2\36\u00a5\3\2\2\2 \"\5\6\4\2! \3\2\2\2\"#\3\2\2\2#!\3\2\2\2#$"+
		"\3\2\2\2$\3\3\2\2\2%&\7&\2\2&\'\7%\2\2\'(\5\b\5\2(\5\3\2\2\2)*\5\4\3\2"+
		"*+\7*\2\2+8\3\2\2\2,.\7\b\2\2-/\5\b\5\2.-\3\2\2\2./\3\2\2\2/\60\3\2\2"+
		"\2\608\7*\2\2\61\62\5\b\5\2\62\63\7*\2\2\638\3\2\2\2\64\65\5\16\b\2\65"+
		"\66\7*\2\2\668\3\2\2\2\67)\3\2\2\2\67,\3\2\2\2\67\61\3\2\2\2\67\64\3\2"+
		"\2\28\7\3\2\2\29:\b\5\1\2:;\7\33\2\2;<\5\b\5\2<=\7\34\2\2=K\3\2\2\2>?"+
		"\7&\2\2?K\5\20\t\2@A\7\35\2\2AB\5\n\6\2BC\7\36\2\2CK\3\2\2\2DE\7\21\2"+
		"\2EK\5\b\5\fFG\7\13\2\2GK\5\b\5\13HK\7&\2\2IK\5\36\20\2J9\3\2\2\2J>\3"+
		"\2\2\2J@\3\2\2\2JD\3\2\2\2JF\3\2\2\2JH\3\2\2\2JI\3\2\2\2Ke\3\2\2\2LM\f"+
		"\n\2\2MN\7\22\2\2Nd\5\b\5\13OP\f\t\2\2PQ\t\2\2\2Qd\5\b\5\nRS\f\b\2\2S"+
		"T\t\3\2\2Td\5\b\5\tUV\f\7\2\2VW\t\4\2\2Wd\5\b\5\bXY\f\6\2\2YZ\t\5\2\2"+
		"Zd\5\b\5\7[\\\f\r\2\2\\]\7\35\2\2]^\5\b\5\2^_\7\36\2\2_d\3\2\2\2`a\f\5"+
		"\2\2ab\7\"\2\2bd\7&\2\2cL\3\2\2\2cO\3\2\2\2cR\3\2\2\2cU\3\2\2\2cX\3\2"+
		"\2\2c[\3\2\2\2c`\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\t\3\2\2\2ge\3"+
		"\2\2\2hm\5\f\7\2ij\7!\2\2jl\5\f\7\2ki\3\2\2\2lo\3\2\2\2mk\3\2\2\2mn\3"+
		"\2\2\2n\13\3\2\2\2om\3\2\2\2pq\5\b\5\2q\r\3\2\2\2rs\7\n\2\2st\7&\2\2t"+
		"u\5\20\t\2uy\7\37\2\2vx\7*\2\2wv\3\2\2\2x{\3\2\2\2yw\3\2\2\2yz\3\2\2\2"+
		"z|\3\2\2\2{y\3\2\2\2|\u0080\5\22\n\2}\177\7*\2\2~}\3\2\2\2\177\u0082\3"+
		"\2\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083\3\2\2\2\u0082\u0080"+
		"\3\2\2\2\u0083\u0084\7 \2\2\u0084\17\3\2\2\2\u0085\u0087\7\33\2\2\u0086"+
		"\u0088\5\24\13\2\u0087\u0086\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089\3"+
		"\2\2\2\u0089\u008a\7\34\2\2\u008a\21\3\2\2\2\u008b\u008d\5\6\4\2\u008c"+
		"\u008b\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e\u008f\3\2"+
		"\2\2\u008f\23\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0096\5\b\5\2\u0092\u0093"+
		"\7!\2\2\u0093\u0095\5\b\5\2\u0094\u0092\3\2\2\2\u0095\u0098\3\2\2\2\u0096"+
		"\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\25\3\2\2\2\u0098\u0096\3\2\2"+
		"\2\u0099\u009a\7(\2\2\u009a\27\3\2\2\2\u009b\u009c\7\'\2\2\u009c\31\3"+
		"\2\2\2\u009d\u009e\7)\2\2\u009e\33\3\2\2\2\u009f\u00a0\t\6\2\2\u00a0\35"+
		"\3\2\2\2\u00a1\u00a6\5\26\f\2\u00a2\u00a6\5\30\r\2\u00a3\u00a6\5\34\17"+
		"\2\u00a4\u00a6\5\32\16\2\u00a5\u00a1\3\2\2\2\u00a5\u00a2\3\2\2\2\u00a5"+
		"\u00a3\3\2\2\2\u00a5\u00a4\3\2\2\2\u00a6\37\3\2\2\2\17#.\67Jcemy\u0080"+
		"\u0087\u008e\u0096\u00a5";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}