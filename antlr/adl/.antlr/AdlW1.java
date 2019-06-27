// Generated from /home/garym/devel/wxio/tron/antlr/adl/AdlW1.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdlW1 extends Parser {
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
		JsonArray=46, JsonObj=47, ModuleAnno=48, DeclAnno=49, FieldAnno=50, DNAC=51, 
		Name=52, Exnotation=53;
	public static final int
		RULE_adl = 0, RULE_json = 1, RULE_module = 2, RULE_tld = 3, RULE_nameBody = 4, 
		RULE_annotation = 5, RULE_typeExpr_ = 6, RULE_typeExprElem_ = 7, RULE_jsonVal = 8;
	public static final String[] ruleNames = {
		"adl", "json", "module", "tld", "nameBody", "annotation", "typeExpr_", 
		"typeExprElem_", "jsonVal"
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
		"ModuleAnno", "DeclAnno", "FieldAnno", "DNAC", "Name", "Exnotation"
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
	public String getGrammarFileName() { return "AdlW1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AdlW1(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class AdlContext extends ParserRuleContext {
		public Token tok;
		public List<TerminalNode> DOWN() { return getTokens(AdlW1.DOWN); }
		public TerminalNode DOWN(int i) {
			return getToken(AdlW1.DOWN, i);
		}
		public ModuleContext module() {
			return getRuleContext(ModuleContext.class,0);
		}
		public List<TerminalNode> UP() { return getTokens(AdlW1.UP); }
		public TerminalNode UP(int i) {
			return getToken(AdlW1.UP, i);
		}
		public TerminalNode EOF() { return getToken(AdlW1.EOF, 0); }
		public TerminalNode ADL() { return getToken(AdlW1.ADL, 0); }
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
			setState(18);
			match(DOWN);
			setState(19);
			((AdlContext)_localctx).tok = match(ADL);
			setState(20);
			match(DOWN);
			setState(21);
			module();
			setState(22);
			match(UP);
			setState(23);
			match(UP);
			setState(24);
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

	public static class JsonContext extends ParserRuleContext {
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public JsonValContext jsonVal() {
			return getRuleContext(JsonValContext.class,0);
		}
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public TerminalNode EOF() { return getToken(AdlW1.EOF, 0); }
		public JsonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_json; }
	}

	public final JsonContext json() throws RecognitionException {
		JsonContext _localctx = new JsonContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_json);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26);
			match(DOWN);
			setState(27);
			jsonVal();
			setState(28);
			match(UP);
			setState(29);
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
		public Token tok;
		public TerminalNode Module() { return getToken(AdlW1.Module, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<TerminalNode> Import() { return getTokens(AdlW1.Import); }
		public TerminalNode Import(int i) {
			return getToken(AdlW1.Import, i);
		}
		public List<TldContext> tld() {
			return getRuleContexts(TldContext.class);
		}
		public TldContext tld(int i) {
			return getRuleContext(TldContext.class,i);
		}
		public ModuleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_module; }
	}

	public final ModuleContext module() throws RecognitionException {
		ModuleContext _localctx = new ModuleContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_module);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(31);
			((ModuleContext)_localctx).tok = match(Module);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOWN) {
				{
				setState(32);
				match(DOWN);
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Annotation) {
					{
					{
					setState(33);
					annotation();
					}
					}
					setState(38);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Import) {
					{
					{
					setState(39);
					match(Import);
					}
					}
					setState(44);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(48);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << Struct) | (1L << Union) | (1L << Newtype) | (1L << Type) | (1L << ModuleAnno) | (1L << DeclAnno) | (1L << FieldAnno))) != 0)) {
					{
					{
					setState(45);
					tld();
					}
					}
					setState(50);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(51);
				match(UP);
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

	public static class TldContext extends ParserRuleContext {
		public TldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tld; }
	 
		public TldContext() { }
		public void copyFrom(TldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeContext extends TldContext {
		public Token tok;
		public TerminalNode Type() { return getToken(AdlW1.Type, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode TypeParam() { return getToken(AdlW1.TypeParam, 0); }
		public TypeExpr_Context typeExpr_() {
			return getRuleContext(TypeExpr_Context.class,0);
		}
		public List<JsonValContext> jsonVal() {
			return getRuleContexts(JsonValContext.class);
		}
		public JsonValContext jsonVal(int i) {
			return getRuleContext(JsonValContext.class,i);
		}
		public TypeContext(TldContext ctx) { copyFrom(ctx); }
	}
	public static class TypeParamErrorContext extends TldContext {
		public Token tok;
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode ERROR() { return getToken(AdlW1.ERROR, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public TerminalNode Struct() { return getToken(AdlW1.Struct, 0); }
		public TerminalNode Union() { return getToken(AdlW1.Union, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public List<NameBodyContext> nameBody() {
			return getRuleContexts(NameBodyContext.class);
		}
		public NameBodyContext nameBody(int i) {
			return getRuleContext(NameBodyContext.class,i);
		}
		public TerminalNode Type() { return getToken(AdlW1.Type, 0); }
		public TerminalNode Newtype() { return getToken(AdlW1.Newtype, 0); }
		public TypeExpr_Context typeExpr_() {
			return getRuleContext(TypeExpr_Context.class,0);
		}
		public List<JsonValContext> jsonVal() {
			return getRuleContexts(JsonValContext.class);
		}
		public JsonValContext jsonVal(int i) {
			return getRuleContext(JsonValContext.class,i);
		}
		public TypeParamErrorContext(TldContext ctx) { copyFrom(ctx); }
	}
	public static class NewtypeContext extends TldContext {
		public Token tok;
		public TerminalNode Newtype() { return getToken(AdlW1.Newtype, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode TypeParam() { return getToken(AdlW1.TypeParam, 0); }
		public TypeExpr_Context typeExpr_() {
			return getRuleContext(TypeExpr_Context.class,0);
		}
		public List<JsonValContext> jsonVal() {
			return getRuleContexts(JsonValContext.class);
		}
		public JsonValContext jsonVal(int i) {
			return getRuleContext(JsonValContext.class,i);
		}
		public NewtypeContext(TldContext ctx) { copyFrom(ctx); }
	}
	public static class ModAnnoContext extends TldContext {
		public Token tok;
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public JsonValContext jsonVal() {
			return getRuleContext(JsonValContext.class,0);
		}
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public TerminalNode ModuleAnno() { return getToken(AdlW1.ModuleAnno, 0); }
		public ModAnnoContext(TldContext ctx) { copyFrom(ctx); }
	}
	public static class FieldAnnoContext extends TldContext {
		public Token tok;
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public JsonValContext jsonVal() {
			return getRuleContext(JsonValContext.class,0);
		}
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public TerminalNode FieldAnno() { return getToken(AdlW1.FieldAnno, 0); }
		public FieldAnnoContext(TldContext ctx) { copyFrom(ctx); }
	}
	public static class UnionContext extends TldContext {
		public Token tok;
		public TerminalNode Union() { return getToken(AdlW1.Union, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode TypeParam() { return getToken(AdlW1.TypeParam, 0); }
		public List<NameBodyContext> nameBody() {
			return getRuleContexts(NameBodyContext.class);
		}
		public NameBodyContext nameBody(int i) {
			return getRuleContext(NameBodyContext.class,i);
		}
		public UnionContext(TldContext ctx) { copyFrom(ctx); }
	}
	public static class DeclAnnoContext extends TldContext {
		public Token tok;
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public JsonValContext jsonVal() {
			return getRuleContext(JsonValContext.class,0);
		}
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public TerminalNode DeclAnno() { return getToken(AdlW1.DeclAnno, 0); }
		public DeclAnnoContext(TldContext ctx) { copyFrom(ctx); }
	}
	public static class StructContext extends TldContext {
		public Token tok;
		public TerminalNode Struct() { return getToken(AdlW1.Struct, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode TypeParam() { return getToken(AdlW1.TypeParam, 0); }
		public List<NameBodyContext> nameBody() {
			return getRuleContexts(NameBodyContext.class);
		}
		public NameBodyContext nameBody(int i) {
			return getRuleContext(NameBodyContext.class,i);
		}
		public StructContext(TldContext ctx) { copyFrom(ctx); }
	}

	public final TldContext tld() throws RecognitionException {
		TldContext _localctx = new TldContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_tld);
		int _la;
		try {
			setState(198);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				_localctx = new StructContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				((StructContext)_localctx).tok = match(Struct);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOWN) {
					{
					setState(55);
					match(DOWN);
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Annotation) {
						{
						{
						setState(56);
						annotation();
						}
						}
						setState(61);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(63);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeParam) {
						{
						setState(62);
						match(TypeParam);
						}
					}

					setState(68);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Field) {
						{
						{
						setState(65);
						nameBody();
						}
						}
						setState(70);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(71);
					match(UP);
					}
				}

				}
				break;
			case 2:
				_localctx = new UnionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(74);
				((UnionContext)_localctx).tok = match(Union);
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOWN) {
					{
					setState(75);
					match(DOWN);
					setState(79);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Annotation) {
						{
						{
						setState(76);
						annotation();
						}
						}
						setState(81);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(83);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeParam) {
						{
						setState(82);
						match(TypeParam);
						}
					}

					setState(88);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Field) {
						{
						{
						setState(85);
						nameBody();
						}
						}
						setState(90);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(91);
					match(UP);
					}
				}

				}
				break;
			case 3:
				_localctx = new TypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(94);
				((TypeContext)_localctx).tok = match(Type);
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOWN) {
					{
					setState(95);
					match(DOWN);
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Annotation) {
						{
						{
						setState(96);
						annotation();
						}
						}
						setState(101);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(103);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeParam) {
						{
						setState(102);
						match(TypeParam);
						}
					}

					setState(106);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeExpr) {
						{
						setState(105);
						typeExpr_();
						}
					}

					setState(111);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JsonStr) | (1L << JsonBool) | (1L << JsonNull) | (1L << JsonInt) | (1L << JsonFloat) | (1L << JsonArray) | (1L << JsonObj))) != 0)) {
						{
						{
						setState(108);
						jsonVal();
						}
						}
						setState(113);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(114);
					match(UP);
					}
				}

				}
				break;
			case 4:
				_localctx = new NewtypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(117);
				((NewtypeContext)_localctx).tok = match(Newtype);
				setState(138);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOWN) {
					{
					setState(118);
					match(DOWN);
					setState(122);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==Annotation) {
						{
						{
						setState(119);
						annotation();
						}
						}
						setState(124);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(126);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeParam) {
						{
						setState(125);
						match(TypeParam);
						}
					}

					setState(129);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==TypeExpr) {
						{
						setState(128);
						typeExpr_();
						}
					}

					setState(134);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JsonStr) | (1L << JsonBool) | (1L << JsonNull) | (1L << JsonInt) | (1L << JsonFloat) | (1L << JsonArray) | (1L << JsonObj))) != 0)) {
						{
						{
						setState(131);
						jsonVal();
						}
						}
						setState(136);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(137);
					match(UP);
					}
				}

				}
				break;
			case 5:
				_localctx = new ModAnnoContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				((ModAnnoContext)_localctx).tok = match(ModuleAnno);
				setState(141);
				match(DOWN);
				setState(142);
				jsonVal();
				setState(143);
				match(UP);
				}
				break;
			case 6:
				_localctx = new DeclAnnoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				((DeclAnnoContext)_localctx).tok = match(DeclAnno);
				setState(146);
				match(DOWN);
				setState(147);
				jsonVal();
				setState(148);
				match(UP);
				}
				break;
			case 7:
				_localctx = new FieldAnnoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(150);
				((FieldAnnoContext)_localctx).tok = match(FieldAnno);
				setState(151);
				match(DOWN);
				setState(152);
				jsonVal();
				setState(153);
				match(UP);
				}
				break;
			case 8:
				_localctx = new TypeParamErrorContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(157);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Struct:
					{
					setState(155);
					((TypeParamErrorContext)_localctx).tok = match(Struct);
					}
					break;
				case Union:
					{
					setState(156);
					((TypeParamErrorContext)_localctx).tok = match(Union);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(159);
				match(DOWN);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Annotation) {
					{
					{
					setState(160);
					annotation();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(ERROR);
				setState(170);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Field) {
					{
					{
					setState(167);
					nameBody();
					}
					}
					setState(172);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(173);
				match(UP);
				}
				break;
			case 9:
				_localctx = new TypeParamErrorContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case Type:
					{
					setState(174);
					((TypeParamErrorContext)_localctx).tok = match(Type);
					}
					break;
				case Newtype:
					{
					setState(175);
					((TypeParamErrorContext)_localctx).tok = match(Newtype);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(178);
				match(DOWN);
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Annotation) {
					{
					{
					setState(179);
					annotation();
					}
					}
					setState(184);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(185);
				match(ERROR);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeExpr) {
					{
					setState(186);
					typeExpr_();
					}
				}

				setState(192);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JsonStr) | (1L << JsonBool) | (1L << JsonNull) | (1L << JsonInt) | (1L << JsonFloat) | (1L << JsonArray) | (1L << JsonObj))) != 0)) {
					{
					{
					setState(189);
					jsonVal();
					}
					}
					setState(194);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(196);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(195);
					match(UP);
					}
					break;
				}
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

	public static class NameBodyContext extends ParserRuleContext {
		public NameBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nameBody; }
	 
		public NameBodyContext() { }
		public void copyFrom(NameBodyContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class FieldContext extends NameBodyContext {
		public Token tok;
		public TerminalNode Field() { return getToken(AdlW1.Field, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TypeExpr_Context typeExpr_() {
			return getRuleContext(TypeExpr_Context.class,0);
		}
		public JsonValContext jsonVal() {
			return getRuleContext(JsonValContext.class,0);
		}
		public FieldContext(NameBodyContext ctx) { copyFrom(ctx); }
	}

	public final NameBodyContext nameBody() throws RecognitionException {
		NameBodyContext _localctx = new NameBodyContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_nameBody);
		int _la;
		try {
			_localctx = new FieldContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(200);
			((FieldContext)_localctx).tok = match(Field);
			setState(215);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOWN) {
				{
				setState(201);
				match(DOWN);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==Annotation) {
					{
					{
					setState(202);
					annotation();
					}
					}
					setState(207);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TypeExpr) {
					{
					setState(208);
					typeExpr_();
					}
				}

				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JsonStr) | (1L << JsonBool) | (1L << JsonNull) | (1L << JsonInt) | (1L << JsonFloat) | (1L << JsonArray) | (1L << JsonObj))) != 0)) {
					{
					setState(211);
					jsonVal();
					}
				}

				setState(214);
				match(UP);
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

	public static class AnnotationContext extends ParserRuleContext {
		public Token tok;
		public TerminalNode Annotation() { return getToken(AdlW1.Annotation, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public JsonValContext jsonVal() {
			return getRuleContext(JsonValContext.class,0);
		}
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217);
			((AnnotationContext)_localctx).tok = match(Annotation);
			setState(222);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOWN) {
				{
				setState(218);
				match(DOWN);
				setState(219);
				jsonVal();
				setState(220);
				match(UP);
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

	public static class TypeExpr_Context extends ParserRuleContext {
		public Token tok;
		public TerminalNode TypeExpr() { return getToken(AdlW1.TypeExpr, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public List<TypeExprElem_Context> typeExprElem_() {
			return getRuleContexts(TypeExprElem_Context.class);
		}
		public TypeExprElem_Context typeExprElem_(int i) {
			return getRuleContext(TypeExprElem_Context.class,i);
		}
		public TypeExpr_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExpr_; }
	}

	public final TypeExpr_Context typeExpr_() throws RecognitionException {
		TypeExpr_Context _localctx = new TypeExpr_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_typeExpr_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
			((TypeExpr_Context)_localctx).tok = match(TypeExpr);
			setState(233);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOWN) {
				{
				setState(225);
				match(DOWN);
				setState(227); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(226);
					typeExprElem_();
					}
					}
					setState(229); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TypeExprElem );
				setState(231);
				match(UP);
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

	public static class TypeExprElem_Context extends ParserRuleContext {
		public TypeExprElem_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeExprElem_; }
	 
		public TypeExprElem_Context() { }
		public void copyFrom(TypeExprElem_Context ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TypeParamsContext extends TypeExprElem_Context {
		public Token tok;
		public TerminalNode TypeExprElem() { return getToken(AdlW1.TypeExprElem, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public List<TypeExprElem_Context> typeExprElem_() {
			return getRuleContexts(TypeExprElem_Context.class);
		}
		public TypeExprElem_Context typeExprElem_(int i) {
			return getRuleContext(TypeExprElem_Context.class,i);
		}
		public TypeParamsContext(TypeExprElem_Context ctx) { copyFrom(ctx); }
	}

	public final TypeExprElem_Context typeExprElem_() throws RecognitionException {
		TypeExprElem_Context _localctx = new TypeExprElem_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_typeExprElem_);
		int _la;
		try {
			_localctx = new TypeParamsContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(235);
			((TypeParamsContext)_localctx).tok = match(TypeExprElem);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOWN) {
				{
				setState(236);
				match(DOWN);
				setState(238); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(237);
					typeExprElem_();
					}
					}
					setState(240); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==TypeExprElem );
				setState(242);
				match(UP);
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

	public static class JsonValContext extends ParserRuleContext {
		public JsonValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonVal; }
	 
		public JsonValContext() { }
		public void copyFrom(JsonValContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class JsonStrContext extends JsonValContext {
		public Token tok;
		public TerminalNode JsonStr() { return getToken(AdlW1.JsonStr, 0); }
		public JsonStrContext(JsonValContext ctx) { copyFrom(ctx); }
	}
	public static class JsonArrayContext extends JsonValContext {
		public Token tok;
		public TerminalNode JsonArray() { return getToken(AdlW1.JsonArray, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public List<JsonValContext> jsonVal() {
			return getRuleContexts(JsonValContext.class);
		}
		public JsonValContext jsonVal(int i) {
			return getRuleContext(JsonValContext.class,i);
		}
		public JsonArrayContext(JsonValContext ctx) { copyFrom(ctx); }
	}
	public static class JsonFloatContext extends JsonValContext {
		public Token tok;
		public TerminalNode JsonFloat() { return getToken(AdlW1.JsonFloat, 0); }
		public JsonFloatContext(JsonValContext ctx) { copyFrom(ctx); }
	}
	public static class JsonObjContext extends JsonValContext {
		public Token tok;
		public TerminalNode JsonObj() { return getToken(AdlW1.JsonObj, 0); }
		public TerminalNode DOWN() { return getToken(AdlW1.DOWN, 0); }
		public TerminalNode UP() { return getToken(AdlW1.UP, 0); }
		public List<JsonValContext> jsonVal() {
			return getRuleContexts(JsonValContext.class);
		}
		public JsonValContext jsonVal(int i) {
			return getRuleContext(JsonValContext.class,i);
		}
		public JsonObjContext(JsonValContext ctx) { copyFrom(ctx); }
	}
	public static class JsonBoolContext extends JsonValContext {
		public Token tok;
		public TerminalNode JsonBool() { return getToken(AdlW1.JsonBool, 0); }
		public JsonBoolContext(JsonValContext ctx) { copyFrom(ctx); }
	}
	public static class JsonIntContext extends JsonValContext {
		public Token tok;
		public TerminalNode JsonInt() { return getToken(AdlW1.JsonInt, 0); }
		public JsonIntContext(JsonValContext ctx) { copyFrom(ctx); }
	}
	public static class JsonNullContext extends JsonValContext {
		public Token tok;
		public TerminalNode JsonNull() { return getToken(AdlW1.JsonNull, 0); }
		public JsonNullContext(JsonValContext ctx) { copyFrom(ctx); }
	}

	public final JsonValContext jsonVal() throws RecognitionException {
		JsonValContext _localctx = new JsonValContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_jsonVal);
		int _la;
		try {
			setState(273);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JsonStr:
				_localctx = new JsonStrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(246);
				((JsonStrContext)_localctx).tok = match(JsonStr);
				}
				break;
			case JsonBool:
				_localctx = new JsonBoolContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(247);
				((JsonBoolContext)_localctx).tok = match(JsonBool);
				}
				break;
			case JsonNull:
				_localctx = new JsonNullContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(248);
				((JsonNullContext)_localctx).tok = match(JsonNull);
				}
				break;
			case JsonInt:
				_localctx = new JsonIntContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(249);
				((JsonIntContext)_localctx).tok = match(JsonInt);
				}
				break;
			case JsonFloat:
				_localctx = new JsonFloatContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(250);
				((JsonFloatContext)_localctx).tok = match(JsonFloat);
				}
				break;
			case JsonArray:
				_localctx = new JsonArrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(251);
				((JsonArrayContext)_localctx).tok = match(JsonArray);
				setState(260);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOWN) {
					{
					setState(252);
					match(DOWN);
					setState(254); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(253);
						jsonVal();
						}
						}
						setState(256); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JsonStr) | (1L << JsonBool) | (1L << JsonNull) | (1L << JsonInt) | (1L << JsonFloat) | (1L << JsonArray) | (1L << JsonObj))) != 0) );
					setState(258);
					match(UP);
					}
				}

				}
				break;
			case JsonObj:
				_localctx = new JsonObjContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(262);
				((JsonObjContext)_localctx).tok = match(JsonObj);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==DOWN) {
					{
					setState(263);
					match(DOWN);
					setState(265); 
					_errHandler.sync(this);
					_la = _input.LA(1);
					do {
						{
						{
						setState(264);
						jsonVal();
						}
						}
						setState(267); 
						_errHandler.sync(this);
						_la = _input.LA(1);
					} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << JsonStr) | (1L << JsonBool) | (1L << JsonNull) | (1L << JsonInt) | (1L << JsonFloat) | (1L << JsonArray) | (1L << JsonObj))) != 0) );
					setState(269);
					match(UP);
					}
				}

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\67\u0116\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\7\4%\n\4\f"+
		"\4\16\4(\13\4\3\4\7\4+\n\4\f\4\16\4.\13\4\3\4\7\4\61\n\4\f\4\16\4\64\13"+
		"\4\3\4\5\4\67\n\4\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\5\5\5B\n\5\3\5"+
		"\7\5E\n\5\f\5\16\5H\13\5\3\5\5\5K\n\5\3\5\3\5\3\5\7\5P\n\5\f\5\16\5S\13"+
		"\5\3\5\5\5V\n\5\3\5\7\5Y\n\5\f\5\16\5\\\13\5\3\5\5\5_\n\5\3\5\3\5\3\5"+
		"\7\5d\n\5\f\5\16\5g\13\5\3\5\5\5j\n\5\3\5\5\5m\n\5\3\5\7\5p\n\5\f\5\16"+
		"\5s\13\5\3\5\5\5v\n\5\3\5\3\5\3\5\7\5{\n\5\f\5\16\5~\13\5\3\5\5\5\u0081"+
		"\n\5\3\5\5\5\u0084\n\5\3\5\7\5\u0087\n\5\f\5\16\5\u008a\13\5\3\5\5\5\u008d"+
		"\n\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3"+
		"\5\5\5\u00a0\n\5\3\5\3\5\7\5\u00a4\n\5\f\5\16\5\u00a7\13\5\3\5\3\5\7\5"+
		"\u00ab\n\5\f\5\16\5\u00ae\13\5\3\5\3\5\3\5\5\5\u00b3\n\5\3\5\3\5\7\5\u00b7"+
		"\n\5\f\5\16\5\u00ba\13\5\3\5\3\5\5\5\u00be\n\5\3\5\7\5\u00c1\n\5\f\5\16"+
		"\5\u00c4\13\5\3\5\5\5\u00c7\n\5\5\5\u00c9\n\5\3\6\3\6\3\6\7\6\u00ce\n"+
		"\6\f\6\16\6\u00d1\13\6\3\6\5\6\u00d4\n\6\3\6\5\6\u00d7\n\6\3\6\5\6\u00da"+
		"\n\6\3\7\3\7\3\7\3\7\3\7\5\7\u00e1\n\7\3\b\3\b\3\b\6\b\u00e6\n\b\r\b\16"+
		"\b\u00e7\3\b\3\b\5\b\u00ec\n\b\3\t\3\t\3\t\6\t\u00f1\n\t\r\t\16\t\u00f2"+
		"\3\t\3\t\5\t\u00f7\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\6\n\u0101\n\n\r"+
		"\n\16\n\u0102\3\n\3\n\5\n\u0107\n\n\3\n\3\n\3\n\6\n\u010c\n\n\r\n\16\n"+
		"\u010d\3\n\3\n\5\n\u0112\n\n\5\n\u0114\n\n\3\n\2\2\13\2\4\6\b\n\f\16\20"+
		"\22\2\2\2\u0145\2\24\3\2\2\2\4\34\3\2\2\2\6!\3\2\2\2\b\u00c8\3\2\2\2\n"+
		"\u00ca\3\2\2\2\f\u00db\3\2\2\2\16\u00e2\3\2\2\2\20\u00ed\3\2\2\2\22\u0113"+
		"\3\2\2\2\24\25\7\32\2\2\25\26\7\36\2\2\26\27\7\32\2\2\27\30\5\6\4\2\30"+
		"\31\7\33\2\2\31\32\7\33\2\2\32\33\7\2\2\3\33\3\3\2\2\2\34\35\7\32\2\2"+
		"\35\36\5\22\n\2\36\37\7\33\2\2\37 \7\2\2\3 \5\3\2\2\2!\66\7\37\2\2\"&"+
		"\7\32\2\2#%\5\f\7\2$#\3\2\2\2%(\3\2\2\2&$\3\2\2\2&\'\3\2\2\2\',\3\2\2"+
		"\2(&\3\2\2\2)+\7 \2\2*)\3\2\2\2+.\3\2\2\2,*\3\2\2\2,-\3\2\2\2-\62\3\2"+
		"\2\2.,\3\2\2\2/\61\5\b\5\2\60/\3\2\2\2\61\64\3\2\2\2\62\60\3\2\2\2\62"+
		"\63\3\2\2\2\63\65\3\2\2\2\64\62\3\2\2\2\65\67\7\33\2\2\66\"\3\2\2\2\66"+
		"\67\3\2\2\2\67\7\3\2\2\28J\7\"\2\29=\7\32\2\2:<\5\f\7\2;:\3\2\2\2<?\3"+
		"\2\2\2=;\3\2\2\2=>\3\2\2\2>A\3\2\2\2?=\3\2\2\2@B\7&\2\2A@\3\2\2\2AB\3"+
		"\2\2\2BF\3\2\2\2CE\5\n\6\2DC\3\2\2\2EH\3\2\2\2FD\3\2\2\2FG\3\2\2\2GI\3"+
		"\2\2\2HF\3\2\2\2IK\7\33\2\2J9\3\2\2\2JK\3\2\2\2K\u00c9\3\2\2\2L^\7#\2"+
		"\2MQ\7\32\2\2NP\5\f\7\2ON\3\2\2\2PS\3\2\2\2QO\3\2\2\2QR\3\2\2\2RU\3\2"+
		"\2\2SQ\3\2\2\2TV\7&\2\2UT\3\2\2\2UV\3\2\2\2VZ\3\2\2\2WY\5\n\6\2XW\3\2"+
		"\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3\2\2\2]_\7\33\2\2^M"+
		"\3\2\2\2^_\3\2\2\2_\u00c9\3\2\2\2`u\7%\2\2ae\7\32\2\2bd\5\f\7\2cb\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fi\3\2\2\2ge\3\2\2\2hj\7&\2\2ih\3\2"+
		"\2\2ij\3\2\2\2jl\3\2\2\2km\5\16\b\2lk\3\2\2\2lm\3\2\2\2mq\3\2\2\2np\5"+
		"\22\n\2on\3\2\2\2ps\3\2\2\2qo\3\2\2\2qr\3\2\2\2rt\3\2\2\2sq\3\2\2\2tv"+
		"\7\33\2\2ua\3\2\2\2uv\3\2\2\2v\u00c9\3\2\2\2w\u008c\7$\2\2x|\7\32\2\2"+
		"y{\5\f\7\2zy\3\2\2\2{~\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\u0080\3\2\2\2~|\3"+
		"\2\2\2\177\u0081\7&\2\2\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0083"+
		"\3\2\2\2\u0082\u0084\5\16\b\2\u0083\u0082\3\2\2\2\u0083\u0084\3\2\2\2"+
		"\u0084\u0088\3\2\2\2\u0085\u0087\5\22\n\2\u0086\u0085\3\2\2\2\u0087\u008a"+
		"\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\3\2\2\2\u008a"+
		"\u0088\3\2\2\2\u008b\u008d\7\33\2\2\u008cx\3\2\2\2\u008c\u008d\3\2\2\2"+
		"\u008d\u00c9\3\2\2\2\u008e\u008f\7\62\2\2\u008f\u0090\7\32\2\2\u0090\u0091"+
		"\5\22\n\2\u0091\u0092\7\33\2\2\u0092\u00c9\3\2\2\2\u0093\u0094\7\63\2"+
		"\2\u0094\u0095\7\32\2\2\u0095\u0096\5\22\n\2\u0096\u0097\7\33\2\2\u0097"+
		"\u00c9\3\2\2\2\u0098\u0099\7\64\2\2\u0099\u009a\7\32\2\2\u009a\u009b\5"+
		"\22\n\2\u009b\u009c\7\33\2\2\u009c\u00c9\3\2\2\2\u009d\u00a0\7\"\2\2\u009e"+
		"\u00a0\7#\2\2\u009f\u009d\3\2\2\2\u009f\u009e\3\2\2\2\u00a0\u00a1\3\2"+
		"\2\2\u00a1\u00a5\7\32\2\2\u00a2\u00a4\5\f\7\2\u00a3\u00a2\3\2\2\2\u00a4"+
		"\u00a7\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2"+
		"\2\2\u00a7\u00a5\3\2\2\2\u00a8\u00ac\7\35\2\2\u00a9\u00ab\5\n\6\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00af\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00c9\7\33\2\2\u00b0"+
		"\u00b3\7%\2\2\u00b1\u00b3\7$\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b1\3\2\2"+
		"\2\u00b3\u00b4\3\2\2\2\u00b4\u00b8\7\32\2\2\u00b5\u00b7\5\f\7\2\u00b6"+
		"\u00b5\3\2\2\2\u00b7\u00ba\3\2\2\2\u00b8\u00b6\3\2\2\2\u00b8\u00b9\3\2"+
		"\2\2\u00b9\u00bb\3\2\2\2\u00ba\u00b8\3\2\2\2\u00bb\u00bd\7\35\2\2\u00bc"+
		"\u00be\5\16\b\2\u00bd\u00bc\3\2\2\2\u00bd\u00be\3\2\2\2\u00be\u00c2\3"+
		"\2\2\2\u00bf\u00c1\5\22\n\2\u00c0\u00bf\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c0\3\2\2\2\u00c2\u00c3\3\2\2\2\u00c3\u00c6\3\2\2\2\u00c4\u00c2\3\2"+
		"\2\2\u00c5\u00c7\7\33\2\2\u00c6\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7"+
		"\u00c9\3\2\2\2\u00c88\3\2\2\2\u00c8L\3\2\2\2\u00c8`\3\2\2\2\u00c8w\3\2"+
		"\2\2\u00c8\u008e\3\2\2\2\u00c8\u0093\3\2\2\2\u00c8\u0098\3\2\2\2\u00c8"+
		"\u009f\3\2\2\2\u00c8\u00b2\3\2\2\2\u00c9\t\3\2\2\2\u00ca\u00d9\7)\2\2"+
		"\u00cb\u00cf\7\32\2\2\u00cc\u00ce\5\f\7\2\u00cd\u00cc\3\2\2\2\u00ce\u00d1"+
		"\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d3\3\2\2\2\u00d1"+
		"\u00cf\3\2\2\2\u00d2\u00d4\5\16\b\2\u00d3\u00d2\3\2\2\2\u00d3\u00d4\3"+
		"\2\2\2\u00d4\u00d6\3\2\2\2\u00d5\u00d7\5\22\n\2\u00d6\u00d5\3\2\2\2\u00d6"+
		"\u00d7\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8\u00da\7\33\2\2\u00d9\u00cb\3"+
		"\2\2\2\u00d9\u00da\3\2\2\2\u00da\13\3\2\2\2\u00db\u00e0\7!\2\2\u00dc\u00dd"+
		"\7\32\2\2\u00dd\u00de\5\22\n\2\u00de\u00df\7\33\2\2\u00df\u00e1\3\2\2"+
		"\2\u00e0\u00dc\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\r\3\2\2\2\u00e2\u00eb"+
		"\7\'\2\2\u00e3\u00e5\7\32\2\2\u00e4\u00e6\5\20\t\2\u00e5\u00e4\3\2\2\2"+
		"\u00e6\u00e7\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00e9"+
		"\3\2\2\2\u00e9\u00ea\7\33\2\2\u00ea\u00ec\3\2\2\2\u00eb\u00e3\3\2\2\2"+
		"\u00eb\u00ec\3\2\2\2\u00ec\17\3\2\2\2\u00ed\u00f6\7(\2\2\u00ee\u00f0\7"+
		"\32\2\2\u00ef\u00f1\5\20\t\2\u00f0\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u00f0\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f5\7\33"+
		"\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7"+
		"\21\3\2\2\2\u00f8\u0114\7+\2\2\u00f9\u0114\7,\2\2\u00fa\u0114\7-\2\2\u00fb"+
		"\u0114\7.\2\2\u00fc\u0114\7/\2\2\u00fd\u0106\7\60\2\2\u00fe\u0100\7\32"+
		"\2\2\u00ff\u0101\5\22\n\2\u0100\u00ff\3\2\2\2\u0101\u0102\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\7\33"+
		"\2\2\u0105\u0107\3\2\2\2\u0106\u00fe\3\2\2\2\u0106\u0107\3\2\2\2\u0107"+
		"\u0114\3\2\2\2\u0108\u0111\7\61\2\2\u0109\u010b\7\32\2\2\u010a\u010c\5"+
		"\22\n\2\u010b\u010a\3\2\2\2\u010c\u010d\3\2\2\2\u010d\u010b\3\2\2\2\u010d"+
		"\u010e\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0110\7\33\2\2\u0110\u0112\3"+
		"\2\2\2\u0111\u0109\3\2\2\2\u0111\u0112\3\2\2\2\u0112\u0114\3\2\2\2\u0113"+
		"\u00f8\3\2\2\2\u0113\u00f9\3\2\2\2\u0113\u00fa\3\2\2\2\u0113\u00fb\3\2"+
		"\2\2\u0113\u00fc\3\2\2\2\u0113\u00fd\3\2\2\2\u0113\u0108\3\2\2\2\u0114"+
		"\23\3\2\2\2/&,\62\66=AFJQUZ^eilqu|\u0080\u0083\u0088\u008c\u009f\u00a5"+
		"\u00ac\u00b2\u00b8\u00bd\u00c2\u00c6\u00c8\u00cf\u00d3\u00d6\u00d9\u00e0"+
		"\u00e7\u00eb\u00f2\u00f6\u0102\u0106\u010d\u0111\u0113";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}