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

@WebServlet(urlPatterns = {"/LoginServlets"})
public class LoginServlets extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlets</title>");            
            out.println("</head>");
            out.println("<body>");
            out.print("<form action='LoginServlets' method='post' >");
            out.println("<label>Usuario:<input type='text' name='nome' /></label><br/>");
            out.println("<label>Senha:<input type='password' name='senha' /></label><br/>");
            out.println("<button type='submit'>Logar</button>");
            out.print("</form>");
            
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlet", "root", "");

    Statement st = con.createStatement();


    ResultSet rs = st.executeQuery("select * from logins");
      
     
      while (rs.next())
      {
        int id = rs.getInt("id");
        String usuario = rs.getString("nome");
        String senha = rs.getString("senha");
        
        if( usuario.equals(request.getParameter("nome")) && senha.equals(request.getParameter("senha"))){
            HttpSession session = request.getSession(true);
            session.setAttribute("codigo", "123");

            RequestDispatcher dispatcher = getServletContext()
            .getRequestDispatcher("/MenuServlet"); 
          dispatcher.forward(request, response);
        }
        
      }
      st.close();

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