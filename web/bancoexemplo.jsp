<%@page import="java.sql.*" contentType="text/html" pageEncoding="UTF-8"%>
<%! String query = "select * from categorias"; %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Lista de Categorias em JSP</h1>
        <%
           try
           {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "");
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            %>
            <table border='1'>
             <caption>Lista de Categorias</caption>
             <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Categoria</th>
                </tr>
            <tr>
            <%
            while(rs.next()){
            %> 

                    <td><%= rs.getInt("id") %></td>
                    <td><%= rs.getString("nome") %></td>
                    <td><%= rs.getString("categorias_id") %></td>
                </tr>
           
            <% } %>
            </table>
            <%
           }catch(SQLException e){
             out.println("Falha no banco de dados :"+e.getMessage());

           }
        %>
    </body>
</html>