
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package Analizadores;

import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;
import Analizadores.ErrorCom;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserCompilar extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public ParserCompilar() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ParserCompilar(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserCompilar(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\016\000\002\002\004\000\002\006\002\000\002\002" +
    "\010\000\002\002\002\000\002\003\005\000\002\003\005" +
    "\000\002\003\003\000\002\004\005\000\002\004\005\000" +
    "\002\004\003\000\002\005\005\000\002\005\003\000\002" +
    "\005\003\000\002\005\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\006\002\ufffe\014\004\001\002\000\004\013" +
    "\007\001\002\000\004\002\006\001\002\000\004\002\001" +
    "\001\002\000\012\005\011\010\014\014\012\015\010\001" +
    "\002\000\016\004\ufff5\005\ufff5\006\ufff5\007\ufff5\011\ufff5" +
    "\012\ufff5\001\002\000\004\015\034\001\002\000\016\004" +
    "\ufff6\005\ufff6\006\ufff6\007\ufff6\011\ufff6\012\ufff6\001\002" +
    "\000\016\004\ufff8\005\ufff8\006\ufff8\007\ufff8\011\ufff8\012" +
    "\ufff8\001\002\000\012\005\011\010\014\014\012\015\010" +
    "\001\002\000\016\004\ufffb\005\ufffb\006\023\007\024\011" +
    "\ufffb\012\ufffb\001\002\000\010\004\021\005\020\012\017" +
    "\001\002\000\006\002\000\014\000\001\002\000\012\005" +
    "\011\010\014\014\012\015\010\001\002\000\012\005\011" +
    "\010\014\014\012\015\010\001\002\000\016\004\ufffd\005" +
    "\ufffd\006\023\007\024\011\ufffd\012\ufffd\001\002\000\012" +
    "\005\011\010\014\014\012\015\010\001\002\000\012\005" +
    "\011\010\014\014\012\015\010\001\002\000\016\004\ufff9" +
    "\005\ufff9\006\ufff9\007\ufff9\011\ufff9\012\ufff9\001\002\000" +
    "\016\004\ufffa\005\ufffa\006\ufffa\007\ufffa\011\ufffa\012\ufffa" +
    "\001\002\000\016\004\ufffc\005\ufffc\006\023\007\024\011" +
    "\ufffc\012\ufffc\001\002\000\006\002\ufffe\014\004\001\002" +
    "\000\004\002\uffff\001\002\000\010\004\021\005\020\011" +
    "\033\001\002\000\016\004\ufff7\005\ufff7\006\ufff7\007\ufff7" +
    "\011\ufff7\012\ufff7\001\002\000\016\004\ufff4\005\ufff4\006" +
    "\ufff4\007\ufff4\011\ufff4\012\ufff4\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\032\000\004\002\004\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\003\015\004\014" +
    "\005\012\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\010\003\031\004\014" +
    "\005\012\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\006\027\001\001\000\006\004\026\005\012\001\001" +
    "\000\006\004\021\005\012\001\001\000\002\001\001\000" +
    "\004\005\025\001\001\000\004\005\024\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\002" +
    "\030\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserCompilar$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserCompilar$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$ParserCompilar$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




    private List<ErrorCom> erroresCom; 
    private int numExp;

	public ParserCompilar(LexerCompilar lex) {
		super(lex);
        this.erroresCom = lex.getErroresCom();     
        this.numExp = 1;
	}

    /**
     * Método al que se llama automáticamente ante algún error sintactico.
     **/ 
    public void syntax_error(Symbol s){ 
        erroresCom.add(new ErrorCom("Sintactico","No se esperaba Componente",String.valueOf(s.left),String.valueOf(s.right),String.valueOf(s.value)));
    }

    /**
     * Método al que se llama automáticamente ante algún error sintáctico 
     * en el que ya no es posible una recuperación de errores.
     **/ 
    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
        erroresCom.add(new ErrorCom("Sintactico","Error sintactico Irrecuperable",String.valueOf(s.left),String.valueOf(s.right),String.valueOf(s.value)));
    }         
    /*---------Getters & Setters---------*/

    public List<ErrorCom> getErroresCom(){
        return this.erroresCom;
    }

    private void mostrarVal(String val1,String val2,String tipo){
        System.out.println("t"+this.numExp+" = " + val1 + tipo + val2);
        this.numExp++;
    }

    private void mostrarVal2(String val1){
        System.out.println("t"+this.numExp+" = "+"-"+val1);
        this.numExp++;
    }

    private String valT(){
        int val = this.numExp -1;
        return "t"+val;
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserCompilar$actions {
  private final ParserCompilar parser;

  /** Constructor */
  CUP$ParserCompilar$actions(ParserCompilar parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserCompilar$do_action_part00000000(
    int                        CUP$ParserCompilar$act_num,
    java_cup.runtime.lr_parser CUP$ParserCompilar$parser,
    java.util.Stack            CUP$ParserCompilar$stack,
    int                        CUP$ParserCompilar$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserCompilar$result;

      /* select the action based on the action number */
      switch (CUP$ParserCompilar$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)).value;
		RESULT = start_val;
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserCompilar$parser.done_parsing();
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // NT$0 ::= 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-3)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-3)).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-3)).value;
		int expleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)).right;
		Object exp = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)).value;
System.out.println(val + "=" + String.valueOf(exp));
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("NT$0",4, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // inicio ::= ID IGUAL expresion PUNTCOMA NT$0 inicio 
            {
              Object RESULT =null;
              // propagate RESULT from NT$0
                RESULT = (Object) ((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-5)).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-5)).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-5)).value;
		int expleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-3)).left;
		int expright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-3)).right;
		Object exp = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-3)).value;

              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-5)), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // inicio ::= 
            {
              Object RESULT =null;

              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expresion ::= expresion SUMA termino 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.peek()).value;
		mostrarVal(String.valueOf(val1),String.valueOf(val2),"+");RESULT=valT();
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // expresion ::= expresion RESTA termino 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.peek()).value;
		mostrarVal(String.valueOf(val1),String.valueOf(val2),"-");RESULT=valT();
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // expresion ::= termino 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.peek()).value;
		RESULT=val;
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("expresion",1, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // termino ::= termino MULT factor 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.peek()).value;
		mostrarVal(String.valueOf(val1),String.valueOf(val2),"*");RESULT=valT();
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("termino",2, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // termino ::= termino DIVI factor 
            {
              Object RESULT =null;
		int val1left = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).left;
		int val1right = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).right;
		Object val1 = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)).value;
		int val2left = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).left;
		int val2right = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).right;
		Object val2 = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.peek()).value;
		mostrarVal(String.valueOf(val1),String.valueOf(val2),"/");RESULT=valT();
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("termino",2, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // termino ::= factor 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.peek()).value;
		RESULT=val;
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("termino",2, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // factor ::= PARI expresion PARD 
            {
              Object RESULT =null;
		int exprleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)).left;
		int exprright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)).right;
		Object expr = (Object)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)).value;
		RESULT = String.valueOf(expr);
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("factor",3, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-2)), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // factor ::= ID 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.peek()).value;
		RESULT=val;
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("factor",3, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // factor ::= NUMERO 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.peek()).value;
		RESULT=val;
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("factor",3, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // factor ::= RESTA NUMERO 
            {
              Object RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()).right;
		String val = (String)((java_cup.runtime.Symbol) CUP$ParserCompilar$stack.peek()).value;
		mostrarVal2(String.valueOf(val));RESULT=valT();
              CUP$ParserCompilar$result = parser.getSymbolFactory().newSymbol("factor",3, ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.elementAt(CUP$ParserCompilar$top-1)), ((java_cup.runtime.Symbol)CUP$ParserCompilar$stack.peek()), RESULT);
            }
          return CUP$ParserCompilar$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserCompilar$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserCompilar$do_action(
    int                        CUP$ParserCompilar$act_num,
    java_cup.runtime.lr_parser CUP$ParserCompilar$parser,
    java.util.Stack            CUP$ParserCompilar$stack,
    int                        CUP$ParserCompilar$top)
    throws java.lang.Exception
    {
              return CUP$ParserCompilar$do_action_part00000000(
                               CUP$ParserCompilar$act_num,
                               CUP$ParserCompilar$parser,
                               CUP$ParserCompilar$stack,
                               CUP$ParserCompilar$top);
    }
}

}
