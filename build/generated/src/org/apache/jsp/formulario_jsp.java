package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("\n");
      out.write("    <h2>CRUD</h2>\n");
      out.write("\n");
      out.write("    <form class=\"form-horizontal\" method=\"post\" action=\"processamento.jsp?acao=salvar\">\n");
      out.write("\n");
      out.write("        <input type=\"hidden\" name=\"id_formaPagamento\" class=\"form-control\" value=\"<?php echo $formaPagamento->getIdFormaPagamento();?>\">\n");
      out.write("\n");
      out.write("        <!-- area de campos do form -->\n");
      out.write("        <hr />\n");
      out.write("        <div class=\"row form-group\">\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <label for=\"nome\">Nome</label>\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"nome\" name=\"nome\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"col-md-6\">\n");
      out.write("                <label for=\"categorias_id\">Categoria ID</label>\n");
      out.write("                <input type=\"number\" class=\"form-control\" id=\"categorias_id\" name=\"categorias_id\" required>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"form-group\">\n");
      out.write("            <div class=\"col-sm-12\">\n");
      out.write("                <button type=\"submit\" class=\"btn btn-primary\">Cadastrar</button>\n");
      out.write("                <a class=\"btn btn-danger\" href=\"index.php\">Voltar</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("</div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
