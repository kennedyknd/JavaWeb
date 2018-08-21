import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(urlPatterns = {"/CardapioServlet"})
public class CardapioServlet extends HttpServlet {
    
   protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>::.. LISTAGEM DE PRODUTO ..::</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>LISTAGEM CARDAPIO</h1>");
            
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "");

    Statement st = con.createStatement();

    String query = "select a.*, b.nome as categoria "
            + "from cardapios as a inner join categorias as b "
            + "on a.categorias_id = b.id";
 
    ResultSet rs = st.executeQuery(query);
      
      out.println("<table>");
      out.println("<tr>");
      out.println("<th>id</th>");
      out.println("<th>NOME</th>");
      out.println("<th>CATEGORIA</th>");
      out.println("<th>QTD</th>");
      out.println("<th>PRECO VENDA</th>");
      out.println("<th>CATEGORIA ID</th>");
      out.println("</tr>");
      
      while (rs.next())
      {
         
          out.println("<tr>");
          out.println("<td>");
          out.println(rs.getInt("id"));
          out.println("</td>");
          out.println("<td>");
          out.println(rs.getString("nome"));
          out.println("</td>");
          out.println("<td>");
          out.println(rs.getString("categoria"));
          out.println("</td>");
          out.println("<td>");
          out.println(rs.getDouble("qtd"));
          out.println("</td>");
          out.println("<td>");
          out.println(rs.getDouble("valor_venda"));
          out.println("</td>");
          out.println("<td>");
          out.println(rs.getInt("categorias_id"));
          out.println("</td>");
          out.println("</tr>");
        
      }
      st.close();
        out.println("</table>");
        out.println("</body>");
        out.println("</html>");
        }
    }


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LoginServlets.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LoginServlets.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


  
}