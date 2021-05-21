<%-- 
    Document   : ingresar-entidad
    Created on : 21/05/2021, 00:44:27
    Author     : 50234
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            String tipoEntidad = (String) request.getParameter("tipoEntidad");
            session.setAttribute("tipoEntidad", tipoEntidad);
            String rutaForm = "../html/ingresos-formularios/form-ingresar-"+tipoEntidad+".html";
        
            String rol = (String) session.getAttribute("rol");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso <%=tipoEntidad%></title>        
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
        <%          
            switch(tipoEntidad){
                case "usuario":%><%@include file="../html/ingresos-formularios/form-ingresar-usuario.html" %><%
                    break;
                default: %> <jsp:include page="<%=rutaForm%>"/><%
                    break;
            } 
        %>
        
        <%@include file="../html/ingresos/parte-inferior.html" %>
        <%@include file="../html/js-bootstrap.html"%>
    </body>
</html>
