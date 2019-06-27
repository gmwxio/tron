// Generated from /home/garym/devel/wxio/tron/antlr/adl/AdlP.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdlP extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		LCUR=1, RCUR=2, LSQ=3, RSQ=4, EQ=5, DQ=6, SQ=7, SEMI=8, DCOLON=9, COLON=10, 
		DOT=11, COMMA=12, LCHEVR=13, RCHEVR=14, STAR=15, AT=16, STR=17, ID=18, 
		INT=19, FLT=20, WS=21, LINE_DOC=22, LINE_COMMENT=23, DOWN=24, UP=25, ROOT=26, 
		ERROR=27, ADL=28, Module=29, Import=30, Annotation=31, Struct=32, Union=33, 
		Newtype=34, Type=35, TypeParam=36, TypeExpr=37, TypeExprElem=38, Field=39, 
		Json=40, JsonStr=41, JsonBool=42, JsonNull=43, JsonInt=44, JsonFloat=45, 
		JsonArray=46, JsonObj=47, ModuleAnno=48, DeclAnno=49, FieldAnno=50;
	public static final int
		RULE_adl = 0, RULE_module = 1, RULE_imports = 2, RULE_annon = 3, RULE_top_level_statement = 4, 
		RULE_typeParam = 5, RULE_typeParamError = 6, RULE_typeExpr = 7, RULE_typeExprElem = 8, 
		RULE_soruBody = 9, RULE_jsonValue = 10;
	public static final String[] ruleNames = {
		"adl", "module", "imports", "annon", "top_level_statement", "typeParam", 
		"typeParamError", "typeExpr", "typeExprElem", "soruBody", "jsonValue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'['", "']'", "'='", "'\"'", "'''", "';'", "'::'", 
		"':'", "'.'", "','", "'<'", "'>'", "'*'", "'@'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "LCUR", "RCUR", "LSQ", "RSQ", "EQ", "DQ", "SQ", "SEMI", "DCOLON", 
		"COLON", "DOT", "COMMA", "LCHEVR", "RCHEVR", "STAR", "AT", "STR", "ID", 
		"INT", "FLT", "WS", "LINE_DOC", "LINE_COMMENT", "DOWN", "UP", "ROOT", 
		"ERROR", "ADL", "Module", "Import", "Annotation", "Struct", "Union", "Newtype", 
		"Type", "TypeParam", "TypeExpr", "TypeExprElem", "Field", "Json", "JsonStr", 
		"JsonBool", "JsonNull", "JsonInt", "JsonFloat", "JsonArray", "JsonObj", 
		"ModuleAnno", "DeclAnno", "FieldAnno"
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

	@Override
	public String getGrammarFileName() { return "AdlP.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AdlP(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AdlContext extends ParserRuleContext {
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AdlP.EOF, 0); }
		public AdlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_adl; }
	}

	public final AdlContext adl() throws RecognitionException {
		AdlContext _localctx = new AdlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_adl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			module();
			setState(23);
			match(EOF);
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

	public static class ModuleContext extends ParserRuleContext {
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	 
		public ModuleContext() { }
		public void copyFrom(ModuleContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ModuleStatementContext extends ModuleContext {
		public Token kw;
		public Token ID;
		public List<Token> name = new ArrayList<Token>();
		public TerminalNode LCUR() { return getToken(AdlP.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(AdlP.RCUR, 0); }
		public TerminalNode SEMI() { return getToken(AdlP.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public List<AnnonContext> annon() {
			return getRuleContexts(AnnonContext.class);
		}
		public AnnonContext annon(int i) {
			return getRuleContext(AnnonContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(AdlP.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AdlP.DOT, i);
		}
		public List<ImportsContext> imports() {
			return getRuleContexts(ImportsContext.class);
		}
		public ImportsContext imports(int i) {
			return getRuleContext(ImportsContext.class,i);
		}
		public List<Top_level_statementContext> top_level_statement() {
			return getRuleContexts(Top_level_statementContext.class);
		}
		public Top_level_statementContext top_level_statement(int i) {
			return getRuleContext(Top_level_statementContext.class,i);
		}
		public ModuleStatementContext(ModuleContext ctx) { copyFrom(ctx); }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_module);
		int _la;
		try {
			int _alt;
			_localctx = new ModuleStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==LINE_DOC) {
				{
				{
				setState(25);
				annon();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			((ModuleStatementContext)_localctx).kw = match(ID);
			setState(32);
			((ModuleStatementContext)_localctx).ID = match(ID);
			((ModuleStatementContext)_localctx).name.add(((ModuleStatementContext)_localctx).ID);
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(33);
				match(DOT);
				setState(34);
				((ModuleStatementContext)_localctx).ID = match(ID);
				((ModuleStatementContext)_localctx).name.add(((ModuleStatementContext)_localctx).ID);
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(40);
			match(LCUR);
			setState(44);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(41);
					imports();
					}
					} 
				}
				setState(46);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << ID) | (1L << LINE_DOC))) != 0)) {
				{
				{
				setState(47);
				top_level_statement();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(53);
			match(RCUR);
			setState(54);
			match(SEMI);
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

	public static class ImportsContext extends ParserRuleContext {
		public ImportsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imports; }
	 
		public ImportsContext() { }
		public void copyFrom(ImportsContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ImportStatementContext extends ImportsContext {
		public Token kw;
		public Token ID;
		public List<Token> a = new ArrayList<Token>();
		public Token s;
		public TerminalNode SEMI() { return getToken(AdlP.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public List<TerminalNode> DOT() { return getTokens(AdlP.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(AdlP.DOT, i);
		}
		public TerminalNode STAR() { return getToken(AdlP.STAR, 0); }
		public ImportStatementContext(ImportsContext ctx) { copyFrom(ctx); }
	}

	public final ImportsContext imports() throws RecognitionException {
		ImportsContext _localctx = new ImportsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_imports);
		int _la;
		try {
			int _alt;
			_localctx = new ImportStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			((ImportStatementContext)_localctx).kw = match(ID);
			setState(57);
			((ImportStatementContext)_localctx).ID = match(ID);
			((ImportStatementContext)_localctx).a.add(((ImportStatementContext)_localctx).ID);
			setState(62);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(58);
					match(DOT);
					setState(59);
					((ImportStatementContext)_localctx).ID = match(ID);
					((ImportStatementContext)_localctx).a.add(((ImportStatementContext)_localctx).ID);
					}
					} 
				}
				setState(64);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(65);
				match(DOT);
				setState(66);
				((ImportStatementContext)_localctx).s = match(STAR);
				}
			}

			setState(69);
			match(SEMI);
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

	public static class AnnonContext extends ParserRuleContext {
		public AnnonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annon; }
	 
		public AnnonContext() { }
		public void copyFrom(AnnonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DocAnnoContext extends AnnonContext {
		public Token a;
		public TerminalNode LINE_DOC() { return getToken(AdlP.LINE_DOC, 0); }
		public DocAnnoContext(AnnonContext ctx) { copyFrom(ctx); }
	}
	public static class LocalAnnoContext extends AnnonContext {
		public Token a;
		public TerminalNode AT() { return getToken(AdlP.AT, 0); }
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public TerminalNode ID() { return getToken(AdlP.ID, 0); }
		public LocalAnnoContext(AnnonContext ctx) { copyFrom(ctx); }
	}

	public final AnnonContext annon() throws RecognitionException {
		AnnonContext _localctx = new AnnonContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_annon);
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT:
				_localctx = new LocalAnnoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(AT);
				setState(72);
				((LocalAnnoContext)_localctx).a = match(ID);
				setState(73);
				jsonValue();
				}
				break;
			case LINE_DOC:
				_localctx = new DocAnnoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((DocAnnoContext)_localctx).a = match(LINE_DOC);
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

	public static class Top_level_statementContext extends ParserRuleContext {
		public Top_level_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top_level_statement; }
	 
		public Top_level_statementContext() { }
		public void copyFrom(Top_level_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructOrUnionContext extends Top_level_statementContext {
		public Token kw;
		public Token a;
		public TerminalNode LCUR() { return getToken(AdlP.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(AdlP.RCUR, 0); }
		public TerminalNode SEMI() { return getToken(AdlP.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public List<AnnonContext> annon() {
			return getRuleContexts(AnnonContext.class);
		}
		public AnnonContext annon(int i) {
			return getRuleContext(AnnonContext.class,i);
		}
		public TypeParamContext typeParam() {
			return getRuleContext(TypeParamContext.class,0);
		}
		public List<SoruBodyContext> soruBody() {
			return getRuleContexts(SoruBodyContext.class);
		}
		public SoruBodyContext soruBody(int i) {
			return getRuleContext(SoruBodyContext.class,i);
		}
		public StructOrUnionContext(Top_level_statementContext ctx) { copyFrom(ctx); }
	}
	public static class DeclAnnotationContext extends Top_level_statementContext {
		public Token kw;
		public Token a;
		public Token b;
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AdlP.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public DeclAnnotationContext(Top_level_statementContext ctx) { copyFrom(ctx); }
	}
	public static class FieldAnnotationContext extends Top_level_statementContext {
		public Token kw;
		public Token a;
		public Token b;
		public Token c;
		public TerminalNode DCOLON() { return getToken(AdlP.DCOLON, 0); }
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AdlP.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public FieldAnnotationContext(Top_level_statementContext ctx) { copyFrom(ctx); }
	}
	public static class TypeOrNewtypeContext extends Top_level_statementContext {
		public Token kw;
		public Token a;
		public Token b;
		public List<TerminalNode> EQ() { return getTokens(AdlP.EQ); }
		public TerminalNode EQ(int i) {
			return getToken(AdlP.EQ, i);
		}
		public TerminalNode SEMI() { return getToken(AdlP.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public List<AnnonContext> annon() {
			return getRuleContexts(AnnonContext.class);
		}
		public AnnonContext annon(int i) {
			return getRuleContext(AnnonContext.class,i);
		}
		public TypeParamContext typeParam() {
			return getRuleContext(TypeParamContext.class,0);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public TypeOrNewtypeContext(Top_level_statementContext ctx) { copyFrom(ctx); }
	}
	public static class ModuleAnnotationContext extends Top_level_statementContext {
		public Token kw;
		public Token a;
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public TerminalNode SEMI() { return getToken(AdlP.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public ModuleAnnotationContext(Top_level_statementContext ctx) { copyFrom(ctx); }
	}

	public final Top_level_statementContext top_level_statement() throws RecognitionException {
		Top_level_statementContext _localctx = new Top_level_statementContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_top_level_statement);
		int _la;
		try {
			setState(137);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				_localctx = new StructOrUnionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT || _la==LINE_DOC) {
					{
					{
					setState(77);
					annon();
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				((StructOrUnionContext)_localctx).kw = match(ID);
				setState(84);
				((StructOrUnionContext)_localctx).a = match(ID);
				setState(86);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCHEVR) {
					{
					setState(85);
					typeParam();
					}
				}

				setState(88);
				match(LCUR);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << AT) | (1L << ID) | (1L << LINE_DOC))) != 0)) {
					{
					{
					setState(89);
					soruBody();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(95);
				match(RCUR);
				setState(96);
				match(SEMI);
				}
				break;
			case 2:
				_localctx = new TypeOrNewtypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==AT || _la==LINE_DOC) {
					{
					{
					setState(97);
					annon();
					}
					}
					setState(102);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(103);
				((TypeOrNewtypeContext)_localctx).kw = match(ID);
				setState(104);
				((TypeOrNewtypeContext)_localctx).a = match(ID);
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCHEVR) {
					{
					setState(105);
					typeParam();
					}
				}

				setState(108);
				match(EQ);
				setState(109);
				((TypeOrNewtypeContext)_localctx).b = match(ID);
				setState(111);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LCHEVR) {
					{
					setState(110);
					typeExpr();
					}
				}

				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(113);
					match(EQ);
					setState(114);
					jsonValue();
					}
				}

				setState(117);
				match(SEMI);
				}
				break;
			case 3:
				_localctx = new ModuleAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(118);
				((ModuleAnnotationContext)_localctx).kw = match(ID);
				setState(119);
				((ModuleAnnotationContext)_localctx).a = match(ID);
				setState(120);
				jsonValue();
				setState(121);
				match(SEMI);
				}
				break;
			case 4:
				_localctx = new DeclAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(123);
				((DeclAnnotationContext)_localctx).kw = match(ID);
				setState(124);
				((DeclAnnotationContext)_localctx).a = match(ID);
				setState(125);
				((DeclAnnotationContext)_localctx).b = match(ID);
				setState(126);
				jsonValue();
				setState(127);
				match(SEMI);
				}
				break;
			case 5:
				_localctx = new FieldAnnotationContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				((FieldAnnotationContext)_localctx).kw = match(ID);
				setState(130);
				((FieldAnnotationContext)_localctx).a = match(ID);
				setState(131);
				match(DCOLON);
				setState(132);
				((FieldAnnotationContext)_localctx).b = match(ID);
				setState(133);
				((FieldAnnotationContext)_localctx).c = match(ID);
				setState(134);
				jsonValue();
				setState(135);
				match(SEMI);
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

	public static class TypeParamContext extends ParserRuleContext {
		public TypeParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParam; }
	 
		public TypeParamContext() { }
		public void copyFrom(TypeParamContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeParameterContext extends TypeParamContext {
		public Token ID;
		public List<Token> typep = new ArrayList<Token>();
		public TerminalNode LCHEVR() { return getToken(AdlP.LCHEVR, 0); }
		public TerminalNode RCHEVR() { return getToken(AdlP.RCHEVR, 0); }
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AdlP.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AdlP.COMMA, i);
		}
		public TypeParameterContext(TypeParamContext ctx) { copyFrom(ctx); }
	}
	public static class ErrorTypeParamContext extends TypeParamContext {
		public TerminalNode LCHEVR() { return getToken(AdlP.LCHEVR, 0); }
		public List<TypeParamErrorContext> typeParamError() {
			return getRuleContexts(TypeParamErrorContext.class);
		}
		public TypeParamErrorContext typeParamError(int i) {
			return getRuleContext(TypeParamErrorContext.class,i);
		}
		public TerminalNode RCHEVR() { return getToken(AdlP.RCHEVR, 0); }
		public List<TerminalNode> COMMA() { return getTokens(AdlP.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AdlP.COMMA, i);
		}
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public ErrorTypeParamContext(TypeParamContext ctx) { copyFrom(ctx); }
	}

	public final TypeParamContext typeParam() throws RecognitionException {
		TypeParamContext _localctx = new TypeParamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typeParam);
		int _la;
		try {
			setState(170);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				_localctx = new TypeParameterContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				match(LCHEVR);
				setState(140);
				((TypeParameterContext)_localctx).ID = match(ID);
				((TypeParameterContext)_localctx).typep.add(((TypeParameterContext)_localctx).ID);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(141);
					match(COMMA);
					setState(142);
					((TypeParameterContext)_localctx).ID = match(ID);
					((TypeParameterContext)_localctx).typep.add(((TypeParameterContext)_localctx).ID);
					}
					}
					setState(147);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(148);
				match(RCHEVR);
				}
				break;
			case 2:
				_localctx = new ErrorTypeParamContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				match(LCHEVR);
				setState(150);
				typeParamError();
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(151);
					match(COMMA);
					setState(152);
					match(ID);
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(RCHEVR);
				}
				break;
			case 3:
				_localctx = new ErrorTypeParamContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(160);
				match(LCHEVR);
				setState(161);
				match(ID);
				setState(164); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(162);
					match(COMMA);
					setState(163);
					typeParamError();
					}
					}
					setState(166); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(168);
				match(RCHEVR);
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

	public static class TypeParamErrorContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public TerminalNode LCHEVR() { return getToken(AdlP.LCHEVR, 0); }
		public TerminalNode RCHEVR() { return getToken(AdlP.RCHEVR, 0); }
		public List<TypeParamErrorContext> typeParamError() {
			return getRuleContexts(TypeParamErrorContext.class);
		}
		public TypeParamErrorContext typeParamError(int i) {
			return getRuleContext(TypeParamErrorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AdlP.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AdlP.COMMA, i);
		}
		public TypeParamErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParamError; }
	}

	public final TypeParamErrorContext typeParamError() throws RecognitionException {
		TypeParamErrorContext _localctx = new TypeParamErrorContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeParamError);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ID);
			setState(173);
			match(LCHEVR);
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(174);
				match(ID);
				}
				break;
			case 2:
				{
				setState(175);
				typeParamError();
				}
				break;
			}
			setState(185);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(178);
				match(COMMA);
				setState(181);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
				case 1:
					{
					setState(179);
					match(ID);
					}
					break;
				case 2:
					{
					setState(180);
					typeParamError();
					}
					break;
				}
				}
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(188);
			match(RCHEVR);
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

	public static class TypeExprContext extends ParserRuleContext {
		public TypeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr; }
	 
		public TypeExprContext() { }
		public void copyFrom(TypeExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeExpressionContext extends TypeExprContext {
		public TypeExprElemContext typeExprElem;
		public List<TypeExprElemContext> typep = new ArrayList<TypeExprElemContext>();
		public TerminalNode LCHEVR() { return getToken(AdlP.LCHEVR, 0); }
		public TerminalNode RCHEVR() { return getToken(AdlP.RCHEVR, 0); }
		public List<TypeExprElemContext> typeExprElem() {
			return getRuleContexts(TypeExprElemContext.class);
		}
		public TypeExprElemContext typeExprElem(int i) {
			return getRuleContext(TypeExprElemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AdlP.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AdlP.COMMA, i);
		}
		public TypeExpressionContext(TypeExprContext ctx) { copyFrom(ctx); }
	}

	public final TypeExprContext typeExpr() throws RecognitionException {
		TypeExprContext _localctx = new TypeExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeExpr);
		int _la;
		try {
			_localctx = new TypeExpressionContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			match(LCHEVR);
			setState(191);
			((TypeExpressionContext)_localctx).typeExprElem = typeExprElem();
			((TypeExpressionContext)_localctx).typep.add(((TypeExpressionContext)_localctx).typeExprElem);
			setState(196);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(192);
				match(COMMA);
				setState(193);
				((TypeExpressionContext)_localctx).typeExprElem = typeExprElem();
				((TypeExpressionContext)_localctx).typep.add(((TypeExpressionContext)_localctx).typeExprElem);
				}
				}
				setState(198);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(199);
			match(RCHEVR);
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

	public static class TypeExprElemContext extends ParserRuleContext {
		public TypeExprElemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExprElem; }
	 
		public TypeExprElemContext() { }
		public void copyFrom(TypeExprElemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeExpressionElemContext extends TypeExprElemContext {
		public Token a;
		public TypeExprElemContext typeExprElem;
		public List<TypeExprElemContext> typep = new ArrayList<TypeExprElemContext>();
		public TerminalNode ID() { return getToken(AdlP.ID, 0); }
		public TerminalNode LCHEVR() { return getToken(AdlP.LCHEVR, 0); }
		public TerminalNode RCHEVR() { return getToken(AdlP.RCHEVR, 0); }
		public List<TypeExprElemContext> typeExprElem() {
			return getRuleContexts(TypeExprElemContext.class);
		}
		public TypeExprElemContext typeExprElem(int i) {
			return getRuleContext(TypeExprElemContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AdlP.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AdlP.COMMA, i);
		}
		public TypeExpressionElemContext(TypeExprElemContext ctx) { copyFrom(ctx); }
	}

	public final TypeExprElemContext typeExprElem() throws RecognitionException {
		TypeExprElemContext _localctx = new TypeExprElemContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_typeExprElem);
		int _la;
		try {
			_localctx = new TypeExpressionElemContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			((TypeExpressionElemContext)_localctx).a = match(ID);
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCHEVR) {
				{
				setState(202);
				match(LCHEVR);
				setState(203);
				((TypeExpressionElemContext)_localctx).typeExprElem = typeExprElem();
				((TypeExpressionElemContext)_localctx).typep.add(((TypeExpressionElemContext)_localctx).typeExprElem);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(204);
					match(COMMA);
					setState(205);
					((TypeExpressionElemContext)_localctx).typeExprElem = typeExprElem();
					((TypeExpressionElemContext)_localctx).typep.add(((TypeExpressionElemContext)_localctx).typeExprElem);
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211);
				match(RCHEVR);
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

	public static class SoruBodyContext extends ParserRuleContext {
		public SoruBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_soruBody; }
	 
		public SoruBodyContext() { }
		public void copyFrom(SoruBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldStatementContext extends SoruBodyContext {
		public Token a;
		public Token b;
		public TerminalNode SEMI() { return getToken(AdlP.SEMI, 0); }
		public List<TerminalNode> ID() { return getTokens(AdlP.ID); }
		public TerminalNode ID(int i) {
			return getToken(AdlP.ID, i);
		}
		public List<AnnonContext> annon() {
			return getRuleContexts(AnnonContext.class);
		}
		public AnnonContext annon(int i) {
			return getRuleContext(AnnonContext.class,i);
		}
		public TypeExprContext typeExpr() {
			return getRuleContext(TypeExprContext.class,0);
		}
		public TerminalNode EQ() { return getToken(AdlP.EQ, 0); }
		public JsonValueContext jsonValue() {
			return getRuleContext(JsonValueContext.class,0);
		}
		public FieldStatementContext(SoruBodyContext ctx) { copyFrom(ctx); }
	}

	public final SoruBodyContext soruBody() throws RecognitionException {
		SoruBodyContext _localctx = new SoruBodyContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_soruBody);
		int _la;
		try {
			_localctx = new FieldStatementContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT || _la==LINE_DOC) {
				{
				{
				setState(215);
				annon();
				}
				}
				setState(220);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(221);
			((FieldStatementContext)_localctx).a = match(ID);
			setState(223);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LCHEVR) {
				{
				setState(222);
				typeExpr();
				}
			}

			setState(225);
			((FieldStatementContext)_localctx).b = match(ID);
			setState(228);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ) {
				{
				setState(226);
				match(EQ);
				setState(227);
				jsonValue();
				}
			}

			setState(230);
			match(SEMI);
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

	public static class JsonValueContext extends ParserRuleContext {
		public JsonValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonValue; }
	 
		public JsonValueContext() { }
		public void copyFrom(JsonValueContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TrueFalseNullContext extends JsonValueContext {
		public Token kw;
		public TerminalNode ID() { return getToken(AdlP.ID, 0); }
		public TrueFalseNullContext(JsonValueContext ctx) { copyFrom(ctx); }
	}
	public static class ObjStatementContext extends JsonValueContext {
		public Token STR;
		public List<Token> k = new ArrayList<Token>();
		public JsonValueContext jsonValue;
		public List<JsonValueContext> v = new ArrayList<JsonValueContext>();
		public TerminalNode LCUR() { return getToken(AdlP.LCUR, 0); }
		public TerminalNode RCUR() { return getToken(AdlP.RCUR, 0); }
		public List<TerminalNode> COLON() { return getTokens(AdlP.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(AdlP.COLON, i);
		}
		public List<TerminalNode> STR() { return getTokens(AdlP.STR); }
		public TerminalNode STR(int i) {
			return getToken(AdlP.STR, i);
		}
		public List<JsonValueContext> jsonValue() {
			return getRuleContexts(JsonValueContext.class);
		}
		public JsonValueContext jsonValue(int i) {
			return getRuleContext(JsonValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AdlP.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AdlP.COMMA, i);
		}
		public ObjStatementContext(JsonValueContext ctx) { copyFrom(ctx); }
	}
	public static class FloatStatementContext extends JsonValueContext {
		public Token f;
		public TerminalNode FLT() { return getToken(AdlP.FLT, 0); }
		public FloatStatementContext(JsonValueContext ctx) { copyFrom(ctx); }
	}
	public static class ArrayStatementContext extends JsonValueContext {
		public JsonValueContext jsonValue;
		public List<JsonValueContext> jv = new ArrayList<JsonValueContext>();
		public TerminalNode LSQ() { return getToken(AdlP.LSQ, 0); }
		public TerminalNode RSQ() { return getToken(AdlP.RSQ, 0); }
		public List<JsonValueContext> jsonValue() {
			return getRuleContexts(JsonValueContext.class);
		}
		public JsonValueContext jsonValue(int i) {
			return getRuleContext(JsonValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(AdlP.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(AdlP.COMMA, i);
		}
		public ArrayStatementContext(JsonValueContext ctx) { copyFrom(ctx); }
	}
	public static class NumberStatementContext extends JsonValueContext {
		public Token n;
		public TerminalNode INT() { return getToken(AdlP.INT, 0); }
		public NumberStatementContext(JsonValueContext ctx) { copyFrom(ctx); }
	}
	public static class StringStatementContext extends JsonValueContext {
		public Token s;
		public TerminalNode STR() { return getToken(AdlP.STR, 0); }
		public StringStatementContext(JsonValueContext ctx) { copyFrom(ctx); }
	}

	public final JsonValueContext jsonValue() throws RecognitionException {
		JsonValueContext _localctx = new JsonValueContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_jsonValue);
		int _la;
		try {
			setState(264);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STR:
				_localctx = new StringStatementContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(232);
				((StringStatementContext)_localctx).s = match(STR);
				}
				break;
			case ID:
				_localctx = new TrueFalseNullContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(233);
				((TrueFalseNullContext)_localctx).kw = match(ID);
				}
				break;
			case INT:
				_localctx = new NumberStatementContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(234);
				((NumberStatementContext)_localctx).n = match(INT);
				}
				break;
			case FLT:
				_localctx = new FloatStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(235);
				((FloatStatementContext)_localctx).f = match(FLT);
				}
				break;
			case LSQ:
				_localctx = new ArrayStatementContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(236);
				match(LSQ);
				setState(245);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << LCUR) | (1L << LSQ) | (1L << STR) | (1L << ID) | (1L << INT) | (1L << FLT))) != 0)) {
					{
					setState(237);
					((ArrayStatementContext)_localctx).jsonValue = jsonValue();
					((ArrayStatementContext)_localctx).jv.add(((ArrayStatementContext)_localctx).jsonValue);
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(238);
						match(COMMA);
						setState(239);
						((ArrayStatementContext)_localctx).jsonValue = jsonValue();
						((ArrayStatementContext)_localctx).jv.add(((ArrayStatementContext)_localctx).jsonValue);
						}
						}
						setState(244);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(247);
				match(RSQ);
				}
				break;
			case LCUR:
				_localctx = new ObjStatementContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(248);
				match(LCUR);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STR) {
					{
					setState(249);
					((ObjStatementContext)_localctx).STR = match(STR);
					((ObjStatementContext)_localctx).k.add(((ObjStatementContext)_localctx).STR);
					setState(250);
					match(COLON);
					setState(251);
					((ObjStatementContext)_localctx).jsonValue = jsonValue();
					((ObjStatementContext)_localctx).v.add(((ObjStatementContext)_localctx).jsonValue);
					setState(258);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(252);
						match(COMMA);
						setState(253);
						((ObjStatementContext)_localctx).STR = match(STR);
						((ObjStatementContext)_localctx).k.add(((ObjStatementContext)_localctx).STR);
						setState(254);
						match(COLON);
						setState(255);
						((ObjStatementContext)_localctx).jsonValue = jsonValue();
						((ObjStatementContext)_localctx).v.add(((ObjStatementContext)_localctx).jsonValue);
						}
						}
						setState(260);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(263);
				match(RCUR);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\64\u010d\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\3\7\3\35\n\3\f\3\16\3 \13\3\3\3\3\3\3\3\3"+
		"\3\7\3&\n\3\f\3\16\3)\13\3\3\3\3\3\7\3-\n\3\f\3\16\3\60\13\3\3\3\7\3\63"+
		"\n\3\f\3\16\3\66\13\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\7\4?\n\4\f\4\16\4B\13"+
		"\4\3\4\3\4\5\4F\n\4\3\4\3\4\3\5\3\5\3\5\3\5\5\5N\n\5\3\6\7\6Q\n\6\f\6"+
		"\16\6T\13\6\3\6\3\6\3\6\5\6Y\n\6\3\6\3\6\7\6]\n\6\f\6\16\6`\13\6\3\6\3"+
		"\6\3\6\7\6e\n\6\f\6\16\6h\13\6\3\6\3\6\3\6\5\6m\n\6\3\6\3\6\3\6\5\6r\n"+
		"\6\3\6\3\6\5\6v\n\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6\u008c\n\6\3\7\3\7\3\7\3\7\7\7\u0092"+
		"\n\7\f\7\16\7\u0095\13\7\3\7\3\7\3\7\3\7\3\7\7\7\u009c\n\7\f\7\16\7\u009f"+
		"\13\7\3\7\3\7\3\7\3\7\3\7\3\7\6\7\u00a7\n\7\r\7\16\7\u00a8\3\7\3\7\5\7"+
		"\u00ad\n\7\3\b\3\b\3\b\3\b\5\b\u00b3\n\b\3\b\3\b\3\b\5\b\u00b8\n\b\7\b"+
		"\u00ba\n\b\f\b\16\b\u00bd\13\b\3\b\3\b\3\t\3\t\3\t\3\t\7\t\u00c5\n\t\f"+
		"\t\16\t\u00c8\13\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\7\n\u00d1\n\n\f\n\16\n"+
		"\u00d4\13\n\3\n\3\n\5\n\u00d8\n\n\3\13\7\13\u00db\n\13\f\13\16\13\u00de"+
		"\13\13\3\13\3\13\5\13\u00e2\n\13\3\13\3\13\3\13\5\13\u00e7\n\13\3\13\3"+
		"\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u00f3\n\f\f\f\16\f\u00f6\13\f"+
		"\5\f\u00f8\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\7\f\u0103\n\f\f\f\16"+
		"\f\u0106\13\f\5\f\u0108\n\f\3\f\5\f\u010b\n\f\3\f\2\2\r\2\4\6\b\n\f\16"+
		"\20\22\24\26\2\2\2\u012a\2\30\3\2\2\2\4\36\3\2\2\2\6:\3\2\2\2\bM\3\2\2"+
		"\2\n\u008b\3\2\2\2\f\u00ac\3\2\2\2\16\u00ae\3\2\2\2\20\u00c0\3\2\2\2\22"+
		"\u00cb\3\2\2\2\24\u00dc\3\2\2\2\26\u010a\3\2\2\2\30\31\5\4\3\2\31\32\7"+
		"\2\2\3\32\3\3\2\2\2\33\35\5\b\5\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3\2"+
		"\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\24\2\2\"\'\7\24\2\2#$"+
		"\7\r\2\2$&\7\24\2\2%#\3\2\2\2&)\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2(*\3\2\2"+
		"\2)\'\3\2\2\2*.\7\3\2\2+-\5\6\4\2,+\3\2\2\2-\60\3\2\2\2.,\3\2\2\2./\3"+
		"\2\2\2/\64\3\2\2\2\60.\3\2\2\2\61\63\5\n\6\2\62\61\3\2\2\2\63\66\3\2\2"+
		"\2\64\62\3\2\2\2\64\65\3\2\2\2\65\67\3\2\2\2\66\64\3\2\2\2\678\7\4\2\2"+
		"89\7\n\2\29\5\3\2\2\2:;\7\24\2\2;@\7\24\2\2<=\7\r\2\2=?\7\24\2\2><\3\2"+
		"\2\2?B\3\2\2\2@>\3\2\2\2@A\3\2\2\2AE\3\2\2\2B@\3\2\2\2CD\7\r\2\2DF\7\21"+
		"\2\2EC\3\2\2\2EF\3\2\2\2FG\3\2\2\2GH\7\n\2\2H\7\3\2\2\2IJ\7\22\2\2JK\7"+
		"\24\2\2KN\5\26\f\2LN\7\30\2\2MI\3\2\2\2ML\3\2\2\2N\t\3\2\2\2OQ\5\b\5\2"+
		"PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SU\3\2\2\2TR\3\2\2\2UV\7\24\2"+
		"\2VX\7\24\2\2WY\5\f\7\2XW\3\2\2\2XY\3\2\2\2YZ\3\2\2\2Z^\7\3\2\2[]\5\24"+
		"\13\2\\[\3\2\2\2]`\3\2\2\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`^\3\2\2\2ab"+
		"\7\4\2\2b\u008c\7\n\2\2ce\5\b\5\2dc\3\2\2\2eh\3\2\2\2fd\3\2\2\2fg\3\2"+
		"\2\2gi\3\2\2\2hf\3\2\2\2ij\7\24\2\2jl\7\24\2\2km\5\f\7\2lk\3\2\2\2lm\3"+
		"\2\2\2mn\3\2\2\2no\7\7\2\2oq\7\24\2\2pr\5\20\t\2qp\3\2\2\2qr\3\2\2\2r"+
		"u\3\2\2\2st\7\7\2\2tv\5\26\f\2us\3\2\2\2uv\3\2\2\2vw\3\2\2\2w\u008c\7"+
		"\n\2\2xy\7\24\2\2yz\7\24\2\2z{\5\26\f\2{|\7\n\2\2|\u008c\3\2\2\2}~\7\24"+
		"\2\2~\177\7\24\2\2\177\u0080\7\24\2\2\u0080\u0081\5\26\f\2\u0081\u0082"+
		"\7\n\2\2\u0082\u008c\3\2\2\2\u0083\u0084\7\24\2\2\u0084\u0085\7\24\2\2"+
		"\u0085\u0086\7\13\2\2\u0086\u0087\7\24\2\2\u0087\u0088\7\24\2\2\u0088"+
		"\u0089\5\26\f\2\u0089\u008a\7\n\2\2\u008a\u008c\3\2\2\2\u008bR\3\2\2\2"+
		"\u008bf\3\2\2\2\u008bx\3\2\2\2\u008b}\3\2\2\2\u008b\u0083\3\2\2\2\u008c"+
		"\13\3\2\2\2\u008d\u008e\7\17\2\2\u008e\u0093\7\24\2\2\u008f\u0090\7\16"+
		"\2\2\u0090\u0092\7\24\2\2\u0091\u008f\3\2\2\2\u0092\u0095\3\2\2\2\u0093"+
		"\u0091\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\3\2\2\2\u0095\u0093\3\2"+
		"\2\2\u0096\u00ad\7\20\2\2\u0097\u0098\7\17\2\2\u0098\u009d\5\16\b\2\u0099"+
		"\u009a\7\16\2\2\u009a\u009c\7\24\2\2\u009b\u0099\3\2\2\2\u009c\u009f\3"+
		"\2\2\2\u009d\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u00a0\3\2\2\2\u009f"+
		"\u009d\3\2\2\2\u00a0\u00a1\7\20\2\2\u00a1\u00ad\3\2\2\2\u00a2\u00a3\7"+
		"\17\2\2\u00a3\u00a6\7\24\2\2\u00a4\u00a5\7\16\2\2\u00a5\u00a7\5\16\b\2"+
		"\u00a6\u00a4\3\2\2\2\u00a7\u00a8\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a9"+
		"\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\7\20\2\2\u00ab\u00ad\3\2\2\2"+
		"\u00ac\u008d\3\2\2\2\u00ac\u0097\3\2\2\2\u00ac\u00a2\3\2\2\2\u00ad\r\3"+
		"\2\2\2\u00ae\u00af\7\24\2\2\u00af\u00b2\7\17\2\2\u00b0\u00b3\7\24\2\2"+
		"\u00b1\u00b3\5\16\b\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2\2\u00b3\u00bb"+
		"\3\2\2\2\u00b4\u00b7\7\16\2\2\u00b5\u00b8\7\24\2\2\u00b6\u00b8\5\16\b"+
		"\2\u00b7\u00b5\3\2\2\2\u00b7\u00b6\3\2\2\2\u00b8\u00ba\3\2\2\2\u00b9\u00b4"+
		"\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc"+
		"\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7\20\2\2\u00bf\17\3\2\2"+
		"\2\u00c0\u00c1\7\17\2\2\u00c1\u00c6\5\22\n\2\u00c2\u00c3\7\16\2\2\u00c3"+
		"\u00c5\5\22\n\2\u00c4\u00c2\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3"+
		"\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c9\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9"+
		"\u00ca\7\20\2\2\u00ca\21\3\2\2\2\u00cb\u00d7\7\24\2\2\u00cc\u00cd\7\17"+
		"\2\2\u00cd\u00d2\5\22\n\2\u00ce\u00cf\7\16\2\2\u00cf\u00d1\5\22\n\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2"+
		"\2\2\u00d3\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\20\2\2\u00d6"+
		"\u00d8\3\2\2\2\u00d7\u00cc\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\23\3\2\2"+
		"\2\u00d9\u00db\5\b\5\2\u00da\u00d9\3\2\2\2\u00db\u00de\3\2\2\2\u00dc\u00da"+
		"\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\3\2\2\2\u00de\u00dc\3\2\2\2\u00df"+
		"\u00e1\7\24\2\2\u00e0\u00e2\5\20\t\2\u00e1\u00e0\3\2\2\2\u00e1\u00e2\3"+
		"\2\2\2\u00e2\u00e3\3\2\2\2\u00e3\u00e6\7\24\2\2\u00e4\u00e5\7\7\2\2\u00e5"+
		"\u00e7\5\26\f\2\u00e6\u00e4\3\2\2\2\u00e6\u00e7\3\2\2\2\u00e7\u00e8\3"+
		"\2\2\2\u00e8\u00e9\7\n\2\2\u00e9\25\3\2\2\2\u00ea\u010b\7\23\2\2\u00eb"+
		"\u010b\7\24\2\2\u00ec\u010b\7\25\2\2\u00ed\u010b\7\26\2\2\u00ee\u00f7"+
		"\7\5\2\2\u00ef\u00f4\5\26\f\2\u00f0\u00f1\7\16\2\2\u00f1\u00f3\5\26\f"+
		"\2\u00f2\u00f0\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5"+
		"\3\2\2\2\u00f5\u00f8\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00ef\3\2\2\2\u00f7"+
		"\u00f8\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9\u010b\7\6\2\2\u00fa\u0107\7\3"+
		"\2\2\u00fb\u00fc\7\23\2\2\u00fc\u00fd\7\f\2\2\u00fd\u0104\5\26\f\2\u00fe"+
		"\u00ff\7\16\2\2\u00ff\u0100\7\23\2\2\u0100\u0101\7\f\2\2\u0101\u0103\5"+
		"\26\f\2\u0102\u00fe\3\2\2\2\u0103\u0106\3\2\2\2\u0104\u0102\3\2\2\2\u0104"+
		"\u0105\3\2\2\2\u0105\u0108\3\2\2\2\u0106\u0104\3\2\2\2\u0107\u00fb\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010b\7\4\2\2\u010a"+
		"\u00ea\3\2\2\2\u010a\u00eb\3\2\2\2\u010a\u00ec\3\2\2\2\u010a\u00ed\3\2"+
		"\2\2\u010a\u00ee\3\2\2\2\u010a\u00fa\3\2\2\2\u010b\27\3\2\2\2#\36\'.\64"+
		"@EMRX^flqu\u008b\u0093\u009d\u00a8\u00ac\u00b2\u00b7\u00bb\u00c6\u00d2"+
		"\u00d7\u00dc\u00e1\u00e6\u00f4\u00f7\u0104\u0107\u010a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}