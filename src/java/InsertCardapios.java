import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/InsertCardapios"})
public class InsertCardapios extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String query = "select * from cardapios", html="";    
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "");
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet InsertCardapios</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<form action='InsertCardapios' method='GET'>");
            out.println("<label>Nome:<input type='text' name='nome'/></label>");
            out.println("<label>Descrição:<input type='text' name='descricao'/></label>");
            out.println("<label>Quantidade:<input type='text' name='qtd'/></label>");
            out.println("<label>Valor Venda:<input type='text' name='valor_venda'/></label>");
            out.println("<label>Valor Compra:<input type='text' name='valor_compra'/></label>");
            
            out.println("<select name='categorias_id'>");
 
            PreparedStatement stmt = con.prepareStatement(query);
            ResultSet rs = stmt.executeQuery(query);
            
            while(rs.next()){
                out.println("<option value='"+rs.getInt("id")+"'>"+rs.getString("nome")+"</option>");
                html +="<tr>";
                html +="<td>";
                html +=rs.getInt("id");
                html +="</td>";
                html +="<td>";
                html +=rs.getString("nome");
                html +="</td>";
                html +="<td>";
                html +=rs.getString("descricao");
                html +="</td>";
                html +="<td>";
                html +=rs.getDouble("qtd");
                html +="</td>";
                html +="<td>";
                html +=rs.getDouble("valor_venda");
                html +="</td>";
                html +="<td>";
                html +=rs.getDouble("valor_compra");
                html +="</td>";
                html +="<td>";
                html +=rs.getInt("categorias_id");
                html +="</td>";
                html +="</tr>";
            }
            out.println("</select>");
            
            out.println("<button type='submit'>Enviar</button>");
            out.println("</form>");
            out.println("<h1>LISTA DE CARDAPIOS</h1>");
            out.println("<table>");
            out.println("<tr>");
            out.println("<th>");
            out.println("ID");
            out.println("</th>");
            out.println("<th>");
            out.println("NOME");
            out.println("</th>");
            out.println("<th>");
            out.println("DESCRIÇÃO");
            out.println("</th>");
            out.println("<th>");
            out.println("QUANTIDADE");
            out.println("</th>");
            out.println("<th>");
            out.println("VALOR VENDA");
            out.println("</th>");
            out.println("<th>");
            out.println("VALOR COMPRA");
            out.println("</th>");
            out.println("<th>");
            out.println("CATEGORIA ID");
            out.println("</th>");
            out.println("</tr>");
            out.println(html);
            
            out.println("</table>");
            
            out.println("</body></html>");
            query = "insert into cardapios(nome, descricao, qtd, valor_venda, valor_compra, categorias_id) values(?,?,?,?,?,?)";
            
            if( request.getParameter("nome")!= null){
               
                PreparedStatement preparedStmt = con.prepareStatement(query);
                preparedStmt.setString (1, request.getParameter("nome"));
                preparedStmt.setString (2, request.getParameter("descricao"));
                preparedStmt.setString (3, request.getParameter("qtd"));
                preparedStmt.setString (4, request.getParameter("valor_venda"));
                preparedStmt.setString (5, request.getParameter("valor_compra"));
                preparedStmt.setString (6, request.getParameter("categorias_id"));
                preparedStmt.execute();
                con.close();
            }
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertCardapios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertCardapios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertCardapios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertCardapios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}