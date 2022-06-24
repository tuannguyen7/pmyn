// Generated from Pmyn.g4 by ANTLR 4.9.2
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "THEN", "ELSE", "RETURN", "LAMBDA", "DEF", "NOT", "AND", "OR", 
			"WHILE", "IN", "FOR", "MUL_OPERATOR", "DIV_OPERATOR", "ADD_OPERATOR", 
			"SUB_OPERATOR", "MOD_OPERATOR", "POW_OPERATOR", "LESS_THAN", "GREATER_THAN", 
			"EQUALS", "GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "COMMA", "DOT", 
			"COLON", "SEMI_COLON", "ASSIGN", "TRUE", "FALSE", "ID", "LETTER", "DIGIT", 
			"INT", "FLOAT", "STRING", "ESC", "NEW_LINE", "WS", "SL_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u0121\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\3\2\3\2\3\2\3\3\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\25\3"+
		"\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\30\3\31\3\31\3\31\3\32\3"+
		"\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3"+
		"!\3\"\3\"\3#\3#\3$\3$\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3("+
		"\3(\3(\3(\7(\u00e0\n(\f(\16(\u00e3\13(\3)\3)\3*\3*\3+\6+\u00ea\n+\r+\16"+
		"+\u00eb\3,\6,\u00ef\n,\r,\16,\u00f0\3,\3,\6,\u00f5\n,\r,\16,\u00f6\3-"+
		"\3-\3-\7-\u00fc\n-\f-\16-\u00ff\13-\3-\3-\3.\3.\3.\3.\5.\u0107\n.\3/\5"+
		"/\u010a\n/\3/\3/\3\60\6\60\u010f\n\60\r\60\16\60\u0110\3\60\3\60\3\61"+
		"\3\61\7\61\u0117\n\61\f\61\16\61\u011a\13\61\3\61\3\61\5\61\u011e\n\61"+
		"\3\61\3\61\4\u00fd\u0118\2\62\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13"+
		"\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61"+
		"\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q\2S\2U*W+Y,[\2]-_"+
		".a/\3\2\5\4\2C\\c|\3\2\62;\5\2\13\13\17\17\"\"\2\u012a\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2"+
		"\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2"+
		"\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2"+
		"\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K"+
		"\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2]\3\2"+
		"\2\2\2_\3\2\2\2\2a\3\2\2\2\3c\3\2\2\2\5f\3\2\2\2\7k\3\2\2\2\tp\3\2\2\2"+
		"\13w\3\2\2\2\r~\3\2\2\2\17\u0082\3\2\2\2\21\u0086\3\2\2\2\23\u008a\3\2"+
		"\2\2\25\u008d\3\2\2\2\27\u0093\3\2\2\2\31\u0096\3\2\2\2\33\u009a\3\2\2"+
		"\2\35\u009c\3\2\2\2\37\u009e\3\2\2\2!\u00a0\3\2\2\2#\u00a2\3\2\2\2%\u00a4"+
		"\3\2\2\2\'\u00a7\3\2\2\2)\u00a9\3\2\2\2+\u00ab\3\2\2\2-\u00ae\3\2\2\2"+
		"/\u00b1\3\2\2\2\61\u00b4\3\2\2\2\63\u00b7\3\2\2\2\65\u00ba\3\2\2\2\67"+
		"\u00bc\3\2\2\29\u00be\3\2\2\2;\u00c0\3\2\2\2=\u00c2\3\2\2\2?\u00c4\3\2"+
		"\2\2A\u00c6\3\2\2\2C\u00c8\3\2\2\2E\u00ca\3\2\2\2G\u00cc\3\2\2\2I\u00ce"+
		"\3\2\2\2K\u00d0\3\2\2\2M\u00d5\3\2\2\2O\u00db\3\2\2\2Q\u00e4\3\2\2\2S"+
		"\u00e6\3\2\2\2U\u00e9\3\2\2\2W\u00ee\3\2\2\2Y\u00f8\3\2\2\2[\u0106\3\2"+
		"\2\2]\u0109\3\2\2\2_\u010e\3\2\2\2a\u0114\3\2\2\2cd\7k\2\2de\7h\2\2e\4"+
		"\3\2\2\2fg\7v\2\2gh\7j\2\2hi\7g\2\2ij\7p\2\2j\6\3\2\2\2kl\7g\2\2lm\7n"+
		"\2\2mn\7u\2\2no\7g\2\2o\b\3\2\2\2pq\7t\2\2qr\7g\2\2rs\7v\2\2st\7w\2\2"+
		"tu\7t\2\2uv\7p\2\2v\n\3\2\2\2wx\7n\2\2xy\7c\2\2yz\7o\2\2z{\7d\2\2{|\7"+
		"f\2\2|}\7c\2\2}\f\3\2\2\2~\177\7f\2\2\177\u0080\7g\2\2\u0080\u0081\7h"+
		"\2\2\u0081\16\3\2\2\2\u0082\u0083\7p\2\2\u0083\u0084\7q\2\2\u0084\u0085"+
		"\7v\2\2\u0085\20\3\2\2\2\u0086\u0087\7c\2\2\u0087\u0088\7p\2\2\u0088\u0089"+
		"\7f\2\2\u0089\22\3\2\2\2\u008a\u008b\7q\2\2\u008b\u008c\7t\2\2\u008c\24"+
		"\3\2\2\2\u008d\u008e\7y\2\2\u008e\u008f\7j\2\2\u008f\u0090\7k\2\2\u0090"+
		"\u0091\7n\2\2\u0091\u0092\7g\2\2\u0092\26\3\2\2\2\u0093\u0094\7k\2\2\u0094"+
		"\u0095\7p\2\2\u0095\30\3\2\2\2\u0096\u0097\7h\2\2\u0097\u0098\7q\2\2\u0098"+
		"\u0099\7t\2\2\u0099\32\3\2\2\2\u009a\u009b\7,\2\2\u009b\34\3\2\2\2\u009c"+
		"\u009d\7\61\2\2\u009d\36\3\2\2\2\u009e\u009f\7-\2\2\u009f \3\2\2\2\u00a0"+
		"\u00a1\7/\2\2\u00a1\"\3\2\2\2\u00a2\u00a3\7\'\2\2\u00a3$\3\2\2\2\u00a4"+
		"\u00a5\7,\2\2\u00a5\u00a6\7,\2\2\u00a6&\3\2\2\2\u00a7\u00a8\7>\2\2\u00a8"+
		"(\3\2\2\2\u00a9\u00aa\7@\2\2\u00aa*\3\2\2\2\u00ab\u00ac\7?\2\2\u00ac\u00ad"+
		"\7?\2\2\u00ad,\3\2\2\2\u00ae\u00af\7@\2\2\u00af\u00b0\7?\2\2\u00b0.\3"+
		"\2\2\2\u00b1\u00b2\7>\2\2\u00b2\u00b3\7?\2\2\u00b3\60\3\2\2\2\u00b4\u00b5"+
		"\7>\2\2\u00b5\u00b6\7@\2\2\u00b6\62\3\2\2\2\u00b7\u00b8\7#\2\2\u00b8\u00b9"+
		"\7?\2\2\u00b9\64\3\2\2\2\u00ba\u00bb\7*\2\2\u00bb\66\3\2\2\2\u00bc\u00bd"+
		"\7+\2\2\u00bd8\3\2\2\2\u00be\u00bf\7]\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7"+
		"_\2\2\u00c1<\3\2\2\2\u00c2\u00c3\7}\2\2\u00c3>\3\2\2\2\u00c4\u00c5\7\177"+
		"\2\2\u00c5@\3\2\2\2\u00c6\u00c7\7.\2\2\u00c7B\3\2\2\2\u00c8\u00c9\7\60"+
		"\2\2\u00c9D\3\2\2\2\u00ca\u00cb\7<\2\2\u00cbF\3\2\2\2\u00cc\u00cd\7=\2"+
		"\2\u00cdH\3\2\2\2\u00ce\u00cf\7?\2\2\u00cfJ\3\2\2\2\u00d0\u00d1\7v\2\2"+
		"\u00d1\u00d2\7t\2\2\u00d2\u00d3\7w\2\2\u00d3\u00d4\7g\2\2\u00d4L\3\2\2"+
		"\2\u00d5\u00d6\7h\2\2\u00d6\u00d7\7c\2\2\u00d7\u00d8\7n\2\2\u00d8\u00d9"+
		"\7u\2\2\u00d9\u00da\7g\2\2\u00daN\3\2\2\2\u00db\u00e1\5Q)\2\u00dc\u00e0"+
		"\5Q)\2\u00dd\u00e0\5S*\2\u00de\u00e0\7a\2\2\u00df\u00dc\3\2\2\2\u00df"+
		"\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e3\3\2\2\2\u00e1\u00df\3\2"+
		"\2\2\u00e1\u00e2\3\2\2\2\u00e2P\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e4\u00e5"+
		"\t\2\2\2\u00e5R\3\2\2\2\u00e6\u00e7\t\3\2\2\u00e7T\3\2\2\2\u00e8\u00ea"+
		"\5S*\2\u00e9\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ecV\3\2\2\2\u00ed\u00ef\5S*\2\u00ee\u00ed\3\2\2\2\u00ef"+
		"\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2"+
		"\2\2\u00f2\u00f4\7\60\2\2\u00f3\u00f5\5S*\2\u00f4\u00f3\3\2\2\2\u00f5"+
		"\u00f6\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7X\3\2\2\2"+
		"\u00f8\u00fd\7$\2\2\u00f9\u00fc\5[.\2\u00fa\u00fc\13\2\2\2\u00fb\u00f9"+
		"\3\2\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fd"+
		"\u00fb\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100\u0101\7$"+
		"\2\2\u0101Z\3\2\2\2\u0102\u0103\7^\2\2\u0103\u0107\7$\2\2\u0104\u0105"+
		"\7^\2\2\u0105\u0107\7^\2\2\u0106\u0102\3\2\2\2\u0106\u0104\3\2\2\2\u0107"+
		"\\\3\2\2\2\u0108\u010a\7\17\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2"+
		"\2\u010a\u010b\3\2\2\2\u010b\u010c\7\f\2\2\u010c^\3\2\2\2\u010d\u010f"+
		"\t\4\2\2\u010e\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110\u010e\3\2\2\2\u0110"+
		"\u0111\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0113\b\60\2\2\u0113`\3\2\2\2"+
		"\u0114\u0118\7%\2\2\u0115\u0117\13\2\2\2\u0116\u0115\3\2\2\2\u0117\u011a"+
		"\3\2\2\2\u0118\u0119\3\2\2\2\u0118\u0116\3\2\2\2\u0119\u011d\3\2\2\2\u011a"+
		"\u0118\3\2\2\2\u011b\u011e\5]/\2\u011c\u011e\7\2\2\3\u011d\u011b\3\2\2"+
		"\2\u011d\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0120\b\61\2\2\u0120"+
		"b\3\2\2\2\17\2\u00df\u00e1\u00eb\u00f0\u00f6\u00fb\u00fd\u0106\u0109\u0110"+
		"\u0118\u011d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}