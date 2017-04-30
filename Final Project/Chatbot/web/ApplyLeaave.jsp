<%@page import = "java.sql.* "%> 

<%ResultSet resultset = null;%>

<%@page import="DAL.DB" %>
<%@page import="java.sql.ResultSet" %>

<%@page import=" java.util.Date" %>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
         <title>ICBT | leading tertiary education provider in Sri Lanka</title>

        <link rel="stylesheet" href="css/style1.css">
        <link rel="shortcut icon" href="images/05.jpg"> 
        
        
    </head>
    <body class="st" >
        <div class="header">
            <div class="top-header">
                <div class="wrap">
                    <div class="top-header-left">
                        <%
                            if ((session.getAttribute("UserName") == null) || (session.getAttribute("UserName") == "")) {
                        %>

                        <%
                        } else {
                        %>

                        <p align="left">&nbsp;</p>

                        <div>
                            <h2 align="right"><a href="Staff.jsp">WELCOME <%=session.getAttribute("UserName")%></a></h2>
                        </div>
                        <%
                            }
                        %>
                    </div>
                            
                </div>
            </div>
                    <div class="clear"> </div>
                    
                     <p align="right"> <a href="Home.jsp"><font color="#FF0000">Logout </font></a></p>
         
         <center>
           <p><img src="images/t2.png"  align="middle">
           <p> -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p>
           </p></center>
    
           
                   <p><b> <font color="#FF0000"> 
                           <%= new java.util.Date() %>
                  </font></b> </p>
                 
    <p>&nbsp;</p>
    
           <table width="100%" border="0" cellspacing="0" cellpadding="0">
             <tr class="staff">
                 <td width="20%" align="center"><a href="viewProfile_Staff.jsp"> VIEW PROFILE </a> </td>
             
                 <td width="15%"><a href="ApplyLeaave.jsp">Apply FOR LEAVE</a></td>
             </tr>
             <tr>
               <td>&nbsp;</td>
               <td>&nbsp;</td>
               <td>&nbsp;</td>
               <td>&nbsp;</td>
             </tr>
    </table>
           <p>&nbsp;</p>
     <h1 align="center"> Sending Email</h1>
      
        <%! String msgInfo ="";  %>

        <form method="Post" action ="EmailServlet">
            <table border="0" align="center" >
                <tbody>
                    <tr>
                        <td>Recipient Email ID:</td>
                        <td><input type="text" name="txtRecipient" value="" class="size"/></td>
                    </tr>
                    <tr>
                        <td>Subject:</td>
                        <td><input type="text" name="txtSubjetc" value="" class="size"/></td>
                    </tr>
                    <tr>
                        <td>Message:</td>
                        <td><textarea name="txtMessgae" rows="5" cols="35" class="size">
                            </textarea></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit" value="Send" /></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><h3 id="message" style="color:red;"> <%=  msgInfo%> </h3> </td>
                    </tr>
                </tbody>
            </table>

            
        </form>
    </body>
</html>
