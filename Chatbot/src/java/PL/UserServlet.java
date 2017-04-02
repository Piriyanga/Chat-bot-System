package PL;

import DAL.DB;
import DAL.viewUser;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

   DB obj = DB.getInstance();
   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ICBT | leading tertiary education provider in Sri Lanka </title>");
        out.println("<link rel='shortcut icon'  href='images/05.jpg'>");

        out.println("</head>");

        try {
            if (request.getParameter("save") != null) {

                String UserName = request.getParameter("uname");
                String Password = request.getParameter("pass");
                String UserType = request.getParameter("userType_Id");

                boolean result = obj.AddUser(UserName, Password, UserType);

               if (result == true) {

                    request.setAttribute("useradd", "success");
                }

                request.getRequestDispatcher("/Admin.jsp").forward(request, response);
                response.sendRedirect("/Admin.jsp");

            }

//***************************************** End of Insert ***************************************

            if (request.getParameter("del") != null) {

                String Username = request.getParameter("uname");
                boolean result = obj.DeleteUser(Username);
                if (result == true) {
                    request.setAttribute("flagdelete", "success");

                }
                request.getRequestDispatcher("Admin.jsp").forward(request, response);
                response.sendRedirect("Admin.jsp");
            }
        } catch (Exception e) {
        } finally {

            out.close();
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
