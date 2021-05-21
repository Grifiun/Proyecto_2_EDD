<%-- 
    Document   : home
    Created on : 21-abr-2021, 2:16:02
    Author     : grifiun
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            String rol = (String) session.getAttribute("rol");
        %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <%@include file="../html/css-bootstrap.html"%>
        <title>GCIC</title>       
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
        <%@include file="../html/form-mensaje-resultado-ingreso.html" %>
        <%@include file="../html/ingresos/parte-inferior.html" %>
        <%@include file="../html/footer/footer.html"%>
        <%@include file="../html/js-bootstrap.html"%>
    </body>
</html>

