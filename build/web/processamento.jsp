<%-- 
    Document   : processamento
    Created on : 12/09/2018, 20:05:08
    Author     : 17114290011
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "");
            
            if (request.getParameter("acao").equals("salvar")){
                
                // Condicional para INSERT ou UPDATE
                if (request.getParameter("id").equals("")){
                    String query = "INSERT INTO categorias (`nome`, `categorias_id`) VALUES (?, ?)";
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setString (1, request.getParameter("nome"));
                    preparedStmt.setInt (2, Integer.parseInt(request.getParameter("categorias_id")));
                    preparedStmt.execute();
                    con.close();
                    response.sendRedirect("Categorias");
                } else {
                    String query = "UPDATE categorias SET `nome`= ?, `categorias_id`= ? WHERE `id`= ?";
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setString (1, request.getParameter("nome"));
                    preparedStmt.setInt (2, Integer.parseInt(request.getParameter("categorias_id")));
                    preparedStmt.setInt (3, Integer.parseInt(request.getParameter("id")));
                    preparedStmt.execute();
                    con.close();
                    response.sendRedirect("Categorias");
                }
                
                } else {
                // DELETE
                    String query = "DELETE FROM categorias WHERE id = ?";
                    PreparedStatement preparedStmt = con.prepareStatement(query);
                    preparedStmt.setInt (1, Integer.parseInt(request.getParameter("id")));
                    preparedStmt.execute();
                    con.close();
                    response.sendRedirect("Categorias");
                
            }

        }
    }
            %>
    </body>
</html>
