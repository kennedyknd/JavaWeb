<%-- 
    Document   : exemplojsploop
    Created on : 17/09/2018, 19:57:40
    Author     : 17114290011
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:forEach var="i" begin="1" end="10" step="1">
            <c:out value="${i}" />
            <br/>
        </c:forEach>
    </body>
</html>
