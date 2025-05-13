package com.example;
// Generated from Roman.g4 by ANTLR 4.13.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class RomanParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, WS=8;
	public static final int
		RULE_root = 0, RULE_units = 1, RULE_tens = 2, RULE_hundreds = 3, RULE_one = 4, 
		RULE_five = 5, RULE_ten = 6, RULE_fifty = 7, RULE_oneHundred = 8, RULE_fiveHundred = 9, 
		RULE_oneThousand = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"root", "units", "tens", "hundreds", "one", "five", "ten", "fifty", "oneHundred", 
			"fiveHundred", "oneThousand"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'I'", "'V'", "'X'", "'L'", "'C'", "'D'", "'M'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "WS"
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
	public String getGrammarFileName() { return "Roman.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public RomanParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RootContext extends ParserRuleContext {
		public List<OneThousandContext> oneThousand() {
			return getRuleContexts(OneThousandContext.class);
		}
		public OneThousandContext oneThousand(int i) {
			return getRuleContext(OneThousandContext.class,i);
		}
		public HundredsContext hundreds() {
			return getRuleContext(HundredsContext.class,0);
		}
		public TensContext tens() {
			return getRuleContext(TensContext.class,0);
		}
		public UnitsContext units() {
			return getRuleContext(UnitsContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitRoot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitRoot(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__6) {
				{
				{
				setState(22);
				oneThousand();
				}
				}
				setState(27);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__4 || _la==T__5) {
				{
				setState(28);
				hundreds();
				}
			}

			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2 || _la==T__3) {
				{
				setState(31);
				tens();
				}
			}

			setState(35);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__0 || _la==T__1) {
				{
				setState(34);
				units();
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

	@SuppressWarnings("CheckReturnValue")
	public static class UnitsContext extends ParserRuleContext {
		public List<OneContext> one() {
			return getRuleContexts(OneContext.class);
		}
		public OneContext one(int i) {
			return getRuleContext(OneContext.class,i);
		}
		public FiveContext five() {
			return getRuleContext(FiveContext.class,0);
		}
		public TenContext ten() {
			return getRuleContext(TenContext.class,0);
		}
		public UnitsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_units; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterUnits(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitUnits(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitUnits(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitsContext units() throws RecognitionException {
		UnitsContext _localctx = new UnitsContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_units);
		int _la;
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(37);
				one();
				setState(46);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOF:
				case T__0:
					{
					setState(41);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__0) {
						{
						{
						setState(38);
						one();
						}
						}
						setState(43);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__1:
					{
					setState(44);
					five();
					}
					break;
				case T__2:
					{
					setState(45);
					ten();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__1:
				enterOuterAlt(_localctx, 2);
				{
				setState(48);
				five();
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__0) {
					{
					{
					setState(49);
					one();
					}
					}
					setState(54);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TensContext extends ParserRuleContext {
		public List<TenContext> ten() {
			return getRuleContexts(TenContext.class);
		}
		public TenContext ten(int i) {
			return getRuleContext(TenContext.class,i);
		}
		public FiftyContext fifty() {
			return getRuleContext(FiftyContext.class,0);
		}
		public OneHundredContext oneHundred() {
			return getRuleContext(OneHundredContext.class,0);
		}
		public TensContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tens; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterTens(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitTens(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitTens(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TensContext tens() throws RecognitionException {
		TensContext _localctx = new TensContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_tens);
		int _la;
		try {
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				ten();
				setState(66);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOF:
				case T__0:
				case T__1:
				case T__2:
					{
					setState(61);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(58);
						ten();
						}
						}
						setState(63);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__3:
					{
					setState(64);
					fifty();
					}
					break;
				case T__4:
					{
					setState(65);
					oneHundred();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(68);
				fifty();
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(69);
					ten();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class HundredsContext extends ParserRuleContext {
		public List<OneHundredContext> oneHundred() {
			return getRuleContexts(OneHundredContext.class);
		}
		public OneHundredContext oneHundred(int i) {
			return getRuleContext(OneHundredContext.class,i);
		}
		public FiveHundredContext fiveHundred() {
			return getRuleContext(FiveHundredContext.class,0);
		}
		public OneThousandContext oneThousand() {
			return getRuleContext(OneThousandContext.class,0);
		}
		public HundredsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hundreds; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterHundreds(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitHundreds(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitHundreds(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HundredsContext hundreds() throws RecognitionException {
		HundredsContext _localctx = new HundredsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_hundreds);
		int _la;
		try {
			setState(95);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
				enterOuterAlt(_localctx, 1);
				{
				setState(77);
				oneHundred();
				setState(86);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case EOF:
				case T__0:
				case T__1:
				case T__2:
				case T__3:
				case T__4:
					{
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__4) {
						{
						{
						setState(78);
						oneHundred();
						}
						}
						setState(83);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case T__5:
					{
					setState(84);
					fiveHundred();
					}
					break;
				case T__6:
					{
					setState(85);
					oneThousand();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				fiveHundred();
				setState(92);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(89);
					oneHundred();
					}
					}
					setState(94);
					_errHandler.sync(this);
					_la = _input.LA(1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OneContext extends ParserRuleContext {
		public OneContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_one; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterOne(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitOne(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitOne(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneContext one() throws RecognitionException {
		OneContext _localctx = new OneContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_one);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(T__0);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FiveContext extends ParserRuleContext {
		public FiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_five; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterFive(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitFive(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitFive(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiveContext five() throws RecognitionException {
		FiveContext _localctx = new FiveContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_five);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(99);
			match(T__1);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TenContext extends ParserRuleContext {
		public TenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ten; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterTen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitTen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitTen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TenContext ten() throws RecognitionException {
		TenContext _localctx = new TenContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ten);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			match(T__2);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FiftyContext extends ParserRuleContext {
		public FiftyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fifty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterFifty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitFifty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitFifty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiftyContext fifty() throws RecognitionException {
		FiftyContext _localctx = new FiftyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_fifty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(T__3);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OneHundredContext extends ParserRuleContext {
		public OneHundredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneHundred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterOneHundred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitOneHundred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitOneHundred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneHundredContext oneHundred() throws RecognitionException {
		OneHundredContext _localctx = new OneHundredContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_oneHundred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(T__4);
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

	@SuppressWarnings("CheckReturnValue")
	public static class FiveHundredContext extends ParserRuleContext {
		public FiveHundredContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fiveHundred; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterFiveHundred(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitFiveHundred(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitFiveHundred(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FiveHundredContext fiveHundred() throws RecognitionException {
		FiveHundredContext _localctx = new FiveHundredContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_fiveHundred);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(T__5);
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

	@SuppressWarnings("CheckReturnValue")
	public static class OneThousandContext extends ParserRuleContext {
		public OneThousandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oneThousand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).enterOneThousand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof RomanListener ) ((RomanListener)listener).exitOneThousand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof RomanVisitor ) return ((RomanVisitor<? extends T>)visitor).visitOneThousand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OneThousandContext oneThousand() throws RecognitionException {
		OneThousandContext _localctx = new OneThousandContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_oneThousand);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(T__6);
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
		"\u0004\u0001\bp\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0005\u0000\u0018"+
		"\b\u0000\n\u0000\f\u0000\u001b\t\u0000\u0001\u0000\u0003\u0000\u001e\b"+
		"\u0000\u0001\u0000\u0003\u0000!\b\u0000\u0001\u0000\u0003\u0000$\b\u0000"+
		"\u0001\u0001\u0001\u0001\u0005\u0001(\b\u0001\n\u0001\f\u0001+\t\u0001"+
		"\u0001\u0001\u0001\u0001\u0003\u0001/\b\u0001\u0001\u0001\u0001\u0001"+
		"\u0005\u00013\b\u0001\n\u0001\f\u00016\t\u0001\u0003\u00018\b\u0001\u0001"+
		"\u0002\u0001\u0002\u0005\u0002<\b\u0002\n\u0002\f\u0002?\t\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002C\b\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002G\b\u0002\n\u0002\f\u0002J\t\u0002\u0003\u0002L\b\u0002\u0001\u0003"+
		"\u0001\u0003\u0005\u0003P\b\u0003\n\u0003\f\u0003S\t\u0003\u0001\u0003"+
		"\u0001\u0003\u0003\u0003W\b\u0003\u0001\u0003\u0001\u0003\u0005\u0003"+
		"[\b\u0003\n\u0003\f\u0003^\t\u0003\u0003\u0003`\b\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0000\u0000"+
		"\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0000\u0000"+
		"w\u0000\u0019\u0001\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004"+
		"K\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\ba\u0001\u0000"+
		"\u0000\u0000\nc\u0001\u0000\u0000\u0000\fe\u0001\u0000\u0000\u0000\u000e"+
		"g\u0001\u0000\u0000\u0000\u0010i\u0001\u0000\u0000\u0000\u0012k\u0001"+
		"\u0000\u0000\u0000\u0014m\u0001\u0000\u0000\u0000\u0016\u0018\u0003\u0014"+
		"\n\u0000\u0017\u0016\u0001\u0000\u0000\u0000\u0018\u001b\u0001\u0000\u0000"+
		"\u0000\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000"+
		"\u0000\u001a\u001d\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000"+
		"\u0000\u001c\u001e\u0003\u0006\u0003\u0000\u001d\u001c\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e \u0001\u0000\u0000\u0000"+
		"\u001f!\u0003\u0004\u0002\u0000 \u001f\u0001\u0000\u0000\u0000 !\u0001"+
		"\u0000\u0000\u0000!#\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001\u0000"+
		"#\"\u0001\u0000\u0000\u0000#$\u0001\u0000\u0000\u0000$\u0001\u0001\u0000"+
		"\u0000\u0000%.\u0003\b\u0004\u0000&(\u0003\b\u0004\u0000\'&\u0001\u0000"+
		"\u0000\u0000(+\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000)*\u0001"+
		"\u0000\u0000\u0000*/\u0001\u0000\u0000\u0000+)\u0001\u0000\u0000\u0000"+
		",/\u0003\n\u0005\u0000-/\u0003\f\u0006\u0000.)\u0001\u0000\u0000\u0000"+
		".,\u0001\u0000\u0000\u0000.-\u0001\u0000\u0000\u0000/8\u0001\u0000\u0000"+
		"\u000004\u0003\n\u0005\u000013\u0003\b\u0004\u000021\u0001\u0000\u0000"+
		"\u000036\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001\u0000"+
		"\u0000\u000058\u0001\u0000\u0000\u000064\u0001\u0000\u0000\u00007%\u0001"+
		"\u0000\u0000\u000070\u0001\u0000\u0000\u00008\u0003\u0001\u0000\u0000"+
		"\u00009B\u0003\f\u0006\u0000:<\u0003\f\u0006\u0000;:\u0001\u0000\u0000"+
		"\u0000<?\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000\u0000=>\u0001\u0000"+
		"\u0000\u0000>C\u0001\u0000\u0000\u0000?=\u0001\u0000\u0000\u0000@C\u0003"+
		"\u000e\u0007\u0000AC\u0003\u0010\b\u0000B=\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BA\u0001\u0000\u0000\u0000CL\u0001\u0000\u0000\u0000"+
		"DH\u0003\u000e\u0007\u0000EG\u0003\f\u0006\u0000FE\u0001\u0000\u0000\u0000"+
		"GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IL\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000K9\u0001\u0000"+
		"\u0000\u0000KD\u0001\u0000\u0000\u0000L\u0005\u0001\u0000\u0000\u0000"+
		"MV\u0003\u0010\b\u0000NP\u0003\u0010\b\u0000ON\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RW\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TW\u0003\u0012"+
		"\t\u0000UW\u0003\u0014\n\u0000VQ\u0001\u0000\u0000\u0000VT\u0001\u0000"+
		"\u0000\u0000VU\u0001\u0000\u0000\u0000W`\u0001\u0000\u0000\u0000X\\\u0003"+
		"\u0012\t\u0000Y[\u0003\u0010\b\u0000ZY\u0001\u0000\u0000\u0000[^\u0001"+
		"\u0000\u0000\u0000\\Z\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]`\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000_M\u0001\u0000\u0000"+
		"\u0000_X\u0001\u0000\u0000\u0000`\u0007\u0001\u0000\u0000\u0000ab\u0005"+
		"\u0001\u0000\u0000b\t\u0001\u0000\u0000\u0000cd\u0005\u0002\u0000\u0000"+
		"d\u000b\u0001\u0000\u0000\u0000ef\u0005\u0003\u0000\u0000f\r\u0001\u0000"+
		"\u0000\u0000gh\u0005\u0004\u0000\u0000h\u000f\u0001\u0000\u0000\u0000"+
		"ij\u0005\u0005\u0000\u0000j\u0011\u0001\u0000\u0000\u0000kl\u0005\u0006"+
		"\u0000\u0000l\u0013\u0001\u0000\u0000\u0000mn\u0005\u0007\u0000\u0000"+
		"n\u0015\u0001\u0000\u0000\u0000\u0010\u0019\u001d #).47=BHKQV\\_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}