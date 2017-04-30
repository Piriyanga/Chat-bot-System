package PL;

import DAL.DB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
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
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
          Calendar cal = Calendar.getInstance();
          
        try {
            DB obj = DB.getInstance();
            
            StringBuffer chattxt=new StringBuffer(request.getParameter("chat"));
            String txt=request.getParameter("chattext");
            chattxt.append("You: " + txt + "\n");
             
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
                 int c=0;
         String Ques = null;
         String time=null;
            for(int i=0;i<txtstring.size();i++){
                for (int j=0;j<quest.size();j++) {
                    if(txtstring.get(i).equals(quest.get(j))){
                        
                       chattxt.append("Bot: " +ans.get(j) + "\n");
                         chattxt.append(cal.getTime()+"\n\n");
                      c=1;
                     obj.ChatHistory(quest.get(j),ans.get(j),String.valueOf(cal.getTime()));
                    }
                    
                    else{
                        Ques=quest.get(j);
                        time=String.valueOf(cal.getTime());
                    }
                    
                }
            }
            
            if(c==0){
                 chattxt.append("Bot: " +"Your Question is invalid" + "\n");
                  chattxt.append(time+"\n");
                  obj.ChatHistory(Ques,"Your Question is invalid",time);
            }
          
                request.setAttribute("dd",c);
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
