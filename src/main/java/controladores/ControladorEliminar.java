/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import clasesDAO.Edificio;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

/**
 *
 * @author 50234
 */
@WebServlet(name = "ControladorEliminar", urlPatterns = {"/ControladorEliminar"})
public class ControladorEliminar extends HttpServlet {

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
        String tipo = request.getParameter("tipo");        
        String index = request.getParameter("index");
        String edificioNombre = request.getSession().getAttribute("edificio").toString();
        
        String identificador = request.getSession().getAttribute("listado"+index).toString();
        System.out.println("Tipo : " + tipo);
        System.out.println("Index: " + index);
        System.out.println("ID: "+ identificador);
        switch(tipo){
            case "usuario":
                instancias.InstanciaEstructuraUsuarios.borrarUsuario(identificador);
                break;
            case "catedraticos":
                instancias.InstanciaEstructuraCatedraticos.borrarCatedratico(identificador);
                break;
            case "edificios":
                instancias.InstanciaEstructuraEdificios.borrarEdificio(identificador);
                break;
            case "salones":
                Edificio edificioAux = instancias.InstanciaEstructuraEdificios.buscarEdificio(edificioNombre);
                edificioAux.getListadoSalones().eliminarNodo(identificador);
                break;
            default://error ?
                break;
        
        }
        
        request.getSession().setAttribute("mensaje", "Entidad borrada");        
        String direccion = "";
        
        //direccion = "jsp/home-"+usuarioRol+".jsp";
        direccion = "jsp/home.jsp";
        response.sendRedirect(direccion);
        
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
