package DAL;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB {

    // start db

    private static DB instance = new DB();

    private DB() {
    }

    public static DB getInstance() {
        return instance;           
    }

    static Connection conn;

    public static Connection CreateConnection() {
        String User = "root";
        String Pass = "root";
        String URL = "jdbc:mysql://localhost/chatbot";
        String JDBC_D = "com.mysql.jdbc.Driver";

        Connection conn = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(URL, User, Pass);
            return conn;
        } catch (Exception ex) {
            conn = null;
            return conn;
        }
    }

//end db
    //--------------------------------------------------------------------
    // start login
    public ResultSet login(String UserName, String Password, String UserType) throws Exception {

        ResultSet result;
        try {

            conn = CreateConnection();
            PreparedStatement ps;
            String statement = "select * from login where UserName=? and Password=? and UserType=?";
            ps = conn.prepareStatement(statement);

            ps.setString(1, UserName);
            ps.setString(2, Password);
            ps.setString(3, UserType);
            result = ps.executeQuery();

            return result;

        } catch (Exception ex) {

            result = null;
            return result;

        }
    }
   // end login
 //--------------------------------------------------------------

    ///user entry
//.....start add users .....
    public static boolean AddUser(String UserName, String Password, String UserType) throws Exception {

      
          boolean result = false;
        try {

            PreparedStatement ps;
            conn = CreateConnection();

            String statement = "insert into login values(?,?,?)";
            ps = conn.prepareStatement(statement);
            ps.setString(1, UserName);
            ps.setString(2, Password);
            ps.setString(3, UserType);

            int res = ps.executeUpdate();

            if (res > 0) {

                result = true;
            }
            return result;
        } catch (Exception ex) {

            result = false;
            return result;
        }

    }
    
//-------------------------------------------------------------------
    

    //.......start delete users .........
    public static boolean DeleteUser(String Username) {

        boolean result = false;

        try {

            PreparedStatement ps;
            conn = CreateConnection();

            String statement = "delete from login where UserName=?";
            ps = conn.prepareStatement(statement);
            ps.setString(1, Username);
            int res = ps.executeUpdate();

            if (res > 0) {

                result = true;
            }
            return result;
        } catch (Exception e) {

            result = false;
            return result;
        }
    }

//.......end delete users ........
    
    
    //----------------------------------------
    // start view users 
    
    public ResultSet ViewUsers() {

        ResultSet rs;

        try {

            conn = CreateConnection();
            Statement ps;
            String statement = "select * from login";
            ps = conn.createStatement();
            rs = ps.executeQuery(statement);

            return rs;
        } catch (Exception e) {

            rs = null;
            return rs;
        }
    }

//end view users 
    
      // Start Manage employee 
//.........start add employee ........   
    
    public boolean AddEmployee(String EID, String Name, String Address, String DOB, String NIC, String Gender, String Email, String CNO, String Salary, String JobRole, String WorkExp, String Qul, String SDate) throws Exception {
        
        boolean result = false;
        try {

            PreparedStatement ps;
            conn = CreateConnection();

            String statement = "insert into employee values(?,?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = conn.prepareStatement(statement);

            ps.setString(1, EID);
            ps.setString(2, Name);
            ps.setString(3, Address);
            ps.setString(4, DOB);

            ps.setString(5, NIC);
            ps.setString(6, Gender);
            ps.setString(7, Email);
            ps.setString(8, CNO);

            ps.setString(9, Salary);
            ps.setString(10, JobRole);
            ps.setString(11, WorkExp);
            ps.setString(12, Qul);

            ps.setString(13, SDate);

            int res = ps.executeUpdate();

            if (res > 0) {

                result = true;
            }
            return result;
        } catch (Exception ex) {

            result = false;
            return result;
        }

    }
//end add employee

// delete employee
    
    public static boolean DeleteEmployee(String EID) {

        boolean result = false;

        try {

            PreparedStatement ps;
            conn = CreateConnection();

            String statement = "delete from employee where EID=?";
            ps = conn.prepareStatement(statement);
            ps.setString(1, EID);
            int res = ps.executeUpdate();

            if (res > 0) {

                result = true;
            }
            return result;
        } catch (Exception e) {

            result = false;
            return result;
        }
    }

// end delete employee
    
//search 
    public ResultSet FindEmployee(String EID) throws Exception {

        ResultSet rs;
        try {

            conn = CreateConnection();
            PreparedStatement ps;
            String statement = "select * from employee where EID=?";
            ps = conn.prepareStatement(statement);

            ps.setString(1, EID);
            rs = ps.executeQuery();
            return rs;
        } catch (Exception ex) {

            rs = null;
            return rs;
        }
    }

    // update
    public boolean Updateadmin(String EID, String Name, String Address, String DOB, String NIC, String Gender, String Email, String CNO, String Salary, String JobRole, String WorkExp, String Qul, String SDate) throws Exception {

        boolean result = false;
        try {

            PreparedStatement ps;
            conn = CreateConnection();

            String statement = "UPDATE employee SET Name =?, Address =?, DOB =?, NIC =?, Gender =?, Email =?, ContNo =?, Salary =?, JobRole =?,  WorkExp =?, Qualification =?, startDate =? WHERE EID =?";
            ps = conn.prepareStatement(statement);

            ps.setString(1, Name);
            ps.setString(2, Address);
            ps.setString(3, DOB);
            ps.setString(4, NIC);

            ps.setString(5, Gender);
            ps.setString(6, Email);
            ps.setString(7, CNO);
            ps.setString(8, Salary);
            ps.setString(9, JobRole);

            ps.setString(10, WorkExp);
            ps.setString(11, Qul);
            ps.setString(12, SDate);
            ps.setString(13, EID);

            int res = ps.executeUpdate();

            if (res > 0) {

                result = true;
            }
            return result;
        } catch (Exception e) {

            result = false;
            return result;
        }
    }

// end upadte employee
// end manage employee part
    
    
    
          // Start Manage student 
//.........start add student ........   
    
    public boolean AddStudent(String UID, String Name, String Address, String NIC, String Email, String CNO) throws Exception {
        
        boolean result = false;
        try {

            PreparedStatement ps;
            conn = CreateConnection();

            String statement = "insert into user values(?,?,?,?,?,?)";
            ps = conn.prepareStatement(statement);

            ps.setString(1, UID);
            ps.setString(2, Name);
            ps.setString(3, Address);
            ps.setString(4, Email);
            ps.setString(5, CNO);
            ps.setString(6, NIC);

            int res = ps.executeUpdate();

            if (res > 0) {

                result = true;
            }
            return result;
        } catch (Exception ex) {

            result = false;
            return result;
        }

    }
//end add student
    
    // delete student
    
    public static boolean DeleteStudent(String UID) {

        boolean result = false;

        try {

            PreparedStatement ps;
            conn = CreateConnection();

            String statement = "delete from user where UId=?";
            ps = conn.prepareStatement(statement);
            ps.setString(1, UID);
            int res = ps.executeUpdate();

            if (res > 0) {

                result = true;
            }
            return result;
        } catch (Exception e) {

            result = false;
            return result;
        }
    }

// end delete student
    
//search 
    public ResultSet FindStudent(String UID) throws Exception {

        ResultSet rs;
        try {

            conn = CreateConnection();
            PreparedStatement ps;
            String statement = "select * from user where UId=?";
            ps = conn.prepareStatement(statement);

            ps.setString(1, UID);
            rs = ps.executeQuery();
            return rs;
        } catch (Exception ex) {

            rs = null;
            return rs;
        }
    }
    
    
      // update
    public boolean UpdateStudent(String UID, String Name, String Address, String NIC, String Email, String CNO) throws Exception {

        boolean result = false;
        try {

            PreparedStatement ps;
            conn = CreateConnection();

            String statement = "UPDATE user SET Name =?, Address =?, Email =?, ContactNo =?, NIC =? WHERE UId =?";
            ps = conn.prepareStatement(statement);

            ps.setString(1, Name);
            ps.setString(2, Address);
            ps.setString(3, Email);
            ps.setString(4, CNO);
            ps.setString(5, NIC);
            ps.setString(6, UID);

            int res = ps.executeUpdate();

            if (res > 0) {

                result = true;
            }
            return result;
        } catch (Exception e) {

            result = false;
            return result;
        }
    }

// end upadte student
// end manage student part
    
    
    
    //question
    public ResultSet chatbotlist() throws Exception {

        ResultSet result;
        try {

            conn = CreateConnection();
            PreparedStatement ps;
            String statement = "select * from chattbotquestion";
            ps = conn.prepareStatement(statement);

            result = ps.executeQuery();

            return result;

        } catch (Exception ex) {

            result = null;
            return result;

        }
    }
    
}



 //--------------------------------------------------------------
