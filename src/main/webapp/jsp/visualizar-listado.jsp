<%-- 
    Document   : visualizar-listado
    Created on : 21/05/2021, 03:41:46
    Author     : 50234
--%>

<%@page import="clasesDAO.Edificio"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="instancias.InformacionEstructuraDatosGeneral"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%        
        //titulos
        String rol = (String) session.getAttribute("rol");
        //el tipod e tabla a usar
        String tipoListado = (String) request.getParameter("tipoListado");
        //instanciamos el identificador
        
        //instanciamos objeto
        InformacionEstructuraDatosGeneral info = new InformacionEstructuraDatosGeneral();
        
        ArrayList<String> titulo = info.getTitulos(tipoListado);
        List<ArrayList<String>> lista = info.getInfoTable(tipoListado);
        
        if(tipoListado.equals("salones")){
            String indexEdificio = request.getParameter("index_edificio");
            String identificadorEdificio = request.getSession().getAttribute("listado"+indexEdificio).toString();
            Edificio edificioAux = instancias.InstanciaEstructuraEdificios.buscarEdificio(identificadorEdificio);
            session.setAttribute("edificio", identificadorEdificio);
            lista =  edificioAux.getListadoSalones().getInfo();
            titulo = instancias.InstanciaEstructuraEdificios.getTitulosSalones();
        }
                  

        %>   
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado</title>        
        <%@include file="../html/css-bootstrap.html"%>
        <link href="../css/style-ingresos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%          
            switch(rol){
                case "usuario":%><%@include file="../html/navs/nav-usuario.html" %><%
                    break; 
                case "colaborador":%><%@include file="../html/navs/nav-colaborador.html" %><%
                    break; 
                case "admin":%><%@include file="../html/navs/nav-admin.html" %><%
                    break; 
            } 
        %> 
        <%@include file="../html/ingresos/parte-superior.html" %>
        <%@include file="../html/mostrar-registro/tabla-generica.html" %>
        
        <%@include file="../html/ingresos/parte-inferior.html" %>
        <%@include file="../html/js-bootstrap.html"%>
    </body>
</html>
