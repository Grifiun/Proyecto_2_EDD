<%-- 
    Document   : visualizar-captcha
    Created on : 18/05/2021, 03:31:38
    Author     : 50234
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%
            String index = request.getParameter("index");
            String idCaptcha = session.getAttribute("id_captcha" + index).toString();
            
            //CargarCaptcha cargarCaptcha = new CargarCaptcha();            
            //String codigoHTMLFormulario = cargarCaptcha.cargarHTMLCaptcha(idCaptcha);
            
        %>
        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso administrador</title>        
        <%@include file="../html/css-bootstrap.html"%>
        <link href="../css/style-ingresos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <%@include file="../html/navs/nav-usuario.html" %>    
        <%@include file="../html/ingresos/parte-superior.html" %>
                
        <%@include file="../html/ingresos/parte-inferior.html" %>>
        <%@include file="../html/js-bootstrap.html"%>
    </body>
</html>