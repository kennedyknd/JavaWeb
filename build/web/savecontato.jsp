<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Leitura do Beans</title>
    </head>
    <body>
        <jsp:useBean id="contato" class="br.iesb.Contato" scope="session"/>
        <jsp:setProperty name="contato" property="*"/>
        <a href="readcontato.jsp">Ler Bean</a>
    </body>
</html>
