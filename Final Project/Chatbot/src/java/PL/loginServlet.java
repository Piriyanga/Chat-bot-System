package PL;

import DAL.DB;
import java.sql.ResultSet;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "loginServlet", urlPatterns = {"/loginServlet"})
public class loginServlet extends HttpServlet {

      DB obj = DB.getInstance();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>ICBT | leading tertiary education provider in Sri Lanka </title>");
        out.println("<link rel='shortcut icon'  href='images/05.jpg'>");

        out.println("</head>");

        try {
            String UserName = request.getParameter("user");
            String Password = request.getParameter("pass");
            String UserType = request.getParameter("userType_Id");
            ResultSet rs = obj.login(UserName, Password, UserType);

            if (rs.next()) {

                if (rs.getString(3).equals("admin")) {
                    String rol = rs.getString(3);
                    HttpSession session = request.getSession(true);
                    session.setAttribute("Iflag", rol);
                    session.setAttribute("UserName", UserName);
                    session.setMaxInactiveInterval(10);

                    Cookie loginCookie = new Cookie("user", UserName);
			//setting cookie to expiry in 30 mins

                    response.addCookie(loginCookie);
                    request.getRequestDispatcher("Admin.jsp").forward(request, response);
                    response.sendRedirect("Admin.jsp");

                    
                } else if (rs.getString(3).equals("staff")) {

                    String role = rs.getString(3);
                    HttpSession session = request.getSession(true);
                    session.setAttribute("Iflag", role);
                    session.setAttribute("UserName", UserName);
                    session.setMaxInactiveInterval(10);
                    Cookie loginCookie = new Cookie("user1", UserName);
			//setting cookie to expiry in 30 mins

                    response.addCookie(loginCookie);
                    request.getRequestDispatcher("viewProfile_Staff.jsp").forward(request, response);
                    response.sendRedirect("viewProfile_Staff.jsp");
                    
                } else if (rs.getString(3).equals("student")) {

                    String role = rs.getString(3);
                    HttpSession session = request.getSession(true);
                    session.setAttribute("Iflag", role);
                    session.setAttribute("UserName", UserName);
                    session.setMaxInactiveInterval(10);
                    Cookie loginCookie = new Cookie("user2", UserName);
			//setting cookie to expiry in 30 mins

                    response.addCookie(loginCookie);
                    request.getRequestDispatcher("SIS.jsp").forward(request, response);
                    response.sendRedirect("SIS.jsp");
                }

            } else {
                request.setAttribute("lgn", "invalid");
                request.getRequestDispatcher("/Login.jsp").forward(request, response);
                response.sendRedirect("/Login.jsp");
            }

        } catch (Exception ex) {
            Logger.getLogger(loginServlet.class.getName()).log(Level.SEVERE, null, ex);
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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
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
