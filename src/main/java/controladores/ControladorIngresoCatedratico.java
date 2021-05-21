/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import clasesDAO.Catedratico;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 50234
 */
@WebServlet(name = "ControladorIngresoCatedratico", urlPatterns = {"/ControladorIngresoCatedratico"})
public class ControladorIngresoCatedratico extends HttpServlet {

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
        String mensaje = "Bienvenido";
        
        String id = request.getParameter("id");
        String name = request.getParameter("nombre");
        String direccion = request.getParameter("direccion"); 
        
        Catedratico catedratico = new Catedratico(id, name, direccion);
        instancias.InstanciaEstructuraCatedraticos.agregarCatedratico(catedratico);
        
        if(instancias.InstanciaEstructuraCatedraticos.buscarCatedratico(id) != null){           
            System.out.println("CATEDRATICOS: ");
            //instancias.InstanciaEstructuraUsuarios.imprimirUsuarios();
            Catedratico usr = instancias.InstanciaEstructuraCatedraticos.buscarCatedratico(id);
            mensaje = "Catedratico " + usr.getNombre() + " creado";
        }else{
            mensaje = "Error al crear el catedratico";
        }
                
        request.getSession().setAttribute("mensaje", mensaje);
                
        //direccion = "jsp/home-"+usuarioRol+".jsp";
        String direccionRed = "jsp/home.jsp";
        response.sendRedirect(direccionRed);  
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
