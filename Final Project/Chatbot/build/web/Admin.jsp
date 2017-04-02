<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@page import = "java.sql.* "%> 

<%ResultSet resultset = null;%>

<%@page import="DAL.DB" %>
<%@page import="java.sql.ResultSet" %>

<!DOCTYPE HTML>
<html>
    <head>
        <title>ICBT | leading tertiary education provider in Sri Lanka</title>

        <link rel="stylesheet" href="css/style1.css">
        <link rel="shortcut icon" href="images/05.jpg"> 

       

        <link href="css/style.css" rel="stylesheet" type="text/css"  media="all" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>

        <script type="text/javascript" language="javascript">

            // null validation

            function clearText(field)
            {
                if (field.defaultValue === field.value)
                    field.value = '';
                else if (field.value === '')
                    field.value = field.defaultValue;
            }
            function validate(userentry) {
                if (userentry.uname.value === "") {
                    alert("Please Enter the username!!");
                    userentry.uname.focus();
                    return false;
                }
                else if (userentry.pass.value === "") {
                    alert("Please Enter the password!!");
                    userentry.pass.focus();
                    return false;
                }

                return true;
            }

            function valdel(userentry) {
                if (userentry.uname.value === "") {
                    alert("Please enter the username to delete record!");
                    userentry.uname.focus();
                    return false;
                }
                return true;
            }

        </script>


    </head>
    <body>
        
         <%
           
                
             Cookie [] cookies = request.getCookies();
             String usern = null;
             
           for(Cookie cookie : cookies){
	if(cookie.getName().equals("user")) usern = cookie.getValue();
            }
            
           
         %>
         
          <h3>Hi <%=usern%>, Login successful.</h3>
         
         
       
        <!---start-wrap---->

        <!---start-header---->
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
                            <h2 align="right"><a href="Admin.jsp">WELCOME ${UserName}</a></h2>
                        </div>
                        <%
                            }
                        %>
                    </div>
                    <div class="right-left">

                        <ul>
                            <li class="login"><a href="Home.jsp">Logout</a></li>
                        </ul>

                    </div>
                    <div class="clear"> </div>
                </div>
            </div>
            <div class="main-header">


                <div class="wrap">
                    <div class="logo">
                        <a href="Admin.jsp"><img src="images/t2.png" title="logo" /></a>
                        <br>
                    </div>

                    <div class="clear"> </div>
                </div>
            </div>



            <div class="clear"> </div>
            <div class="top-nav">
                <div class="wrap">
                    <ul>
                        <li class="active"><a href="Admin.jsp">User Entry</a></li>
                        <li><a href="Student.jsp">Manage Students </a></li>
                        <li><a href="Employee.jsp">Manage Employee </a></li>
                        <li><a href="Question.jsp">Manage Questions </a></li>

                    </ul>
                </div>
            </div>
        </div>
        <!---START-CONTENT---->

        <div class="col span_2_of_3">
            <div class="contact-form">

                <h3>USER ENTRY</h3>
                <form name="userentry" method="post" action="UserServlet">

                    <table width="100%" border="0" cellspacing="0" cellpadding="0">
                        <tr>
                            <td width="40%">&nbsp;</td>
                            <td width="60%"><table width="817" height="581" border=1" >

                                        <tr>
                          <td width="167" height="45">USERNAME</td>
                          <td width="323"><div align="center">
                            <input type="text" name="uname" id="uname" value="${uname}" />
                          </div></td>
                          <td width="305"><div align="center"></div></td>
                        </tr>
                        <tr>
                          <td height="70">PASSWORD</td>
                          <td><div align="center">
                                  <input type="password" name="pass" id="pass" value="${pass}" />
                          </div></td>
                        </tr>
                        <tr>
                          <td height="74">USER TYPE</td>
                          <td><div align="center">
                            <select name="userType_Id" id="userType_Id">
                              <option>Admin</option>
                              <option>Student</option>
                              <option>Staff</option>
                            </select>
                          </div></td>
                          <td><div align="center"></div></td>
                        </tr>
                        <tr>
                          <td height="67"><input type="submit" name="save" id="save" value="SAVE" onClick="validate(this.form)" /></td>
                          <td><div align="center">
                            <input type="submit" name="del" id="del" value="DELETE" onClick="valdel(this.form)" />
                          </div></td>
                          <td><div align="center"></div></td>
                        </tr>

                                        <%
                                            if (request.getAttribute("useradd") != null) {

                                                String flag = request.getAttribute("useradd").toString();
                                                if (flag == "success") {

                                                    out.println("<script type=\"text/JavaScript\">");
                                                    out.println("alert(\"Successfully Added!!\")");
                                                    out.println("</script>");

                                                    request.setAttribute("useradd", null);
                                                }

                                            } else {

                                                out.flush();
                                            }

                                        %>

                                        <%  if (request.getAttribute("flagdelete") != null) {

                                                String flag = request.getAttribute("flagdelete").toString();
                                                if (flag == "success") {

                                                    out.println("<script type=\"text/JavaScript\">");
                                                    out.println("alert(\"Successfully Deleted !!\")");
                                                    out.println("</script>");

                                                    request.setAttribute("flagdelete", null);
                                                }

                                            } else {

                                                out.flush();
                                            }


                                        %>
                                    </table>
                    </table>

                                    </form>


                                    <form action="viewentry_User.jsp" method="get">
                                        <span> <input type="submit" name="view" id="view" value="VIEW ALL"></span>
                                    </form>
                                    </div>
                                    </div>				
                                    </div>

                                    </div>






                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>     
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/> 
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>     
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/> 
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>     
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/> 
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>     
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/> 
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>     
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/> 
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>    
                                    <P>&nbsp;<P/>     
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>
                                    <P>&nbsp;<P/>

                                    <!----End-content----->
                                    </div>
                                    <!---End-wrap---->
                                    <!---start-footer---->
                                    <div class="footer">
                                        <div class="wrap">
                                            <div class="footer-grids">
                                                <div class="footer-grid">

                                                    <div class="footer-grid">
                                                        <h3>CONTACTS</h3>
                                                        <p>Email: icbtcampus@gmail.com</p>
                                                        <p><span>Hotline: 0112121212</span></p>

                                                    </div>
                                                    <div class="clear"> </div>
                                                </div>

                                                <div class="clear"> </div>

                                                <div class="copy-tight">
                                                    <p><marquee direction="left">@2012-2017 ICBT Campus | ICBT All Rights Reserved.</marquee></p>
                                                </div>

                                            </div>
                                        </div>
                                        <!---End-footer---->
                                        </body>
                                        </html>

