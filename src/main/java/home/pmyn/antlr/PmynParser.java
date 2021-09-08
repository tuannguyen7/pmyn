// Generated from src/main/java/home/pmyn/antlr/Pmyn.g4 by ANTLR 4.9.2

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
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		IF=1, THEN=2, ELSE=3, RETURN=4, LAMBDA=5, DEF=6, NOT=7, AND=8, OR=9, MUL_OPERATOR=10, 
		DIV_OPERATOR=11, ADD_OPERATOR=12, SUB_OPERATOR=13, MOD_OPERATOR=14, POW_OPERATOR=15, 
		LESS_THAN=16, GREATER_THAN=17, EQUALS=18, GT_EQ=19, LT_EQ=20, NOT_EQ_1=21, 
		NOT_EQ_2=22, OPEN_PAREN=23, CLOSE_PAREN=24, OPEN_BRACK=25, CLOSE_BRACK=26, 
		OPEN_BRACE=27, CLOSE_BRACE=28, COMMA=29, DOT=30, COLON=31, SEMI_COLON=32, 
		ASSIGN=33, TRUE=34, FALSE=35, ID=36, INT=37, FLOAT=38, STRING=39, NEW_LINE=40, 
		WS=41, SL_COMMENT=42;
	public static final int
		RULE_compilationUnit = 0, RULE_stat = 1, RULE_expr = 2, RULE_sublist = 3, 
		RULE_sub = 4, RULE_varAssignmentStmt = 5;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "stat", "expr", "sublist", "sub", "varAssignmentStmt"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'return'", "'lambda'", "'def'", "'not'", 
			"'and'", "'or'", "'*'", "'/'", "'+'", "'-'", "'%'", "'**'", "'<'", "'>'", 
			"'=='", "'>='", "'<='", "'<>'", "'!='", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "','", "'.'", "':'", "';'", "'='", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELSE", "RETURN", "LAMBDA", "DEF", "NOT", "AND", 
			"OR", "MUL_OPERATOR", "DIV_OPERATOR", "ADD_OPERATOR", "SUB_OPERATOR", 
			"MOD_OPERATOR", "POW_OPERATOR", "LESS_THAN", "GREATER_THAN", "EQUALS", 
			"GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "COMMA", "DOT", 
			"COLON", "SEMI_COLON", "ASSIGN", "TRUE", "FALSE", "ID", "INT", "FLOAT", 
			"STRING", "NEW_LINE", "WS", "SL_COMMENT"
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
			setState(13); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(12);
				stat();
				}
				}
				setState(15); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << SUB_OPERATOR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEW_LINE))) != 0) );
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
	public static class NewLineContext extends StatContext {
		public TerminalNode NEW_LINE() { return getToken(PmynParser.NEW_LINE, 0); }
		public NewLineContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitNewLine(this);
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
		public VarAssignmentStmtContext varAssignmentStmt() {
			return getRuleContext(VarAssignmentStmtContext.class,0);
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
		enterRule(_localctx, 2, RULE_stat);
		try {
			setState(24);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(17);
				varAssignmentStmt();
				setState(18);
				match(NEW_LINE);
				}
				break;
			case 2:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(20);
				expr(0);
				setState(21);
				match(NEW_LINE);
				}
				break;
			case 3:
				_localctx = new NewLineContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(23);
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
	public static class MulDivModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MUL_OPERATOR() { return getToken(PmynParser.MUL_OPERATOR, 0); }
		public TerminalNode DIV_OPERATOR() { return getToken(PmynParser.DIV_OPERATOR, 0); }
		public TerminalNode MOD_OPERATOR() { return getToken(PmynParser.MOD_OPERATOR, 0); }
		public MulDivModContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterMulDivMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitMulDivMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitMulDivMod(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ExprContext {
		public TerminalNode STRING() { return getToken(PmynParser.STRING, 0); }
		public StringLiteralContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class DecimalLiteralContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(PmynParser.FLOAT, 0); }
		public DecimalLiteralContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class PowContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode POW_OPERATOR() { return getToken(PmynParser.POW_OPERATOR, 0); }
		public PowContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterPow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitPow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitPow(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanTrueLiteralContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(PmynParser.TRUE, 0); }
		public BooleanTrueLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterBooleanTrueLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitBooleanTrueLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitBooleanTrueLiteral(this);
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
	public static class IntegerLiteralContext extends ExprContext {
		public TerminalNode INT() { return getToken(PmynParser.INT, 0); }
		public IntegerLiteralContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class BooleanFalseLiteralContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(PmynParser.FALSE, 0); }
		public BooleanFalseLiteralContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterBooleanFalseLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitBooleanFalseLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitBooleanFalseLiteral(this);
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

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAREN:
				{
				_localctx = new ExprInsideParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(27);
				match(OPEN_PAREN);
				setState(28);
				expr(0);
				setState(29);
				match(CLOSE_PAREN);
				}
				break;
			case OPEN_BRACK:
				{
				_localctx = new ListRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(31);
				match(OPEN_BRACK);
				setState(32);
				sublist();
				setState(33);
				match(CLOSE_BRACK);
				}
				break;
			case SUB_OPERATOR:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(35);
				match(SUB_OPERATOR);
				setState(36);
				expr(13);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(37);
				match(NOT);
				setState(38);
				expr(9);
				}
				break;
			case ID:
				{
				_localctx = new VarRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(39);
				match(ID);
				}
				break;
			case STRING:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(40);
				match(STRING);
				}
				break;
			case INT:
				{
				_localctx = new IntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(41);
				match(INT);
				}
				break;
			case FLOAT:
				{
				_localctx = new DecimalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(42);
				match(FLOAT);
				}
				break;
			case TRUE:
				{
				_localctx = new BooleanTrueLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(43);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new BooleanFalseLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(44);
				match(FALSE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(69);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(67);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(47);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(48);
						match(POW_OPERATOR);
						setState(49);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(50);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(51);
						((MulDivModContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MUL_OPERATOR) | (1L << DIV_OPERATOR) | (1L << MOD_OPERATOR))) != 0)) ) {
							((MulDivModContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(52);
						expr(12);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(53);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(54);
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
						setState(55);
						expr(11);
						}
						break;
					case 4:
						{
						_localctx = new AndOrLogicContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(56);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(57);
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
						setState(58);
						expr(9);
						}
						break;
					case 5:
						{
						_localctx = new EqualityComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(59);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(60);
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
						setState(61);
						expr(8);
						}
						break;
					case 6:
						{
						_localctx = new ListGetIndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(62);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(63);
						match(OPEN_BRACK);
						setState(64);
						expr(0);
						setState(65);
						match(CLOSE_BRACK);
						}
						break;
					}
					} 
				}
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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
		enterRule(_localctx, 6, RULE_sublist);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(72);
			sub();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(73);
				match(COMMA);
				setState(74);
				sub();
				}
				}
				setState(79);
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
		enterRule(_localctx, 8, RULE_sub);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
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

	public static class VarAssignmentStmtContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(PmynParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(PmynParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public VarAssignmentStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssignmentStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterVarAssignmentStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitVarAssignmentStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitVarAssignmentStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignmentStmtContext varAssignmentStmt() throws RecognitionException {
		VarAssignmentStmtContext _localctx = new VarAssignmentStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_varAssignmentStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(ID);
			setState(83);
			match(ASSIGN);
			setState(84);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 2:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 8);
		case 4:
			return precpred(_ctx, 7);
		case 5:
			return precpred(_ctx, 14);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,Y\4\2\t\2\4\3\t\3"+
		"\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\3\2\6\2\20\n\2\r\2\16\2\21\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3\33\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\60\n\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4F\n\4\f"+
		"\4\16\4I\13\4\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\2\3\6\b\2\4\6\b\n\f\2\6\4\2\f\r\20\20\3\2\16\17\3\2\n\13\3\2"+
		"\22\30\2e\2\17\3\2\2\2\4\32\3\2\2\2\6/\3\2\2\2\bJ\3\2\2\2\nR\3\2\2\2\f"+
		"T\3\2\2\2\16\20\5\4\3\2\17\16\3\2\2\2\20\21\3\2\2\2\21\17\3\2\2\2\21\22"+
		"\3\2\2\2\22\3\3\2\2\2\23\24\5\f\7\2\24\25\7*\2\2\25\33\3\2\2\2\26\27\5"+
		"\6\4\2\27\30\7*\2\2\30\33\3\2\2\2\31\33\7*\2\2\32\23\3\2\2\2\32\26\3\2"+
		"\2\2\32\31\3\2\2\2\33\5\3\2\2\2\34\35\b\4\1\2\35\36\7\31\2\2\36\37\5\6"+
		"\4\2\37 \7\32\2\2 \60\3\2\2\2!\"\7\33\2\2\"#\5\b\5\2#$\7\34\2\2$\60\3"+
		"\2\2\2%&\7\17\2\2&\60\5\6\4\17\'(\7\t\2\2(\60\5\6\4\13)\60\7&\2\2*\60"+
		"\7)\2\2+\60\7\'\2\2,\60\7(\2\2-\60\7$\2\2.\60\7%\2\2/\34\3\2\2\2/!\3\2"+
		"\2\2/%\3\2\2\2/\'\3\2\2\2/)\3\2\2\2/*\3\2\2\2/+\3\2\2\2/,\3\2\2\2/-\3"+
		"\2\2\2/.\3\2\2\2\60G\3\2\2\2\61\62\f\16\2\2\62\63\7\21\2\2\63F\5\6\4\16"+
		"\64\65\f\r\2\2\65\66\t\2\2\2\66F\5\6\4\16\678\f\f\2\289\t\3\2\29F\5\6"+
		"\4\r:;\f\n\2\2;<\t\4\2\2<F\5\6\4\13=>\f\t\2\2>?\t\5\2\2?F\5\6\4\n@A\f"+
		"\20\2\2AB\7\33\2\2BC\5\6\4\2CD\7\34\2\2DF\3\2\2\2E\61\3\2\2\2E\64\3\2"+
		"\2\2E\67\3\2\2\2E:\3\2\2\2E=\3\2\2\2E@\3\2\2\2FI\3\2\2\2GE\3\2\2\2GH\3"+
		"\2\2\2H\7\3\2\2\2IG\3\2\2\2JO\5\n\6\2KL\7\37\2\2LN\5\n\6\2MK\3\2\2\2N"+
		"Q\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2QO\3\2\2\2RS\5\6\4\2S\13\3\2\2"+
		"\2TU\7&\2\2UV\7#\2\2VW\5\6\4\2W\r\3\2\2\2\b\21\32/EGO";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}