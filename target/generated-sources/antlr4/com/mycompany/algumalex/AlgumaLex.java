// Generated from com\mycompany\algumalex\AlgumaLex.g4 by ANTLR 4.7.2
package com.mycompany.algumalex;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AlgumaLex extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PALAVRA_CHAVE=1, NUMINT=2, NUMREAL=3, VAR=4, CADEIA=5, COMENTARIO=6, WS=7, 
		OP_REL=8, OP_ARIT=9, DELIM=10, OPPAR=11, CLPAR=12, SEMICOMMA=13;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"PALAVRA_CHAVE", "NUMINT", "NUMREAL", "VAR", "CADEIA", "ESC_SEQ", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "OPPAR", "CLPAR", "SEMICOMMA"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, "'('", 
			"')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PALAVRA_CHAVE", "NUMINT", "NUMREAL", "VAR", "CADEIA", "COMENTARIO", 
			"WS", "OP_REL", "OP_ARIT", "DELIM", "OPPAR", "CLPAR", "SEMICOMMA"
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


	public AlgumaLex(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "AlgumaLex.g4"; }

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

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 6:
			COMENTARIO_action((RuleContext)_localctx, actionIndex);
			break;
		case 7:
			WS_action((RuleContext)_localctx, actionIndex);
			break;
		}
	}
	private void COMENTARIO_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0:
			skip();
			break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1:
			skip();
			break;
		}
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\17\u00a0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2E\n\2\3\3\5\3"+
		"H\n\3\3\3\6\3K\n\3\r\3\16\3L\3\4\5\4P\n\4\3\4\6\4S\n\4\r\4\16\4T\3\4\3"+
		"\4\6\4Y\n\4\r\4\16\4Z\5\4]\n\4\3\5\3\5\7\5a\n\5\f\5\16\5d\13\5\3\6\3\6"+
		"\3\6\7\6i\n\6\f\6\16\6l\13\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\7\bu\n\b\f\b"+
		"\16\bx\13\b\3\b\5\b{\n\b\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\5\n\u008c\n\n\3\13\3\13\3\13\3\13\3\13\5\13\u0093\n\13"+
		"\3\f\3\f\3\f\3\f\5\f\u0099\n\f\3\r\3\r\3\16\3\16\3\17\3\17\2\2\20\3\3"+
		"\5\4\7\5\t\6\13\7\r\2\17\b\21\t\23\n\25\13\27\f\31\r\33\16\35\17\3\2\n"+
		"\4\2--//\4\2C\\c|\5\2\62;C\\c|\4\2))^^\4\2\f\f\17\17\5\2\13\f\17\17\""+
		"\"\5\2,-//\61\61\6\2$$..==AA\2\u00b9\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2"+
		"\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25"+
		"\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3D\3\2\2"+
		"\2\5G\3\2\2\2\7O\3\2\2\2\t^\3\2\2\2\13e\3\2\2\2\ro\3\2\2\2\17r\3\2\2\2"+
		"\21\177\3\2\2\2\23\u008b\3\2\2\2\25\u0092\3\2\2\2\27\u0098\3\2\2\2\31"+
		"\u009a\3\2\2\2\33\u009c\3\2\2\2\35\u009e\3\2\2\2\37 \7k\2\2 !\7p\2\2!"+
		"E\7k\2\2\"#\7h\2\2#E\7p\2\2$%\7k\2\2%&\7p\2\2&E\7v\2\2\'(\7h\2\2()\7n"+
		"\2\2)*\7q\2\2*+\7c\2\2+E\7v\2\2,-\7e\2\2-.\7j\2\2./\7c\2\2/E\7t\2\2\60"+
		"\61\7u\2\2\61\62\7v\2\2\62\63\7t\2\2\63\64\7k\2\2\64\65\7p\2\2\65E\7i"+
		"\2\2\66\67\7d\2\2\678\7q\2\289\7q\2\29:\7n\2\2:;\7g\2\2;<\7c\2\2<E\7p"+
		"\2\2=>\7y\2\2>?\7j\2\2?@\7k\2\2@A\7n\2\2AE\7g\2\2BC\7k\2\2CE\7h\2\2D\37"+
		"\3\2\2\2D\"\3\2\2\2D$\3\2\2\2D\'\3\2\2\2D,\3\2\2\2D\60\3\2\2\2D\66\3\2"+
		"\2\2D=\3\2\2\2DB\3\2\2\2E\4\3\2\2\2FH\t\2\2\2GF\3\2\2\2GH\3\2\2\2HJ\3"+
		"\2\2\2IK\4\62;\2JI\3\2\2\2KL\3\2\2\2LJ\3\2\2\2LM\3\2\2\2M\6\3\2\2\2NP"+
		"\t\2\2\2ON\3\2\2\2OP\3\2\2\2PR\3\2\2\2QS\4\62;\2RQ\3\2\2\2ST\3\2\2\2T"+
		"R\3\2\2\2TU\3\2\2\2U\\\3\2\2\2VX\7\60\2\2WY\4\62;\2XW\3\2\2\2YZ\3\2\2"+
		"\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\V\3\2\2\2\\]\3\2\2\2]\b\3\2\2\2^b\t"+
		"\3\2\2_a\t\4\2\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2c\n\3\2\2\2db"+
		"\3\2\2\2ej\7)\2\2fi\5\r\7\2gi\n\5\2\2hf\3\2\2\2hg\3\2\2\2il\3\2\2\2jh"+
		"\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7)\2\2n\f\3\2\2\2op\7^\2\2pq"+
		"\7)\2\2q\16\3\2\2\2rv\7\u0080\2\2su\n\6\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2"+
		"\2\2vw\3\2\2\2wz\3\2\2\2xv\3\2\2\2y{\7\17\2\2zy\3\2\2\2z{\3\2\2\2{|\3"+
		"\2\2\2|}\7\f\2\2}~\b\b\2\2~\20\3\2\2\2\177\u0080\t\7\2\2\u0080\u0081\b"+
		"\t\3\2\u0081\22\3\2\2\2\u0082\u008c\7@\2\2\u0083\u0084\7@\2\2\u0084\u008c"+
		"\7?\2\2\u0085\u008c\7>\2\2\u0086\u0087\7>\2\2\u0087\u008c\7?\2\2\u0088"+
		"\u0089\7>\2\2\u0089\u008c\7@\2\2\u008a\u008c\7?\2\2\u008b\u0082\3\2\2"+
		"\2\u008b\u0083\3\2\2\2\u008b\u0085\3\2\2\2\u008b\u0086\3\2\2\2\u008b\u0088"+
		"\3\2\2\2\u008b\u008a\3\2\2\2\u008c\24\3\2\2\2\u008d\u0093\t\b\2\2\u008e"+
		"\u008f\7\61\2\2\u008f\u0093\7\61\2\2\u0090\u0091\7,\2\2\u0091\u0093\7"+
		",\2\2\u0092\u008d\3\2\2\2\u0092\u008e\3\2\2\2\u0092\u0090\3\2\2\2\u0093"+
		"\26\3\2\2\2\u0094\u0095\7/\2\2\u0095\u0099\7@\2\2\u0096\u0097\7>\2\2\u0097"+
		"\u0099\7/\2\2\u0098\u0094\3\2\2\2\u0098\u0096\3\2\2\2\u0099\30\3\2\2\2"+
		"\u009a\u009b\7*\2\2\u009b\32\3\2\2\2\u009c\u009d\7+\2\2\u009d\34\3\2\2"+
		"\2\u009e\u009f\t\t\2\2\u009f\36\3\2\2\2\22\2DGLOTZ\\bhjvz\u008b\u0092"+
		"\u0098\4\3\b\2\3\t\3";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}