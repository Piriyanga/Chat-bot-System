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

@WebServlet(name = "EmployeeServlet", urlPatterns = {"/EmployeeServlet"})
public class EmployeeServlet extends HttpServlet {

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

                String EID = request.getParameter("eid");
                String Name = request.getParameter("name");
                String Address = request.getParameter("address");
                String DOB = request.getParameter("dob");
                String NIC = request.getParameter("nic");
                String Gender = request.getParameter("gender");
                String Email = request.getParameter("email");
                String CNO = request.getParameter("contno");
                String Salary = request.getParameter("salary");
                String JobRole = request.getParameter("jobrole");
                String WorkExp = request.getParameter("workexp");
                String Qul = request.getParameter("qul");
                String SDate = request.getParameter("sdate");

                boolean result = obj.AddEmployee(EID, Name, Address, DOB, NIC, Gender, Email, CNO, Salary, JobRole, WorkExp, Qul, SDate);

                if (result == true) {

                    request.setAttribute("flagAdd", "success");
                }

                request.getRequestDispatcher("/Employee.jsp").forward(request, response);
                response.sendRedirect("/Employee.jsp");

            }

// end of insert
            if (request.getParameter("del") != null) {

                String EID = request.getParameter("eid");
                boolean result = obj.DeleteEmployee(EID);
                if (result == true) {
                    request.setAttribute("flagdel", "success");

                }
                request.getRequestDispatcher("/Employee.jsp").forward(request, response);
                response.sendRedirect("/Employee.jsp");
            }

// end of delete
            if (request.getParameter("search") != null) {

                String EID = request.getParameter("eid");
                ResultSet rs = obj.FindEmployee(EID);

                while (rs.next()) {
                    int eid = rs.getInt(1);
                    request.setAttribute("eid", eid);

                    String Name = rs.getString(2);
                    request.setAttribute("name", Name);

                    String Address = rs.getString(3);
                    request.setAttribute("address", Address);

                    String DOB = rs.getString(4);
                    request.setAttribute("dob", DOB);

                    String NIC = rs.getString(5);
                    request.setAttribute("nic", NIC);

                    String Gender = rs.getString(6);
                    request.setAttribute("gender", Gender);

                    String Email = rs.getString(7);
                    request.setAttribute("email", Email);

                    String CNO = rs.getString(8);
                    request.setAttribute("contno", CNO);

                    String Salary = rs.getString(9);
                    request.setAttribute("salary", Salary);

                    String JobRole = rs.getString(10);
                    request.setAttribute("jobrole", JobRole);

                    String WorkExp = rs.getString(11);
                    request.setAttribute("workexp", WorkExp);

                    String Qul = rs.getString(12);
                    request.setAttribute("qul", Qul);

                    String SDate = rs.getString(13);
                    request.setAttribute("sdate", SDate);

                }

                request.getRequestDispatcher("/Employee.jsp").forward(request, response);
                response.sendRedirect("/Employee.jsp");
            }

// end of search            
            if (request.getParameter("edit") != null) {

                String EID = request.getParameter("eid");
                String Name = request.getParameter("name");
                String Address = request.getParameter("address");
                String DOB = request.getParameter("dob");
                String NIC = request.getParameter("nic");
                String Gender = request.getParameter("gender");
                String Email = request.getParameter("email");
                String CNO = request.getParameter("contno");
                String Salary = request.getParameter("salary");
                String JobRole = request.getParameter("jobrole");
                String WorkExp = request.getParameter("workexp");
                String Qul = request.getParameter("qul");
                String SDate = request.getParameter("sdate");

                boolean result = obj.Updateadmin(EID, Name, Address, DOB, NIC, Gender, Email, CNO, Salary, JobRole, WorkExp, Qul, SDate);
                if (result == true) {

                    request.setAttribute("flagupdate", "success");
                }

                request.getRequestDispatcher("/Employee.jsp").forward(request, response);
                response.sendRedirect("/Employee.jsp");
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
