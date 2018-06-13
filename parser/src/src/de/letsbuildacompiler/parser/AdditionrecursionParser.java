// Generated from Additionrecursion.g4 by ANTLR 4.7.1
package src.de.letsbuildacompiler.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class AdditionrecursionParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, NUM=38, NEWLINE=39, 
		IDENTIFIER=40, WHITESPACE=41, STRING=42;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_expression = 2, RULE_varDeclaration = 3, 
		RULE_varDeclarationList = 4, RULE_assignment = 5, RULE_println = 6, RULE_print = 7, 
		RULE_branch = 8, RULE_do_while = 9, RULE_while_statement = 10, RULE_block = 11, 
		RULE_incrementation = 12, RULE_decrement = 13, RULE_forLoop = 14, RULE_forInitialization = 15, 
		RULE_forChange = 16, RULE_charArray = 17, RULE_arrayAssignment = 18, RULE_arrayElement = 19, 
		RULE_comparingArrayElements = 20, RULE_comparingBooleanAndArrayElement = 21, 
		RULE_returnStatement = 22;
	public static final String[] ruleNames = {
		"program", "statement", "expression", "varDeclaration", "varDeclarationList", 
		"assignment", "println", "print", "branch", "do_while", "while_statement", 
		"block", "incrementation", "decrement", "forLoop", "forInitialization", 
		"forChange", "charArray", "arrayAssignment", "arrayElement", "comparingArrayElements", 
		"comparingBooleanAndArrayElement", "returnStatement"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", "'/'", "'*'", "'-'", "'+'", "'<'", "'<='", "'>'", "'>='", 
		"'&&'", "'||'", "'static'", "'int'", "'='", "','", "'scanf('", "'\"%d\"'", 
		"'&'", "')'", "'printf('", "'print('", "'if'", "'('", "'else'", "'do'", 
		"'while'", "'{'", "'}'", "'++'", "'--'", "'for'", "'char'", "'['", "']'", 
		"'\"%c\"'", "'=='", "'return'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "NUM", "NEWLINE", "IDENTIFIER", "WHITESPACE", "STRING"
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
	public String getGrammarFileName() { return "Additionrecursion.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AdditionrecursionParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				statement();
				}
				}
				setState(49); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__25) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << IDENTIFIER))) != 0) );
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

	public static class StatementContext extends ParserRuleContext {
		public PrintlnContext println() {
			return getRuleContext(PrintlnContext.class,0);
		}
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public BranchContext branch() {
			return getRuleContext(BranchContext.class,0);
		}
		public Do_whileContext do_while() {
			return getRuleContext(Do_whileContext.class,0);
		}
		public While_statementContext while_statement() {
			return getRuleContext(While_statementContext.class,0);
		}
		public IncrementationContext incrementation() {
			return getRuleContext(IncrementationContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ForLoopContext forLoop() {
			return getRuleContext(ForLoopContext.class,0);
		}
		public ArrayAssignmentContext arrayAssignment() {
			return getRuleContext(ArrayAssignmentContext.class,0);
		}
		public CharArrayContext charArray() {
			return getRuleContext(CharArrayContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(87);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(51);
				println();
				setState(52);
				match(T__0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(54);
				print();
				setState(55);
				match(T__0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(57);
				varDeclarationList(0);
				setState(58);
				match(T__0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(60);
				varDeclaration();
				setState(61);
				match(T__0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(63);
				assignment();
				setState(64);
				match(T__0);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(66);
				branch();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(67);
				do_while();
				setState(68);
				match(T__0);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(70);
				while_statement();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(71);
				incrementation();
				setState(72);
				match(T__0);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(74);
				decrement();
				setState(75);
				match(T__0);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(77);
				forLoop();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(78);
				arrayAssignment();
				setState(79);
				match(T__0);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(81);
				charArray();
				setState(82);
				match(T__0);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(84);
				returnStatement();
				setState(85);
				match(T__0);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DivContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DivContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExpressionContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public VariableContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OrContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OrContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumberContext extends ExpressionContext {
		public Token number;
		public TerminalNode NUM() { return getToken(AdditionrecursionParser.NUM, 0); }
		public NumberContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitNumber(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitMult(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public AndContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RelationalContext extends ExpressionContext {
		public ExpressionContext lft;
		public Token operator;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public RelationalContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitRelational(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringContext extends ExpressionContext {
		public Token txt;
		public TerminalNode STRING() { return getToken(AdditionrecursionParser.STRING, 0); }
		public StringContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PlusContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PlusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPlus(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MinusContext extends ExpressionContext {
		public ExpressionContext lft;
		public ExpressionContext rght;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MinusContext(ExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitMinus(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 4;
		enterRecursionRule(_localctx, 4, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				{
				_localctx = new NumberContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(90);
				((NumberContext)_localctx).number = match(NUM);
				}
				break;
			case STRING:
				{
				_localctx = new StringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(91);
				((StringContext)_localctx).txt = match(STRING);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(92);
				((VariableContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(118);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(116);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						_localctx = new DivContext(new ExpressionContext(_parentctx, _parentState));
						((DivContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(95);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(96);
						match(T__1);
						setState(97);
						((DivContext)_localctx).rght = expression(11);
						}
						break;
					case 2:
						{
						_localctx = new MultContext(new ExpressionContext(_parentctx, _parentState));
						((MultContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(98);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(99);
						match(T__2);
						setState(100);
						((MultContext)_localctx).rght = expression(10);
						}
						break;
					case 3:
						{
						_localctx = new MinusContext(new ExpressionContext(_parentctx, _parentState));
						((MinusContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(101);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(102);
						match(T__3);
						setState(103);
						((MinusContext)_localctx).rght = expression(9);
						}
						break;
					case 4:
						{
						_localctx = new PlusContext(new ExpressionContext(_parentctx, _parentState));
						((PlusContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(104);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(105);
						match(T__4);
						setState(106);
						((PlusContext)_localctx).rght = expression(8);
						}
						break;
					case 5:
						{
						_localctx = new RelationalContext(new ExpressionContext(_parentctx, _parentState));
						((RelationalContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(107);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(108);
						((RelationalContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
							((RelationalContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(109);
						((RelationalContext)_localctx).rght = expression(7);
						}
						break;
					case 6:
						{
						_localctx = new AndContext(new ExpressionContext(_parentctx, _parentState));
						((AndContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(110);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(111);
						match(T__9);
						setState(112);
						((AndContext)_localctx).rght = expression(6);
						}
						break;
					case 7:
						{
						_localctx = new OrContext(new ExpressionContext(_parentctx, _parentState));
						((OrContext)_localctx).lft = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(113);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(114);
						match(T__10);
						setState(115);
						((OrContext)_localctx).rght = expression(5);
						}
						break;
					}
					} 
				}
				setState(120);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimpleVarDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public SimpleVarDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitSimpleVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VarDeclarationAndAssignmentContext extends VarDeclarationContext {
		public Token varName;
		public ExpressionContext exp;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public VarDeclarationAndAssignmentContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVarDeclarationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ListDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ListDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StaticVarDeclarationContext extends VarDeclarationContext {
		public Token varName;
		public ExpressionContext exp;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StaticVarDeclarationContext(VarDeclarationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitStaticVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				_localctx = new StaticVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(T__11);
				setState(122);
				match(T__12);
				setState(123);
				((StaticVarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				setState(124);
				match(T__13);
				setState(125);
				((StaticVarDeclarationContext)_localctx).exp = expression(0);
				}
				break;
			case 2:
				_localctx = new VarDeclarationAndAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				match(T__12);
				setState(127);
				((VarDeclarationAndAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(128);
				match(T__13);
				setState(129);
				((VarDeclarationAndAssignmentContext)_localctx).exp = expression(0);
				}
				break;
			case 3:
				_localctx = new SimpleVarDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(130);
				match(T__12);
				setState(131);
				((SimpleVarDeclarationContext)_localctx).varName = match(IDENTIFIER);
				}
				break;
			case 4:
				_localctx = new ListDeclarationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(132);
				match(T__14);
				setState(133);
				((ListDeclarationContext)_localctx).varName = match(IDENTIFIER);
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

	public static class VarDeclarationListContext extends ParserRuleContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarDeclarationListContext varDeclarationList() {
			return getRuleContext(VarDeclarationListContext.class,0);
		}
		public VarDeclarationListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclarationList; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitVarDeclarationList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationListContext varDeclarationList() throws RecognitionException {
		return varDeclarationList(0);
	}

	private VarDeclarationListContext varDeclarationList(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		VarDeclarationListContext _localctx = new VarDeclarationListContext(_ctx, _parentState);
		VarDeclarationListContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_varDeclarationList, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(137);
			varDeclaration();
			}
			_ctx.stop = _input.LT(-1);
			setState(143);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new VarDeclarationListContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_varDeclarationList);
					setState(139);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(140);
					varDeclaration();
					}
					} 
				}
				setState(145);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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

	public static class AssignmentContext extends ParserRuleContext {
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
	 
		public AssignmentContext() { }
		public void copyFrom(AssignmentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BooleanVariableEvaluationAndAssignmentContext extends AssignmentContext {
		public Token variableName;
		public ComparingBooleanAndArrayElementContext value;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ComparingBooleanAndArrayElementContext comparingBooleanAndArrayElement() {
			return getRuleContext(ComparingBooleanAndArrayElementContext.class,0);
		}
		public BooleanVariableEvaluationAndAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitBooleanVariableEvaluationAndAssignment(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InputVarContext extends AssignmentContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public InputVarContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitInputVar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DirectVarAssignmentContext extends AssignmentContext {
		public Token varName;
		public ExpressionContext expr;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DirectVarAssignmentContext(AssignmentContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDirectVarAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignment);
		try {
			setState(158);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				_localctx = new BooleanVariableEvaluationAndAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				((BooleanVariableEvaluationAndAssignmentContext)_localctx).variableName = match(IDENTIFIER);
				setState(147);
				match(T__13);
				setState(148);
				((BooleanVariableEvaluationAndAssignmentContext)_localctx).value = comparingBooleanAndArrayElement();
				}
				break;
			case 2:
				_localctx = new DirectVarAssignmentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(149);
				((DirectVarAssignmentContext)_localctx).varName = match(IDENTIFIER);
				setState(150);
				match(T__13);
				setState(151);
				((DirectVarAssignmentContext)_localctx).expr = expression(0);
				}
				break;
			case 3:
				_localctx = new InputVarContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(152);
				match(T__15);
				setState(153);
				match(T__16);
				setState(154);
				match(T__14);
				setState(155);
				match(T__17);
				setState(156);
				((InputVarContext)_localctx).varName = match(IDENTIFIER);
				setState(157);
				match(T__18);
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

	public static class PrintlnContext extends ParserRuleContext {
		public PrintlnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_println; }
	 
		public PrintlnContext() { }
		public void copyFrom(PrintlnContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PrintStatementAndVariableContext extends PrintlnContext {
		public Token text;
		public Token varName;
		public TerminalNode STRING() { return getToken(AdditionrecursionParser.STRING, 0); }
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public PrintStatementAndVariableContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPrintStatementAndVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimplePrintStatementContext extends PrintlnContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimplePrintStatementContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitSimplePrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Print_threeContext extends PrintlnContext {
		public Token text;
		public Token varName;
		public Token variableName;
		public ExpressionContext expr;
		public TerminalNode STRING() { return getToken(AdditionrecursionParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AdditionrecursionParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AdditionrecursionParser.IDENTIFIER, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Print_threeContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPrint_three(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Print_Two_VariablesContext extends PrintlnContext {
		public Token text;
		public Token varName;
		public Token variableName;
		public TerminalNode STRING() { return getToken(AdditionrecursionParser.STRING, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(AdditionrecursionParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AdditionrecursionParser.IDENTIFIER, i);
		}
		public Print_Two_VariablesContext(PrintlnContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPrint_Two_Variables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintlnContext println() throws RecognitionException {
		PrintlnContext _localctx = new PrintlnContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_println);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new PrintStatementAndVariableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				match(T__19);
				setState(161);
				((PrintStatementAndVariableContext)_localctx).text = match(STRING);
				setState(162);
				match(T__14);
				setState(163);
				((PrintStatementAndVariableContext)_localctx).varName = match(IDENTIFIER);
				setState(164);
				match(T__18);
				}
				break;
			case 2:
				_localctx = new Print_Two_VariablesContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(165);
				match(T__19);
				setState(166);
				((Print_Two_VariablesContext)_localctx).text = match(STRING);
				setState(167);
				match(T__14);
				setState(168);
				((Print_Two_VariablesContext)_localctx).varName = match(IDENTIFIER);
				setState(169);
				match(T__14);
				setState(170);
				((Print_Two_VariablesContext)_localctx).variableName = match(IDENTIFIER);
				setState(171);
				match(T__18);
				}
				break;
			case 3:
				_localctx = new Print_threeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(172);
				match(T__19);
				setState(173);
				((Print_threeContext)_localctx).text = match(STRING);
				setState(174);
				match(T__14);
				setState(175);
				((Print_threeContext)_localctx).varName = match(IDENTIFIER);
				setState(176);
				match(T__14);
				setState(177);
				((Print_threeContext)_localctx).variableName = match(IDENTIFIER);
				setState(178);
				match(T__14);
				setState(179);
				((Print_threeContext)_localctx).expr = expression(0);
				setState(180);
				match(T__18);
				}
				break;
			case 4:
				_localctx = new SimplePrintStatementContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(182);
				match(T__19);
				setState(183);
				((SimplePrintStatementContext)_localctx).argument = expression(0);
				setState(184);
				match(T__18);
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

	public static class PrintContext extends ParserRuleContext {
		public ExpressionContext argument;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(T__20);
			setState(189);
			((PrintContext)_localctx).argument = expression(0);
			setState(190);
			match(T__18);
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

	public static class BranchContext extends ParserRuleContext {
		public BranchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_branch; }
	 
		public BranchContext() { }
		public void copyFrom(BranchContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class CompareStatements_ifContext extends BranchContext {
		public ExpressionContext lft;
		public Token operator;
		public ExpressionContext rght;
		public BlockContext onTrue;
		public BlockContext onFalse;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public CompareStatements_ifContext(BranchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitCompareStatements_if(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OtherIfStatementsContext extends BranchContext {
		public ExpressionContext condition;
		public BlockContext onTrue;
		public BlockContext onFalse;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<BlockContext> block() {
			return getRuleContexts(BlockContext.class);
		}
		public BlockContext block(int i) {
			return getRuleContext(BlockContext.class,i);
		}
		public OtherIfStatementsContext(BranchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitOtherIfStatements(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class If_statement_OrContext extends BranchContext {
		public ExpressionContext left_condition;
		public Token operator;
		public ExpressionContext right_condition;
		public StatementContext instruction;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public If_statement_OrContext(BranchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitIf_statement_Or(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CheckforOne_IfContext extends BranchContext {
		public Token varName;
		public StatementContext valid;
		public StatementContext nonValid;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public CheckforOne_IfContext(BranchContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitCheckforOne_If(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BranchContext branch() throws RecognitionException {
		BranchContext _localctx = new BranchContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_branch);
		int _la;
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new CompareStatements_ifContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(T__21);
				setState(193);
				match(T__22);
				setState(194);
				((CompareStatements_ifContext)_localctx).lft = expression(0);
				setState(195);
				((CompareStatements_ifContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
					((CompareStatements_ifContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(196);
				((CompareStatements_ifContext)_localctx).rght = expression(0);
				setState(197);
				match(T__18);
				setState(198);
				((CompareStatements_ifContext)_localctx).onTrue = block();
				setState(199);
				match(T__23);
				setState(200);
				((CompareStatements_ifContext)_localctx).onFalse = block();
				}
				break;
			case 2:
				_localctx = new If_statement_OrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(202);
				match(T__21);
				setState(203);
				match(T__22);
				setState(204);
				((If_statement_OrContext)_localctx).left_condition = expression(0);
				setState(205);
				((If_statement_OrContext)_localctx).operator = match(T__10);
				setState(206);
				((If_statement_OrContext)_localctx).right_condition = expression(0);
				setState(207);
				match(T__18);
				setState(208);
				((If_statement_OrContext)_localctx).instruction = statement();
				}
				break;
			case 3:
				_localctx = new CheckforOne_IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(210);
				match(T__21);
				setState(211);
				match(T__22);
				setState(212);
				((CheckforOne_IfContext)_localctx).varName = match(IDENTIFIER);
				setState(213);
				match(T__18);
				setState(214);
				((CheckforOne_IfContext)_localctx).valid = statement();
				setState(215);
				match(T__23);
				setState(216);
				((CheckforOne_IfContext)_localctx).nonValid = statement();
				}
				break;
			case 4:
				_localctx = new OtherIfStatementsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(218);
				match(T__21);
				setState(219);
				match(T__22);
				setState(220);
				((OtherIfStatementsContext)_localctx).condition = expression(0);
				setState(221);
				match(T__18);
				setState(222);
				((OtherIfStatementsContext)_localctx).onTrue = block();
				setState(223);
				match(T__23);
				setState(224);
				((OtherIfStatementsContext)_localctx).onFalse = block();
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

	public static class Do_whileContext extends ParserRuleContext {
		public Do_whileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_do_while; }
	 
		public Do_whileContext() { }
		public void copyFrom(Do_whileContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DoWhile_OrContext extends Do_whileContext {
		public BlockContext loop;
		public ExpressionContext left_condition;
		public Token operator;
		public ExpressionContext right_condition;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public DoWhile_OrContext(Do_whileContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDoWhile_Or(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleDoWhileContext extends Do_whileContext {
		public BlockContext loop;
		public ExpressionContext condition;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleDoWhileContext(Do_whileContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitSimpleDoWhile(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Do_whileContext do_while() throws RecognitionException {
		Do_whileContext _localctx = new Do_whileContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_do_while);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new DoWhile_OrContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(T__24);
				setState(229);
				((DoWhile_OrContext)_localctx).loop = block();
				setState(230);
				match(T__25);
				setState(231);
				match(T__22);
				setState(232);
				((DoWhile_OrContext)_localctx).left_condition = expression(0);
				setState(233);
				((DoWhile_OrContext)_localctx).operator = match(T__10);
				setState(234);
				((DoWhile_OrContext)_localctx).right_condition = expression(0);
				setState(235);
				match(T__18);
				}
				break;
			case 2:
				_localctx = new SimpleDoWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(237);
				match(T__24);
				setState(238);
				((SimpleDoWhileContext)_localctx).loop = block();
				setState(239);
				match(T__25);
				setState(240);
				match(T__22);
				setState(241);
				((SimpleDoWhileContext)_localctx).condition = expression(0);
				setState(242);
				match(T__18);
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

	public static class While_statementContext extends ParserRuleContext {
		public ExpressionContext condition;
		public BlockContext loopCondition;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public While_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_statement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitWhile_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_statementContext while_statement() throws RecognitionException {
		While_statementContext _localctx = new While_statementContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__25);
			setState(247);
			match(T__22);
			setState(248);
			((While_statementContext)_localctx).condition = expression(0);
			setState(249);
			match(T__18);
			setState(250);
			((While_statementContext)_localctx).loopCondition = block();
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

	public static class BlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(T__26);
			setState(256);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__11) | (1L << T__12) | (1L << T__14) | (1L << T__15) | (1L << T__19) | (1L << T__20) | (1L << T__21) | (1L << T__24) | (1L << T__25) | (1L << T__30) | (1L << T__31) | (1L << T__36) | (1L << IDENTIFIER))) != 0)) {
				{
				{
				setState(253);
				statement();
				}
				}
				setState(258);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(259);
			match(T__27);
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

	public static class IncrementationContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public IncrementationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incrementation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitIncrementation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncrementationContext incrementation() throws RecognitionException {
		IncrementationContext _localctx = new IncrementationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_incrementation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			((IncrementationContext)_localctx).varName = match(IDENTIFIER);
			setState(262);
			match(T__28);
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

	public static class DecrementContext extends ParserRuleContext {
		public Token varName;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public DecrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_decrement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDecrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DecrementContext decrement() throws RecognitionException {
		DecrementContext _localctx = new DecrementContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_decrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			((DecrementContext)_localctx).varName = match(IDENTIFIER);
			setState(265);
			match(T__29);
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

	public static class ForLoopContext extends ParserRuleContext {
		public ForInitializationContext initialization;
		public ExpressionContext condition;
		public ForChangeContext change;
		public BlockContext loopCondition;
		public ForInitializationContext forInitialization() {
			return getRuleContext(ForInitializationContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ForChangeContext forChange() {
			return getRuleContext(ForChangeContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forLoop; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitForLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForLoopContext forLoop() throws RecognitionException {
		ForLoopContext _localctx = new ForLoopContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_forLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__30);
			setState(268);
			match(T__22);
			setState(269);
			((ForLoopContext)_localctx).initialization = forInitialization();
			setState(270);
			match(T__0);
			setState(271);
			((ForLoopContext)_localctx).condition = expression(0);
			setState(272);
			match(T__0);
			setState(273);
			((ForLoopContext)_localctx).change = forChange();
			setState(274);
			match(T__18);
			setState(275);
			((ForLoopContext)_localctx).loopCondition = block();
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

	public static class ForInitializationContext extends ParserRuleContext {
		public ForInitializationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forInitialization; }
	 
		public ForInitializationContext() { }
		public void copyFrom(ForInitializationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeclareVariable_ForContext extends ForInitializationContext {
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public DeclareVariable_ForContext(ForInitializationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitDeclareVariable_For(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignVariable_ForContext extends ForInitializationContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignVariable_ForContext(ForInitializationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitAssignVariable_For(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForInitializationContext forInitialization() throws RecognitionException {
		ForInitializationContext _localctx = new ForInitializationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_forInitialization);
		try {
			setState(279);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__11:
			case T__12:
			case T__14:
				_localctx = new DeclareVariable_ForContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				varDeclaration();
				}
				break;
			case T__15:
			case IDENTIFIER:
				_localctx = new AssignVariable_ForContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(278);
				assignment();
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

	public static class ForChangeContext extends ParserRuleContext {
		public IncrementationContext incrementation() {
			return getRuleContext(IncrementationContext.class,0);
		}
		public DecrementContext decrement() {
			return getRuleContext(DecrementContext.class,0);
		}
		public ForChangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forChange; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitForChange(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForChangeContext forChange() throws RecognitionException {
		ForChangeContext _localctx = new ForChangeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_forChange);
		try {
			setState(283);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(281);
				incrementation();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(282);
				decrement();
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

	public static class CharArrayContext extends ParserRuleContext {
		public Token arrayName;
		public Token varName;
		public List<TerminalNode> IDENTIFIER() { return getTokens(AdditionrecursionParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(AdditionrecursionParser.IDENTIFIER, i);
		}
		public CharArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charArray; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitCharArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharArrayContext charArray() throws RecognitionException {
		CharArrayContext _localctx = new CharArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_charArray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(T__31);
			setState(286);
			((CharArrayContext)_localctx).arrayName = match(IDENTIFIER);
			setState(287);
			match(T__32);
			setState(288);
			((CharArrayContext)_localctx).varName = match(IDENTIFIER);
			setState(289);
			match(T__33);
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

	public static class ArrayAssignmentContext extends ParserRuleContext {
		public Token arrayName;
		public ExpressionContext number;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayAssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayAssignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitArrayAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayAssignmentContext arrayAssignment() throws RecognitionException {
		ArrayAssignmentContext _localctx = new ArrayAssignmentContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_arrayAssignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			match(T__15);
			setState(292);
			match(T__34);
			setState(293);
			match(T__14);
			setState(294);
			match(T__17);
			setState(295);
			((ArrayAssignmentContext)_localctx).arrayName = match(IDENTIFIER);
			setState(296);
			match(T__32);
			setState(297);
			((ArrayAssignmentContext)_localctx).number = expression(0);
			setState(298);
			match(T__33);
			setState(299);
			match(T__18);
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

	public static class ArrayElementContext extends ParserRuleContext {
		public Token arrayName;
		public ExpressionContext number;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arrayElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayElementContext arrayElement() throws RecognitionException {
		ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_arrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			((ArrayElementContext)_localctx).arrayName = match(IDENTIFIER);
			setState(302);
			match(T__32);
			setState(303);
			((ArrayElementContext)_localctx).number = expression(0);
			setState(304);
			match(T__33);
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

	public static class ComparingArrayElementsContext extends ParserRuleContext {
		public ArrayElementContext left_element;
		public ArrayElementContext right_element;
		public List<ArrayElementContext> arrayElement() {
			return getRuleContexts(ArrayElementContext.class);
		}
		public ArrayElementContext arrayElement(int i) {
			return getRuleContext(ArrayElementContext.class,i);
		}
		public ComparingArrayElementsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparingArrayElements; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitComparingArrayElements(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparingArrayElementsContext comparingArrayElements() throws RecognitionException {
		ComparingArrayElementsContext _localctx = new ComparingArrayElementsContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comparingArrayElements);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(306);
			match(T__22);
			setState(307);
			((ComparingArrayElementsContext)_localctx).left_element = arrayElement();
			setState(308);
			match(T__35);
			setState(309);
			((ComparingArrayElementsContext)_localctx).right_element = arrayElement();
			setState(310);
			match(T__18);
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

	public static class ComparingBooleanAndArrayElementContext extends ParserRuleContext {
		public Token variableName;
		public ComparingArrayElementsContext booleanReturned;
		public TerminalNode IDENTIFIER() { return getToken(AdditionrecursionParser.IDENTIFIER, 0); }
		public ComparingArrayElementsContext comparingArrayElements() {
			return getRuleContext(ComparingArrayElementsContext.class,0);
		}
		public ComparingBooleanAndArrayElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparingBooleanAndArrayElement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitComparingBooleanAndArrayElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparingBooleanAndArrayElementContext comparingBooleanAndArrayElement() throws RecognitionException {
		ComparingBooleanAndArrayElementContext _localctx = new ComparingBooleanAndArrayElementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_comparingBooleanAndArrayElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			((ComparingBooleanAndArrayElementContext)_localctx).variableName = match(IDENTIFIER);
			setState(313);
			match(T__9);
			setState(314);
			((ComparingBooleanAndArrayElementContext)_localctx).booleanReturned = comparingArrayElements();
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

	public static class ReturnStatementContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AdditionrecursionVisitor ) return ((AdditionrecursionVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			match(T__36);
			setState(317);
			expression(0);
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
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		case 4:
			return varDeclarationList_sempred((VarDeclarationListContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean varDeclarationList_sempred(VarDeclarationListContext _localctx, int predIndex) {
		switch (predIndex) {
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3,\u0142\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\5\3Z\n\3\3\4\3\4\3\4\3\4\5\4`\n\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4w\n\4\f\4\16\4z\13\4\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5\u0089\n\5\3\6\3\6\3\6\3\6\3\6\7\6\u0090\n\6\f\6\16\6\u0093\13"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a1\n\7\3\b\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00bd\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\n\u00e5\n\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\5\13\u00f7\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\7\r\u0101\n\r"+
		"\f\r\16\r\u0104\13\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3"+
		"\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\5\21\u011a\n\21\3\22"+
		"\3\22\5\22\u011e\n\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\2\4\6\n\31\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\b\13\2\u0151\2\61"+
		"\3\2\2\2\4Y\3\2\2\2\6_\3\2\2\2\b\u0088\3\2\2\2\n\u008a\3\2\2\2\f\u00a0"+
		"\3\2\2\2\16\u00bc\3\2\2\2\20\u00be\3\2\2\2\22\u00e4\3\2\2\2\24\u00f6\3"+
		"\2\2\2\26\u00f8\3\2\2\2\30\u00fe\3\2\2\2\32\u0107\3\2\2\2\34\u010a\3\2"+
		"\2\2\36\u010d\3\2\2\2 \u0119\3\2\2\2\"\u011d\3\2\2\2$\u011f\3\2\2\2&\u0125"+
		"\3\2\2\2(\u012f\3\2\2\2*\u0134\3\2\2\2,\u013a\3\2\2\2.\u013e\3\2\2\2\60"+
		"\62\5\4\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64"+
		"\3\3\2\2\2\65\66\5\16\b\2\66\67\7\3\2\2\67Z\3\2\2\289\5\20\t\29:\7\3\2"+
		"\2:Z\3\2\2\2;<\5\n\6\2<=\7\3\2\2=Z\3\2\2\2>?\5\b\5\2?@\7\3\2\2@Z\3\2\2"+
		"\2AB\5\f\7\2BC\7\3\2\2CZ\3\2\2\2DZ\5\22\n\2EF\5\24\13\2FG\7\3\2\2GZ\3"+
		"\2\2\2HZ\5\26\f\2IJ\5\32\16\2JK\7\3\2\2KZ\3\2\2\2LM\5\34\17\2MN\7\3\2"+
		"\2NZ\3\2\2\2OZ\5\36\20\2PQ\5&\24\2QR\7\3\2\2RZ\3\2\2\2ST\5$\23\2TU\7\3"+
		"\2\2UZ\3\2\2\2VW\5.\30\2WX\7\3\2\2XZ\3\2\2\2Y\65\3\2\2\2Y8\3\2\2\2Y;\3"+
		"\2\2\2Y>\3\2\2\2YA\3\2\2\2YD\3\2\2\2YE\3\2\2\2YH\3\2\2\2YI\3\2\2\2YL\3"+
		"\2\2\2YO\3\2\2\2YP\3\2\2\2YS\3\2\2\2YV\3\2\2\2Z\5\3\2\2\2[\\\b\4\1\2\\"+
		"`\7(\2\2]`\7,\2\2^`\7*\2\2_[\3\2\2\2_]\3\2\2\2_^\3\2\2\2`x\3\2\2\2ab\f"+
		"\f\2\2bc\7\4\2\2cw\5\6\4\rde\f\13\2\2ef\7\5\2\2fw\5\6\4\fgh\f\n\2\2hi"+
		"\7\6\2\2iw\5\6\4\13jk\f\t\2\2kl\7\7\2\2lw\5\6\4\nmn\f\b\2\2no\t\2\2\2"+
		"ow\5\6\4\tpq\f\7\2\2qr\7\f\2\2rw\5\6\4\bst\f\6\2\2tu\7\r\2\2uw\5\6\4\7"+
		"va\3\2\2\2vd\3\2\2\2vg\3\2\2\2vj\3\2\2\2vm\3\2\2\2vp\3\2\2\2vs\3\2\2\2"+
		"wz\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\7\3\2\2\2zx\3\2\2\2{|\7\16\2\2|}\7\17"+
		"\2\2}~\7*\2\2~\177\7\20\2\2\177\u0089\5\6\4\2\u0080\u0081\7\17\2\2\u0081"+
		"\u0082\7*\2\2\u0082\u0083\7\20\2\2\u0083\u0089\5\6\4\2\u0084\u0085\7\17"+
		"\2\2\u0085\u0089\7*\2\2\u0086\u0087\7\21\2\2\u0087\u0089\7*\2\2\u0088"+
		"{\3\2\2\2\u0088\u0080\3\2\2\2\u0088\u0084\3\2\2\2\u0088\u0086\3\2\2\2"+
		"\u0089\t\3\2\2\2\u008a\u008b\b\6\1\2\u008b\u008c\5\b\5\2\u008c\u0091\3"+
		"\2\2\2\u008d\u008e\f\4\2\2\u008e\u0090\5\b\5\2\u008f\u008d\3\2\2\2\u0090"+
		"\u0093\3\2\2\2\u0091\u008f\3\2\2\2\u0091\u0092\3\2\2\2\u0092\13\3\2\2"+
		"\2\u0093\u0091\3\2\2\2\u0094\u0095\7*\2\2\u0095\u0096\7\20\2\2\u0096\u00a1"+
		"\5,\27\2\u0097\u0098\7*\2\2\u0098\u0099\7\20\2\2\u0099\u00a1\5\6\4\2\u009a"+
		"\u009b\7\22\2\2\u009b\u009c\7\23\2\2\u009c\u009d\7\21\2\2\u009d\u009e"+
		"\7\24\2\2\u009e\u009f\7*\2\2\u009f\u00a1\7\25\2\2\u00a0\u0094\3\2\2\2"+
		"\u00a0\u0097\3\2\2\2\u00a0\u009a\3\2\2\2\u00a1\r\3\2\2\2\u00a2\u00a3\7"+
		"\26\2\2\u00a3\u00a4\7,\2\2\u00a4\u00a5\7\21\2\2\u00a5\u00a6\7*\2\2\u00a6"+
		"\u00bd\7\25\2\2\u00a7\u00a8\7\26\2\2\u00a8\u00a9\7,\2\2\u00a9\u00aa\7"+
		"\21\2\2\u00aa\u00ab\7*\2\2\u00ab\u00ac\7\21\2\2\u00ac\u00ad\7*\2\2\u00ad"+
		"\u00bd\7\25\2\2\u00ae\u00af\7\26\2\2\u00af\u00b0\7,\2\2\u00b0\u00b1\7"+
		"\21\2\2\u00b1\u00b2\7*\2\2\u00b2\u00b3\7\21\2\2\u00b3\u00b4\7*\2\2\u00b4"+
		"\u00b5\7\21\2\2\u00b5\u00b6\5\6\4\2\u00b6\u00b7\7\25\2\2\u00b7\u00bd\3"+
		"\2\2\2\u00b8\u00b9\7\26\2\2\u00b9\u00ba\5\6\4\2\u00ba\u00bb\7\25\2\2\u00bb"+
		"\u00bd\3\2\2\2\u00bc\u00a2\3\2\2\2\u00bc\u00a7\3\2\2\2\u00bc\u00ae\3\2"+
		"\2\2\u00bc\u00b8\3\2\2\2\u00bd\17\3\2\2\2\u00be\u00bf\7\27\2\2\u00bf\u00c0"+
		"\5\6\4\2\u00c0\u00c1\7\25\2\2\u00c1\21\3\2\2\2\u00c2\u00c3\7\30\2\2\u00c3"+
		"\u00c4\7\31\2\2\u00c4\u00c5\5\6\4\2\u00c5\u00c6\t\2\2\2\u00c6\u00c7\5"+
		"\6\4\2\u00c7\u00c8\7\25\2\2\u00c8\u00c9\5\30\r\2\u00c9\u00ca\7\32\2\2"+
		"\u00ca\u00cb\5\30\r\2\u00cb\u00e5\3\2\2\2\u00cc\u00cd\7\30\2\2\u00cd\u00ce"+
		"\7\31\2\2\u00ce\u00cf\5\6\4\2\u00cf\u00d0\7\r\2\2\u00d0\u00d1\5\6\4\2"+
		"\u00d1\u00d2\7\25\2\2\u00d2\u00d3\5\4\3\2\u00d3\u00e5\3\2\2\2\u00d4\u00d5"+
		"\7\30\2\2\u00d5\u00d6\7\31\2\2\u00d6\u00d7\7*\2\2\u00d7\u00d8\7\25\2\2"+
		"\u00d8\u00d9\5\4\3\2\u00d9\u00da\7\32\2\2\u00da\u00db\5\4\3\2\u00db\u00e5"+
		"\3\2\2\2\u00dc\u00dd\7\30\2\2\u00dd\u00de\7\31\2\2\u00de\u00df\5\6\4\2"+
		"\u00df\u00e0\7\25\2\2\u00e0\u00e1\5\30\r\2\u00e1\u00e2\7\32\2\2\u00e2"+
		"\u00e3\5\30\r\2\u00e3\u00e5\3\2\2\2\u00e4\u00c2\3\2\2\2\u00e4\u00cc\3"+
		"\2\2\2\u00e4\u00d4\3\2\2\2\u00e4\u00dc\3\2\2\2\u00e5\23\3\2\2\2\u00e6"+
		"\u00e7\7\33\2\2\u00e7\u00e8\5\30\r\2\u00e8\u00e9\7\34\2\2\u00e9\u00ea"+
		"\7\31\2\2\u00ea\u00eb\5\6\4\2\u00eb\u00ec\7\r\2\2\u00ec\u00ed\5\6\4\2"+
		"\u00ed\u00ee\7\25\2\2\u00ee\u00f7\3\2\2\2\u00ef\u00f0\7\33\2\2\u00f0\u00f1"+
		"\5\30\r\2\u00f1\u00f2\7\34\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4\5\6\4"+
		"\2\u00f4\u00f5\7\25\2\2\u00f5\u00f7\3\2\2\2\u00f6\u00e6\3\2\2\2\u00f6"+
		"\u00ef\3\2\2\2\u00f7\25\3\2\2\2\u00f8\u00f9\7\34\2\2\u00f9\u00fa\7\31"+
		"\2\2\u00fa\u00fb\5\6\4\2\u00fb\u00fc\7\25\2\2\u00fc\u00fd\5\30\r\2\u00fd"+
		"\27\3\2\2\2\u00fe\u0102\7\35\2\2\u00ff\u0101\5\4\3\2\u0100\u00ff\3\2\2"+
		"\2\u0101\u0104\3\2\2\2\u0102\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u0105"+
		"\3\2\2\2\u0104\u0102\3\2\2\2\u0105\u0106\7\36\2\2\u0106\31\3\2\2\2\u0107"+
		"\u0108\7*\2\2\u0108\u0109\7\37\2\2\u0109\33\3\2\2\2\u010a\u010b\7*\2\2"+
		"\u010b\u010c\7 \2\2\u010c\35\3\2\2\2\u010d\u010e\7!\2\2\u010e\u010f\7"+
		"\31\2\2\u010f\u0110\5 \21\2\u0110\u0111\7\3\2\2\u0111\u0112\5\6\4\2\u0112"+
		"\u0113\7\3\2\2\u0113\u0114\5\"\22\2\u0114\u0115\7\25\2\2\u0115\u0116\5"+
		"\30\r\2\u0116\37\3\2\2\2\u0117\u011a\5\b\5\2\u0118\u011a\5\f\7\2\u0119"+
		"\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a!\3\2\2\2\u011b\u011e\5\32\16"+
		"\2\u011c\u011e\5\34\17\2\u011d\u011b\3\2\2\2\u011d\u011c\3\2\2\2\u011e"+
		"#\3\2\2\2\u011f\u0120\7\"\2\2\u0120\u0121\7*\2\2\u0121\u0122\7#\2\2\u0122"+
		"\u0123\7*\2\2\u0123\u0124\7$\2\2\u0124%\3\2\2\2\u0125\u0126\7\22\2\2\u0126"+
		"\u0127\7%\2\2\u0127\u0128\7\21\2\2\u0128\u0129\7\24\2\2\u0129\u012a\7"+
		"*\2\2\u012a\u012b\7#\2\2\u012b\u012c\5\6\4\2\u012c\u012d\7$\2\2\u012d"+
		"\u012e\7\25\2\2\u012e\'\3\2\2\2\u012f\u0130\7*\2\2\u0130\u0131\7#\2\2"+
		"\u0131\u0132\5\6\4\2\u0132\u0133\7$\2\2\u0133)\3\2\2\2\u0134\u0135\7\31"+
		"\2\2\u0135\u0136\5(\25\2\u0136\u0137\7&\2\2\u0137\u0138\5(\25\2\u0138"+
		"\u0139\7\25\2\2\u0139+\3\2\2\2\u013a\u013b\7*\2\2\u013b\u013c\7\f\2\2"+
		"\u013c\u013d\5*\26\2\u013d-\3\2\2\2\u013e\u013f\7\'\2\2\u013f\u0140\5"+
		"\6\4\2\u0140/\3\2\2\2\20\63Y_vx\u0088\u0091\u00a0\u00bc\u00e4\u00f6\u0102"+
		"\u0119\u011d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}