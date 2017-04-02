package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import DAL.DB;
import java.sql.ResultSet;

public final class Question_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" \n");
      out.write("\n");
ResultSet resultset = null;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>ICBT | leading tertiary education provider in Sri Lanka</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style1.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/05.jpg\"> \n");
      out.write("\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"  media=\"all\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("\n");
      out.write("            // null validation\n");
      out.write("\n");
      out.write("            function clearText(field)\n");
      out.write("            {\n");
      out.write("                if (field.defaultValue === field.value)\n");
      out.write("                    field.value = '';\n");
      out.write("                else if (field.value === '')\n");
      out.write("                    field.value = field.defaultValue;\n");
      out.write("            }\n");
      out.write("            function validate(userentry) {\n");
      out.write("                if (userentry.uname.value === \"\") {\n");
      out.write("                    alert(\"Please Enter the username!!\");\n");
      out.write("                    userentry.uname.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (userentry.pass.value === \"\") {\n");
      out.write("                    alert(\"Please Enter the password!!\");\n");
      out.write("                    userentry.pass.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function valdel(userentry) {\n");
      out.write("                if (userentry.uname.value === \"\") {\n");
      out.write("                    alert(\"Please enter the username to delete record!\");\n");
      out.write("                    userentry.uname.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("         ");

           
                
             Cookie [] cookies = request.getCookies();
             String usern = null;
             
           for(Cookie cookie : cookies){
	if(cookie.getName().equals("user")) usern = cookie.getValue();
            }
            
           
         
      out.write("\n");
      out.write("         \n");
      out.write("          <h3>Hi ");
      out.print(usern);
      out.write(", Login successful.</h3>\n");
      out.write("         \n");
      out.write("         \n");
      out.write("       \n");
      out.write("        <!---start-wrap---->\n");
      out.write("\n");
      out.write("        <!---start-header---->\n");
      out.write("        <div class=\"header\">\n");
      out.write("            <div class=\"top-header\">\n");
      out.write("                <div class=\"wrap\">\n");
      out.write("                    <div class=\"top-header-left\">\n");
      out.write("                        ");

                            if ((session.getAttribute("UserName") == null) || (session.getAttribute("UserName") == "")) {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        ");

                        } else {
                        
      out.write("\n");
      out.write("\n");
      out.write("                        <p align=\"left\">&nbsp;</p>\n");
      out.write("\n");
      out.write("                        <div>\n");
      out.write("                            <h2 align=\"right\"><a href=\"Admin.jsp\">WELCOME ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${UserName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</a></h2>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"right-left\">\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"login\"><a href=\"Home.jsp\">Logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"clear\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"main-header\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"wrap\">\n");
      out.write("                    <div class=\"logo\">\n");
      out.write("                        <a href=\"Admin.jsp\"><img src=\"images/t2.png\" title=\"logo\" /></a>\n");
      out.write("                        <br>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"clear\"> </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"clear\"> </div>\n");
      out.write("            <div class=\"top-nav\">\n");
      out.write("                <div class=\"wrap\">\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Admin.jsp\">User Entry</a></li>\n");
      out.write("                        <li><a href=\"Student.jsp\">Manage Students </a></li>\n");
      out.write("                        <li><a href=\"Employee.jsp\">Manage Employee </a></li>\n");
      out.write("                        <li class=\"active\"><a href=\"Question.jsp\">Manage Questions </a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!---START-CONTENT---->\n");
      out.write("\n");
      out.write("        <div class=\"col span_2_of_3\">\n");
      out.write("            <div class=\"contact-form\">\n");
      out.write("\n");
      out.write("                <h3>Manage Question</h3>\n");
      out.write("                <form name=\"userentry\" method=\"post\" action=\"UserServlet\">\n");
      out.write("\n");
      out.write("                    <table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td width=\"40%\">&nbsp;</td>\n");
      out.write("                            <td width=\"60%\"><table width=\"817\" height=\"581\" border=1\" >\n");
      out.write("\n");
      out.write("                                        <tr>\n");
      out.write("                          <td width=\"167\" height=\"45\">USERNAME</td>\n");
      out.write("                          <td width=\"323\"><div align=\"center\">\n");
      out.write("                            <input type=\"text\" name=\"uname\" id=\"uname\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                          </div></td>\n");
      out.write("                          <td width=\"305\"><div align=\"center\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td height=\"70\">PASSWORD</td>\n");
      out.write("                          <td><div align=\"center\">\n");
      out.write("                                  <input type=\"password\" name=\"pass\" id=\"pass\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pass}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                          </div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td height=\"74\">USER TYPE</td>\n");
      out.write("                          <td><div align=\"center\">\n");
      out.write("                            <select name=\"userType_Id\" id=\"userType_Id\">\n");
      out.write("                              <option>Admin</option>\n");
      out.write("                              <option>Student</option>\n");
      out.write("                              <option>Staff</option>\n");
      out.write("                            </select>\n");
      out.write("                          </div></td>\n");
      out.write("                          <td><div align=\"center\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                          <td height=\"67\"><input type=\"submit\" name=\"save\" id=\"save\" value=\"SAVE\" onClick=\"validate(this.form)\" /></td>\n");
      out.write("                          <td><div align=\"center\">\n");
      out.write("                            <input type=\"submit\" name=\"del\" id=\"del\" value=\"DELETE\" onClick=\"valdel(this.form)\" />\n");
      out.write("                          </div></td>\n");
      out.write("                          <td><div align=\"center\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                                        ");

                                            if (request.getAttribute("useradd") != null) {

                                                String flag = request.getAttribute("useradd").toString();
                                                if (flag == "success") {

                                                    out.println("<script type=\"text/JavaScript\">");
                                                    out.println("alert(\"Successfully Added!!\")");
                                                    out.println("</script>");

                                                    request.setAttribute("useradd", null);
                                                }

                                            } else {

                                                out.flush();
                                            }

                                        
      out.write("\n");
      out.write("\n");
      out.write("                                        ");
  if (request.getAttribute("flagdelete") != null) {

                                                String flag = request.getAttribute("flagdelete").toString();
                                                if (flag == "success") {

                                                    out.println("<script type=\"text/JavaScript\">");
                                                    out.println("alert(\"Successfully Deleted !!\")");
                                                    out.println("</script>");

                                                    request.setAttribute("flagdelete", null);
                                                }

                                            } else {

                                                out.flush();
                                            }


                                        
      out.write("\n");
      out.write("                                    </table>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <form action=\"viewentry_User.jsp\" method=\"get\">\n");
      out.write("                                        <span> <input type=\"submit\" name=\"view\" id=\"view\" value=\"VIEW ALL\"></span>\n");
      out.write("                                    </form>\n");
      out.write("                                    </div>\n");
      out.write("                                    </div>\t\t\t\t\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>     \n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/> \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>     \n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/> \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>     \n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/> \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>     \n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/> \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>     \n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/> \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>    \n");
      out.write("                                    <P>&nbsp;<P/>     \n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("                                    <P>&nbsp;<P/>\n");
      out.write("\n");
      out.write("                                    <!----End-content----->\n");
      out.write("                                    </div>\n");
      out.write("                                    <!---End-wrap---->\n");
      out.write("                                    <!---start-footer---->\n");
      out.write("                                    <div class=\"footer\">\n");
      out.write("                                        <div class=\"wrap\">\n");
      out.write("                                            <div class=\"footer-grids\">\n");
      out.write("                                                <div class=\"footer-grid\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"footer-grid\">\n");
      out.write("                                                        <h3>CONTACTS</h3>\n");
      out.write("                                                        <p>Email: icbtcampus@gmail.com</p>\n");
      out.write("                                                        <p><span>Hotline: 0112121212</span></p>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"clear\"> </div>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"clear\"> </div>\n");
      out.write("\n");
      out.write("                                                <div class=\"copy-tight\">\n");
      out.write("                                                    <p><marquee direction=\"left\">@2012-2017 ICBT Campus | ICBT All Rights Reserved.</marquee></p>\n");
      out.write("                                                </div>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <!---End-footer---->\n");
      out.write("                                        </body>\n");
      out.write("                                        </html>\n");
      out.write("\n");
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
