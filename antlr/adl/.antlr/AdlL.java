// Generated from /home/garym/devel/wxio/tron/antlr/adl/AdlL.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdlL extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCUR=1, RCUR=2, LSQ=3, RSQ=4, EQ=5, DQ=6, SQ=7, SEMI=8, DCOLON=9, COLON=10, 
		DOT=11, COMMA=12, LCHEVR=13, RCHEVR=14, STAR=15, AT=16, STR=17, ID=18, 
		INT=19, FLT=20, WS=21, LINE_DOC=22, LINE_COMMENT=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"LCUR", "RCUR", "LSQ", "RSQ", "EQ", "DQ", "SQ", "SEMI", "DCOLON", "COLON", 
		"DOT", "COMMA", "LCHEVR", "RCHEVR", "STAR", "AT", "Letter", "DecimalDigit", 
		"OctalDigit", "HexDigit", "DecimalLit", "OctalLit", "HexLit", "Decimals", 
		"Exponent", "STR", "ID", "INT", "FLT", "SqChar", "DqChar", "CharValue", 
		"HexEscape", "OctEscape", "CharEscape", "WS", "LINE_DOC", "LINE_COMMENT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'='", "'\"'", "'''", "';'", "'::'", 
		"':'", "'.'", "','", "'<'", "'>'", "'*'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCUR", "RCUR", "LSQ", "RSQ", "EQ", "DQ", "SQ", "SEMI", "DCOLON", 
		"COLON", "DOT", "COMMA", "LCHEVR", "RCHEVR", "STAR", "AT", "STR", "ID", 
		"INT", "FLT", "WS", "LINE_DOC", "LINE_COMMENT"
	};
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


	public AdlL(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AdlL.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u0102\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\3\2\3\2\3\3\3\3\3\4\3"+
		"\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\f\3"+
		"\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23"+
		"\3\24\3\24\3\25\3\25\3\26\3\26\7\26{\n\26\f\26\16\26~\13\26\3\27\3\27"+
		"\7\27\u0082\n\27\f\27\16\27\u0085\13\27\3\30\3\30\3\30\6\30\u008a\n\30"+
		"\r\30\16\30\u008b\3\31\6\31\u008f\n\31\r\31\16\31\u0090\3\32\3\32\5\32"+
		"\u0095\n\32\3\32\3\32\3\33\3\33\7\33\u009b\n\33\f\33\16\33\u009e\13\33"+
		"\3\33\3\33\3\33\7\33\u00a3\n\33\f\33\16\33\u00a6\13\33\3\33\5\33\u00a9"+
		"\n\33\3\34\3\34\3\34\7\34\u00ae\n\34\f\34\16\34\u00b1\13\34\3\35\3\35"+
		"\3\35\5\35\u00b6\n\35\3\36\3\36\3\36\5\36\u00bb\n\36\3\36\5\36\u00be\n"+
		"\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00c6\n\36\5\36\u00c8\n\36\3\37"+
		"\3\37\3\37\5\37\u00cd\n\37\3 \3 \3 \5 \u00d2\n \3!\3!\3!\3!\5!\u00d8\n"+
		"!\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3$\3$\3$\3%\6%\u00e8\n%\r%\16%\u00e9"+
		"\3%\3%\3&\3&\3&\3&\3&\7&\u00f3\n&\f&\16&\u00f6\13&\3\'\3\'\3\'\3\'\7\'"+
		"\u00fc\n\'\f\'\16\'\u00ff\13\'\3\'\3\'\2\2(\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\2%\2\'\2)\2+\2-\2"+
		"/\2\61\2\63\2\65\23\67\249\25;\26=\2?\2A\2C\2E\2G\2I\27K\30M\31\3\2\20"+
		"\5\2C\\aac|\3\2\62;\3\2\629\5\2\62;CHch\3\2\63;\4\2ZZzz\4\2GGgg\4\2--"+
		"//\3\2))\3\2$$\5\2\2\2\f\f^^\13\2$$))^^cdhhppttvvxx\5\2\13\f\16\17\"\""+
		"\4\2\f\f\17\17\2\u010b\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2"+
		"\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2"+
		"\2\2\2!\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2I\3\2"+
		"\2\2\2K\3\2\2\2\2M\3\2\2\2\3O\3\2\2\2\5Q\3\2\2\2\7S\3\2\2\2\tU\3\2\2\2"+
		"\13W\3\2\2\2\rY\3\2\2\2\17[\3\2\2\2\21]\3\2\2\2\23_\3\2\2\2\25b\3\2\2"+
		"\2\27d\3\2\2\2\31f\3\2\2\2\33h\3\2\2\2\35j\3\2\2\2\37l\3\2\2\2!n\3\2\2"+
		"\2#p\3\2\2\2%r\3\2\2\2\'t\3\2\2\2)v\3\2\2\2+x\3\2\2\2-\177\3\2\2\2/\u0086"+
		"\3\2\2\2\61\u008e\3\2\2\2\63\u0092\3\2\2\2\65\u00a8\3\2\2\2\67\u00aa\3"+
		"\2\2\29\u00b5\3\2\2\2;\u00c7\3\2\2\2=\u00cc\3\2\2\2?\u00d1\3\2\2\2A\u00d7"+
		"\3\2\2\2C\u00d9\3\2\2\2E\u00de\3\2\2\2G\u00e3\3\2\2\2I\u00e7\3\2\2\2K"+
		"\u00ed\3\2\2\2M\u00f7\3\2\2\2OP\7}\2\2P\4\3\2\2\2QR\7\177\2\2R\6\3\2\2"+
		"\2ST\7]\2\2T\b\3\2\2\2UV\7_\2\2V\n\3\2\2\2WX\7?\2\2X\f\3\2\2\2YZ\7$\2"+
		"\2Z\16\3\2\2\2[\\\7)\2\2\\\20\3\2\2\2]^\7=\2\2^\22\3\2\2\2_`\7<\2\2`a"+
		"\7<\2\2a\24\3\2\2\2bc\7<\2\2c\26\3\2\2\2de\7\60\2\2e\30\3\2\2\2fg\7.\2"+
		"\2g\32\3\2\2\2hi\7>\2\2i\34\3\2\2\2jk\7@\2\2k\36\3\2\2\2lm\7,\2\2m \3"+
		"\2\2\2no\7B\2\2o\"\3\2\2\2pq\t\2\2\2q$\3\2\2\2rs\t\3\2\2s&\3\2\2\2tu\t"+
		"\4\2\2u(\3\2\2\2vw\t\5\2\2w*\3\2\2\2x|\t\6\2\2y{\5%\23\2zy\3\2\2\2{~\3"+
		"\2\2\2|z\3\2\2\2|}\3\2\2\2},\3\2\2\2~|\3\2\2\2\177\u0083\7\62\2\2\u0080"+
		"\u0082\5\'\24\2\u0081\u0080\3\2\2\2\u0082\u0085\3\2\2\2\u0083\u0081\3"+
		"\2\2\2\u0083\u0084\3\2\2\2\u0084.\3\2\2\2\u0085\u0083\3\2\2\2\u0086\u0087"+
		"\7\62\2\2\u0087\u0089\t\7\2\2\u0088\u008a\5)\25\2\u0089\u0088\3\2\2\2"+
		"\u008a\u008b\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c\60"+
		"\3\2\2\2\u008d\u008f\5%\23\2\u008e\u008d\3\2\2\2\u008f\u0090\3\2\2\2\u0090"+
		"\u008e\3\2\2\2\u0090\u0091\3\2\2\2\u0091\62\3\2\2\2\u0092\u0094\t\b\2"+
		"\2\u0093\u0095\t\t\2\2\u0094\u0093\3\2\2\2\u0094\u0095\3\2\2\2\u0095\u0096"+
		"\3\2\2\2\u0096\u0097\5\61\31\2\u0097\64\3\2\2\2\u0098\u009c\7)\2\2\u0099"+
		"\u009b\5=\37\2\u009a\u0099\3\2\2\2\u009b\u009e\3\2\2\2\u009c\u009a\3\2"+
		"\2\2\u009c\u009d\3\2\2\2\u009d\u009f\3\2\2\2\u009e\u009c\3\2\2\2\u009f"+
		"\u00a9\7)\2\2\u00a0\u00a4\7$\2\2\u00a1\u00a3\5? \2\u00a2\u00a1\3\2\2\2"+
		"\u00a3\u00a6\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a7"+
		"\3\2\2\2\u00a6\u00a4\3\2\2\2\u00a7\u00a9\7$\2\2\u00a8\u0098\3\2\2\2\u00a8"+
		"\u00a0\3\2\2\2\u00a9\66\3\2\2\2\u00aa\u00af\5#\22\2\u00ab\u00ae\5#\22"+
		"\2\u00ac\u00ae\5%\23\2\u00ad\u00ab\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b08\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b6\5+\26\2\u00b3\u00b6\5-\27\2\u00b4\u00b6\5/"+
		"\30\2\u00b5\u00b2\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b4\3\2\2\2\u00b6"+
		":\3\2\2\2\u00b7\u00b8\5\61\31\2\u00b8\u00ba\5\27\f\2\u00b9\u00bb\5\61"+
		"\31\2\u00ba\u00b9\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00be\5\63\32\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c8\3"+
		"\2\2\2\u00bf\u00c0\5\61\31\2\u00c0\u00c1\5\63\32\2\u00c1\u00c8\3\2\2\2"+
		"\u00c2\u00c3\5\27\f\2\u00c3\u00c5\5\61\31\2\u00c4\u00c6\5\63\32\2\u00c5"+
		"\u00c4\3\2\2\2\u00c5\u00c6\3\2\2\2\u00c6\u00c8\3\2\2\2\u00c7\u00b7\3\2"+
		"\2\2\u00c7\u00bf\3\2\2\2\u00c7\u00c2\3\2\2\2\u00c8<\3\2\2\2\u00c9\u00ca"+
		"\7^\2\2\u00ca\u00cd\7)\2\2\u00cb\u00cd\n\n\2\2\u00cc\u00c9\3\2\2\2\u00cc"+
		"\u00cb\3\2\2\2\u00cd>\3\2\2\2\u00ce\u00cf\7^\2\2\u00cf\u00d2\7$\2\2\u00d0"+
		"\u00d2\n\13\2\2\u00d1\u00ce\3\2\2\2\u00d1\u00d0\3\2\2\2\u00d2@\3\2\2\2"+
		"\u00d3\u00d8\5C\"\2\u00d4\u00d8\5E#\2\u00d5\u00d8\5G$\2\u00d6\u00d8\n"+
		"\f\2\2\u00d7\u00d3\3\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7"+
		"\u00d6\3\2\2\2\u00d8B\3\2\2\2\u00d9\u00da\7^\2\2\u00da\u00db\t\7\2\2\u00db"+
		"\u00dc\5)\25\2\u00dc\u00dd\5)\25\2\u00ddD\3\2\2\2\u00de\u00df\7^\2\2\u00df"+
		"\u00e0\5\'\24\2\u00e0\u00e1\5\'\24\2\u00e1\u00e2\5\'\24\2\u00e2F\3\2\2"+
		"\2\u00e3\u00e4\7^\2\2\u00e4\u00e5\t\r\2\2\u00e5H\3\2\2\2\u00e6\u00e8\t"+
		"\16\2\2\u00e7\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ec\b%\2\2\u00ecJ\3\2\2\2\u00ed"+
		"\u00ee\7\61\2\2\u00ee\u00ef\7\61\2\2\u00ef\u00f0\7\61\2\2\u00f0\u00f4"+
		"\3\2\2\2\u00f1\u00f3\n\17\2\2\u00f2\u00f1\3\2\2\2\u00f3\u00f6\3\2\2\2"+
		"\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5L\3\2\2\2\u00f6\u00f4\3"+
		"\2\2\2\u00f7\u00f8\7\61\2\2\u00f8\u00f9\7\61\2\2\u00f9\u00fd\3\2\2\2\u00fa"+
		"\u00fc\n\17\2\2\u00fb\u00fa\3\2\2\2\u00fc\u00ff\3\2\2\2\u00fd\u00fb\3"+
		"\2\2\2\u00fd\u00fe\3\2\2\2\u00fe\u0100\3\2\2\2\u00ff\u00fd\3\2\2\2\u0100"+
		"\u0101\b\'\2\2\u0101N\3\2\2\2\30\2|\u0083\u008b\u0090\u0094\u009c\u00a4"+
		"\u00a8\u00ad\u00af\u00b5\u00ba\u00bd\u00c5\u00c7\u00cc\u00d1\u00d7\u00e9"+
		"\u00f4\u00fd\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}