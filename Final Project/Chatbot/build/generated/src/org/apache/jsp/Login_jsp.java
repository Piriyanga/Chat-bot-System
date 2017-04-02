package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import DAL.DB;
import java.sql.ResultSet;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <title>ICBT | leading tertiary education provider in Sri Lanka</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style1.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/05.jpg\"> \n");
      out.write("\n");
      out.write("        <script src=\"js/responsiveslides.min.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>  \n");
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <img src=\"images/logo.png\" align=\"middle\">\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"login-card\">\n");
      out.write("        <h1>Log-in </h1><br>\n");
      out.write("\n");
      out.write("        <form name=\"Login\" method=\"POST\" action=\"loginServlet\" >\n");
      out.write("            <div>\n");
      out.write("                <span><label>Username:</label></span>\n");
      out.write("                <span><input type=\"text\" name=\"user\" id=\"user\"  required=\"required\"></span>   \n");
      out.write("            </div>\n");
      out.write("            <p>&nbsp; </p>\n");
      out.write("            <div>\n");
      out.write("                <span><label>Password: </label></span>\n");
      out.write("                <span><input type=\"password\" name=\"pass\" id=\"pass\" required=\"required\"></span>\n");
      out.write("            </div>\n");
      out.write("            <p>&nbsp; </p>\n");
      out.write("            <div>\n");
      out.write("                <span><label>User Type: </label></span>\n");
      out.write("                <span><select name=\"userType_Id\" id=\"userType_Id\">\n");
      out.write("                        <option>admin</option>\n");
      out.write("                        <option>staff</option>\n");
      out.write("                        <option>student</option>\n");
      out.write("                    </select></span>\n");
      out.write("            </div>\n");
      out.write("            <p>&nbsp; </p>\n");
      out.write("            <div> \n");
      out.write("                <input type=\"submit\" name=\"login\" id=\"login\" class=\"login login-submit\" value=\"Login\"  style=\"width:120px; height:30px;\" />\n");
      out.write("            </div>\n");
      out.write("            ");

                if (request.getAttribute("lgn") != null) {

                    String flag = request.getAttribute("lgn").toString();
                    if (flag == "invalid") {

                        out.println("<script type=\"text/JavaScript\">");
                        out.println("alert(\"Invalid USERNAME or PASSWORD or wrong USER TYPE selection! Please try Again.\")");
                        out.println("</script>");

                        request.setAttribute("lgn", null);
                    }
                } else {
                    out.flush();

                }


            
      out.write("  \n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</body>\n");
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
