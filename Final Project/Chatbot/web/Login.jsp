<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import = "java.sql.*"%>
<%@page import="DAL.DB" %>
<%@page import="java.sql.ResultSet" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <title>ICBT | leading tertiary education provider in Sri Lanka</title>

        <link rel="stylesheet" href="css/style1.css">
        <link rel="shortcut icon" href="images/05.jpg"> 

        <script src="js/responsiveslides.min.js"></script>




    </head>

    <body>  

    <center>
        <img src="images/logo.png" align="middle">
        
    </center>


    <div class="login-card">
        <h1>Log-in </h1><br>

        <form name="Login" method="POST" action="loginServlet" >
            <div>
                <span><label>Username:</label></span>
                <span><input type="text" name="user" id="user"  required="required"></span>   
            </div>
            <p>&nbsp; </p>
            <div>
                <span><label>Password: </label></span>
                <span><input type="password" name="pass" id="pass" required="required"></span>
            </div>
            <p>&nbsp; </p>
            <div>
                <span><label>User Type: </label></span>
                <span><select name="userType_Id" id="userType_Id">
                        <option>admin</option>
                        <option>staff</option>
                        <option>student</option>
                    </select></span>
            </div>
            <p>&nbsp; </p>
            <div> 
                <input type="submit" name="login" id="login" class="login login-submit" value="Login"  style="width:120px; height:30px;" />
            </div>
            <%
                if (request.getAttribute("lgn") != null) {

                    String flag = request.getAttribute("lgn").toString();
                    if (flag == "invalid") {

                        out.println("<script type=\"text/JavaScript\">");
                        out.println("alert(\"Invalid USERNAME or PASSWORD or wrong USER TYPE selection! Please try Again.\")");
                        out.println("</script>");

                        request.setAttribute("lgn", null);
                    }
                } else {
                    out.flush();

                }


            %>  

        </form>





    </div>


</body>
</html>
