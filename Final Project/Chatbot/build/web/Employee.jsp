<%@page import = "java.sql.* "%> 

<%ResultSet resultset = null;%>

<%@page import="DAL.DB" %>
<%@page import="java.sql.ResultSet" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ICBT | leading tertiary education provider in Sri Lanka</title>

        <link rel="stylesheet" href="css/style1.css">
        <link rel="shortcut icon" href="images/05.jpg"> 
        
        
        <link href="css/style.css" rel="stylesheet" type="text/css"  media="all" />
        <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css'>

        <script type="text/javascript" language="javascript">
            
            //null validation
            
            function clearText(field)
            {
                if (field.defaultValue === field.value)
                    field.value = '';
                else if (field.value === '')
                    field.value = field.defaultValue;
            }
			
			
            function validate(manageEmployee) {
                if (manageEmployee.eid.value === "") {
                    alert("Please Enter the Employee ID!");
                    manageEmployee.nic.focus();
                    return false;
                }
                else if (manageEmployee.name.value === "") {
                    alert("Please Enter the name!");
                    manageEmployee.name.focus();
                    return false;
                }
                else if (manageEmployee.address.value === "") {
                    alert("Please Enter the Address!");
                    manageEmployee.address.focus();
                    return false;
                }
		else if (manageEmployee.dob.value === "") {
                    alert("Please Enter the DOB!");
                    manageEmployee.dob.focus();
                    return false;
                }
		else if (manageEmployee.nic.value === "") {
                    alert("Please Enter the NIC!");
                    manageEmployee.nic.focus();
                    return false;
                }
		else if (manageEmployee.gender.value === "") {
                    alert("Please Enter the Gender!");
                    manageEmployee.gender.focus();
                    return false;
                }
		else if (manageEmployee.contno.value === "") {
                    alert("Please Enter the Contact No!");
                    manageEmployee.contno.focus();
                    return false;
                }
		else if (manageEmployee.salary.value === "") {
                    alert("Please Enter the Salary!");
                    manageEmployee.salary.focus();
                    return false;
                }
		else if (manageEmployee.jobrole.value === "") {
                    alert("Please Enter Job Role!");
                    manageEmployee.jobrole.focus();
                    return false;
                }
		else if (manageEmployee.workexp.value === "") {
                    alert("Please Enter the Work Experience!");
                    manageEmployee.workexp.focus();
                    return false;
                }
		else if (manageEmployee.qul.value === "") {
                    alert("Please Enter the Qualification!");
                    manageEmployee.qul.focus();
                    return false;
                }
                else if (manageEmployee.sdate.value === "") {
                    alert("Please Enter the StartDate!");
                    manageEmployee.sdate.focus();
                    return false;
                }

                return true;
            }


            function valdel(manageEmployee) {
                if (manageEmployee.eid.value === "") {
                    alert("Please enter the Empolyee id to delete record!");
                    manageEmployee.eid.focus();
                    return false;
                }
                return true;

            }


            function valsearch(manageEmployee) {
                if (manageEmployee.eid.value === "") {
                    alert("Please enter the Empolyee id to search record!");
                    manageEmployee.eid.focus();
                    return false;
                }
                return true;
            }

           //NIC validation
           
            function NIC(nic)
            {
                var NIC = /9+[0-9]+v{1,9}/;
                if (nic.value.match(NIC))
                {
                    return true;
                }
                else
                {
                    alert("Not a valid NIC Number. Please Re-enter!");
                    return false;
                }
            }

           // PhoneNo Validation
            function pno(contno) {

                var phoneno = /^\d{10}$/;
                if (contno.value.match(phoneno)) {
                    return true;
                }
                else {
                    alert("Not a valid Contact Number. Please Re- enter!");
                    return false;
                }
            }


            // Email Validation
            
	    function validation() {
                var x = document.forms["manageEmployee"]["email"].value;
                var atpos = x.indexOf("@");
                var dotpos = x.lastIndexOf(".");
                if (atpos < 1 || dotpos < atpos + 2 || dotpos + 2 >= x.length) {
                    alert("Not a Valid E-mail ID. Please Re-enter!");
                    return false;
                }
            }


        </script>
        
        
    </head>
    <body>
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
                            <h2 align="right"><a href="Admin.jsp">WELCOME <%=session.getAttribute("UserName")%></a></h2>
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
                    </div>

                    <div class="clear"> </div>
                </div>
            </div>



            <div class="clear"> </div>
            <div class="top-nav">
                <div class="wrap">
                    <ul>
                        <li><a href="Admin.jsp">User Entry</a></li>
                       <li><a href="Student.jsp">Manage Students </a></li>
                        <li class="active"><a href="Employee.jsp">Manage Employee </a></li>
                        

                    </ul>
                </div>
            </div>
        </div>
        <!---START-CONTENT---->

        <div class="col span_2_of_3">
            <div class="contact-form">
                
                <h3>Employee Details</h3>
                
                <form name="manageEmployee" method="post" action="EmployeeServlet">
                    <table width="739" height="817" border=1">
                        <tr>
                            <td width="224" height="45">EMPLOYEE ID</td>
                            <td width="304"><div align="center">
                              <input type="text" name="eid" id="eid"  value="${eid}" />
                            </div></td>
                            <td width="189"><div align="center">
                              <input type="submit" name="search" id="search" value="SEARCH" onClick="valsearch(this.form)" />
                            
                        </tr>
                        <tr>
                            <td height="66">NAME</td>
                            <td><div align="center">
                              <input type="text" name="name" id="name"  value="${name}" />
                            </div></td>
                            <td><div align="center"></div></td>
                        </tr>
                        <tr>
                            <td height="37">ADDRESS</td>
                            <td><div align="center">
                              <input type="text" name="address" id="address"  value="${address}" />
                            </div></td>
                            <td><div align="center"></div></td>
                        </tr>
                        <tr>
                            <td height="67">DOB</td>
                            <td><div align="center">
                              <input type="text" name="dob" id="dob"  value="${dob}" />
                            </div></td>
                            <td><div align="center"></div></td>
                        </tr>
                        <tr>
                            <td height="48">NIC</td>
                            <td><div align="center">
                              <input type="text" name="nic" id="nic"  value="${nic}" />
                            </div></td>
                            <td><div align="center"></div></td>
                        </tr>
                        <tr>
                            <td height="64">GENDER</td>
                            <td><div align="center">
                              <input type="text" name="gender" id="gender" value="${gender}" />
                            </div></td>
                            <td><div align="center"></div></td>
                        </tr>
                        <tr>
                            <td height="44">EMAIL</td>
                            <td><div align="center">
                              <input type="text" name="email" id="email" value="${email}" />
                            </div></td>
                            <td><div align="center"></div></td>
                        </tr>
                        <tr>
                            <td height="66">CONTACT NO</td>
                            <td><div align="center">
                              <input type="text" name="contno" id="contno" value="${contno}" />
                            </div></td>
                            <td><div align="center"></div></td>
                        </tr>
                        <tr>
                            <td height="42">SALARY</td>
                            <td><div align="center">
                              <input type="text" name="salary" id="salary" value="${salary}" />
                            </div></td>
                            <td><div align="center"></div></td>
                        </tr>
                        <tr>
                            <td height="58">JOB ROLE</td>
                            <td><div align="center">
                              <input type="text" name="jobrole" id="jobrole" value="${jobrole}" />
                            </div></td>
                            <td><div align="center"></div></td>
                        </tr>
                        <tr>
                            <td height="62">WORK EXPERENICE</td>
                            <td><div align="center">
                              <input type="text" name="workexp" id="workexp" value="${workexp}" />
                            </div></td>
                            <td><div align="center"></div></td>
                        </tr>
                        <tr>
                          <td height="62">QUALIFICATION</td>
                          <td><div align="center">
                            <input type="text" name="qul" id="qul" value="${qul}" />
                          </div></td>
                          <td><div align="center"></div></td>
                        </tr>
                        <tr>
                          <td height="62">START DATE</td>
                          <td><div align="center">
                            <input type="text" name="sdate" id="sdate" value="${sdate}" />
                          </div></td>
                          <td><div align="center"></div></td>
                        </tr>
                        <tr>
                          <td height="62"><input type="submit" name="save" id="save" value="SAVE" onClick="validate(this.form);
                                        return pno(document.manageEmployee.cno);
                                        return NIC(document.manageEmployee.nic);
                                        return validation(document.manageEmployee.email)"/></td>
                          
                          
                          <td><input type="submit" name="del" id="del" value="DELETE" onClick="valdel(this.form)" /></td>
                         
                          
                         <td><input type="submit" name="edit" id="edit" value="UPDATE" onClick="validate(this.form);
                                            return pno(document.manageEmployee.cno);
                                             return NIC(document.manageEmployee.nic);
                                          return validation(document.manageEmployee.email)" /></td>
                        </tr>
                        
                        <%
                            if (request.getAttribute("flagAdd") != null) {

                                String flag = request.getAttribute("flagAdd").toString();
                                if (flag == "success") {

                                    out.println("<script type=\"text/JavaScript\">");
                                    out.println("alert(\"Employee Details Successfully Inserted!\")");
                                    out.println("</script>");

                                    request.setAttribute("flagAdd", null);
                                }
                            } 
                            else {
                                out.flush();

                            }


                        %>  
                        
                        
                        <%                                
			     if (request.getAttribute("flagupdate") != null) {

                                String flag = request.getAttribute("flagupdate").toString();
                                if (flag == "success") {

                                    out.println("<script type=\"text/JavaScript\">");
                                    out.println("alert(\"Employee Details Successfully Updated!\")");
                                    out.println("</script>");

                                    request.setAttribute("flagupdate", null);
                                }
                            } 
                            else {

                                out.flush();

                            }

                        %>
                        
                        
                        <%                                          
			    if (request.getAttribute("flagdel") != null) {

                                String flag = request.getAttribute("flagdel").toString();
                                if (flag == "success") {

                                    out.println("<script type=\"text/JavaScript\">");
                                    out.println("alert(\"Employee Details Successfully Deleted!\")");
                                    out.println("</script>");

                                    request.setAttribute("flagdel", null);
                                }
                            } 
                            else {

                                out.flush();

                            }
                        %>
                        
                        
                    </table>
                </form>
                <p>&nbsp;</p>
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
</div>
    <!---End-footer---->
    </body>
</html>
