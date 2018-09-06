<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String user, pass; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Faça Login</title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    </head>
    <body>
        <div align="center" style="padding-top: 10em;">
            <form action="validalogin.jsp" method="post">
                <label><strong>Nome:</strong></label>
                <br>
                <input type="text" name="user" size="20"/><br>
                <br>
                <label><strong>Senha:</strong></label>
                <br>
                <input type="password" name="pass" size="20"/>
                <br><br>
                <button type="submit button" class="btn btn-success" name="botsubmit" value="TRUE">Enviar</button>
            </form>
        </div>
    </body>
</html>
