// Generated from Pmyn.g4 by ANTLR 4.8

package home.pmyn.antlr;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PmynLexer extends Lexer {
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
		DOT=32, COLON=33, SEMI_COLON=34, ASSIGN=35, ID=36, NUMBER=37, STRING=38, 
		NEW_LINE=39, WS=40, SL_COMMENT=41;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "IF", "THEN", "ELSE", "RETURN", "LAMBDA", "DEF", "NOT", 
			"AND", "OR", "MUL_OPERATOR", "DIV_OPERATOR", "ADD_OPERATOR", "SUB_OPERATOR", 
			"MOD_OPERATOR", "POWER_OPERATOR", "LESS_THAN", "GREATER_THAN", "EQUALS", 
			"GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "COMMA", "DOT", 
			"COLON", "SEMI_COLON", "ASSIGN", "ID", "LETTER", "DIGIT", "INT", "FLOAT", 
			"NUMBER", "STRING", "NEW_LINE", "WS", "SL_COMMENT"
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
			"COLON", "SEMI_COLON", "ASSIGN", "ID", "NUMBER", "STRING", "NEW_LINE", 
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


	public PmynLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pmyn.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2+\u0112\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21"+
		"\3\22\3\22\3\22\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34"+
		"\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\3#\3$\3$\3%\3%\3"+
		"%\3%\7%\u00cd\n%\f%\16%\u00d0\13%\3&\3&\3\'\3\'\3(\6(\u00d7\n(\r(\16("+
		"\u00d8\3)\6)\u00dc\n)\r)\16)\u00dd\3)\3)\6)\u00e2\n)\r)\16)\u00e3\3*\3"+
		"*\5*\u00e8\n*\3+\3+\7+\u00ec\n+\f+\16+\u00ef\13+\3+\3+\3+\7+\u00f4\n+"+
		"\f+\16+\u00f7\13+\3+\5+\u00fa\n+\3,\5,\u00fd\n,\3,\3,\3-\6-\u0102\n-\r"+
		"-\16-\u0103\3-\3-\3.\3.\7.\u010a\n.\f.\16.\u010d\13.\3.\3.\3.\3.\5\u00ed"+
		"\u00f5\u010b\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\2Q\2S\'U(W)Y*[+\3\2\7\4\2C\\c"+
		"|\3\2\62;\4\2$$^^\4\2))^^\5\2\13\13\17\17\"\"\2\u011a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2S"+
		"\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5b\3\2"+
		"\2\2\7h\3\2\2\2\tk\3\2\2\2\13p\3\2\2\2\ru\3\2\2\2\17|\3\2\2\2\21\u0083"+
		"\3\2\2\2\23\u0087\3\2\2\2\25\u008b\3\2\2\2\27\u008f\3\2\2\2\31\u0092\3"+
		"\2\2\2\33\u0094\3\2\2\2\35\u0096\3\2\2\2\37\u0098\3\2\2\2!\u009a\3\2\2"+
		"\2#\u009c\3\2\2\2%\u009f\3\2\2\2\'\u00a1\3\2\2\2)\u00a3\3\2\2\2+\u00a6"+
		"\3\2\2\2-\u00a9\3\2\2\2/\u00ac\3\2\2\2\61\u00af\3\2\2\2\63\u00b2\3\2\2"+
		"\2\65\u00b4\3\2\2\2\67\u00b6\3\2\2\29\u00b8\3\2\2\2;\u00ba\3\2\2\2=\u00bc"+
		"\3\2\2\2?\u00be\3\2\2\2A\u00c0\3\2\2\2C\u00c2\3\2\2\2E\u00c4\3\2\2\2G"+
		"\u00c6\3\2\2\2I\u00c8\3\2\2\2K\u00d1\3\2\2\2M\u00d3\3\2\2\2O\u00d6\3\2"+
		"\2\2Q\u00db\3\2\2\2S\u00e7\3\2\2\2U\u00f9\3\2\2\2W\u00fc\3\2\2\2Y\u0101"+
		"\3\2\2\2[\u0107\3\2\2\2]^\7v\2\2^_\7t\2\2_`\7w\2\2`a\7g\2\2a\4\3\2\2\2"+
		"bc\7h\2\2cd\7c\2\2de\7n\2\2ef\7u\2\2fg\7g\2\2g\6\3\2\2\2hi\7k\2\2ij\7"+
		"h\2\2j\b\3\2\2\2kl\7v\2\2lm\7j\2\2mn\7g\2\2no\7p\2\2o\n\3\2\2\2pq\7g\2"+
		"\2qr\7n\2\2rs\7u\2\2st\7g\2\2t\f\3\2\2\2uv\7t\2\2vw\7g\2\2wx\7v\2\2xy"+
		"\7w\2\2yz\7t\2\2z{\7p\2\2{\16\3\2\2\2|}\7n\2\2}~\7c\2\2~\177\7o\2\2\177"+
		"\u0080\7d\2\2\u0080\u0081\7f\2\2\u0081\u0082\7c\2\2\u0082\20\3\2\2\2\u0083"+
		"\u0084\7f\2\2\u0084\u0085\7g\2\2\u0085\u0086\7h\2\2\u0086\22\3\2\2\2\u0087"+
		"\u0088\7p\2\2\u0088\u0089\7q\2\2\u0089\u008a\7v\2\2\u008a\24\3\2\2\2\u008b"+
		"\u008c\7c\2\2\u008c\u008d\7p\2\2\u008d\u008e\7f\2\2\u008e\26\3\2\2\2\u008f"+
		"\u0090\7q\2\2\u0090\u0091\7t\2\2\u0091\30\3\2\2\2\u0092\u0093\7,\2\2\u0093"+
		"\32\3\2\2\2\u0094\u0095\7\61\2\2\u0095\34\3\2\2\2\u0096\u0097\7-\2\2\u0097"+
		"\36\3\2\2\2\u0098\u0099\7/\2\2\u0099 \3\2\2\2\u009a\u009b\7\'\2\2\u009b"+
		"\"\3\2\2\2\u009c\u009d\7,\2\2\u009d\u009e\7,\2\2\u009e$\3\2\2\2\u009f"+
		"\u00a0\7>\2\2\u00a0&\3\2\2\2\u00a1\u00a2\7@\2\2\u00a2(\3\2\2\2\u00a3\u00a4"+
		"\7?\2\2\u00a4\u00a5\7?\2\2\u00a5*\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\u00a8"+
		"\7?\2\2\u00a8,\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ab\7?\2\2\u00ab.\3"+
		"\2\2\2\u00ac\u00ad\7>\2\2\u00ad\u00ae\7@\2\2\u00ae\60\3\2\2\2\u00af\u00b0"+
		"\7#\2\2\u00b0\u00b1\7?\2\2\u00b1\62\3\2\2\2\u00b2\u00b3\7*\2\2\u00b3\64"+
		"\3\2\2\2\u00b4\u00b5\7+\2\2\u00b5\66\3\2\2\2\u00b6\u00b7\7]\2\2\u00b7"+
		"8\3\2\2\2\u00b8\u00b9\7_\2\2\u00b9:\3\2\2\2\u00ba\u00bb\7}\2\2\u00bb<"+
		"\3\2\2\2\u00bc\u00bd\7\177\2\2\u00bd>\3\2\2\2\u00be\u00bf\7.\2\2\u00bf"+
		"@\3\2\2\2\u00c0\u00c1\7\60\2\2\u00c1B\3\2\2\2\u00c2\u00c3\7<\2\2\u00c3"+
		"D\3\2\2\2\u00c4\u00c5\7=\2\2\u00c5F\3\2\2\2\u00c6\u00c7\7?\2\2\u00c7H"+
		"\3\2\2\2\u00c8\u00ce\5K&\2\u00c9\u00cd\5K&\2\u00ca\u00cd\5M\'\2\u00cb"+
		"\u00cd\7a\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"J\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2L\3\2\2\2\u00d3"+
		"\u00d4\t\3\2\2\u00d4N\3\2\2\2\u00d5\u00d7\5M\'\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9P\3\2\2\2"+
		"\u00da\u00dc\5M\'\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\7\60\2\2"+
		"\u00e0\u00e2\5M\'\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4R\3\2\2\2\u00e5\u00e8\5O(\2\u00e6\u00e8"+
		"\5Q)\2\u00e7\u00e5\3\2\2\2\u00e7\u00e6\3\2\2\2\u00e8T\3\2\2\2\u00e9\u00ed"+
		"\7$\2\2\u00ea\u00ec\n\4\2\2\u00eb\u00ea\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed"+
		"\u00ee\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00f0\3\2\2\2\u00ef\u00ed\3\2"+
		"\2\2\u00f0\u00fa\7$\2\2\u00f1\u00f5\7)\2\2\u00f2\u00f4\n\5\2\2\u00f3\u00f2"+
		"\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f6\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00f8\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f8\u00fa\7)\2\2\u00f9\u00e9\3\2"+
		"\2\2\u00f9\u00f1\3\2\2\2\u00faV\3\2\2\2\u00fb\u00fd\7\17\2\2\u00fc\u00fb"+
		"\3\2\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\7\f\2\2\u00ff"+
		"X\3\2\2\2\u0100\u0102\t\6\2\2\u0101\u0100\3\2\2\2\u0102\u0103\3\2\2\2"+
		"\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105\u0106"+
		"\b-\2\2\u0106Z\3\2\2\2\u0107\u010b\7%\2\2\u0108\u010a\13\2\2\2\u0109\u0108"+
		"\3\2\2\2\u010a\u010d\3\2\2\2\u010b\u010c\3\2\2\2\u010b\u0109\3\2\2\2\u010c"+
		"\u010e\3\2\2\2\u010d\u010b\3\2\2\2\u010e\u010f\5W,\2\u010f\u0110\3\2\2"+
		"\2\u0110\u0111\b.\2\2\u0111\\\3\2\2\2\17\2\u00cc\u00ce\u00d8\u00dd\u00e3"+
		"\u00e7\u00ed\u00f5\u00f9\u00fc\u0103\u010b\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}