<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! String user, pass; %>
<% 
    if(request.getParameter("botsubmit")!= null
            && request.getParameter("botsubmit").equals("TRUE")){
        user = request.getParameter("user");
        pass = request.getParameter("pass");
        
        if(user.equals("teste") && pass.equals("teste"))
              response.sendRedirect("bemvindo.jsp");
        else
              response.sendRedirect("falha.jsp");
    }
%>
