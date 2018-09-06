<%-- 
    Document   : exemplo
    Created on : 29/08/2018, 21:45:11
    Author     : guilherme.alcantara
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@include file="ExemploLoop.jsp"%>
        
        <%
            java.util.Date date = new java.util.Date();
        %>
        Olá JSP! Qual o tempo agora?
        
        <%
            out.println(date);
            out.println("<br>Endereço da sua máquina é ");
            out.println(request.getRemoteHost());
        %>
        <p>
            Hoje é: <%= (new java.util.Date()).toLocaleString()%>
        </p>
    </body>
</html>
