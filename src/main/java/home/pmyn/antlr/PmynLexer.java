// Generated from src/main/java/home/pmyn/antlr/Pmyn.g4 by ANTLR 4.9.2

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
		IF=1, THEN=2, ELSE=3, RETURN=4, LAMBDA=5, DEF=6, NOT=7, AND=8, OR=9, MUL_OPERATOR=10, 
		DIV_OPERATOR=11, ADD_OPERATOR=12, SUB_OPERATOR=13, MOD_OPERATOR=14, POW_OPERATOR=15, 
		LESS_THAN=16, GREATER_THAN=17, EQUALS=18, GT_EQ=19, LT_EQ=20, NOT_EQ_1=21, 
		NOT_EQ_2=22, OPEN_PAREN=23, CLOSE_PAREN=24, OPEN_BRACK=25, CLOSE_BRACK=26, 
		OPEN_BRACE=27, CLOSE_BRACE=28, COMMA=29, DOT=30, COLON=31, SEMI_COLON=32, 
		ASSIGN=33, TRUE=34, FALSE=35, ID=36, INT=37, FLOAT=38, STRING=39, NEW_LINE=40, 
		WS=41, SL_COMMENT=42;
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
			"POW_OPERATOR", "LESS_THAN", "GREATER_THAN", "EQUALS", "GT_EQ", "LT_EQ", 
			"NOT_EQ_1", "NOT_EQ_2", "OPEN_PAREN", "CLOSE_PAREN", "OPEN_BRACK", "CLOSE_BRACK", 
			"OPEN_BRACE", "CLOSE_BRACE", "COMMA", "DOT", "COLON", "SEMI_COLON", "ASSIGN", 
			"TRUE", "FALSE", "ID", "LETTER", "DIGIT", "INT", "FLOAT", "STRING", "ESC", 
			"NEW_LINE", "WS", "SL_COMMENT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2,\u0118\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37"+
		"\3 \3 \3!\3!\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\7%\u00cd"+
		"\n%\f%\16%\u00d0\13%\3&\3&\3\'\3\'\3(\6(\u00d7\n(\r(\16(\u00d8\3)\6)\u00dc"+
		"\n)\r)\16)\u00dd\3)\3)\6)\u00e2\n)\r)\16)\u00e3\3*\3*\3*\7*\u00e9\n*\f"+
		"*\16*\u00ec\13*\3*\3*\3*\3*\7*\u00f2\n*\f*\16*\u00f5\13*\3*\5*\u00f8\n"+
		"*\3+\3+\3+\3+\5+\u00fe\n+\3,\5,\u0101\n,\3,\3,\3-\6-\u0106\n-\r-\16-\u0107"+
		"\3-\3-\3.\3.\7.\u010e\n.\f.\16.\u0111\13.\3.\3.\5.\u0115\n.\3.\3.\5\u00ea"+
		"\u00f3\u010f\2/\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65"+
		"\34\67\359\36;\37= ?!A\"C#E$G%I&K\2M\2O\'Q(S)U\2W*Y+[,\3\2\5\4\2C\\c|"+
		"\3\2\62;\5\2\13\13\17\17\"\"\2\u0124\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23"+
		"\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2"+
		"\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2"+
		"\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3"+
		"\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2"+
		"\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2"+
		"\2S\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\3]\3\2\2\2\5`\3\2\2\2\7e"+
		"\3\2\2\2\tj\3\2\2\2\13q\3\2\2\2\rx\3\2\2\2\17|\3\2\2\2\21\u0080\3\2\2"+
		"\2\23\u0084\3\2\2\2\25\u0087\3\2\2\2\27\u0089\3\2\2\2\31\u008b\3\2\2\2"+
		"\33\u008d\3\2\2\2\35\u008f\3\2\2\2\37\u0091\3\2\2\2!\u0094\3\2\2\2#\u0096"+
		"\3\2\2\2%\u0098\3\2\2\2\'\u009b\3\2\2\2)\u009e\3\2\2\2+\u00a1\3\2\2\2"+
		"-\u00a4\3\2\2\2/\u00a7\3\2\2\2\61\u00a9\3\2\2\2\63\u00ab\3\2\2\2\65\u00ad"+
		"\3\2\2\2\67\u00af\3\2\2\29\u00b1\3\2\2\2;\u00b3\3\2\2\2=\u00b5\3\2\2\2"+
		"?\u00b7\3\2\2\2A\u00b9\3\2\2\2C\u00bb\3\2\2\2E\u00bd\3\2\2\2G\u00c2\3"+
		"\2\2\2I\u00c8\3\2\2\2K\u00d1\3\2\2\2M\u00d3\3\2\2\2O\u00d6\3\2\2\2Q\u00db"+
		"\3\2\2\2S\u00f7\3\2\2\2U\u00fd\3\2\2\2W\u0100\3\2\2\2Y\u0105\3\2\2\2["+
		"\u010b\3\2\2\2]^\7k\2\2^_\7h\2\2_\4\3\2\2\2`a\7v\2\2ab\7j\2\2bc\7g\2\2"+
		"cd\7p\2\2d\6\3\2\2\2ef\7g\2\2fg\7n\2\2gh\7u\2\2hi\7g\2\2i\b\3\2\2\2jk"+
		"\7t\2\2kl\7g\2\2lm\7v\2\2mn\7w\2\2no\7t\2\2op\7p\2\2p\n\3\2\2\2qr\7n\2"+
		"\2rs\7c\2\2st\7o\2\2tu\7d\2\2uv\7f\2\2vw\7c\2\2w\f\3\2\2\2xy\7f\2\2yz"+
		"\7g\2\2z{\7h\2\2{\16\3\2\2\2|}\7p\2\2}~\7q\2\2~\177\7v\2\2\177\20\3\2"+
		"\2\2\u0080\u0081\7c\2\2\u0081\u0082\7p\2\2\u0082\u0083\7f\2\2\u0083\22"+
		"\3\2\2\2\u0084\u0085\7q\2\2\u0085\u0086\7t\2\2\u0086\24\3\2\2\2\u0087"+
		"\u0088\7,\2\2\u0088\26\3\2\2\2\u0089\u008a\7\61\2\2\u008a\30\3\2\2\2\u008b"+
		"\u008c\7-\2\2\u008c\32\3\2\2\2\u008d\u008e\7/\2\2\u008e\34\3\2\2\2\u008f"+
		"\u0090\7\'\2\2\u0090\36\3\2\2\2\u0091\u0092\7,\2\2\u0092\u0093\7,\2\2"+
		"\u0093 \3\2\2\2\u0094\u0095\7>\2\2\u0095\"\3\2\2\2\u0096\u0097\7@\2\2"+
		"\u0097$\3\2\2\2\u0098\u0099\7?\2\2\u0099\u009a\7?\2\2\u009a&\3\2\2\2\u009b"+
		"\u009c\7@\2\2\u009c\u009d\7?\2\2\u009d(\3\2\2\2\u009e\u009f\7>\2\2\u009f"+
		"\u00a0\7?\2\2\u00a0*\3\2\2\2\u00a1\u00a2\7>\2\2\u00a2\u00a3\7@\2\2\u00a3"+
		",\3\2\2\2\u00a4\u00a5\7#\2\2\u00a5\u00a6\7?\2\2\u00a6.\3\2\2\2\u00a7\u00a8"+
		"\7*\2\2\u00a8\60\3\2\2\2\u00a9\u00aa\7+\2\2\u00aa\62\3\2\2\2\u00ab\u00ac"+
		"\7]\2\2\u00ac\64\3\2\2\2\u00ad\u00ae\7_\2\2\u00ae\66\3\2\2\2\u00af\u00b0"+
		"\7}\2\2\u00b08\3\2\2\2\u00b1\u00b2\7\177\2\2\u00b2:\3\2\2\2\u00b3\u00b4"+
		"\7.\2\2\u00b4<\3\2\2\2\u00b5\u00b6\7\60\2\2\u00b6>\3\2\2\2\u00b7\u00b8"+
		"\7<\2\2\u00b8@\3\2\2\2\u00b9\u00ba\7=\2\2\u00baB\3\2\2\2\u00bb\u00bc\7"+
		"?\2\2\u00bcD\3\2\2\2\u00bd\u00be\7v\2\2\u00be\u00bf\7t\2\2\u00bf\u00c0"+
		"\7w\2\2\u00c0\u00c1\7g\2\2\u00c1F\3\2\2\2\u00c2\u00c3\7h\2\2\u00c3\u00c4"+
		"\7c\2\2\u00c4\u00c5\7n\2\2\u00c5\u00c6\7u\2\2\u00c6\u00c7\7g\2\2\u00c7"+
		"H\3\2\2\2\u00c8\u00ce\5K&\2\u00c9\u00cd\5K&\2\u00ca\u00cd\5M\'\2\u00cb"+
		"\u00cd\7a\2\2\u00cc\u00c9\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cb\3\2"+
		"\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf"+
		"J\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00d2\t\2\2\2\u00d2L\3\2\2\2\u00d3"+
		"\u00d4\t\3\2\2\u00d4N\3\2\2\2\u00d5\u00d7\5M\'\2\u00d6\u00d5\3\2\2\2\u00d7"+
		"\u00d8\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9P\3\2\2\2"+
		"\u00da\u00dc\5M\'\2\u00db\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1\7\60\2\2"+
		"\u00e0\u00e2\5M\'\2\u00e1\u00e0\3\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e1"+
		"\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4R\3\2\2\2\u00e5\u00ea\7$\2\2\u00e6\u00e9"+
		"\5U+\2\u00e7\u00e9\13\2\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ec\3\2\2\2\u00ea\u00eb\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ed\3\2"+
		"\2\2\u00ec\u00ea\3\2\2\2\u00ed\u00f8\7$\2\2\u00ee\u00f3\7)\2\2\u00ef\u00f2"+
		"\5U+\2\u00f0\u00f2\13\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f0\3\2\2\2\u00f2"+
		"\u00f5\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00f6\3\2"+
		"\2\2\u00f5\u00f3\3\2\2\2\u00f6\u00f8\7)\2\2\u00f7\u00e5\3\2\2\2\u00f7"+
		"\u00ee\3\2\2\2\u00f8T\3\2\2\2\u00f9\u00fa\7^\2\2\u00fa\u00fe\7$\2\2\u00fb"+
		"\u00fc\7^\2\2\u00fc\u00fe\7^\2\2\u00fd\u00f9\3\2\2\2\u00fd\u00fb\3\2\2"+
		"\2\u00feV\3\2\2\2\u00ff\u0101\7\17\2\2\u0100\u00ff\3\2\2\2\u0100\u0101"+
		"\3\2\2\2\u0101\u0102\3\2\2\2\u0102\u0103\7\f\2\2\u0103X\3\2\2\2\u0104"+
		"\u0106\t\4\2\2\u0105\u0104\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\b-\2\2\u010a"+
		"Z\3\2\2\2\u010b\u010f\7%\2\2\u010c\u010e\13\2\2\2\u010d\u010c\3\2\2\2"+
		"\u010e\u0111\3\2\2\2\u010f\u0110\3\2\2\2\u010f\u010d\3\2\2\2\u0110\u0114"+
		"\3\2\2\2\u0111\u010f\3\2\2\2\u0112\u0115\5W,\2\u0113\u0115\7\2\2\3\u0114"+
		"\u0112\3\2\2\2\u0114\u0113\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0117\b."+
		"\2\2\u0117\\\3\2\2\2\22\2\u00cc\u00ce\u00d8\u00dd\u00e3\u00e8\u00ea\u00f1"+
		"\u00f3\u00f7\u00fd\u0100\u0107\u010f\u0114\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}