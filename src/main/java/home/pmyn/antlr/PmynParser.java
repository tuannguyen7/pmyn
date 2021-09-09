// Generated from Pmyn.g4 by ANTLR 4.9.2
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
		IF=1, THEN=2, ELSE=3, RETURN=4, LAMBDA=5, DEF=6, NOT=7, AND=8, OR=9, WHILE=10, 
		IN=11, FOR=12, MUL_OPERATOR=13, DIV_OPERATOR=14, ADD_OPERATOR=15, SUB_OPERATOR=16, 
		MOD_OPERATOR=17, POW_OPERATOR=18, LESS_THAN=19, GREATER_THAN=20, EQUALS=21, 
		GT_EQ=22, LT_EQ=23, NOT_EQ_1=24, NOT_EQ_2=25, OPEN_PAREN=26, CLOSE_PAREN=27, 
		OPEN_BRACK=28, CLOSE_BRACK=29, OPEN_BRACE=30, CLOSE_BRACE=31, COMMA=32, 
		DOT=33, COLON=34, SEMI_COLON=35, ASSIGN=36, TRUE=37, FALSE=38, ID=39, 
		INT=40, FLOAT=41, STRING=42, NEW_LINE=43, WS=44, SL_COMMENT=45;
	public static final int
		RULE_compilationUnit = 0, RULE_stat = 1, RULE_expr = 2, RULE_sublist = 3, 
		RULE_sub = 4, RULE_varAssignmentStmt = 5, RULE_ifElseStmt = 6, RULE_elseStmt = 7, 
		RULE_blockStmt = 8, RULE_whileStmt = 9, RULE_forStmt = 10, RULE_functionDecl = 11, 
		RULE_funcParams = 12, RULE_funcArgs = 13;
	private static String[] makeRuleNames() {
		return new String[] {
			"compilationUnit", "stat", "expr", "sublist", "sub", "varAssignmentStmt", 
			"ifElseStmt", "elseStmt", "blockStmt", "whileStmt", "forStmt", "functionDecl", 
			"funcParams", "funcArgs"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'return'", "'lambda'", "'def'", "'not'", 
			"'and'", "'or'", "'while'", "'in'", "'for'", "'*'", "'/'", "'+'", "'-'", 
			"'%'", "'**'", "'<'", "'>'", "'=='", "'>='", "'<='", "'<>'", "'!='", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "','", "'.'", "':'", "';'", 
			"'='", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELSE", "RETURN", "LAMBDA", "DEF", "NOT", "AND", 
			"OR", "WHILE", "IN", "FOR", "MUL_OPERATOR", "DIV_OPERATOR", "ADD_OPERATOR", 
			"SUB_OPERATOR", "MOD_OPERATOR", "POW_OPERATOR", "LESS_THAN", "GREATER_THAN", 
			"EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "OPEN_PAREN", "CLOSE_PAREN", 
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
			setState(29); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(28);
				stat();
				}
				}
				setState(31); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << RETURN) | (1L << DEF) | (1L << NOT) | (1L << WHILE) | (1L << FOR) | (1L << SUB_OPERATOR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEW_LINE))) != 0) );
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
	public static class IfElseStatementContext extends StatContext {
		public IfElseStmtContext ifElseStmt() {
			return getRuleContext(IfElseStmtContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(PmynParser.NEW_LINE, 0); }
		public IfElseStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterIfElseStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitIfElseStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitIfElseStatement(this);
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
	public static class WhileStatementContext extends StatContext {
		public WhileStmtContext whileStmt() {
			return getRuleContext(WhileStmtContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(PmynParser.NEW_LINE, 0); }
		public WhileStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterWhileStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitWhileStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitWhileStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForStatementContext extends StatContext {
		public ForStmtContext forStmt() {
			return getRuleContext(ForStmtContext.class,0);
		}
		public TerminalNode NEW_LINE() { return getToken(PmynParser.NEW_LINE, 0); }
		public ForStatementContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterForStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitForStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitForStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				_localctx = new VariableAssignmentStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(33);
				varAssignmentStmt();
				setState(34);
				match(NEW_LINE);
				}
				break;
			case 2:
				_localctx = new IfElseStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				ifElseStmt();
				setState(37);
				match(NEW_LINE);
				}
				break;
			case 3:
				_localctx = new WhileStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(39);
				whileStmt();
				setState(40);
				match(NEW_LINE);
				}
				break;
			case 4:
				_localctx = new ForStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(42);
				forStmt();
				setState(43);
				match(NEW_LINE);
				}
				break;
			case 5:
				_localctx = new ReturnStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(45);
				match(RETURN);
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << SUB_OPERATOR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(46);
					expr(0);
					}
				}

				setState(49);
				match(NEW_LINE);
				}
				break;
			case 6:
				_localctx = new FuncDefContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				functionDecl();
				setState(51);
				match(NEW_LINE);
				}
				break;
			case 7:
				_localctx = new ExprStatementContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(53);
				expr(0);
				setState(54);
				match(NEW_LINE);
				}
				break;
			case 8:
				_localctx = new NewLineContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(56);
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
		public TerminalNode CLOSE_BRACK() { return getToken(PmynParser.CLOSE_BRACK, 0); }
		public SublistContext sublist() {
			return getRuleContext(SublistContext.class,0);
		}
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
	public static class FuncCallContext extends ExprContext {
		public TerminalNode ID() { return getToken(PmynParser.ID, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PmynParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PmynParser.CLOSE_PAREN, 0); }
		public FuncArgsContext funcArgs() {
			return getRuleContext(FuncArgsContext.class,0);
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
			setState(85);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				_localctx = new ExprInsideParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(60);
				match(OPEN_PAREN);
				setState(61);
				expr(0);
				setState(62);
				match(CLOSE_PAREN);
				}
				break;
			case 2:
				{
				_localctx = new FuncCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(64);
				match(ID);
				setState(65);
				match(OPEN_PAREN);
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << SUB_OPERATOR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(66);
					funcArgs();
					}
				}

				setState(69);
				match(CLOSE_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new ListRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(70);
				match(OPEN_BRACK);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NOT) | (1L << SUB_OPERATOR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(71);
					sublist();
					}
				}

				setState(74);
				match(CLOSE_BRACK);
				}
				break;
			case 4:
				{
				_localctx = new UnaryMinusContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(75);
				match(SUB_OPERATOR);
				setState(76);
				expr(14);
				}
				break;
			case 5:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(77);
				match(NOT);
				setState(78);
				expr(10);
				}
				break;
			case 6:
				{
				_localctx = new VarRefContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(79);
				match(ID);
				}
				break;
			case 7:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(80);
				match(STRING);
				}
				break;
			case 8:
				{
				_localctx = new IntegerLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(81);
				match(INT);
				}
				break;
			case 9:
				{
				_localctx = new DecimalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				match(FLOAT);
				}
				break;
			case 10:
				{
				_localctx = new BooleanTrueLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				match(TRUE);
				}
				break;
			case 11:
				{
				_localctx = new BooleanFalseLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				match(FALSE);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(112);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(110);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new PowContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(87);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(88);
						match(POW_OPERATOR);
						setState(89);
						expr(13);
						}
						break;
					case 2:
						{
						_localctx = new MulDivModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(90);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(91);
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
						setState(92);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(93);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(94);
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
						setState(95);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new AndOrLogicContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(96);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(97);
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
						setState(98);
						expr(10);
						}
						break;
					case 5:
						{
						_localctx = new EqualityComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(99);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(100);
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
						setState(101);
						expr(9);
						}
						break;
					case 6:
						{
						_localctx = new ListGetIndexContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(102);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(103);
						match(OPEN_BRACK);
						setState(104);
						expr(0);
						setState(105);
						match(CLOSE_BRACK);
						}
						break;
					case 7:
						{
						_localctx = new ObjectAttributeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(107);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(108);
						match(DOT);
						setState(109);
						match(ID);
						}
						break;
					}
					} 
				}
				setState(114);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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
			setState(115);
			sub();
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(116);
				match(COMMA);
				setState(117);
				sub();
				}
				}
				setState(122);
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
			setState(123);
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
			setState(125);
			match(ID);
			setState(126);
			match(ASSIGN);
			setState(127);
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

	public static class IfElseStmtContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(PmynParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(PmynParser.IF, i);
		}
		public List<TerminalNode> OPEN_PAREN() { return getTokens(PmynParser.OPEN_PAREN); }
		public TerminalNode OPEN_PAREN(int i) {
			return getToken(PmynParser.OPEN_PAREN, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CLOSE_PAREN() { return getTokens(PmynParser.CLOSE_PAREN); }
		public TerminalNode CLOSE_PAREN(int i) {
			return getToken(PmynParser.CLOSE_PAREN, i);
		}
		public List<BlockStmtContext> blockStmt() {
			return getRuleContexts(BlockStmtContext.class);
		}
		public BlockStmtContext blockStmt(int i) {
			return getRuleContext(BlockStmtContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(PmynParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(PmynParser.ELSE, i);
		}
		public ElseStmtContext elseStmt() {
			return getRuleContext(ElseStmtContext.class,0);
		}
		public IfElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifElseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterIfElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitIfElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitIfElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfElseStmtContext ifElseStmt() throws RecognitionException {
		IfElseStmtContext _localctx = new IfElseStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifElseStmt);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(IF);
			setState(130);
			match(OPEN_PAREN);
			setState(131);
			expr(0);
			setState(132);
			match(CLOSE_PAREN);
			setState(133);
			blockStmt();
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(134);
					match(ELSE);
					setState(135);
					match(IF);
					setState(136);
					match(OPEN_PAREN);
					setState(137);
					expr(0);
					setState(138);
					match(CLOSE_PAREN);
					setState(139);
					blockStmt();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
			}
			setState(147);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(146);
				elseStmt();
				}
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

	public static class ElseStmtContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(PmynParser.ELSE, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ElseStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterElseStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitElseStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitElseStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseStmtContext elseStmt() throws RecognitionException {
		ElseStmtContext _localctx = new ElseStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_elseStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			match(ELSE);
			setState(150);
			blockStmt();
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

	public static class BlockStmtContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACE() { return getToken(PmynParser.OPEN_BRACE, 0); }
		public TerminalNode CLOSE_BRACE() { return getToken(PmynParser.CLOSE_BRACE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public BlockStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterBlockStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitBlockStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitBlockStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockStmtContext blockStmt() throws RecognitionException {
		BlockStmtContext _localctx = new BlockStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_blockStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(OPEN_BRACE);
			setState(156);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IF) | (1L << RETURN) | (1L << DEF) | (1L << NOT) | (1L << WHILE) | (1L << FOR) | (1L << SUB_OPERATOR) | (1L << OPEN_PAREN) | (1L << OPEN_BRACK) | (1L << TRUE) | (1L << FALSE) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEW_LINE))) != 0)) {
				{
				{
				setState(153);
				stat();
				}
				}
				setState(158);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(159);
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

	public static class WhileStmtContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(PmynParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public WhileStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterWhileStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitWhileStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitWhileStmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileStmtContext whileStmt() throws RecognitionException {
		WhileStmtContext _localctx = new WhileStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whileStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(WHILE);
			setState(162);
			expr(0);
			setState(163);
			blockStmt();
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

	public static class ForStmtContext extends ParserRuleContext {
		public ForStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forStmt; }
	 
		public ForStmtContext() { }
		public void copyFrom(ForStmtContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ForIndexStatementContext extends ForStmtContext {
		public TerminalNode FOR() { return getToken(PmynParser.FOR, 0); }
		public List<TerminalNode> SEMI_COLON() { return getTokens(PmynParser.SEMI_COLON); }
		public TerminalNode SEMI_COLON(int i) {
			return getToken(PmynParser.SEMI_COLON, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public List<VarAssignmentStmtContext> varAssignmentStmt() {
			return getRuleContexts(VarAssignmentStmtContext.class);
		}
		public VarAssignmentStmtContext varAssignmentStmt(int i) {
			return getRuleContext(VarAssignmentStmtContext.class,i);
		}
		public ForIndexStatementContext(ForStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterForIndexStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitForIndexStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitForIndexStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ForInStatementContext extends ForStmtContext {
		public TerminalNode FOR() { return getToken(PmynParser.FOR, 0); }
		public TerminalNode ID() { return getToken(PmynParser.ID, 0); }
		public TerminalNode IN() { return getToken(PmynParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public ForInStatementContext(ForStmtContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterForInStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitForInStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitForInStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForStmtContext forStmt() throws RecognitionException {
		ForStmtContext _localctx = new ForStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forStmt);
		int _la;
		try {
			setState(183);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new ForInStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(165);
				match(FOR);
				setState(166);
				match(ID);
				setState(167);
				match(IN);
				setState(168);
				expr(0);
				setState(169);
				blockStmt();
				}
				break;
			case 2:
				_localctx = new ForIndexStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(171);
				match(FOR);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(172);
					varAssignmentStmt();
					}
				}

				setState(175);
				match(SEMI_COLON);
				setState(176);
				expr(0);
				setState(177);
				match(SEMI_COLON);
				setState(179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(178);
					varAssignmentStmt();
					}
				}

				setState(181);
				blockStmt();
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

	public static class FunctionDeclContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(PmynParser.DEF, 0); }
		public TerminalNode ID() { return getToken(PmynParser.ID, 0); }
		public TerminalNode OPEN_PAREN() { return getToken(PmynParser.OPEN_PAREN, 0); }
		public TerminalNode CLOSE_PAREN() { return getToken(PmynParser.CLOSE_PAREN, 0); }
		public BlockStmtContext blockStmt() {
			return getRuleContext(BlockStmtContext.class,0);
		}
		public FuncParamsContext funcParams() {
			return getRuleContext(FuncParamsContext.class,0);
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
		enterRule(_localctx, 22, RULE_functionDecl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			match(DEF);
			setState(186);
			match(ID);
			setState(187);
			match(OPEN_PAREN);
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(188);
				funcParams();
				}
			}

			setState(191);
			match(CLOSE_PAREN);
			setState(192);
			blockStmt();
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

	public static class FuncParamsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(PmynParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(PmynParser.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(PmynParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(PmynParser.COMMA, i);
		}
		public FuncParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcParams; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterFuncParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitFuncParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitFuncParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncParamsContext funcParams() throws RecognitionException {
		FuncParamsContext _localctx = new FuncParamsContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcParams);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(ID);
			setState(199);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(195);
				match(COMMA);
				setState(196);
				match(ID);
				}
				}
				setState(201);
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

	public static class FuncArgsContext extends ParserRuleContext {
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
		public FuncArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcArgs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).enterFuncArgs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PmynListener ) ((PmynListener)listener).exitFuncArgs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof PmynVisitor ) return ((PmynVisitor<? extends T>)visitor).visitFuncArgs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncArgsContext funcArgs() throws RecognitionException {
		FuncArgsContext _localctx = new FuncArgsContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_funcArgs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			expr(0);
			setState(207);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(203);
				match(COMMA);
				setState(204);
				expr(0);
				}
				}
				setState(209);
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
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 9);
		case 4:
			return precpred(_ctx, 8);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3/\u00d5\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\6\2 \n\2\r\2\16\2!\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3\62\n\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\5\3<\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4F\n"+
		"\4\3\4\3\4\3\4\5\4K\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5"+
		"\4X\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4q\n\4\f\4\16\4t\13\4\3\5\3\5\3\5\7\5"+
		"y\n\5\f\5\16\5|\13\5\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\7\b\u0090\n\b\f\b\16\b\u0093\13\b\3\b\5\b\u0096"+
		"\n\b\3\t\3\t\3\t\3\n\3\n\7\n\u009d\n\n\f\n\16\n\u00a0\13\n\3\n\3\n\3\13"+
		"\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u00b0\n\f\3\f\3\f"+
		"\3\f\3\f\5\f\u00b6\n\f\3\f\3\f\5\f\u00ba\n\f\3\r\3\r\3\r\3\r\5\r\u00c0"+
		"\n\r\3\r\3\r\3\r\3\16\3\16\3\16\7\16\u00c8\n\16\f\16\16\16\u00cb\13\16"+
		"\3\17\3\17\3\17\7\17\u00d0\n\17\f\17\16\17\u00d3\13\17\3\17\2\3\6\20\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\2\6\4\2\17\20\23\23\3\2\21\22\3\2\n"+
		"\13\3\2\25\33\2\u00ec\2\37\3\2\2\2\4;\3\2\2\2\6W\3\2\2\2\bu\3\2\2\2\n"+
		"}\3\2\2\2\f\177\3\2\2\2\16\u0083\3\2\2\2\20\u0097\3\2\2\2\22\u009a\3\2"+
		"\2\2\24\u00a3\3\2\2\2\26\u00b9\3\2\2\2\30\u00bb\3\2\2\2\32\u00c4\3\2\2"+
		"\2\34\u00cc\3\2\2\2\36 \5\4\3\2\37\36\3\2\2\2 !\3\2\2\2!\37\3\2\2\2!\""+
		"\3\2\2\2\"\3\3\2\2\2#$\5\f\7\2$%\7-\2\2%<\3\2\2\2&\'\5\16\b\2\'(\7-\2"+
		"\2(<\3\2\2\2)*\5\24\13\2*+\7-\2\2+<\3\2\2\2,-\5\26\f\2-.\7-\2\2.<\3\2"+
		"\2\2/\61\7\6\2\2\60\62\5\6\4\2\61\60\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2"+
		"\2\63<\7-\2\2\64\65\5\30\r\2\65\66\7-\2\2\66<\3\2\2\2\678\5\6\4\289\7"+
		"-\2\29<\3\2\2\2:<\7-\2\2;#\3\2\2\2;&\3\2\2\2;)\3\2\2\2;,\3\2\2\2;/\3\2"+
		"\2\2;\64\3\2\2\2;\67\3\2\2\2;:\3\2\2\2<\5\3\2\2\2=>\b\4\1\2>?\7\34\2\2"+
		"?@\5\6\4\2@A\7\35\2\2AX\3\2\2\2BC\7)\2\2CE\7\34\2\2DF\5\34\17\2ED\3\2"+
		"\2\2EF\3\2\2\2FG\3\2\2\2GX\7\35\2\2HJ\7\36\2\2IK\5\b\5\2JI\3\2\2\2JK\3"+
		"\2\2\2KL\3\2\2\2LX\7\37\2\2MN\7\22\2\2NX\5\6\4\20OP\7\t\2\2PX\5\6\4\f"+
		"QX\7)\2\2RX\7,\2\2SX\7*\2\2TX\7+\2\2UX\7\'\2\2VX\7(\2\2W=\3\2\2\2WB\3"+
		"\2\2\2WH\3\2\2\2WM\3\2\2\2WO\3\2\2\2WQ\3\2\2\2WR\3\2\2\2WS\3\2\2\2WT\3"+
		"\2\2\2WU\3\2\2\2WV\3\2\2\2Xr\3\2\2\2YZ\f\17\2\2Z[\7\24\2\2[q\5\6\4\17"+
		"\\]\f\16\2\2]^\t\2\2\2^q\5\6\4\17_`\f\r\2\2`a\t\3\2\2aq\5\6\4\16bc\f\13"+
		"\2\2cd\t\4\2\2dq\5\6\4\fef\f\n\2\2fg\t\5\2\2gq\5\6\4\13hi\f\21\2\2ij\7"+
		"\36\2\2jk\5\6\4\2kl\7\37\2\2lq\3\2\2\2mn\f\t\2\2no\7#\2\2oq\7)\2\2pY\3"+
		"\2\2\2p\\\3\2\2\2p_\3\2\2\2pb\3\2\2\2pe\3\2\2\2ph\3\2\2\2pm\3\2\2\2qt"+
		"\3\2\2\2rp\3\2\2\2rs\3\2\2\2s\7\3\2\2\2tr\3\2\2\2uz\5\n\6\2vw\7\"\2\2"+
		"wy\5\n\6\2xv\3\2\2\2y|\3\2\2\2zx\3\2\2\2z{\3\2\2\2{\t\3\2\2\2|z\3\2\2"+
		"\2}~\5\6\4\2~\13\3\2\2\2\177\u0080\7)\2\2\u0080\u0081\7&\2\2\u0081\u0082"+
		"\5\6\4\2\u0082\r\3\2\2\2\u0083\u0084\7\3\2\2\u0084\u0085\7\34\2\2\u0085"+
		"\u0086\5\6\4\2\u0086\u0087\7\35\2\2\u0087\u0091\5\22\n\2\u0088\u0089\7"+
		"\5\2\2\u0089\u008a\7\3\2\2\u008a\u008b\7\34\2\2\u008b\u008c\5\6\4\2\u008c"+
		"\u008d\7\35\2\2\u008d\u008e\5\22\n\2\u008e\u0090\3\2\2\2\u008f\u0088\3"+
		"\2\2\2\u0090\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092"+
		"\u0095\3\2\2\2\u0093\u0091\3\2\2\2\u0094\u0096\5\20\t\2\u0095\u0094\3"+
		"\2\2\2\u0095\u0096\3\2\2\2\u0096\17\3\2\2\2\u0097\u0098\7\5\2\2\u0098"+
		"\u0099\5\22\n\2\u0099\21\3\2\2\2\u009a\u009e\7 \2\2\u009b\u009d\5\4\3"+
		"\2\u009c\u009b\3\2\2\2\u009d\u00a0\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a1\3\2\2\2\u00a0\u009e\3\2\2\2\u00a1\u00a2\7!\2\2\u00a2"+
		"\23\3\2\2\2\u00a3\u00a4\7\f\2\2\u00a4\u00a5\5\6\4\2\u00a5\u00a6\5\22\n"+
		"\2\u00a6\25\3\2\2\2\u00a7\u00a8\7\16\2\2\u00a8\u00a9\7)\2\2\u00a9\u00aa"+
		"\7\r\2\2\u00aa\u00ab\5\6\4\2\u00ab\u00ac\5\22\n\2\u00ac\u00ba\3\2\2\2"+
		"\u00ad\u00af\7\16\2\2\u00ae\u00b0\5\f\7\2\u00af\u00ae\3\2\2\2\u00af\u00b0"+
		"\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b2\7%\2\2\u00b2\u00b3\5\6\4\2\u00b3"+
		"\u00b5\7%\2\2\u00b4\u00b6\5\f\7\2\u00b5\u00b4\3\2\2\2\u00b5\u00b6\3\2"+
		"\2\2\u00b6\u00b7\3\2\2\2\u00b7\u00b8\5\22\n\2\u00b8\u00ba\3\2\2\2\u00b9"+
		"\u00a7\3\2\2\2\u00b9\u00ad\3\2\2\2\u00ba\27\3\2\2\2\u00bb\u00bc\7\b\2"+
		"\2\u00bc\u00bd\7)\2\2\u00bd\u00bf\7\34\2\2\u00be\u00c0\5\32\16\2\u00bf"+
		"\u00be\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c2\7\35"+
		"\2\2\u00c2\u00c3\5\22\n\2\u00c3\31\3\2\2\2\u00c4\u00c9\7)\2\2\u00c5\u00c6"+
		"\7\"\2\2\u00c6\u00c8\7)\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\33\3\2\2\2\u00cb\u00c9\3\2\2"+
		"\2\u00cc\u00d1\5\6\4\2\u00cd\u00ce\7\"\2\2\u00ce\u00d0\5\6\4\2\u00cf\u00cd"+
		"\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2"+
		"\35\3\2\2\2\u00d3\u00d1\3\2\2\2\24!\61;EJWprz\u0091\u0095\u009e\u00af"+
		"\u00b5\u00b9\u00bf\u00c9\u00d1";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}