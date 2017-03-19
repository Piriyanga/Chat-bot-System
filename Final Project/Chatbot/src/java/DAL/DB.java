package DAL;

/**
 *
 * @author User
 */
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
        return instance;           // singleton design pattern applied   
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
}

// end login
 //--------------------------------------------------------------
