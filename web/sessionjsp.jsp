<%-- 
    Document   : session
    Created on : 10/09/2018, 19:40:12
    Author     : 17114290011
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String texto;
            texto = request.getParameter("frase");
            session.setAttribute("usuario", texto);
            response.sendRedirect("lesession.jsp");
         %>
    </body>
</html>
