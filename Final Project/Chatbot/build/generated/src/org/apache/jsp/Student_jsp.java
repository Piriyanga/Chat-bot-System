package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import DAL.DB;
import java.sql.ResultSet;

public final class Student_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write(" \n");
      out.write("\n");
ResultSet resultset = null;
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
      out.write("        <title>ICBT | leading tertiary education provider in Sri Lanka</title>\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style1.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/05.jpg\"> \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\"  media=\"all\" />\n");
      out.write("        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>\n");
      out.write("\n");
      out.write("        <script type=\"text/javascript\" language=\"javascript\">\n");
      out.write("            \n");
      out.write("            //null validation\n");
      out.write("            \n");
      out.write("            function clearText(field)\n");
      out.write("            {\n");
      out.write("                if (field.defaultValue === field.value)\n");
      out.write("                    field.value = '';\n");
      out.write("                else if (field.value === '')\n");
      out.write("                    field.value = field.defaultValue;\n");
      out.write("            }\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("            function validate(manageStudent) {\n");
      out.write("                if (manageStudent.uid.value === \"\") {\n");
      out.write("                    alert(\"Please Enter the Student ID!\");\n");
      out.write("                    manageStudent.nic.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (manageStudent.name.value === \"\") {\n");
      out.write("                    alert(\"Please Enter the name!\");\n");
      out.write("                    manageStudent.name.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if (manageStudent.address.value === \"\") {\n");
      out.write("                    alert(\"Please Enter the Address!\");\n");
      out.write("                    manageStudent.address.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\t\telse if (manageStudent.nic.value === \"\") {\n");
      out.write("                    alert(\"Please Enter the NIC!\");\n");
      out.write("                    manageStudent.nic.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\t\telse if (manageStudent.contno.value === \"\") {\n");
      out.write("                    alert(\"Please Enter the Contact No!\");\n");
      out.write("                    manageStudent.contno.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function valdel(manageStudent) {\n");
      out.write("                if (manageStudent.uid.value === \"\") {\n");
      out.write("                    alert(\"Please enter the Studnet id to delete record!\");\n");
      out.write("                    manageStudent.uid.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            function valsearch(manageStudent) {\n");
      out.write("                if (manageStudent.uid.value === \"\") {\n");
      out.write("                    alert(\"Please enter the Student id to search record!\");\n");
      out.write("                    manageStudent.uid.focus();\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("           //NIC validation\n");
      out.write("           \n");
      out.write("            function NIC(nic)\n");
      out.write("            {\n");
      out.write("                var NIC = /9+[0-9]+v{1,9}/;\n");
      out.write("                if (nic.value.match(NIC))\n");
      out.write("                {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    alert(\"Not a valid NIC Number. Please Re-enter!\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("           // PhoneNo Validation\n");
      out.write("            function pno(contno) {\n");
      out.write("\n");
      out.write("                var phoneno = /^\\d{10}$/;\n");
      out.write("                if (contno.value.match(phoneno)) {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("                else {\n");
      out.write("                    alert(\"Not a valid Contact Number. Please Re- enter!\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            // Email Validation\n");
      out.write("            \n");
      out.write("\t    function validation() {\n");
      out.write("                var x = document.forms[\"manageEmployee\"][\"email\"].value;\n");
      out.write("                var atpos = x.indexOf(\"@\");\n");
      out.write("                var dotpos = x.lastIndexOf(\".\");\n");
      out.write("                if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= x.length) {\n");
      out.write("                    alert(\"Not a Valid E-mail ID. Please Re-enter!\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
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
      out.print(session.getAttribute("UserName"));
      out.write("</a></h2>\n");
      out.write("                        </div>\n");
      out.write("                        ");

                            }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"right-left\">\n");
      out.write("\n");
      out.write("                        <ul>\n");
      out.write("                            <li class=\"login\"><a href=\"Home.html\">Logout</a></li>\n");
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
      out.write("                       <li class=\"active\"><a href=\"Student.jsp\">Manage Students </a></li>\n");
      out.write("                        <li><a href=\"Employee.jsp\">Manage Employee </a></li>\n");
      out.write("                        <li><a href=\"Question.jsp\">Manage Questions </a></li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <!---START-CONTENT---->\n");
      out.write("\n");
      out.write("        <div class=\"col span_2_of_3\">\n");
      out.write("            <div class=\"contact-form\">\n");
      out.write("                \n");
      out.write("                <h3>Student Details</h3>\n");
      out.write("                \n");
      out.write("                <form name=\"manageStudent\" method=\"post\" action=\"StudentServlet\">\n");
      out.write("                    <table width=\"739\" height=\"817\" border=1\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td width=\"224\" height=\"45\">STUDENT ID</td>\n");
      out.write("                            <td width=\"304\"><div align=\"center\">\n");
      out.write("                              <input type=\"text\" name=\"uid\" id=\"uid\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${uid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            </div></td>\n");
      out.write("                            <td width=\"189\"><div align=\"center\">\n");
      out.write("                              <input type=\"submit\" name=\"search\" id=\"search\" value=\"SEARCH\" onClick=\"valsearch(this.form)\" />\n");
      out.write("                            \n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"66\">NAME</td>\n");
      out.write("                            <td><div align=\"center\">\n");
      out.write("                              <input type=\"text\" name=\"name\" id=\"name\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${name}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            </div></td>\n");
      out.write("                            <td><div align=\"center\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"37\">ADDRESS</td>\n");
      out.write("                            <td><div align=\"center\">\n");
      out.write("                              <input type=\"text\" name=\"address\" id=\"address\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            </div></td>\n");
      out.write("                            <td><div align=\"center\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"48\">NIC</td>\n");
      out.write("                            <td><div align=\"center\">\n");
      out.write("                              <input type=\"text\" name=\"nic\" id=\"nic\"  value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${nic}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            </div></td>\n");
      out.write("                            <td><div align=\"center\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"44\">EMAIL</td>\n");
      out.write("                            <td><div align=\"center\">\n");
      out.write("                              <input type=\"text\" name=\"email\" id=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            </div></td>\n");
      out.write("                            <td><div align=\"center\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td height=\"66\">CONTACT NO</td>\n");
      out.write("                            <td><div align=\"center\">\n");
      out.write("                              <input type=\"text\" name=\"contno\" id=\"contno\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${contno}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("                            </div></td>\n");
      out.write("                            <td><div align=\"center\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr>\n");
      out.write("                          <td height=\"62\"><input type=\"submit\" name=\"save\" id=\"save\" value=\"SAVE\" onClick=\"validate(this.form);\n");
      out.write("                                        return pno(document.manageStudent.cno);\n");
      out.write("                                        return NIC(document.manageStudent.nic);\n");
      out.write("                                        return validation(document.manageStudent.email)\"/></td>\n");
      out.write("                          \n");
      out.write("                          \n");
      out.write("                          <td><input type=\"submit\" name=\"del\" id=\"del\" value=\"DELETE\" onClick=\"valdel(this.form)\" /></td>\n");
      out.write("                         \n");
      out.write("                          \n");
      out.write("                         <td><input type=\"submit\" name=\"edit\" id=\"edit\" value=\"UPDATE\" onClick=\"validate(this.form);\n");
      out.write("                                            return pno(document.manageStudent.cno);\n");
      out.write("                                             return NIC(document.manageStudent.nic);\n");
      out.write("                                          return validation(document.manageStudent.email)\" /></td>\n");
      out.write("                        </tr>\n");
      out.write("                        \n");
      out.write("                        ");

                            if (request.getAttribute("flagAdd") != null) {

                                String flag = request.getAttribute("flagAdd").toString();
                                if (flag == "success") {

                                    out.println("<script type=\"text/JavaScript\">");
                                    out.println("alert(\"Student Details Successfully Inserted!\")");
                                    out.println("</script>");

                                    request.setAttribute("flagAdd", null);
                                }
                            } 
                            else {
                                out.flush();

                            }


                        
      out.write("  \n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        ");
                                
			     if (request.getAttribute("flagupdate") != null) {

                                String flag = request.getAttribute("flagupdate").toString();
                                if (flag == "success") {

                                    out.println("<script type=\"text/JavaScript\">");
                                    out.println("alert(\"Student Details Successfully Updated!\")");
                                    out.println("</script>");

                                    request.setAttribute("flagupdate", null);
                                }
                            } 
                            else {

                                out.flush();

                            }

                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        ");
                                          
			    if (request.getAttribute("flagdel") != null) {

                                String flag = request.getAttribute("flagdel").toString();
                                if (flag == "success") {

                                    out.println("<script type=\"text/JavaScript\">");
                                    out.println("alert(\"Student Details Successfully Deleted!\")");
                                    out.println("</script>");

                                    request.setAttribute("flagdel", null);
                                }
                            } 
                            else {

                                out.flush();

                            }
                        
      out.write("\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </table>\n");
      out.write("                </form>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\t\t\t\t\n");
      out.write("\n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>     \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>     \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>     \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/> \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>     \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/> \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>     \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/> \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>     \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/> \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>     \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/> \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>     \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/> \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>     \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/> \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>    \n");
      out.write("<P>&nbsp;<P/>     \n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("<P>&nbsp;<P/>\n");
      out.write("\n");
      out.write("<!----End-content----->\n");
      out.write("</div>\n");
      out.write("<!---End-wrap---->\n");
      out.write("\n");
      out.write("\n");
      out.write("<!---start-footer---->\n");
      out.write("<div class=\"footer\">\n");
      out.write("    <div class=\"wrap\">\n");
      out.write("        <div class=\"footer-grids\">\n");
      out.write("            \n");
      out.write("              <div class=\"footer-grid\">\n");
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
      out.write("            \n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("    <!---End-footer---->\n");
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
