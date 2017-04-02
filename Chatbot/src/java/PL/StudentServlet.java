package PL;

import DAL.DB;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "StudentServlet", urlPatterns = {"/StudentServlet"})
public class StudentServlet extends HttpServlet {

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

                String UID = request.getParameter("uid");
                String Name = request.getParameter("name");
                String Address = request.getParameter("address");                
                String NIC = request.getParameter("nic");
                String Email = request.getParameter("email");
                String CNO = request.getParameter("contno");
                

                boolean result = obj.AddStudent(UID, Name, Address, NIC, Email, CNO);

                if (result == true) {

                    request.setAttribute("flagAdd", "success");
                }

                request.getRequestDispatcher("/Student.jsp").forward(request, response);
                response.sendRedirect("/Student.jsp");

            }

// end of insert
            
            if (request.getParameter("del") != null) {

                String UID = request.getParameter("uid");
                boolean result = obj.DeleteStudent(UID);
                if (result == true) {
                    request.setAttribute("flagdel", "success");

                }
                request.getRequestDispatcher("/Student.jsp").forward(request, response);
                response.sendRedirect("/Student.jsp");
            }

// end of delete
            
            if (request.getParameter("search") != null) {

                String UID = request.getParameter("uid");
                ResultSet rs = obj.FindStudent(UID);

                while (rs.next()) {
                    String uid = rs.getString(1);
                    request.setAttribute("uid", uid);

                    String Name = rs.getString(2);
                    request.setAttribute("name", Name);

                    String Address = rs.getString(3);
                    request.setAttribute("address", Address);

                    String Email = rs.getString(4);
                    request.setAttribute("email", Email);

                    String CNO = rs.getString(5);
                    request.setAttribute("contno", CNO);

                    String NIC = rs.getString(6);
                    request.setAttribute("nic", NIC);

                }

                request.getRequestDispatcher("/Student.jsp").forward(request, response);
                response.sendRedirect("/Student.jsp");
            }

// end of search            
            if (request.getParameter("edit") != null) {

                String UID = request.getParameter("uid");
                String Name = request.getParameter("name");
                String Address = request.getParameter("address");
                String Email = request.getParameter("email");
                String CNO = request.getParameter("contno");
                String NIC = request.getParameter("nic");

                boolean result = obj.UpdateStudent(UID, Name, Address, Email, CNO, NIC);
                if (result == true) {

                    request.setAttribute("flagupdate", "success");
                }

                request.getRequestDispatcher("/Student.jsp").forward(request, response);
                response.sendRedirect("/Student.jsp");
            }

// end of update
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
