/*Primera seccion, librerias */
package gramatica;
import java_cup.runtime.*;
import static gramatica.ParserLecturaSym.*;
import clasesDAO.Token;
import clasesDAO.TokenError;
import java.util.ArrayList;

/*Segunda seccion, config*/
%%
%class LexerLectura
%cup
%cupdebug
%unicode
%line
%public
%column


%{
    //Creamos un listado de llos errores lexicos
    ArrayList<TokenError> listadoErroresLexicos = new ArrayList();

%}

%{
    //Funciones
    //retorna un simbolo despues de crear un nuevo token y agregarlo al listado
    private Symbol retornarSimbolo(int tipo, String tipoToken, String lexema, int fila, int columna){
        //creamos un  token auxiliar
        Token tokenAux = new Token(tipoToken, lexema, fila, columna);
        System.out.println("Fila: "+fila+" Columa: "+columna+" Token: "+tipoToken+ " Lexema: "+lexema);
        //retornamos el token aux como simbolo
        return new Symbol(tipo, tokenAux);
    }
    
    //Agregamos un token al array list de errores lexicos
    private void addErrorLexico(String tipoToken, String lexema, String msgError, int fila, int columna){
        //creamos un  token auxiliar
        TokenError tokenErrorAux = new TokenError(tipoToken, lexema, msgError, fila, columna);
        //Agregamos al listado
        listadoErroresLexicos.add(tokenErrorAux);
    }

    //Obtenemos el arrLust de los errores lexicos
    public ArrayList<TokenError> obtenerListadoErroresLexicos(){
        return listadoErroresLexicos;
    }
%}

//SEPARADORES
SEPARADORES = [ \r\t\b\f\n]

//SIMBOLOS
PAREN_INI    = "(";
PAREN_FIN    = ")";
PUNTO_COMA   = ";"; 
COMA         = ",";
//NODOS
USUARIO      = (USUARIO) | (Usuario) | (usuario);
EDIFICIO     = (EDIFICIO) | (Edificio) | (edificio);
SALON        = (SALON) | (Salon) | (salon) ;
CURSO        = (CURSO) | (curso) | (Curso);
ESTUDIANTE   = (ESTUDIANTE) | (Estudiante) | (estudiante);
CATEDRATICO  = (CATEDRATICO) | (catedratico) | (Catedratico);
HORARIO      = (HORARIO) | (horario) | (Horario);
ASIGNAR      = (ASIGNAR) | (Asignar) | (asignar);
//TIPO USUARIO
COLABORADOR  = (COLABORADOR) | (colaborador) | (Colaborador);

//DATA VALUES
INTEGER_VALUE = (0 | ([1-9] [0-9]*) ) //aceptamos 0 o un numero valido, es decir no aceptamos 0 a la izquierda
DECIMAL_VALUE = (0 | ([1-9] [0-9]*) ) (\. ([0-9]{1,3} [1-9]?)) //? Numero decimal, no aceptamos 0 como ultimo digito

//DATOS
TEXTO       = (\" | \“ |  \”)   ([\0-\41] | [\43-\134] | [\136-\176] | ("]" [\0-\40]* [a-zA-Z]) )+ (\" | \“ |  \”) 
ALFANUM     =  ([a-zA-Z0-9]+);

%%

/*Tercera accion, expresiones*/
<YYINITIAL>{
    //SIMBOLOS
    {PAREN_INI       }           { return retornarSimbolo(PAREN_INI       , "PAREN_INI"       , yytext(), yyline + 1, yycolumn + 1); }    
    {PAREN_FIN       }           { return retornarSimbolo(PAREN_FIN       , "PAREN_FIN"       , yytext(), yyline + 1, yycolumn + 1); }
    {PUNTO_COMA      }           { return retornarSimbolo(PUNTO_COMA      , "PUNTO_COMA"      , yytext(), yyline + 1, yycolumn + 1); }
    {COMA            }           { return retornarSimbolo(COMA            , "COMA"            , yytext(), yyline + 1, yycolumn + 1); }  

    //NODOS
    {USUARIO        }           { return retornarSimbolo(USUARIO          , "USUARIO"         , yytext(), yyline + 1, yycolumn + 1); }    
    {EDIFICIO       }           { return retornarSimbolo(EDIFICIO         , "EDIFICIO"        , yytext(), yyline + 1, yycolumn + 1); }    
    {SALON          }           { return retornarSimbolo(SALON            , "SALON"           , yytext(), yyline + 1, yycolumn + 1); }    
    {CURSO          }           { return retornarSimbolo(CURSO            , "CURSO"           , yytext(), yyline + 1, yycolumn + 1); }    
    {ESTUDIANTE     }           { return retornarSimbolo(ESTUDIANTE       , "ESTUDIANTE"      , yytext(), yyline + 1, yycolumn + 1); }    
    {CATEDRATICO    }           { return retornarSimbolo(CATEDRATICO      , "CATEDRATICO"     , yytext(), yyline + 1, yycolumn + 1); }    
    {HORARIO        }           { return retornarSimbolo(HORARIO          , "HORARIO"         , yytext(), yyline + 1, yycolumn + 1); }    
    {ASIGNAR        }           { return retornarSimbolo(ASIGNAR          , "ASIGNAR"         , yytext(), yyline + 1, yycolumn + 1); }    
    
    {COLABORADOR    }           { return retornarSimbolo(COLABORADOR      , "COLABORADOR"     , yytext(), yyline + 1, yycolumn + 1); }    
       
    //DATA VALUES
    {DECIMAL_VALUE} | {INTEGER_VALUE}   { return retornarSimbolo(NUMERO   , "NUMERO"          , yytext(), yyline + 1, yycolumn + 1); }
    {TEXTO} | {ALFANUM}           { return retornarSimbolo(ALFANUM          , "ALFANUM"         , yytext().replaceAll("“","\"").replaceAll("”","\""), yyline + 1, yycolumn + 1); } 

    //{}           { return retornarSimbolo(HEX, "HEX" , yytext(), yyline + 1, yycolumn + 1); }
    
    {SEPARADORES }           { /*                                                                                     */ }
}

[^] { addErrorLexico ("LEXICO", yytext(), "Token no valido", yyline + 1, yycolumn + 1);}





