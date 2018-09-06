<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="contato" class="br.iesb.Contato" scope="session"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        Dados do contato<br/>
        Name: <%= contato.getNome()%><br/>
        Zap: <%= contato.getZap()%><br/>
        Email: <%= contato.getEmail()%><br/>
    </body>
</html>
