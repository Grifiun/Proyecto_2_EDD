
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package gramatica;

import java_cup.runtime.*;
import gramatica.ParserLecturaSym;
import gramatica.LexerLectura;
import java_cup.runtime.XMLElement;
import clasesDAO.*;
import java.util.ArrayList;
import java.util.List;
import instancias.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class ParserLectura extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return ParserLecturaSym.class;
}

  /** Default constructor. */
  @Deprecated
  public ParserLectura() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public ParserLectura(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public ParserLectura(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\033\000\002\002\004\000\002\002\004\000\002\002" +
    "\002\000\002\003\003\000\002\003\003\000\002\003\003" +
    "\000\002\003\003\000\002\003\003\000\002\003\003\000" +
    "\002\003\003\000\002\003\003\000\002\004\015\000\002" +
    "\005\007\000\002\006\013\000\002\007\015\000\002\010" +
    "\013\000\002\011\013\000\002\012\023\000\002\013\015" +
    "\000\002\016\003\000\002\017\003\000\002\020\003\000" +
    "\002\020\003\000\002\014\003\000\002\014\003\000\002" +
    "\014\003\000\002\015\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\142\000\022\002\uffff\010\uffff\011\uffff\012\uffff\013" +
    "\uffff\014\uffff\015\uffff\016\uffff\001\002\000\022\002\013" +
    "\010\007\011\016\012\014\013\015\014\020\015\021\016" +
    "\005\001\002\000\004\004\116\001\002\000\022\002\ufff7" +
    "\010\ufff7\011\ufff7\012\ufff7\013\ufff7\014\ufff7\015\ufff7\016" +
    "\ufff7\001\002\000\004\004\101\001\002\000\022\002\ufffc" +
    "\010\ufffc\011\ufffc\012\ufffc\013\ufffc\014\ufffc\015\ufffc\016" +
    "\ufffc\001\002\000\022\002\ufffb\010\ufffb\011\ufffb\012\ufffb" +
    "\013\ufffb\014\ufffb\015\ufffb\016\ufffb\001\002\000\022\002" +
    "\ufffa\010\ufffa\011\ufffa\012\ufffa\013\ufffa\014\ufffa\015\ufffa" +
    "\016\ufffa\001\002\000\004\002\001\001\002\000\004\004" +
    "\071\001\002\000\004\004\057\001\002\000\004\004\053" +
    "\001\002\000\022\002\ufffd\010\ufffd\011\ufffd\012\ufffd\013" +
    "\ufffd\014\ufffd\015\ufffd\016\ufffd\001\002\000\004\004\043" +
    "\001\002\000\004\004\026\001\002\000\022\002\000\010" +
    "\000\011\000\012\000\013\000\014\000\015\000\016\000" +
    "\001\002\000\022\002\ufffe\010\ufffe\011\ufffe\012\ufffe\013" +
    "\ufffe\014\ufffe\015\ufffe\016\ufffe\001\002\000\022\002\ufff8" +
    "\010\ufff8\011\ufff8\012\ufff8\013\ufff8\014\ufff8\015\ufff8\016" +
    "\ufff8\001\002\000\022\002\ufff9\010\ufff9\011\ufff9\012\ufff9" +
    "\013\ufff9\014\ufff9\015\ufff9\016\ufff9\001\002\000\004\022" +
    "\027\001\002\000\006\005\uffe7\007\uffe7\001\002\000\004" +
    "\007\031\001\002\000\010\014\036\020\033\021\034\001" +
    "\002\000\004\007\037\001\002\000\006\005\uffe9\007\uffe9" +
    "\001\002\000\006\005\uffea\007\uffea\001\002\000\006\005" +
    "\uffee\007\uffee\001\002\000\006\005\uffe8\007\uffe8\001\002" +
    "\000\010\014\036\020\033\021\034\001\002\000\004\005" +
    "\041\001\002\000\004\006\042\001\002\000\022\002\ufff1" +
    "\010\ufff1\011\ufff1\012\ufff1\013\ufff1\014\ufff1\015\ufff1\016" +
    "\ufff1\001\002\000\010\014\036\020\033\021\034\001\002" +
    "\000\004\007\045\001\002\000\004\022\027\001\002\000" +
    "\004\007\047\001\002\000\004\022\027\001\002\000\004" +
    "\005\051\001\002\000\004\006\052\001\002\000\022\002" +
    "\ufff2\010\ufff2\011\ufff2\012\ufff2\013\ufff2\014\ufff2\015\ufff2" +
    "\016\ufff2\001\002\000\010\014\036\020\033\021\034\001" +
    "\002\000\004\005\055\001\002\000\004\006\056\001\002" +
    "\000\022\002\ufff5\010\ufff5\011\ufff5\012\ufff5\013\ufff5\014" +
    "\ufff5\015\ufff5\016\ufff5\001\002\000\004\022\027\001\002" +
    "\000\004\007\061\001\002\000\010\014\036\020\033\021" +
    "\034\001\002\000\004\007\063\001\002\000\004\022\027" +
    "\001\002\000\004\007\065\001\002\000\004\022\027\001" +
    "\002\000\004\005\067\001\002\000\004\006\070\001\002" +
    "\000\022\002\ufff3\010\ufff3\011\ufff3\012\ufff3\013\ufff3\014" +
    "\ufff3\015\ufff3\016\ufff3\001\002\000\010\014\036\020\033" +
    "\021\034\001\002\000\004\007\073\001\002\000\004\022" +
    "\027\001\002\000\004\007\075\001\002\000\004\022\027" +
    "\001\002\000\004\005\077\001\002\000\004\006\100\001" +
    "\002\000\022\002\ufff4\010\ufff4\011\ufff4\012\ufff4\013\ufff4" +
    "\014\ufff4\015\ufff4\016\ufff4\001\002\000\004\022\027\001" +
    "\002\000\004\007\103\001\002\000\010\014\036\020\033" +
    "\021\034\001\002\000\004\007\105\001\002\000\010\014" +
    "\036\020\033\021\034\001\002\000\004\007\110\001\002" +
    "\000\004\007\uffed\001\002\000\006\014\112\020\111\001" +
    "\002\000\004\005\uffec\001\002\000\004\005\uffeb\001\002" +
    "\000\004\005\114\001\002\000\004\006\115\001\002\000" +
    "\022\002\ufff6\010\ufff6\011\ufff6\012\ufff6\013\ufff6\014\ufff6" +
    "\015\ufff6\016\ufff6\001\002\000\004\022\027\001\002\000" +
    "\004\007\120\001\002\000\012\014\036\020\033\021\034" +
    "\022\027\001\002\000\004\007\137\001\002\000\004\007" +
    "\123\001\002\000\004\022\027\001\002\000\004\007\125" +
    "\001\002\000\004\022\027\001\002\000\004\007\127\001" +
    "\002\000\004\022\027\001\002\000\004\007\131\001\002" +
    "\000\004\022\027\001\002\000\004\007\133\001\002\000" +
    "\004\022\027\001\002\000\004\005\135\001\002\000\004" +
    "\006\136\001\002\000\022\002\ufff0\010\ufff0\011\ufff0\012" +
    "\ufff0\013\ufff0\014\ufff0\015\ufff0\016\ufff0\001\002\000\004" +
    "\022\027\001\002\000\004\007\141\001\002\000\004\022" +
    "\027\001\002\000\004\005\143\001\002\000\004\006\144" +
    "\001\002\000\022\002\uffef\010\uffef\011\uffef\012\uffef\013" +
    "\uffef\014\uffef\015\uffef\016\uffef\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\142\000\004\002\003\001\001\000\024\003\021\004" +
    "\022\005\016\006\007\007\010\010\011\011\024\012\023" +
    "\013\005\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\004\015\027\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\014\034\016" +
    "\031\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\014" +
    "\037\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\014\034\016\043\001\001\000\002\001" +
    "\001\000\004\015\045\001\001\000\002\001\001\000\004" +
    "\015\047\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\006\014\034\016\053\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\015" +
    "\057\001\001\000\002\001\001\000\006\014\034\016\061" +
    "\001\001\000\002\001\001\000\004\015\063\001\001\000" +
    "\002\001\001\000\004\015\065\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\014\034\016" +
    "\071\001\001\000\002\001\001\000\004\015\073\001\001" +
    "\000\002\001\001\000\004\015\075\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\004\015\101" +
    "\001\001\000\002\001\001\000\006\014\034\016\103\001" +
    "\001\000\002\001\001\000\006\014\106\017\105\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\020\112\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\015\116\001" +
    "\001\000\002\001\001\000\006\014\121\015\120\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\015\123\001" +
    "\001\000\002\001\001\000\004\015\125\001\001\000\002" +
    "\001\001\000\004\015\127\001\001\000\002\001\001\000" +
    "\004\015\131\001\001\000\002\001\001\000\004\015\133" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\004\015\137\001\001\000\002\001\001\000\004" +
    "\015\141\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$ParserLectura$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$ParserLectura$actions(this);
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
    return action_obj.CUP$ParserLectura$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    //Listado de errores	
	//Controlador de error sintactico
    ArrayList<TokenError> listadoErroresSintacticos = new ArrayList();
	

	@Override
	public void syntax_error(Symbol a){
		Token tokenError = (Token) a.value;//lo transformamos en token para obtener su lexema, fila y columna		
		String msgError = "Se esperaba: ";	
		
                
		int linea = (tokenError != null) ? tokenError.getLinea() : 0;
		int columna = (tokenError != null) ? tokenError.getColumna() : 0;
		
		if(a.sym == ParserLecturaSym.EOF){
			System.out.println("END OF FILE");
			TokenError tokenErrorAux = new TokenError("ERROR SINTACTICO", "Etiqueta de cierre", "La etiqueta de cierre debe ser ;", -1, -1);
			listadoErroresSintacticos.add(tokenErrorAux);
		}else{
			for(int i = 0; i < expected_token_ids().size(); i++){
				//msgError = msgError + mensajes[expected_token_ids().get(i)];
				msgError = msgError + symbl_name_from_id(expected_token_ids().get(i)) + " ";

				if(i < expected_token_ids().size() - 1)
					msgError = msgError + ", ";			
			}
			//System.out.println("error de sintaxis: linea: "+tokenError.getLexema()+" "+tokenError.getLinea()+" columna: "+tokenError.getColumna()+" MENSAJE: "+msgError);
			TokenError tokenErrorAux = new TokenError("ERROR SINTACTICO", tokenError.getLexema(), msgError, linea, columna);
			listadoErroresSintacticos.add(tokenErrorAux);
		}
		
	}
	
	public void report_error(String message, Object info) {
        System.out.println("Reportar Error");
    }
    
	public void report_fatal_error(String message, Object info) {
        System.out.println("Error Fatal: " + info);
    }

    protected int error_sync_size() {
        return 1;
    }
	
	public ArrayList<TokenError> getListadoErroresSintacticos(){
		return listadoErroresSintacticos;
	}

	public ParserLectura(LexerLectura lex){
        super(lex);
    }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$ParserLectura$actions {
  private final ParserLectura parser;

  /** Constructor */
  CUP$ParserLectura$actions(ParserLectura parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$ParserLectura$do_action_part00000000(
    int                        CUP$ParserLectura$act_num,
    java_cup.runtime.lr_parser CUP$ParserLectura$parser,
    java.util.Stack            CUP$ParserLectura$stack,
    int                        CUP$ParserLectura$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$ParserLectura$result;

      /* select the action based on the action number */
      switch (CUP$ParserLectura$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= s EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-1)).value;
		RESULT = start_val;
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-1)), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$ParserLectura$parser.done_parsing();
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // s ::= s carga_estructura_general 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-1)), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // s ::= 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("s",0, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // carga_estructura_general ::= carga_usuario 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_estructura_general",1, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // carga_estructura_general ::= carga_edificio 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_estructura_general",1, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // carga_estructura_general ::= carga_salon 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_estructura_general",1, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // carga_estructura_general ::= carga_curso 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_estructura_general",1, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // carga_estructura_general ::= carga_estudiante 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_estructura_general",1, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // carga_estructura_general ::= carga_catedratico 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_estructura_general",1, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // carga_estructura_general ::= carga_horario 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_estructura_general",1, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // carga_estructura_general ::= carga_asignar 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_estructura_general",1, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // carga_usuario ::= USUARIO PAREN_INI parametro_numero COMA parametro_nombre COMA parametro_password COMA parametro_tipo PAREN_FIN PUNTO_COMA 
            {
              Object RESULT =null;
		int inicioleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-9)).left;
		int inicioright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-9)).right;
		Token inicio = (Token)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-9)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-8)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-8)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-8)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-6)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-6)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-6)).value;
		int passwordleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-4)).left;
		int passwordright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-4)).right;
		String password = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-4)).value;
		int tipoleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).left;
		int tiporight = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).right;
		String tipo = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).value;
		
                        Usuario usuarioAux = new Usuario(id, name, password, tipo);
                        instancias.InstanciaEstructuraUsuarios.agregarUsuario(usuarioAux);                        
                        
                        if(instancias.InstanciaEstructuraUsuarios.buscarUsuario(id) == null){ 
                            String mensaje = "Error al crear el usuario <id: " + id + "> <nombre: " + name + ">";
                            TokenError tokenErrorAux = new TokenError("ERROR SEMANTICO", "Usuario", mensaje, inicio.getLinea(), inicio.getColumna());
			                listadoErroresSintacticos.add(tokenErrorAux);
                        }
                    
                    
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_usuario",2, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-10)), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // carga_edificio ::= EDIFICIO PAREN_INI parametro_nombre PAREN_FIN PUNTO_COMA 
            {
              Object RESULT =null;
		int inicioleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-3)).left;
		int inicioright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-3)).right;
		Token inicio = (Token)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-3)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).value;
		
                        Edificio edificioAux = new Edificio(name);
                        instancias.InstanciaEstructuraEdificios.agregarEdificio(edificioAux);
                                
                        if(instancias.InstanciaEstructuraEdificios.buscarEdificio(name) == null){           
                            String mensaje = "Error al crear el edificio <nombre: " + name + ">";
                            TokenError tokenErrorAux = new TokenError("ERROR SEMANTICO", "Edificio", mensaje, inicio.getLinea(), inicio.getColumna());
			                listadoErroresSintacticos.add(tokenErrorAux);
                        }else{
                            System.out.println("Edificio ingresado ");
                        }
                    
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_edificio",3, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-4)), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // carga_salon ::= SALON PAREN_INI parametro_nombre COMA parametro_numero COMA parametro_numero PAREN_FIN PUNTO_COMA 
            {
              Object RESULT =null;
		int inicioleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-7)).left;
		int inicioright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-7)).right;
		Token inicio = (Token)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-7)).value;
		int nameEdificioleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-6)).left;
		int nameEdificioright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-6)).right;
		String nameEdificio = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-6)).value;
		int numeroSalonleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-4)).left;
		int numeroSalonright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-4)).right;
		String numeroSalon = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-4)).value;
		int capacidadleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).left;
		int capacidadright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).right;
		String capacidad = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).value;
		
                        Salon salonAux = new Salon(nameEdificio, numeroSalon, capacidad);
                        String mensaje = "";
                        Edificio edificioAux = instancias.InstanciaEstructuraEdificios.buscarEdificio(nameEdificio);
                        if(edificioAux != null){
                            edificioAux.getListadoSalones().insertarNodo(salonAux, String.valueOf(salonAux.getNumero()));                    
                            if(edificioAux.getListadoSalones().buscarNodo(String.valueOf(salonAux.getNumero())) != null){//fue ingresado           
                                System.out.println("Salon ingresado: ");
                                mensaje = "";
                            }else{
                                mensaje = "Error al crear el salon "+numeroSalon;
                            }
                        }else{
                            mensaje = "El edificio con nombre "+ numeroSalon + " no existe";
                        }
                    
                        if(mensaje.equals("") == false){//hay error
                            TokenError tokenErrorAux = new TokenError("ERROR SEMANTICO", "Salon", mensaje, inicio.getLinea(), inicio.getColumna());
			                listadoErroresSintacticos.add(tokenErrorAux);

                        }
                    
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_salon",4, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-8)), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // carga_curso ::= CURSO PAREN_INI parametro_numero COMA parametro_nombre COMA parametro_numero COMA parametro_numero PAREN_FIN PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_curso",5, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-10)), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // carga_estudiante ::= ESTUDIANTE PAREN_INI parametro_nombre COMA parametro_numero COMA parametro_numero PAREN_FIN PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_estudiante",6, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-8)), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // carga_catedratico ::= CATEDRATICO PAREN_INI parametro_numero COMA parametro_nombre COMA parametro_alfanum PAREN_FIN PUNTO_COMA 
            {
              Object RESULT =null;
		int inicioleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-7)).left;
		int inicioright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-7)).right;
		Token inicio = (Token)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-7)).value;
		int idleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-6)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-6)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-6)).value;
		int nameleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-4)).left;
		int nameright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-4)).right;
		String name = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-4)).value;
		int direccionleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).left;
		int direccionright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).right;
		String direccion = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-2)).value;
		
                        Catedratico catedratico = new Catedratico(id, name, direccion);
                        instancias.InstanciaEstructuraCatedraticos.agregarCatedratico(catedratico);
                        
                        if(instancias.InstanciaEstructuraCatedraticos.buscarCatedratico(id) == null){                
                            String mensaje = "Error al crear el catedratico <id: " + id + "> <nombre: " + name + ">";
                            TokenError tokenErrorAux = new TokenError("ERROR SEMANTICO", "Catedratico", mensaje, inicio.getLinea(), inicio.getColumna());
			                listadoErroresSintacticos.add(tokenErrorAux);
                        }else{
                            System.out.println("CATEDRATICO INGRESADO: ");
                        }
                     
                    
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_catedratico",7, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-8)), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // carga_horario ::= HORARIO PAREN_INI parametro_numero COMA parametro_alfanum COMA parametro_numero COMA parametro_numero COMA parametro_numero COMA parametro_numero COMA parametro_numero PAREN_FIN PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_horario",8, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-16)), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // carga_asignar ::= HORARIO PAREN_INI parametro_numero COMA parametro_numero COMA parametro_numero COMA parametro_numero PAREN_FIN PUNTO_COMA 
            {
              Object RESULT =null;

              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("carga_asignar",9, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.elementAt(CUP$ParserLectura$top-10)), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // parametro_nombre ::= parametro_alfanum 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.peek()).value;
		 RESULT = a; 
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("parametro_nombre",12, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // parametro_password ::= parametro_alfanum 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.peek()).value;
		 RESULT = a; 
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("parametro_password",13, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // parametro_tipo ::= COLABORADOR 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).right;
		Token a = (Token)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.peek()).value;
		 RESULT = a.getLexema(); 
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("parametro_tipo",14, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // parametro_tipo ::= ESTUDIANTE 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).right;
		Token a = (Token)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.peek()).value;
		 RESULT = a.getLexema(); 
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("parametro_tipo",14, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // parametro_alfanum ::= ALFANUM 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).right;
		Token a = (Token)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.peek()).value;
		 RESULT = a.getLexema(); 
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("parametro_alfanum",10, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // parametro_alfanum ::= COLABORADOR 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).right;
		Token a = (Token)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.peek()).value;
		 RESULT = a.getLexema(); 
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("parametro_alfanum",10, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // parametro_alfanum ::= ESTUDIANTE 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).right;
		Token a = (Token)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.peek()).value;
		 RESULT = a.getLexema(); 
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("parametro_alfanum",10, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // parametro_numero ::= NUMERO 
            {
              String RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).left;
		int aright = ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()).right;
		Token a = (Token)((java_cup.runtime.Symbol) CUP$ParserLectura$stack.peek()).value;
		 RESULT = a.getLexema(); 
              CUP$ParserLectura$result = parser.getSymbolFactory().newSymbol("parametro_numero",11, ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), ((java_cup.runtime.Symbol)CUP$ParserLectura$stack.peek()), RESULT);
            }
          return CUP$ParserLectura$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$ParserLectura$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$ParserLectura$do_action(
    int                        CUP$ParserLectura$act_num,
    java_cup.runtime.lr_parser CUP$ParserLectura$parser,
    java.util.Stack            CUP$ParserLectura$stack,
    int                        CUP$ParserLectura$top)
    throws java.lang.Exception
    {
              return CUP$ParserLectura$do_action_part00000000(
                               CUP$ParserLectura$act_num,
                               CUP$ParserLectura$parser,
                               CUP$ParserLectura$stack,
                               CUP$ParserLectura$top);
    }
}

}