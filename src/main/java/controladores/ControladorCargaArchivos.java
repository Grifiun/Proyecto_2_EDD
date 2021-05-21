/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import clasesDAO.TokenError;
import gramatica.LexerLectura;
import gramatica.ParserLectura;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.text.Normalizer;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 50234
 */
@WebServlet(name = "ControladorCargaArchivos", urlPatterns = {"/ControladorCargaArchivos"})
public class ControladorCargaArchivos extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String salida = "Analizando...";
        try ( PrintWriter out = response.getWriter()) {
            // TODO output your page here. You may use following sample code. 
            
            try{
                String entrada = request.getParameter("texto");                     
                //Palabra descorrompida
                String palabraOriginal = new String(entrada.getBytes("ISO-8859-1"), "UTF-8");
                //Entrada sin marcas diacriticas
                String normalized_string = Normalizer.normalize(palabraOriginal, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");

                StringReader sr = new StringReader(normalized_string);
                LexerLectura lexer = new LexerLectura(sr);
                ParserLectura pars = new ParserLectura(lexer);
                try{                        
                    pars.parse();                       
                    String errores = "";
                    ArrayList<TokenError> listadoErroresLexicos = lexer.obtenerListadoErroresLexicos();
                    ArrayList<TokenError> listadoErroresSintacticos = pars.getListadoErroresSintacticos();
                    
                    
                    try{
                        for(TokenError te: listadoErroresLexicos){
                            errores += te.getTipoToken()+" Linea"+te.getLinea()+" Columna: "+te.getColumna()+" Lexema :"+te.getLexema()+" Mensaje: "+te.getMsgError() + "\n";                                                     
                        }
                    }catch(Exception ex){
                        
                    }
                    try{
                        for(TokenError te: listadoErroresSintacticos){                          
                            errores += te.getTipoToken()+" Linea"+te.getLinea()+" Columna: "+te.getColumna()+" Lexema :"+te.getLexema()+" Mensaje: "+te.getMsgError() + "\n";                            
                        }                        
                    }catch(Exception ex){ 
                        
                    }
                   
                    //Guardamos si no hay errires}
                    if(errores.equals("")){
                        errores = "Sin errores de compilacion";
                    }
                    
                    //mostramos errores
                    System.out.println(errores); 
                    //System.out.println(pars.getContenidoScripting());
                    salida = errores;
                    
                }catch(Exception ex){
                    System.out.println("Error en el lenguajes de lectura: "+ex.getMessage());
                    ex.printStackTrace();
                }

                System.out.println(" Parser Ejecutado");
                request.getSession().setAttribute("entrada", normalized_string);
                request.getSession().setAttribute("salida", salida);
                               
            }catch(Exception ex){
                System.out.println("Error al ejecutar el parser: "+ex.getLocalizedMessage());
            }finally{
                request.getSession().setAttribute("mensajeError", "recibido");     
                String direccion = "jsp/ide.jsp";
                response.sendRedirect(direccion);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
