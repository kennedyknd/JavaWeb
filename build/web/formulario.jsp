<%-- 
    Document   : formulario
    Created on : 12/09/2018, 20:32:43
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
        <div>

    <h2>CRUD</h2>

    <form class="form-horizontal" method="post" action="processamento.jsp?acao=salvar">

        <input type="hidden" name="id_formaPagamento" class="form-control" value="<?php echo $formaPagamento->getIdFormaPagamento();?>">

        <!-- area de campos do form -->
        <hr />
        <div class="row form-group">
            <div class="col-md-6">
                <label for="nome">Nome</label>
                <input type="text" class="form-control" id="nome" name="nome" required>
            </div>

            <div class="col-md-6">
                <label for="categorias_id">Categoria ID</label>
                <input type="number" class="form-control" id="categorias_id" name="categorias_id" required>
            </div>

        </div>

        <div class="form-group">
            <div class="col-sm-12">
                <button type="submit" class="btn btn-primary">Cadastrar</button>
                <a class="btn btn-danger" href="index.php">Voltar</a>
            </div>
        </div>
    </form>
</div>
    </body>
</html>
