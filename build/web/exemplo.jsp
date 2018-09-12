<%-- 
    Document   : exemploQualquer
    Created on : 29/08/2018, 21:08:32
    Author     : 17114290011
--%>

<%@page import="br.iesb.Calculadora"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            Calculadora c = new Calculadora(4);
            out.print(c.getCalculadora());
            
        %>
        
        
        <%@include file="exemploLoop.jsp" %>
        <%
            java.util.Date date = new java.util.Date();
        %>
            Olá JSP! Qual o tempo agora?
        <%
            out.println( date );
            out.println ( "<BR>Endereço da sua máquina é " );
            out.println ( request.getRemoteHost());
        %>
        <p>
            Hoje é: <%= (new java.util.Date()).toLocaleString()%>
        </p>
    </body>
</html>