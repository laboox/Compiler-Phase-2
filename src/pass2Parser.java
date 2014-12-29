// Generated from cool2.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class pass2Parser extends Parser {
    static { RuntimeMetaData.checkVersion("4.4", RuntimeMetaData.VERSION); }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    public static final int
            T__18=1, T__17=2, T__16=3, T__15=4, T__14=5, T__13=6, T__12=7, T__11=8,
            T__10=9, T__9=10, T__8=11, T__7=12, T__6=13, T__5=14, T__4=15, T__3=16,
            T__2=17, T__1=18, T__0=19, IF=20, FI=21, CLASS=22, ELSE=23, IN=24, INHERITS=25,
            ISVOID=26, LET=27, LOOP=28, POOL=29, THEN=30, WHILE=31, CASE=32, ESAC=33,
            NEW=34, OF=35, NOT=36, TRUE=37, FALSE=38, INTEGER=39, TYPE=40, OBJECT=41,
            SELF=42, SELF_TYPE=43, STRING=44, SINGLE_COMMENT=45, MULTI_COMMENT=46,
            WS=47;
    public static final String[] tokenNames = {
            "<INVALID>", "')'", "'.'", "'=>'", "','", "'+'", "'-'", "'*'", "':'",
            "'('", "'@'", "'<'", "'='", "';'", "'<='", "'{'", "'/'", "'~'", "'}'",
            "'<-'", "IF", "FI", "CLASS", "ELSE", "IN", "INHERITS", "ISVOID", "LET",
            "LOOP", "POOL", "THEN", "WHILE", "CASE", "ESAC", "NEW", "OF", "NOT", "TRUE",
            "FALSE", "INTEGER", "TYPE", "OBJECT", "'self'", "'SELF_TYPE'", "STRING",
            "SINGLE_COMMENT", "MULTI_COMMENT", "WS"
    };
    public static final int
            RULE_cool = 0, RULE_program = 1, RULE_clas = 2, RULE_feature = 3, RULE_formal = 4,
            RULE_expr = 5, RULE_not = 6, RULE_comp = 7, RULE_comp2 = 8, RULE_addsub = 9,
            RULE_addsub2 = 10, RULE_muldiv = 11, RULE_muldiv2 = 12, RULE_voidd = 13,
            RULE_target = 14, RULE_call = 15, RULE_call2 = 16, RULE_func = 17, RULE_end = 18;
    public static final String[] ruleNames = {
            "cool", "program", "clas", "feature", "formal", "expr", "not", "comp",
            "comp2", "addsub", "addsub2", "muldiv", "muldiv2", "voidd", "target",
            "call", "call2", "func", "end"
    };

    //User Defined fields here:
    SymbolTable symbolTable;

    @Override
    public String getGrammarFileName() { return "cool2.g4"; }

    @Override
    public String[] getTokenNames() { return tokenNames; }

    @Override
    public String[] getRuleNames() { return ruleNames; }

    @Override
    public String getSerializedATN() { return _serializedATN; }

    @Override
    public ATN getATN() { return _ATN; }

    public pass2Parser(TokenStream input, SymbolTable symbolTable) {
        super(input);
        _interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
        this.symbolTable = symbolTable;
    }
    public static class CoolContext extends ParserRuleContext {
        public ProgramContext program() {
            return getRuleContext(ProgramContext.class,0);
        }
        public CoolContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_cool; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterCool(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitCool(this);
        }
    }

    public final CoolContext cool() throws RecognitionException, Pass2Error {
        CoolContext _localctx = new CoolContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_cool);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(38); program();
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

    public static class ProgramContext extends ParserRuleContext {
        public ClasContext clas(int i) {
            return getRuleContext(ClasContext.class,i);
        }
        public List<ClasContext> clas() {
            return getRuleContexts(ClasContext.class);
        }
        public ProgramContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_program; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterProgram(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitProgram(this);
        }
    }

    public final ProgramContext program() throws RecognitionException, Pass2Error {
        ProgramContext _localctx = new ProgramContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_program);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                System.out.println("1");
                setState(44);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(41); clas();
                            setState(42); match(T__6);
                        }
                    }
                    setState(46);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ( _la==CLASS );
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

    public static class ClasContext extends ParserRuleContext {
        public List<FeatureContext> feature() {
            return getRuleContexts(FeatureContext.class);
        }
        public FeatureContext feature(int i) {
            return getRuleContext(FeatureContext.class,i);
        }
        public TerminalNode INHERITS() { return getToken(pass2Parser.INHERITS, 0); }
        public TerminalNode TYPE(int i) {
            return getToken(pass2Parser.TYPE, i);
        }
        public List<TerminalNode> TYPE() { return getTokens(pass2Parser.TYPE); }
        public TerminalNode CLASS() { return getToken(pass2Parser.CLASS, 0); }
        public ClasContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_clas; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterClas(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitClas(this);
        }
    }

    public final ClasContext clas() throws RecognitionException, Pass2Error {
        ClasContext _localctx = new ClasContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_clas);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                System.out.println("2");
                setState(49); match(CLASS);

                symbolTable.setClassScope(symbolTable.getTypes().getType(getCurrentToken().getText()));

                setState(50); match(TYPE);
                setState(53);
                _la = _input.LA(1);
                if (_la==INHERITS) {
                    {
                        setState(51); match(INHERITS);
                        setState(52); match(TYPE);
                    }
                }

                setState(55); match(T__4);
                setState(61);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la==OBJECT) {
                    {
                        {
                            setState(56); feature();
                            setState(57); match(T__6);
                        }
                    }
                    setState(63);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(64); match(T__1);
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

    public static class FeatureContext extends ParserRuleContext {
        public TerminalNode OBJECT() { return getToken(pass2Parser.OBJECT, 0); }
        public FormalContext formal(int i) {
            return getRuleContext(FormalContext.class,i);
        }
        public List<FormalContext> formal() {
            return getRuleContexts(FormalContext.class);
        }
        public ExprContext expr() {
            return getRuleContext(ExprContext.class,0);
        }
        public TerminalNode TYPE() { return getToken(pass2Parser.TYPE, 0); }
        public FeatureContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_feature; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterFeature(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitFeature(this);
        }
    }

    public final FeatureContext feature() throws RecognitionException, Pass2Error {
        FeatureContext _localctx = new FeatureContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_feature);
        int _la;
        try {
            setState(94);
            switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    symbolTable.enterScope();
                    //System.out.println("3");
                    {
                        setState(67);
                        /*System.out.println("SET METHOD");
                        System.out.println("line "+getCurrentToken().getLine());
                        System.out.println(symbolTable.getClassScope().getName());
                        System.out.println(getCurrentToken().getText());
                        System.out.println(symbolTable.getClassScope().getMethod(getCurrentToken().getText())+" in ");
                        */
                        symbolTable.setMethodScope(symbolTable.getClassScope().getMethod(getCurrentToken().getText()));
                        match(OBJECT);
                        setState(68); match(T__10);
                        setState(77);
                        _la = _input.LA(1);
                        if (_la==OBJECT) {
                            {
                                setState(69); formal();
                                setState(74);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                                while (_la==T__15) {
                                    {
                                        {
                                            setState(70); match(T__15);
                                            setState(71); formal();
                                        }
                                    }
                                    setState(76);
                                    _errHandler.sync(this);
                                    _la = _input.LA(1);
                                }
                            }
                        }

                        setState(79); match(T__18);
                        setState(80); match(T__11);
                        setState(81); match(TYPE);
                        setState(82); match(T__4);
                        setState(83); expr();
                        setState(84);
                        match(T__1);
                        symbolTable.exitScope();
                    }
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    System.out.println("4");
                    {
                        setState(87); match(OBJECT);
                        setState(88); match(T__11);
                        setState(89); match(TYPE);
                        setState(92);
                        _la = _input.LA(1);
                        if (_la==T__0) {
                            {
                                setState(90); match(T__0);
                                setState(91); expr();
                            }
                        }

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

    public static class FormalContext extends ParserRuleContext {
        public TerminalNode OBJECT() { return getToken(pass2Parser.OBJECT, 0); }
        public TerminalNode TYPE() { return getToken(pass2Parser.TYPE, 0); }
        public FormalContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_formal; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterFormal(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitFormal(this);
        }
    }

    public final FormalContext formal() throws RecognitionException {
        FormalContext _localctx = new FormalContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_formal);
        try {
            enterOuterAlt(_localctx, 1);
            {
                //System.out.println("5");
                setState(97);
                String id = getCurrentToken().getText();
                match(OBJECT);
                setState(98); match(T__11);
                setState(99);
                Type type = symbolTable.getTypes().getType(getCurrentToken().getText());
                symbolTable.addId(id, type);
                match(TYPE);
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

    public static class ExprContext extends ParserRuleContext {
        public TerminalNode OBJECT() { return getToken(pass2Parser.OBJECT, 0); }
        public ExprContext expr() {
            return getRuleContext(ExprContext.class,0);
        }
        public NotContext not() {
            return getRuleContext(NotContext.class,0);
        }
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_expr; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterExpr(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitExpr(this);
        }
        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final ExprContext expr() throws RecognitionException, Pass2Error {
        ExprContext _localctx = new ExprContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_expr);
        try {
            setState(106);
            switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    //System.out.println("6");
                    setState(102);

                    Token token=getCurrentToken();
                    String id=token.getText();
                    if(id.equals("self"))
                        ErrorHandler.invalidSelfUsage(token,true);

                    Type idType=symbolTable.lookup(id);
                    if(idType==null)
                        ErrorHandler.noSuchVar(token);

                    match(OBJECT);
                    setState(103); match(T__0);
                    setState(104);
                    Type exprType=expr().getType();
                    if(! symbolTable.getTypes().isFather(idType, exprType))
                        ErrorHandler.notAncsor(token, idType, exprType);
                    else
                        _localctx.setType(exprType);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(105);
                    _localctx.setType(not().getType());
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

    public static class NotContext extends ParserRuleContext {
        public CompContext comp() {
            return getRuleContext(CompContext.class,0);
        }
        public TerminalNode NOT() { return getToken(pass2Parser.NOT, 0); }
        public NotContext not() {
            return getRuleContext(NotContext.class,0);
        }
        public NotContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_not; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterNot(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitNot(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final NotContext not() throws RecognitionException, Pass2Error {
        NotContext _localctx = new NotContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_not);
        try {
            setState(112);
            switch (_input.LA(1)) {
                case NOT:
                    enterOuterAlt(_localctx, 1);
                {
                    System.out.println("24");
                    setState(109); match(NOT);
                    setState(110);

                    Type notType=not().getType();
                    if(! notType.equals(symbolTable.getTypes().getBoolType()))
                        ErrorHandler.unopErr(getCurrentToken(),"Bool");
                    else
                        _localctx.setType(symbolTable.getTypes().getBoolType());
                }
                break;
                case T__10:
                case T__4:
                case T__2:
                case IF:
                case ISVOID:
                case LET:
                case WHILE:
                case CASE:
                case NEW:
                case TRUE:
                case FALSE:
                case INTEGER:
                case OBJECT:
                case STRING:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(111);
                    _localctx.setType(comp().getType());
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

    public static class CompContext extends ParserRuleContext {
        public AddsubContext addsub() {
            return getRuleContext(AddsubContext.class,0);
        }
        public Comp2Context comp2() {
            return getRuleContext(Comp2Context.class,0);
        }
        public CompContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_comp; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterComp(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitComp(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final CompContext comp() throws RecognitionException, Pass2Error {
        CompContext _localctx = new CompContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_comp);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(114);

                _localctx.setType(addsub().getType());

                setState(115);

                Type compType=comp2().getType();
                if(compType!=null)
                    _localctx.setType(symbolTable.getTypes().getBoolType());

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

    public static class Comp2Context extends ParserRuleContext {
        public AddsubContext addsub() {
            return getRuleContext(AddsubContext.class,0);
        }
        public Comp2Context comp2() {
            return getRuleContext(Comp2Context.class,0);
        }
        public Comp2Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_comp2; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterComp2(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitComp2(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final Comp2Context comp2() throws RecognitionException, Pass2Error {
        Comp2Context _localctx = new Comp2Context(_ctx, getState());
        enterRule(_localctx, 16, RULE_comp2);
        try {
            setState(133);
            switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    //System.out.println("21");
                    setState(118); match(T__8);
                    setState(119);

                    Token t1=getCurrentToken();
                    Type e1Type = addsub().getType();

                    setState(120); ;

                    Token t2=getCurrentToken();
                    Type e2Type = comp2().getType();


                    if(! e1Type.getName().equals(symbolTable.getTypes().getIntType()) || ! e2Type.getName().equals(symbolTable.getTypes().getIntType()))
                        ErrorHandler.biopErr(t1,t2, e1Type.getName(), e2Type.getName());
                    else
                        _localctx.setType(symbolTable.getTypes().getBoolType());

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    //System.out.println("22");
                    setState(123); match(T__5);
                    setState(124);

                    Token t1=getCurrentToken();
                    Type e1Type = addsub().getType();

                    setState(125);

                    Token t2=getCurrentToken();
                    Type e2Type = comp2().getType();

                    if(! e1Type.getName().equals(symbolTable.getTypes().getIntType()) || ! e2Type.getName().equals(symbolTable.getTypes().getIntType()))
                        ErrorHandler.biopErr(t1,t2, e1Type.getName(), e2Type.getName());
                    else
                        _localctx.setType(symbolTable.getTypes().getBoolType());

                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
                    //System.out.println("23");
                    setState(128); match(T__7);
                    setState(129);

                    Token t1=getCurrentToken();
                    Type e1Type = addsub().getType();

                    setState(130);

                    Token t2=getCurrentToken();
                    Type e2Type = comp2().getType();

                    if(! e1Type.getName().equals(symbolTable.getTypes().getIntType()) || ! e2Type.getName().equals(symbolTable.getTypes().getIntType()))
                        ErrorHandler.biopErr(t1,t2, e1Type.getName(), e2Type.getName());
                    else
                        _localctx.setType(symbolTable.getTypes().getBoolType());

                }
                break;
                case 4:
                    enterOuterAlt(_localctx, 4);
                {
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

    public static class AddsubContext extends ParserRuleContext {
        public MuldivContext muldiv() {
            return getRuleContext(MuldivContext.class,0);
        }
        public Addsub2Context addsub2() {
            return getRuleContext(Addsub2Context.class,0);
        }
        public AddsubContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_addsub; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterAddsub(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitAddsub(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final AddsubContext addsub() throws RecognitionException, Pass2Error {
        AddsubContext _localctx = new AddsubContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_addsub);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(135);
                _localctx.setType( muldiv().getType());
                setState(136);


                Type addType=addsub2().getType();
                if(addType!=null)
                    _localctx.setType(symbolTable.getTypes().getIntType());
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

    public static class Addsub2Context extends ParserRuleContext {
        public MuldivContext muldiv() {
            return getRuleContext(MuldivContext.class,0);
        }
        public Addsub2Context addsub2() {
            return getRuleContext(Addsub2Context.class,0);
        }
        public Addsub2Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_addsub2; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterAddsub2(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitAddsub2(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final Addsub2Context addsub2() throws RecognitionException, Pass2Error {
        Addsub2Context _localctx = new Addsub2Context(_ctx, getState());
        enterRule(_localctx, 20, RULE_addsub2);
        try {
            setState(149);
            switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    //System.out.println("16");
                    setState(139); match(T__14);
                    setState(140);

                    Token t1=getCurrentToken();
                    Type e1Type = muldiv().getType();

                    setState(141);

                    Token t2=getCurrentToken();
                    Type e2Type = addsub2().getType();

                    if(! e1Type.getName().equals(symbolTable.getTypes().getIntType()) || ! e2Type.getName().equals(symbolTable.getTypes().getIntType()))
                        ErrorHandler.biopErr(t1,t2, e1Type.getName(), e2Type.getName());
                    else
                        _localctx.setType(symbolTable.getTypes().getIntType());

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    System.out.println("17");
                    setState(144); match(T__13);
                    setState(145);


                    Token t1=getCurrentToken();
                    Type e1Type = muldiv().getType();

                    setState(146);

                    Token t2=getCurrentToken();
                    Type e2Type = addsub2().getType();

                    if(! e1Type.getName().equals(symbolTable.getTypes().getIntType()) || ! e2Type.getName().equals(symbolTable.getTypes().getIntType()))
                        ErrorHandler.biopErr(t1,t2, e1Type.getName(), e2Type.getName());
                    else
                        _localctx.setType(symbolTable.getTypes().getIntType());

                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
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

    public static class MuldivContext extends ParserRuleContext {
        public VoiddContext voidd() {
            return getRuleContext(VoiddContext.class,0);
        }
        public Muldiv2Context muldiv2() {
            return getRuleContext(Muldiv2Context.class,0);
        }
        public MuldivContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_muldiv; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterMuldiv(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitMuldiv(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final MuldivContext muldiv() throws RecognitionException, Pass2Error {
        MuldivContext _localctx = new MuldivContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_muldiv);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(151);
                _localctx.setType(voidd().getType());
                setState(152);
                Type mulType=muldiv2().getType();
                if(mulType!=null)
                    _localctx.setType(symbolTable.getTypes().getIntType());
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

    public static class Muldiv2Context extends ParserRuleContext {
        public VoiddContext voidd() {
            return getRuleContext(VoiddContext.class,0);
        }
        public Muldiv2Context muldiv2() {
            return getRuleContext(Muldiv2Context.class,0);
        }
        public Muldiv2Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_muldiv2; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterMuldiv2(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitMuldiv2(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final Muldiv2Context muldiv2() throws RecognitionException, Pass2Error {
        Muldiv2Context _localctx = new Muldiv2Context(_ctx, getState());
        enterRule(_localctx, 24, RULE_muldiv2);
        try {
            setState(165);
            switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    //System.out.println("18");
                    setState(155); match(T__12);
                    setState(156);

                    Token t1=getCurrentToken();
                    Type e1Type = voidd().getType();

                    setState(157);

                    Token t2=getCurrentToken();
                    Type e2Type = muldiv2().getType();

                    if(! e1Type.getName().equals(symbolTable.getTypes().getIntType()) || ! e2Type.getName().equals(symbolTable.getTypes().getIntType()))
                        ErrorHandler.biopErr(t1,t2, e1Type.getName(), e2Type.getName());
                    else
                        _localctx.setType(symbolTable.getTypes().getIntType());

                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    //System.out.println("19");
                    setState(160); match(T__3);
                    setState(161);

                    Token t1=getCurrentToken();
                    Type e1Type = voidd().getType();

                    setState(162);

                    Token t2=getCurrentToken();
                    Type e2Type = muldiv2().getType();
                    if(! e1Type.getName().equals(symbolTable.getTypes().getIntType()) || ! e2Type.getName().equals(symbolTable.getTypes().getIntType()))
                        ErrorHandler.biopErr(t1, t2, e1Type.getName(), e2Type.getName());
                    else
                        _localctx.setType(symbolTable.getTypes().getIntType());

                }
                break;
                case 3:
                    enterOuterAlt(_localctx, 3);
                {
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

    public static class VoiddContext extends ParserRuleContext {
        public TerminalNode ISVOID() { return getToken(pass2Parser.ISVOID, 0); }
        public TargetContext target() {
            return getRuleContext(TargetContext.class,0);
        }
        public VoiddContext voidd() {
            return getRuleContext(VoiddContext.class,0);
        }
        public VoiddContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_voidd; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterVoidd(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitVoidd(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final VoiddContext voidd() throws RecognitionException, Pass2Error {
        VoiddContext _localctx = new VoiddContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_voidd);
        try {
            setState(171);
            switch (_input.LA(1)) {
                case ISVOID:
                    enterOuterAlt(_localctx, 1);
                {
                    //System.out.println("15");
                    setState(168); match(ISVOID);
                    setState(169); voidd();
                    _localctx.setType(symbolTable.getTypes().getBoolType());
                }
                break;
                case T__10:
                case T__4:
                case T__2:
                case IF:
                case LET:
                case WHILE:
                case CASE:
                case NEW:
                case TRUE:
                case FALSE:
                case INTEGER:
                case OBJECT:
                case STRING:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(170);
                    _localctx.setType(target().getType());
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

    public static class TargetContext extends ParserRuleContext {
        public TargetContext target() {
            return getRuleContext(TargetContext.class,0);
        }
        public CallContext call() {
            return getRuleContext(CallContext.class,0);
        }
        public TargetContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_target; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterTarget(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitTarget(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final TargetContext target() throws RecognitionException, Pass2Error {
        TargetContext _localctx = new TargetContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_target);
        try {
            setState(177);
            switch (_input.LA(1)) {
                case T__2:
                    enterOuterAlt(_localctx, 1);
                {
                    //System.out.println("20");
                    setState(174); match(T__2);
                    setState(175);

                    Type targetType=target().getType();
                    if(! targetType.getName().equals("Int"))
                        ErrorHandler.unopErr(getCurrentToken(),"Int");
                    else
                        _localctx.setType(symbolTable.getTypes().getIntType());
                }
                break;
                case T__10:
                case T__4:
                case IF:
                case LET:
                case WHILE:
                case CASE:
                case NEW:
                case TRUE:
                case FALSE:
                case INTEGER:
                case OBJECT:
                case STRING:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(176);
                    _localctx.setType(call().getType());
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

    public static class CallContext extends ParserRuleContext {
        public Call2Context call2() {
            return getRuleContext(Call2Context.class,0);
        }
        public FuncContext func() {
            return getRuleContext(FuncContext.class,0);
        }
        public CallContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_call; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterCall(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitCall(this);
        }


        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final CallContext call() throws RecognitionException, Pass2Error {
        CallContext _localctx = new CallContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_call);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(179);

                Type callerType=func().getType();

                setState(180);

                Type ret=call2(callerType).getType();
                if(ret==null)
                    _localctx.setType(callerType);
                else
                    _localctx.setType(ret);
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

    public static class Call2Context extends ParserRuleContext {
        public TerminalNode OBJECT() { return getToken(pass2Parser.OBJECT, 0); }
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }
        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class,i);
        }
        public Call2Context call2(Type callerType) {
            return getRuleContext(Call2Context.class,0);
        }
        public TerminalNode TYPE() { return getToken(pass2Parser.TYPE, 0); }
        public Call2Context(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_call2; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterCall2(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitCall2(this);
        }
        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final Call2Context call2(Type callerType) throws RecognitionException, Pass2Error {
        Call2Context _localctx = new Call2Context(_ctx, getState());
        enterRule(_localctx, 32, RULE_call2);
        int _la;
        try {
            setState(203);
            switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    //System.out.println("7");
                    setState(185);
                    _la = _input.LA(1);
                    if (_la==T__9) {
                        {
                            setState(183); match(T__9);
                            setState(184);

                            Token token=getCurrentToken();
                            Type declaredrType=symbolTable.getTypes().getType(token.getText());
                            if(declaredrType==null)
                                ErrorHandler.noSuchType(token, true);
                            else if(! symbolTable.getTypes().isFather(declaredrType, callerType))
                                ErrorHandler.esm(getCurrentToken(), declaredrType, callerType);

                            match(TYPE);
                        }
                    }

                    setState(187); match(T__17);
                    setState(188);

                    Token token=getCurrentToken();
                    Method method=symbolTable.getTypes().getMethodDFS(callerType,token.getText());
                    if(method==null)
                        ErrorHandler.noSuchMethod(token);
                    else
                        _localctx.setType(method.returnType);
                    int ind=0;


                    match(OBJECT);
                    setState(189); match(T__10);
                    setState(198);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__4) | (1L << T__2) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << OBJECT) | (1L << STRING))) != 0)) {
                        {
                            setState(190);

                            Type argType= expr().getType();
                            if(! symbolTable.getTypes().isFather(method.getFormal(ind++).getType(), argType))
                                ErrorHandler.invalidArgType(getCurrentToken());

                            setState(195);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la==T__15) {
                                {
                                    {
                                        setState(191); match(T__15);
                                        setState(192);

                                        argType= expr().getType();
                                        if(! symbolTable.getTypes().isFather(method.getFormal(ind++).getType(), argType))
                                            ErrorHandler.invalidArgType(getCurrentToken());

                                    }
                                }
                                setState(197);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(200); match(T__18);
                    setState(201);

                    Type nextType=call2(_localctx.getType()).getType();
                    if(nextType!=null);
                        _localctx.setType(nextType);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
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

    public static class FuncContext extends ParserRuleContext {
        public TerminalNode OBJECT() { return getToken(pass2Parser.OBJECT, 0); }
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }
        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class,i);
        }
        public EndContext end() {
            return getRuleContext(EndContext.class,0);
        }
        public FuncContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_func; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterFunc(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitFunc(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final FuncContext func() throws RecognitionException, Pass2Error {
        FuncContext _localctx = new FuncContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_func);
        int _la;
        try {
            setState(220);
            switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
                case 1:
                    enterOuterAlt(_localctx, 1);
                {
                    //System.out.println("8");
                    setState(206);

                    Token token=getCurrentToken();
                    Method method=symbolTable.getTypes().getMethodDFS(symbolTable.getClassScope(),token.getText());
                    if(method==null)
                        ErrorHandler.noSuchMethod(token);
                    else
                        _localctx.setType(method.getReturnType());
                    int ind=0;

                    match(OBJECT);
                    setState(207); match(T__10);
                    setState(216);
                    _la = _input.LA(1);
                    if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__4) | (1L << T__2) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << OBJECT) | (1L << STRING))) != 0)) {
                        {
                            setState(208);

                            Type argType= expr().getType();
                            if(! symbolTable.getTypes().isFather(method.getFormal(ind++).getType(), argType))
                                ErrorHandler.invalidArgType(getCurrentToken());

                            setState(213);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                            while (_la==T__15) {
                                {
                                    {
                                        setState(209); match(T__15);
                                        setState(210);

                                        argType= expr().getType();
                                        if(! symbolTable.getTypes().isFather(method.getFormal(ind++).getType(), argType))
                                            ErrorHandler.invalidArgType(getCurrentToken());

                                    }
                                }
                                setState(215);
                                _errHandler.sync(this);
                                _la = _input.LA(1);
                            }
                        }
                    }

                    setState(218); match(T__18);
                }
                break;
                case 2:
                    enterOuterAlt(_localctx, 2);
                {
                    setState(219);
                    _localctx.setType(end().getType());
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

    public static class EndContext extends ParserRuleContext {
        public TerminalNode POOL() { return getToken(pass2Parser.POOL, 0); }
        public TerminalNode THEN() { return getToken(pass2Parser.THEN, 0); }
        public List<TerminalNode> OBJECT() { return getTokens(pass2Parser.OBJECT); }
        public TerminalNode TRUE() { return getToken(pass2Parser.TRUE, 0); }
        public TerminalNode FI() { return getToken(pass2Parser.FI, 0); }
        public TerminalNode LOOP() { return getToken(pass2Parser.LOOP, 0); }
        public TerminalNode TYPE(int i) {
            return getToken(pass2Parser.TYPE, i);
        }
        public TerminalNode IN() { return getToken(pass2Parser.IN, 0); }
        public TerminalNode WHILE() { return getToken(pass2Parser.WHILE, 0); }
        public TerminalNode IF() { return getToken(pass2Parser.IF, 0); }
        public TerminalNode NEW() { return getToken(pass2Parser.NEW, 0); }
        public TerminalNode LET() { return getToken(pass2Parser.LET, 0); }
        public List<ExprContext> expr() {
            return getRuleContexts(ExprContext.class);
        }
        public TerminalNode ELSE() { return getToken(pass2Parser.ELSE, 0); }
        public TerminalNode OBJECT(int i) {
            return getToken(pass2Parser.OBJECT, i);
        }
        public ExprContext expr(int i) {
            return getRuleContext(ExprContext.class,i);
        }
        public TerminalNode OF() { return getToken(pass2Parser.OF, 0); }
        public TerminalNode CASE() { return getToken(pass2Parser.CASE, 0); }
        public TerminalNode STRING() { return getToken(pass2Parser.STRING, 0); }
        public TerminalNode INTEGER() { return getToken(pass2Parser.INTEGER, 0); }
        public List<TerminalNode> TYPE() { return getTokens(pass2Parser.TYPE); }
        public TerminalNode FALSE() { return getToken(pass2Parser.FALSE, 0); }
        public TerminalNode ESAC() { return getToken(pass2Parser.ESAC, 0); }
        public EndContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }
        @Override public int getRuleIndex() { return RULE_end; }
        @Override
        public void enterRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).enterEnd(this);
        }
        @Override
        public void exitRule(ParseTreeListener listener) {
            if ( listener instanceof cool2Listener ) ((cool2Listener)listener).exitEnd(this);
        }

        public Type getType() {
            return type;
        }
        public void setType(Type type) {
            this.type = type;
        }
        private Type type;
    }

    public final EndContext end() throws RecognitionException, Pass2Error {
        EndContext _localctx = new EndContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_end);
        int _la;
        try {
            setState(308);
            switch (_input.LA(1)) {
                case IF:
                    enterOuterAlt(_localctx, 1);
                {
                    //System.out.println("9");
                    setState(223); match(IF);
                    setState(224);

                    Type condType=expr().getType();

                    /*System.out.println("TEST");
                    System.out.println(getCurrentToken().getLine());
                    System.out.println(getCurrentToken().getText());
                    if(condType==null)
                        System.out.println("Here");
                    System.out.println(condType.getName());
                    */

                    if(! condType.matchName("Bool"))
                        ErrorHandler.conditionErr(getCurrentToken());

                    setState(225); match(THEN);
                    setState(226);
                    Type thenType=expr().getType();
                    setState(227); match(ELSE);
                    setState(228);
                    Type elseType=expr().getType();
                    setState(229); match(FI);

                    _localctx.setType(symbolTable.getTypes().grandMate(elseType, thenType));
                }
                break;
                case WHILE:
                    enterOuterAlt(_localctx, 2);
                {
                    //System.out.println("10");
                    setState(232); match(WHILE);
                    setState(233);

                    Type condType=expr().getType();
                    if(! condType.matchName("Bool"))
                        ErrorHandler.conditionErr(getCurrentToken());

                    setState(234); match(LOOP);
                    setState(235); expr();
                    setState(236); match(POOL);
                    _localctx.setType(symbolTable.getTypes().getObjectType());
                }
                break;
                case T__4:
                    enterOuterAlt(_localctx, 3);
                {
                    //System.out.println("11");
                    setState(239); match(T__4);
                    setState(243);
                    _errHandler.sync(this);
                    _la = _input.LA(1);

                    Type expeType;
                    do {
                        {
                            {
                                setState(240);
                                expeType=expr().getType();
                                setState(241); match(T__6);
                            }
                        }
                        setState(245);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__4) | (1L << T__2) | (1L << IF) | (1L << ISVOID) | (1L << LET) | (1L << WHILE) | (1L << CASE) | (1L << NEW) | (1L << NOT) | (1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << OBJECT) | (1L << STRING))) != 0) );
                    setState(247); match(T__1);

                    _localctx.setType(expeType);
                }
                break;
                case LET:
                    enterOuterAlt(_localctx, 4);
                {
                    symbolTable.enterScope();
                    //System.out.println("12");
                    setState(250); match(LET);
                    setState(251);


                    Token token=getCurrentToken();
                    String id=token.getText();
                    if(id.equals("self"))
                        ErrorHandler.invalidSelfUsage(token, true);
                    //if(symbolTable.getMethodScope().formalExists(id))
                    //    ErrorHandler.invalidIdRedefined(token);

                    /*System.out.println("test");
                    System.out.println(token.getLine());
                    if(symbolTable.getMethodScope()==null)
                        System.out.println("here");
                    System.out.println(symbolTable.getMethodScope().getName());
                    */


                    match(OBJECT);
                    setState(252); match(T__11);
                    setState(253);

                    Type idType,exprType;
                    idType= symbolTable.getTypes().getType(getCurrentToken().getText());
                    symbolTable.addId(id, idType);

                    match(TYPE);
                    setState(256);
                    _la = _input.LA(1);
                    if (_la==T__0) {
                        {
                            setState(254); match(T__0);
                            setState(255);

                            exprType=expr().getType();
                            if(! symbolTable.getTypes().isFather(idType,exprType))
                                ErrorHandler.typeErr(token);
                        }
                    }

                    setState(268);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while (_la==T__15) {
                        {
                            {
                                setState(258); match(T__15);
                                setState(259);

                                token=getCurrentToken();
                                id=token.getText();
                                if(id.equals("self"))
                                    ErrorHandler.invalidSelfUsage(token, true);

                                //if(symbolTable.getMethodScope().formalExists(id))
                                //    ErrorHandler.invalidIdRedefined(token);

                                match(OBJECT);
                                setState(260); match(T__11);
                                setState(261);

                                idType= symbolTable.getTypes().getType(getCurrentToken().getText());
                                symbolTable.addId(id,idType);

                                match(TYPE);
                                setState(264);
                                _la = _input.LA(1);
                                if (_la==T__0) {
                                    {
                                        setState(262); match(T__0);
                                        setState(263);

                                        exprType=expr().getType();
                                        if(! symbolTable.getTypes().isFather(idType, exprType))
                                            ErrorHandler.typeErr(token);
                                    }
                                }

                            }
                        }
                        setState(270);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(271); match(IN);
                    setState(272);

                    _localctx.setType(expr().getType());
                    symbolTable.exitScope();
                }
                break;
                case CASE:
                    enterOuterAlt(_localctx, 5);
                {
                    symbolTable.enterScope();
                    //System.out.println("13");
                    setState(274); match(CASE);
                    setState(275);
                    expr();
                    //TODO expr isvoid ...
                    setState(276); match(OF);
                    setState(284);
                    _errHandler.sync(this);
                    _la = _input.LA(1);

                    do {
                        {
                            {
                                setState(277);

                                Token token=getCurrentToken();
                                String id=token.getText();
                                if(id.equals("self"))
                                    ErrorHandler.invalidSelfUsage(token, true);
                                //if(symbolTable.getMethodScope().formalExists(id))
                                //    ErrorHandler.invalidIdRedefined(getCurrentToken());

                                match(OBJECT);
                                setState(278); match(T__11);
                                setState(279);

                                Type idType= symbolTable.getTypes().getType(getCurrentToken().getText());
                                symbolTable.addId(id,idType);
                                //TODO what happened if repeted variable defined

                                match(TYPE);
                                setState(280); match(T__16);
                                setState(281);

                                Type exprType=expr().getType();
                                if (_localctx.getType()==null)
                                    _localctx.setType(exprType);
                                else
                                    _localctx.setType(symbolTable.getTypes().grandMate(exprType, _localctx.getType()));
                                setState(282); match(T__6);
                            }
                        }
                        setState(286);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    } while ( _la==OBJECT );
                    setState(288); match(ESAC);
                    symbolTable.exitScope();
                }
                break;
                case NEW:
                    enterOuterAlt(_localctx, 6);
                {
                    //System.out.println("14");
                    setState(291); match(NEW);
                    setState(292);

                    String declaredType=getCurrentToken().getText();
                    if(declaredType=="SELF_TYPE")
                        _localctx.setType(symbolTable.getClassScope());
                    else if(! symbolTable.getTypes().typeExists(declaredType))
                        ErrorHandler.noSuchType(getCurrentToken(),true);
                    else
                        _localctx.setType(symbolTable.getTypes().getType(declaredType));

                    match(TYPE);
                }
                break;
                case T__10:
                    enterOuterAlt(_localctx, 7);
                {
                    //System.out.println("25");
                    setState(294); match(T__10);
                    setState(295);
                    _localctx.setType(expr().getType());
                    setState(296); match(T__18);
                }
                break;
                case OBJECT:
                    enterOuterAlt(_localctx, 8);
                {
                    //System.out.println("26");
                    setState(299);

                    String id=getCurrentToken().getText();
                    if(id.equals("self"))
                        _localctx.setType(symbolTable.getClassScope());
                    else {
                        Type idType = symbolTable.lookup(id);
                        //TODO can self be attriute of class
                        if (idType == null) {
                            Attribute attribute = symbolTable.getTypes().getAttributeDFS(symbolTable.getClassScope(), id);
                            if (attribute == null)
                                ErrorHandler.noSuchVar(getCurrentToken());
                            else
                                _localctx.setType(attribute.getType());
                        }
                    }
                    match(OBJECT);
                }
                break;
                case INTEGER:
                    enterOuterAlt(_localctx, 9);
                {
                    //System.out.println("27");
                    setState(301);
                    _localctx.setType(symbolTable.getTypes().getType("Int"));
                    match(INTEGER);
                }
                break;
                case STRING:
                    enterOuterAlt(_localctx, 10);
                {
                    //System.out.println("28");
                    _localctx.setType(symbolTable.getTypes().getType("String"));
                    setState(303); match(STRING);
                }
                break;
                case TRUE:
                    enterOuterAlt(_localctx, 11);
                {
                    //System.out.println("29");
                    _localctx.setType(symbolTable.getTypes().getType("Bool"));
                    setState(305); match(TRUE);
                }
                break;
                case FALSE:
                    enterOuterAlt(_localctx, 12);
                {
                    //System.out.println("30");
                    _localctx.setType(symbolTable.getTypes().getType("Bool"));
                    setState(307); match(FALSE);
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
            "\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\61\u0139\4\2\t\2"+
                    "\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
                    "\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
                    "\4\23\t\23\4\24\t\24\3\2\3\2\3\3\3\3\3\3\3\3\6\3/\n\3\r\3\16\3\60\3\4"+
                    "\3\4\3\4\3\4\3\4\5\48\n\4\3\4\3\4\3\4\3\4\7\4>\n\4\f\4\16\4A\13\4\3\4"+
                    "\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5K\n\5\f\5\16\5N\13\5\5\5P\n\5\3\5\3\5"+
                    "\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5_\n\5\5\5a\n\5\3\6\3\6"+
                    "\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\5\7m\n\7\3\b\3\b\3\b\3\b\5\bs\n\b\3\t"+
                    "\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
                    "\n\5\n\u0088\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
                    "\f\3\f\5\f\u0098\n\f\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
                    "\16\3\16\3\16\3\16\5\16\u00a8\n\16\3\17\3\17\3\17\3\17\5\17\u00ae\n\17"+
                    "\3\20\3\20\3\20\3\20\5\20\u00b4\n\20\3\21\3\21\3\21\3\22\3\22\3\22\5\22"+
                    "\u00bc\n\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00c4\n\22\f\22\16\22\u00c7"+
                    "\13\22\5\22\u00c9\n\22\3\22\3\22\3\22\5\22\u00ce\n\22\3\23\3\23\3\23\3"+
                    "\23\3\23\3\23\7\23\u00d6\n\23\f\23\16\23\u00d9\13\23\5\23\u00db\n\23\3"+
                    "\23\3\23\5\23\u00df\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
                    "\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\6\24\u00f6"+
                    "\n\24\r\24\16\24\u00f7\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5"+
                    "\24\u0103\n\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u010b\n\24\7\24\u010d"+
                    "\n\24\f\24\16\24\u0110\13\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
                    "\24\3\24\3\24\3\24\3\24\6\24\u011f\n\24\r\24\16\24\u0120\3\24\3\24\3\24"+
                    "\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
                    "\3\24\3\24\3\24\5\24\u0137\n\24\3\24\2\2\25\2\4\6\b\n\f\16\20\22\24\26"+
                    "\30\32\34\36 \"$&\2\2\u014e\2(\3\2\2\2\4*\3\2\2\2\6\62\3\2\2\2\b`\3\2"+
                    "\2\2\nb\3\2\2\2\fl\3\2\2\2\16r\3\2\2\2\20t\3\2\2\2\22\u0087\3\2\2\2\24"+
                    "\u0089\3\2\2\2\26\u0097\3\2\2\2\30\u0099\3\2\2\2\32\u00a7\3\2\2\2\34\u00ad"+
                    "\3\2\2\2\36\u00b3\3\2\2\2 \u00b5\3\2\2\2\"\u00cd\3\2\2\2$\u00de\3\2\2"+
                    "\2&\u0136\3\2\2\2()\5\4\3\2)\3\3\2\2\2*.\b\3\1\2+,\5\6\4\2,-\7\17\2\2"+
                    "-/\3\2\2\2.+\3\2\2\2/\60\3\2\2\2\60.\3\2\2\2\60\61\3\2\2\2\61\5\3\2\2"+
                    "\2\62\63\b\4\1\2\63\64\7\30\2\2\64\67\7*\2\2\65\66\7\33\2\2\668\7*\2\2"+
                    "\67\65\3\2\2\2\678\3\2\2\289\3\2\2\29?\7\21\2\2:;\5\b\5\2;<\7\17\2\2<"+
                    ">\3\2\2\2=:\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2"+
                    "BC\7\24\2\2C\7\3\2\2\2DE\b\5\1\2EF\7+\2\2FO\7\13\2\2GL\5\n\6\2HI\7\6\2"+
                    "\2IK\5\n\6\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MP\3\2\2\2NL\3\2\2"+
                    "\2OG\3\2\2\2OP\3\2\2\2PQ\3\2\2\2QR\7\3\2\2RS\7\n\2\2ST\7*\2\2TU\7\21\2"+
                    "\2UV\5\f\7\2VW\7\24\2\2Wa\3\2\2\2XY\b\5\1\2YZ\7+\2\2Z[\7\n\2\2[^\7*\2"+
                    "\2\\]\7\25\2\2]_\5\f\7\2^\\\3\2\2\2^_\3\2\2\2_a\3\2\2\2`D\3\2\2\2`X\3"+
                    "\2\2\2a\t\3\2\2\2bc\b\6\1\2cd\7+\2\2de\7\n\2\2ef\7*\2\2f\13\3\2\2\2gh"+
                    "\b\7\1\2hi\7+\2\2ij\7\25\2\2jm\5\f\7\2km\5\16\b\2lg\3\2\2\2lk\3\2\2\2"+
                    "m\r\3\2\2\2no\b\b\1\2op\7&\2\2ps\5\16\b\2qs\5\20\t\2rn\3\2\2\2rq\3\2\2"+
                    "\2s\17\3\2\2\2tu\5\24\13\2uv\5\22\n\2v\21\3\2\2\2wx\b\n\1\2xy\7\r\2\2"+
                    "yz\5\24\13\2z{\5\22\n\2{\u0088\3\2\2\2|}\b\n\1\2}~\7\20\2\2~\177\5\24"+
                    "\13\2\177\u0080\5\22\n\2\u0080\u0088\3\2\2\2\u0081\u0082\b\n\1\2\u0082"+
                    "\u0083\7\16\2\2\u0083\u0084\5\24\13\2\u0084\u0085\5\22\n\2\u0085\u0088"+
                    "\3\2\2\2\u0086\u0088\3\2\2\2\u0087w\3\2\2\2\u0087|\3\2\2\2\u0087\u0081"+
                    "\3\2\2\2\u0087\u0086\3\2\2\2\u0088\23\3\2\2\2\u0089\u008a\5\30\r\2\u008a"+
                    "\u008b\5\26\f\2\u008b\25\3\2\2\2\u008c\u008d\b\f\1\2\u008d\u008e\7\7\2"+
                    "\2\u008e\u008f\5\30\r\2\u008f\u0090\5\26\f\2\u0090\u0098\3\2\2\2\u0091"+
                    "\u0092\b\f\1\2\u0092\u0093\7\b\2\2\u0093\u0094\5\30\r\2\u0094\u0095\5"+
                    "\26\f\2\u0095\u0098\3\2\2\2\u0096\u0098\3\2\2\2\u0097\u008c\3\2\2\2\u0097"+
                    "\u0091\3\2\2\2\u0097\u0096\3\2\2\2\u0098\27\3\2\2\2\u0099\u009a\5\34\17"+
                    "\2\u009a\u009b\5\32\16\2\u009b\31\3\2\2\2\u009c\u009d\b\16\1\2\u009d\u009e"+
                    "\7\t\2\2\u009e\u009f\5\34\17\2\u009f\u00a0\5\32\16\2\u00a0\u00a8\3\2\2"+
                    "\2\u00a1\u00a2\b\16\1\2\u00a2\u00a3\7\22\2\2\u00a3\u00a4\5\34\17\2\u00a4"+
                    "\u00a5\5\32\16\2\u00a5\u00a8\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7\u009c\3"+
                    "\2\2\2\u00a7\u00a1\3\2\2\2\u00a7\u00a6\3\2\2\2\u00a8\33\3\2\2\2\u00a9"+
                    "\u00aa\b\17\1\2\u00aa\u00ab\7\34\2\2\u00ab\u00ae\5\34\17\2\u00ac\u00ae"+
                    "\5\36\20\2\u00ad\u00a9\3\2\2\2\u00ad\u00ac\3\2\2\2\u00ae\35\3\2\2\2\u00af"+
                    "\u00b0\b\20\1\2\u00b0\u00b1\7\23\2\2\u00b1\u00b4\5\36\20\2\u00b2\u00b4"+
                    "\5 \21\2\u00b3\u00af\3\2\2\2\u00b3\u00b2\3\2\2\2\u00b4\37\3\2\2\2\u00b5"+
                    "\u00b6\5$\23\2\u00b6\u00b7\5\"\22\2\u00b7!\3\2\2\2\u00b8\u00bb\b\22\1"+
                    "\2\u00b9\u00ba\7\f\2\2\u00ba\u00bc\7*\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
                    "\3\2\2\2\u00bc\u00bd\3\2\2\2\u00bd\u00be\7\4\2\2\u00be\u00bf\7+\2\2\u00bf"+
                    "\u00c8\7\13\2\2\u00c0\u00c5\5\f\7\2\u00c1\u00c2\7\6\2\2\u00c2\u00c4\5"+
                    "\f\7\2\u00c3\u00c1\3\2\2\2\u00c4\u00c7\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c5"+
                    "\u00c6\3\2\2\2\u00c6\u00c9\3\2\2\2\u00c7\u00c5\3\2\2\2\u00c8\u00c0\3\2"+
                    "\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca\u00cb\7\3\2\2\u00cb"+
                    "\u00ce\5\"\22\2\u00cc\u00ce\3\2\2\2\u00cd\u00b8\3\2\2\2\u00cd\u00cc\3"+
                    "\2\2\2\u00ce#\3\2\2\2\u00cf\u00d0\b\23\1\2\u00d0\u00d1\7+\2\2\u00d1\u00da"+
                    "\7\13\2\2\u00d2\u00d7\5\f\7\2\u00d3\u00d4\7\6\2\2\u00d4\u00d6\5\f\7\2"+
                    "\u00d5\u00d3\3\2\2\2\u00d6\u00d9\3\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8"+
                    "\3\2\2\2\u00d8\u00db\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00d2\3\2\2\2\u00da"+
                    "\u00db\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\7\3\2\2\u00dd\u00df\5&"+
                    "\24\2\u00de\u00cf\3\2\2\2\u00de\u00dd\3\2\2\2\u00df%\3\2\2\2\u00e0\u00e1"+
                    "\b\24\1\2\u00e1\u00e2\7\26\2\2\u00e2\u00e3\5\f\7\2\u00e3\u00e4\7 \2\2"+
                    "\u00e4\u00e5\5\f\7\2\u00e5\u00e6\7\31\2\2\u00e6\u00e7\5\f\7\2\u00e7\u00e8"+
                    "\7\27\2\2\u00e8\u0137\3\2\2\2\u00e9\u00ea\b\24\1\2\u00ea\u00eb\7!\2\2"+
                    "\u00eb\u00ec\5\f\7\2\u00ec\u00ed\7\36\2\2\u00ed\u00ee\5\f\7\2\u00ee\u00ef"+
                    "\7\37\2\2\u00ef\u0137\3\2\2\2\u00f0\u00f1\b\24\1\2\u00f1\u00f5\7\21\2"+
                    "\2\u00f2\u00f3\5\f\7\2\u00f3\u00f4\7\17\2\2\u00f4\u00f6\3\2\2\2\u00f5"+
                    "\u00f2\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f5\3\2\2\2\u00f7\u00f8\3\2"+
                    "\2\2\u00f8\u00f9\3\2\2\2\u00f9\u00fa\7\24\2\2\u00fa\u0137\3\2\2\2\u00fb"+
                    "\u00fc\b\24\1\2\u00fc\u00fd\7\35\2\2\u00fd\u00fe\7+\2\2\u00fe\u00ff\7"+
                    "\n\2\2\u00ff\u0102\7*\2\2\u0100\u0101\7\25\2\2\u0101\u0103\5\f\7\2\u0102"+
                    "\u0100\3\2\2\2\u0102\u0103\3\2\2\2\u0103\u010e\3\2\2\2\u0104\u0105\7\6"+
                    "\2\2\u0105\u0106\7+\2\2\u0106\u0107\7\n\2\2\u0107\u010a\7*\2\2\u0108\u0109"+
                    "\7\25\2\2\u0109\u010b\5\f\7\2\u010a\u0108\3\2\2\2\u010a\u010b\3\2\2\2"+
                    "\u010b\u010d\3\2\2\2\u010c\u0104\3\2\2\2\u010d\u0110\3\2\2\2\u010e\u010c"+
                    "\3\2\2\2\u010e\u010f\3\2\2\2\u010f\u0111\3\2\2\2\u0110\u010e\3\2\2\2\u0111"+
                    "\u0112\7\32\2\2\u0112\u0137\5\f\7\2\u0113\u0114\b\24\1\2\u0114\u0115\7"+
                    "\"\2\2\u0115\u0116\5\f\7\2\u0116\u011e\7%\2\2\u0117\u0118\7+\2\2\u0118"+
                    "\u0119\7\n\2\2\u0119\u011a\7*\2\2\u011a\u011b\7\5\2\2\u011b\u011c\5\f"+
                    "\7\2\u011c\u011d\7\17\2\2\u011d\u011f\3\2\2\2\u011e\u0117\3\2\2\2\u011f"+
                    "\u0120\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0122\3\2"+
                    "\2\2\u0122\u0123\7#\2\2\u0123\u0137\3\2\2\2\u0124\u0125\b\24\1\2\u0125"+
                    "\u0126\7$\2\2\u0126\u0137\7*\2\2\u0127\u0128\b\24\1\2\u0128\u0129\7\13"+
                    "\2\2\u0129\u012a\5\f\7\2\u012a\u012b\7\3\2\2\u012b\u0137\3\2\2\2\u012c"+
                    "\u012d\b\24\1\2\u012d\u0137\7+\2\2\u012e\u012f\b\24\1\2\u012f\u0137\7"+
                    ")\2\2\u0130\u0131\b\24\1\2\u0131\u0137\7.\2\2\u0132\u0133\b\24\1\2\u0133"+
                    "\u0137\7\'\2\2\u0134\u0135\b\24\1\2\u0135\u0137\7(\2\2\u0136\u00e0\3\2"+
                    "\2\2\u0136\u00e9\3\2\2\2\u0136\u00f0\3\2\2\2\u0136\u00fb\3\2\2\2\u0136"+
                    "\u0113\3\2\2\2\u0136\u0124\3\2\2\2\u0136\u0127\3\2\2\2\u0136\u012c\3\2"+
                    "\2\2\u0136\u012e\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0132\3\2\2\2\u0136"+
                    "\u0134\3\2\2\2\u0137\'\3\2\2\2\35\60\67?LO^`lr\u0087\u0097\u00a7\u00ad"+
                    "\u00b3\u00bb\u00c5\u00c8\u00cd\u00d7\u00da\u00de\u00f7\u0102\u010a\u010e"+
                    "\u0120\u0136";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}