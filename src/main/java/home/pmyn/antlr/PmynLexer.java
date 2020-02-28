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
		IF=1, THEN=2, ELSE=3, RETURN=4, LAMBDA=5, DEF=6, NOT=7, AND=8, OR=9, MUL_OPERATOR=10, 
		DIV_OPERATOR=11, ADD_OPERATOR=12, SUB_OPERATOR=13, MOD_OPERATOR=14, POWER_OPERATOR=15, 
		LESS_THAN=16, GREATER_THAN=17, EQUALS=18, GT_EQ=19, LT_EQ=20, NOT_EQ_1=21, 
		NOT_EQ_2=22, OPEN_PAREN=23, CLOSE_PAREN=24, OPEN_BRACK=25, CLOSE_BRACK=26, 
		OPEN_BRACE=27, CLOSE_BRACE=28, COMMA=29, COLON=30, SEMI_COLON=31, ASSIGN=32, 
		ID=33, NUMBER=34, STRING=35, NEW_LINE=36, WS=37, SL_COMMENT=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"IF", "THEN", "ELSE", "RETURN", "LAMBDA", "DEF", "NOT", "AND", "OR", 
			"MUL_OPERATOR", "DIV_OPERATOR", "ADD_OPERATOR", "SUB_OPERATOR", "MOD_OPERATOR", 
			"POWER_OPERATOR", "LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", 
			"NOT_EQ_1", "NOT_EQ_2", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "COMMA", "COLON", "SEMI_COLON", "ASSIGN", 
			"ID", "LETTER", "DIGIT", "INT", "FLOAT", "NUMBER", "STRING", "NEW_LINE", 
			"WS", "SL_COMMENT"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'if'", "'then'", "'else'", "'return'", "'lambda'", "'def'", "'not'", 
			"'and'", "'or'", "'*'", "'/'", "'+'", "'-'", "'%'", "'**'", "'<'", "'>'", 
			"'=='", "'>='", "'<='", "'<>'", "'!='", "'('", "')'", "'['", "']'", "'{'", 
			"'}'", "','", "':'", "';'", "'='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "IF", "THEN", "ELSE", "RETURN", "LAMBDA", "DEF", "NOT", "AND", 
			"OR", "MUL_OPERATOR", "DIV_OPERATOR", "ADD_OPERATOR", "SUB_OPERATOR", 
			"MOD_OPERATOR", "POWER_OPERATOR", "LESS_THAN", "GREATER_THAN", "EQUALS", 
			"GT_EQ", "LT_EQ", "NOT_EQ_1", "NOT_EQ_2", "OPEN_PAREN", "CLOSE_PAREN", 
			"OPEN_BRACK", "CLOSE_BRACK", "OPEN_BRACE", "CLOSE_BRACE", "COMMA", "COLON", 
			"SEMI_COLON", "ASSIGN", "ID", "NUMBER", "STRING", "NEW_LINE", "WS", "SL_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00ff\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\3"+
		"\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3"+
		"\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3"+
		"\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\""+
		"\3\"\3\"\3\"\7\"\u00ba\n\"\f\"\16\"\u00bd\13\"\3#\3#\3$\3$\3%\6%\u00c4"+
		"\n%\r%\16%\u00c5\3&\6&\u00c9\n&\r&\16&\u00ca\3&\3&\6&\u00cf\n&\r&\16&"+
		"\u00d0\3\'\3\'\5\'\u00d5\n\'\3(\3(\7(\u00d9\n(\f(\16(\u00dc\13(\3(\3("+
		"\3(\7(\u00e1\n(\f(\16(\u00e4\13(\3(\5(\u00e7\n(\3)\5)\u00ea\n)\3)\3)\3"+
		"*\6*\u00ef\n*\r*\16*\u00f0\3*\3*\3+\3+\7+\u00f7\n+\f+\16+\u00fa\13+\3"+
		"+\3+\3+\3+\5\u00da\u00e2\u00f8\2,\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23"+
		"\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31"+
		"\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G\2I\2K\2M$O%Q&S\'U(\3\2\7"+
		"\4\2C\\c|\3\2\62;\4\2$$^^\4\2))^^\5\2\13\13\17\17\"\"\2\u0107\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3"+
		"\2\2\2\2S\3\2\2\2\2U\3\2\2\2\3W\3\2\2\2\5Z\3\2\2\2\7_\3\2\2\2\td\3\2\2"+
		"\2\13k\3\2\2\2\rr\3\2\2\2\17v\3\2\2\2\21z\3\2\2\2\23~\3\2\2\2\25\u0081"+
		"\3\2\2\2\27\u0083\3\2\2\2\31\u0085\3\2\2\2\33\u0087\3\2\2\2\35\u0089\3"+
		"\2\2\2\37\u008b\3\2\2\2!\u008e\3\2\2\2#\u0090\3\2\2\2%\u0092\3\2\2\2\'"+
		"\u0095\3\2\2\2)\u0098\3\2\2\2+\u009b\3\2\2\2-\u009e\3\2\2\2/\u00a1\3\2"+
		"\2\2\61\u00a3\3\2\2\2\63\u00a5\3\2\2\2\65\u00a7\3\2\2\2\67\u00a9\3\2\2"+
		"\29\u00ab\3\2\2\2;\u00ad\3\2\2\2=\u00af\3\2\2\2?\u00b1\3\2\2\2A\u00b3"+
		"\3\2\2\2C\u00b5\3\2\2\2E\u00be\3\2\2\2G\u00c0\3\2\2\2I\u00c3\3\2\2\2K"+
		"\u00c8\3\2\2\2M\u00d4\3\2\2\2O\u00e6\3\2\2\2Q\u00e9\3\2\2\2S\u00ee\3\2"+
		"\2\2U\u00f4\3\2\2\2WX\7k\2\2XY\7h\2\2Y\4\3\2\2\2Z[\7v\2\2[\\\7j\2\2\\"+
		"]\7g\2\2]^\7p\2\2^\6\3\2\2\2_`\7g\2\2`a\7n\2\2ab\7u\2\2bc\7g\2\2c\b\3"+
		"\2\2\2de\7t\2\2ef\7g\2\2fg\7v\2\2gh\7w\2\2hi\7t\2\2ij\7p\2\2j\n\3\2\2"+
		"\2kl\7n\2\2lm\7c\2\2mn\7o\2\2no\7d\2\2op\7f\2\2pq\7c\2\2q\f\3\2\2\2rs"+
		"\7f\2\2st\7g\2\2tu\7h\2\2u\16\3\2\2\2vw\7p\2\2wx\7q\2\2xy\7v\2\2y\20\3"+
		"\2\2\2z{\7c\2\2{|\7p\2\2|}\7f\2\2}\22\3\2\2\2~\177\7q\2\2\177\u0080\7"+
		"t\2\2\u0080\24\3\2\2\2\u0081\u0082\7,\2\2\u0082\26\3\2\2\2\u0083\u0084"+
		"\7\61\2\2\u0084\30\3\2\2\2\u0085\u0086\7-\2\2\u0086\32\3\2\2\2\u0087\u0088"+
		"\7/\2\2\u0088\34\3\2\2\2\u0089\u008a\7\'\2\2\u008a\36\3\2\2\2\u008b\u008c"+
		"\7,\2\2\u008c\u008d\7,\2\2\u008d \3\2\2\2\u008e\u008f\7>\2\2\u008f\"\3"+
		"\2\2\2\u0090\u0091\7@\2\2\u0091$\3\2\2\2\u0092\u0093\7?\2\2\u0093\u0094"+
		"\7?\2\2\u0094&\3\2\2\2\u0095\u0096\7@\2\2\u0096\u0097\7?\2\2\u0097(\3"+
		"\2\2\2\u0098\u0099\7>\2\2\u0099\u009a\7?\2\2\u009a*\3\2\2\2\u009b\u009c"+
		"\7>\2\2\u009c\u009d\7@\2\2\u009d,\3\2\2\2\u009e\u009f\7#\2\2\u009f\u00a0"+
		"\7?\2\2\u00a0.\3\2\2\2\u00a1\u00a2\7*\2\2\u00a2\60\3\2\2\2\u00a3\u00a4"+
		"\7+\2\2\u00a4\62\3\2\2\2\u00a5\u00a6\7]\2\2\u00a6\64\3\2\2\2\u00a7\u00a8"+
		"\7_\2\2\u00a8\66\3\2\2\2\u00a9\u00aa\7}\2\2\u00aa8\3\2\2\2\u00ab\u00ac"+
		"\7\177\2\2\u00ac:\3\2\2\2\u00ad\u00ae\7.\2\2\u00ae<\3\2\2\2\u00af\u00b0"+
		"\7<\2\2\u00b0>\3\2\2\2\u00b1\u00b2\7=\2\2\u00b2@\3\2\2\2\u00b3\u00b4\7"+
		"?\2\2\u00b4B\3\2\2\2\u00b5\u00bb\5E#\2\u00b6\u00ba\5E#\2\u00b7\u00ba\5"+
		"G$\2\u00b8\u00ba\7a\2\2\u00b9\u00b6\3\2\2\2\u00b9\u00b7\3\2\2\2\u00b9"+
		"\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2"+
		"\2\2\u00bcD\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\t\2\2\2\u00bfF\3\2"+
		"\2\2\u00c0\u00c1\t\3\2\2\u00c1H\3\2\2\2\u00c2\u00c4\5G$\2\u00c3\u00c2"+
		"\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6"+
		"J\3\2\2\2\u00c7\u00c9\5G$\2\u00c8\u00c7\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\7\60"+
		"\2\2\u00cd\u00cf\5G$\2\u00ce\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00ce"+
		"\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1L\3\2\2\2\u00d2\u00d5\5I%\2\u00d3\u00d5"+
		"\5K&\2\u00d4\u00d2\3\2\2\2\u00d4\u00d3\3\2\2\2\u00d5N\3\2\2\2\u00d6\u00da"+
		"\7$\2\2\u00d7\u00d9\n\4\2\2\u00d8\u00d7\3\2\2\2\u00d9\u00dc\3\2\2\2\u00da"+
		"\u00db\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00da\3\2"+
		"\2\2\u00dd\u00e7\7$\2\2\u00de\u00e2\7)\2\2\u00df\u00e1\n\5\2\2\u00e0\u00df"+
		"\3\2\2\2\u00e1\u00e4\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e2\u00e0\3\2\2\2\u00e3"+
		"\u00e5\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\u00e7\7)\2\2\u00e6\u00d6\3\2"+
		"\2\2\u00e6\u00de\3\2\2\2\u00e7P\3\2\2\2\u00e8\u00ea\7\17\2\2\u00e9\u00e8"+
		"\3\2\2\2\u00e9\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\7\f\2\2\u00ec"+
		"R\3\2\2\2\u00ed\u00ef\t\6\2\2\u00ee\u00ed\3\2\2\2\u00ef\u00f0\3\2\2\2"+
		"\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3"+
		"\b*\2\2\u00f3T\3\2\2\2\u00f4\u00f8\7%\2\2\u00f5\u00f7\13\2\2\2\u00f6\u00f5"+
		"\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\5Q)\2\u00fc\u00fd\3\2\2"+
		"\2\u00fd\u00fe\b+\2\2\u00feV\3\2\2\2\17\2\u00b9\u00bb\u00c5\u00ca\u00d0"+
		"\u00d4\u00da\u00e2\u00e6\u00e9\u00f0\u00f8\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}