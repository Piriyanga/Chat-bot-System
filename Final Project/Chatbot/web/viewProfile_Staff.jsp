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
             <%

            Cookie[] cookies = request.getCookies();
            String usern1 = "";

            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user2")) {
                    usern1 = cookie.getValue();
                }
            }


        %>

        <h3>Hi <%=usern1%>, Login successful.</h3>
        
        
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
                            <h2 align="right"><a href="viewProfile_Staff.jsp.jsp">WELCOME <%=session.getAttribute("UserName")%></a></h2>
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
           <p><img src="images/name.png"  align="middle">
           <p> -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------</p>
           </center>
    
           
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
    
    
          <P align="center">-------------------------------------</P>
    <h1 align="center"> View Profile </h1>

    <P align="center">-------------------------------------</P>
    <center>
       <table width="1300" border="3" >
            <tr>
                
            <td width="80"><strong>Employee ID</strong></td>
            <td width="120"><strong>Name</strong></td>
            <td width="71"><strong>Address</strong></td>
            <td width="98"><div align="center"><strong>DOB</strong></div></td>
            <td width="112"><div align="center"><strong>NIC</strong></div></td>
            <td width="70"><div align="center"><strong>Gender</strong></div></td>
            <td width="110"><div align="center"><strong>Email</strong></div></td>
            <td width="105"><div align="center"><strong>Contact No</strong></div></td>
            <td width="102"><div align="center"><strong>Salary (Rs)</strong></div></td>
            <td width="66"><div align="center"><strong>Job Role</strong></div></td>
            <td width="75"><div align="center"><strong>Work Experience</strong></div></td>
            <td width="85"><div align="center"><strong>Qualification</strong></div></td>
            <td width="96"><div align="center"><strong>Start Date</strong></div></td>
            

            <%

                DB obj = DB.getInstance();
                ResultSet rs = obj.ViewProfilestaff();
                while (rs.next()) {

            %>
            <tr>
                <td>
                    <%= rs.getString(1)%>
                </td>
                <td>
                    <%= rs.getString(2)%>
                </td>
                <td>
                    <%= rs.getString(3)%>
                </td>
                <td>
                    <%= rs.getString(4)%>
                </td>
                <td>
                    <%= rs.getString(5)%>
                </td>
                <td>
                    <%= rs.getString(6)%>
                </td>
                <td>
                    <%= rs.getString(7)%>
                </td>
                <td>
                    <%= rs.getString(8)%>
                </td>
                <td>
                    <%= rs.getString(9)%>
                </td>
                <td>
                    <%= rs.getString(10)%>
                </td>
                <td>
                    <%= rs.getString(11)%>
                </td>
                <td>
                    <%= rs.getString(12)%>
                </td>
                <td>
                    <%= rs.getString(13)%>
                </td>

            </tr>
            <%
                }

            %>

        </table>
    </center>
    </body>
</html>
