<%-- 
    Document   : ExemploLoop
    Created on : 29/08/2018, 21:29:06
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
        <table border='1'>
            <%
                int n = 10;
                for(int i = 0; i < n; i++){
            %>
            <tr>
                <td>Number</td>
                <td><%= i+1 %></td>
            </tr>
           <%
               }
           %>
        </table>
    </body>
</html>
