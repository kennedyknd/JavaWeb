<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="savecontato.jsp" method="post">
            <label>Nome</label><br/>
            <input type="text" name="nome"><br/>
            <label>Zap</label><br/>
            <input type="text" name="zap"><br/>
            <label>Email</label><br/>
            <input type="text" name="email">
            <br/>
            <input type="submit" value="Enviar" name="enviar"/>
        </form>
    </body>
</html>
