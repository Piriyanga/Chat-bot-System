<%@page import="DAL.DB"%>

<%@page import="java.sql.ResultSet"%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <title>ICBT | leading tertiary education provider in Sri Lanka</title>

        <link rel="stylesheet" href="css/style1.css">
        <link rel="shortcut icon" href="images/05.jpg"> 
        
    </head>
    <body>
    <center>
        <img src="images/t2.png"  align="middle">
    </center>
    <P align="center">-------------------------------------</P>
    <h1 align="center"> System Users </h1>

    <P align="center">-------------------------------------</P>
    <center>
        <table width="800" border="3" >
            <tr>
                <th width="89"><div align="center"><strong>Username</strong></div></th>
            <td width="80"><div align="center"><strong>Password</strong></div></td>
            <td width="69"><div align="center"><strong>User Type</strong></div></td>

            </tr>
            <%

                DB obj = DB.getInstance();
                ResultSet rs = obj.ViewUsers();
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

            </tr>
            <%
                }

            %>

        </table>
    </center>
    <p></p>
    <br><br><br><br>
    <p> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <strong> <a href="ManageAdmin.jsp"> <font color="white" > BACK </font> </a></strong></p>
    <br>
    
    <br>
    </body>
</html>
