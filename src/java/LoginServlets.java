/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Kennedy
 */
@WebServlet(urlPatterns = {"/LoginServlets"})
public class LoginServlets extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet LoginServlets</title>");            
            out.println("</head>");
            out.println("<body>");
            out.print("<form action='LoginServlets' method'post' >");
            out.print("<label>Usuário:<input type='text' name='nome' /></label><br/>");
            out.print("<label>Senha:<input type='password' name='senha' /></label><br/>");
            out.print("<button type'submit'>Logar</button>");
            out.print("</form>");
            
            
            
//            if ( "guiGay".equals(request.getParameter("nome"))){
//                out.println("<br/>Isso é verdade ...");
//                }
//            else if ( !"".equals(request.getParameter("nome")) && request.getParameter("nome") != null) {
//                out.println("<br/>Nome de Login Válido ...");
//            }

        if ( loginChech ( request.getParameter("nome")) && loginChech ( request.getParameter("senha"))){
            if ( request.getParameter("nome").equals("Fulano") && request.getParameter("senha").equals("iesb")){
                //response.sendRedirect("MenuServlet");
                
                HttpSession session = request.getSession(true);
                session.setAttribute("codigo", "123");
                
                RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/MenuServlet");
                dispatcher.forward(request, response);
                
            }
            else if ( !"".equals(request.getParameter("nome")) && request.getParameter("nome") != null) {
                out.println("<br/>Insira um login ou senha válido");
            }
            else {
                out.print("Senha ou login não aprovado(s)");
            }
        }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
    
    protected boolean loginChech(String valor){
        if ( !"".equals(valor) && valor != null)
            return true;
        else
            return false;
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
