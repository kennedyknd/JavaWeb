<%-- 
    Document   : lesession
    Created on : 10/09/2018, 19:44:09
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
        <h1>Valor da sessão: <%= session.getAttribute("usuario") %></h1>
    </body>
</html>
