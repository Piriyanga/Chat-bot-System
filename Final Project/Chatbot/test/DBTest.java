import DAL.DB;
import java.sql.Connection;
import java.sql.ResultSet;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class DBTest {
    
    public DBTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

 @Test
    public void testCreateConnection() {
        System.out.println("CreateConnection");
        Connection expResult = null;
        Connection result = DB.CreateConnection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    
     @Test
    public void testLogin() throws Exception {
        System.out.println("login");
        String UserName = "";
        String Password = "";
        String UserType = "";
        DB instance = null;
        ResultSet expResult = null;
        ResultSet result = instance.login(UserName, Password, UserType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testAddUser() throws Exception {
        System.out.println("AddUser");
        String UserName = "";
        String Password = "";
        String UserType = "";
        boolean expResult = false;
        boolean result = DB.AddUser(UserName, Password, UserType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
      @Test
    public void testDeleteUser() {
        System.out.println("DeleteUser");
        String Username = "";
        DB instance = null;
        boolean expResult = false;
        boolean result = instance.DeleteUser(Username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     @Test
    public void testViewUsers() {
        System.out.println("ViewUsers");
        DB instance = null;
        ResultSet expResult = null;
        ResultSet result = instance.ViewUsers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
      @Test
    public void testAddEmployee() throws Exception {
        System.out.println("AddEmployee");
        String EID = "";
        String Name = "";
        String Address = "";
        String DOB = "";
        String NIC = "";
        String Gender = "";
        String Email = "";
        String CNO = "";
        String Salary = "";
        String JobRole = "";
        String WorkExp = "";
        String Qul = "";
        String SDate = "";
        DB instance = null;
        boolean expResult = false;
        boolean result = instance.AddEmployee(EID, Name, Address, DOB, NIC, Gender, Email, CNO, Salary, JobRole, WorkExp, Qul, SDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
        @Test
    public void testDeleteEmployee() {
        System.out.println("DeleteEmployee");
        String EID = "";
        DB instance = null;
        boolean expResult = false;
        boolean result = instance.DeleteEmployee(EID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
     @Test
    public void testFindEmployee() throws Exception {
        System.out.println("FindEmployee");
        String EID = "";
        DB instance = null;
        ResultSet expResult = null;
        ResultSet result = instance.FindEmployee(EID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
    @Test
    public void testUpdateadmin() throws Exception {
        System.out.println("Updateadmin");
        String EID = "";
        String Name = "";
        String Address = "";
        String DOB = "";
        String NIC = "";
        String Gender = "";
        String Email = "";
        String CNO = "";
        String Salary = "";
        String JobRole = "";
        String WorkExp = "";
        String Qul = "";
        String SDate = "";
        DB instance = null;
        boolean expResult = false;
        boolean result = instance.Updateadmin(EID, Name, Address, DOB, NIC, Gender, Email, CNO, Salary, JobRole, WorkExp, Qul, SDate);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    
    
    
}
