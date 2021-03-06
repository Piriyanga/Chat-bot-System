package PL;

import DAL.DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "Chat", urlPatterns = {"/Chat"})
public class Chat extends HttpServlet {

  /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   

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
        try {
            DB obj = DB.getInstance();
            
            StringBuffer chattxt=new StringBuffer(request.getParameter("chat"));
            String txt=request.getParameter("chattext");
            chattxt.append("You: " + txt + "\n");
            
            System.out.println("---- Split by comma ',' ------");
            StringTokenizer st2 = new StringTokenizer(txt, "?");
             ResultSet rsot = obj.chatbotlist();
          List<String> quest=new ArrayList<String>();
          
             List<String> txtstring=new ArrayList<>();
             List<String> ans=new ArrayList<>();
             List<String> anstxt=new ArrayList<>();
         
            while (rsot.next()) {
                   quest.add(rsot.getString("Question"));
                     ans.add(rsot.getString("Answers"));
                 
                }
            while (st2.hasMoreElements()) {
			txtstring.add((String) st2.nextElement());
                       
		}
         
            for(int i=0;i<txtstring.size();i++){
                for (int j=0;j<quest.size();j++) {
                    if(txtstring.get(i).equals(quest.get(j))){
                        anstxt.add(ans.get(j));
                      
                    }
                }
            }
            
            for (String b : anstxt) {
                
                chattxt.append("Bot: " +b + "\n");
            }
                request.setAttribute("dd",anstxt.size());
            request.setAttribute("chattxt", chattxt.toString());
            
            
            request.getRequestDispatcher("Home.jsp").forward(request, response);
        } catch (Exception ex) {
            Logger.getLogger(Chat.class.getName()).log(Level.SEVERE, null, ex);
            
        }
                 
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
