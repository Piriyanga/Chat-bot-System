package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import DAL.DB;
import java.sql.ResultSet;

public final class viewentry_005fUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("     <title>ICBT | leading tertiary education provider in Sri Lanka</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style1.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/05.jpg\"> \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <img src=\"images/t2.png\"  align=\"middle\">\n");
      out.write("    </center>\n");
      out.write("    <P align=\"center\">-------------------------------------</P>\n");
      out.write("    <h1 align=\"center\"> System Users </h1>\n");
      out.write("\n");
      out.write("    <P align=\"center\">-------------------------------------</P>\n");
      out.write("        <center>\n");
      out.write("        <img src=\"images/name.png\"  align=\"middle\">\n");
      out.write("    </center>\n");
      out.write("    <P align=\"center\">-------------------------------------</P>\n");
      out.write("    <h1 align=\"center\"> System Users </h1>\n");
      out.write("\n");
      out.write("    <P align=\"center\">-------------------------------------</P>\n");
      out.write("    <center>\n");
      out.write("        <table width=\"800\" border=\"3\" >\n");
      out.write("            <tr>\n");
      out.write("                <th width=\"89\"><div align=\"center\"><strong>Username</strong></div></th>\n");
      out.write("            <td width=\"80\"><div align=\"center\"><strong>Password</strong></div></td>\n");
      out.write("            <td width=\"69\"><div align=\"center\"><strong>User Type</strong></div></td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");


                DB obj = DB.getInstance();
                ResultSet rs = obj.ViewUsers();
                while (rs.next()) {

            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print( rs.getString(1));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print( rs.getString(2));
      out.write("\n");
      out.write("                </td>\n");
      out.write("                <td>\n");
      out.write("                    ");
      out.print( rs.getString(3));
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                }

            
      out.write("\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </center>\n");
      out.write("    <p></p>\n");
      out.write("    <br><br><br><br>\n");
      out.write("    <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("        <strong> <a href=\"ManageAdmin.jsp\"> <font color=\"white\" > BACK </font> </a></strong></p>\n");
      out.write("    <br>\n");
      out.write("    \n");
      out.write("    <br>\n");
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
