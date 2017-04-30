
import DAL.Employee;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class EmployeeTest {
    
    public EmployeeTest() {
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

 /**
     * Test of getEID method, of class Employee.
     */
   
    @Test
    public void testSetEID() {
        System.out.println("Employee ID");
        String EID = "1";
        Employee instance = new Employee();
        instance.setEID(EID);
       
    }

    /**
     * Test of setName method, of class Employee.
     */
    @Test
    public void testSetName() {
        System.out.println("Employee Name");
        String Name = "Kevin";
        Employee instance = new Employee();
        instance.setName(Name);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }


 /**
     * Test of setAddress method, of class Employee.
     */
    @Test
    public void testSetAddress() {
        System.out.println("Address");
        String Address = "Jaffna";
        Employee instance = new Employee();
        instance.setAddress(Address);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of setDOB method, of class Employee.
     */
    @Test
    public void testSetDOB() {
        System.out.println("DOB");
        String DOB = "21/12/1990";
        Employee instance = new Employee();
        instance.setDOB(DOB);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNIC method, of class Employee.
     */
    @Test
    public void testSetNIC() {
        System.out.println("NIC");
        String NIC = "903727323V";
        Employee instance = new Employee();
        instance.setNIC(NIC);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

 /**
     * Test of setGender method, of class Employee.
     */
    @Test
    public void testSetGender() {
        System.out.println("Gender");
        String Gender = "Male";
        Employee instance = new Employee();
        instance.setGender(Gender);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }


    /**
     * Test of setEmail method, of class Employee.
     */
    @Test
    public void testSetEmail() {
        System.out.println("Email");
        String Email = "kevin@gmail.com";
        Employee instance = new Employee();
        instance.setEmail(Email);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }


/**
     * Test of setContNo method, of class Employee.
     */
    @Test
    public void testSetContNo() {
        System.out.println("ContNo");
        String ContNo = "9948982224";
        Employee instance = new Employee();
        instance.setContNo(ContNo);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }



    /**
     * Test of setSalary method, of class Employee.
     */
    @Test
    public void testSetSalary() {
        System.out.println("Salary");
        String Salary = "76099";
        Employee instance = new Employee();
        instance.setSalary(Salary);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


/**
     * Test of setJobRole method, of class Employee.
     */
    @Test
    public void testSetJobRole() {
        System.out.println("JobRole");
        String JobRole = "Admin";
        Employee instance = new Employee();
        instance.setJobRole(JobRole);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }



    /**
     * Test of setWorkExp method, of class Employee.
     */
    @Test
    public void testSetWorkExp() {
        System.out.println("WorkExp");
        String WorkExp = "5years";
        Employee instance = new Employee();
        instance.setWorkExp(WorkExp);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }


 /**
     * Test of setQualifictaion method, of class Employee.
     */
    @Test
    public void testSetQualifictaion() {
        System.out.println("Qualifictaion");
        String Qualifictaion = "MBA";
        Employee instance = new Employee();
        instance.setQualifictaion(Qualifictaion);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }


    /**
     * Test of setStartDate method, of class Employee.
     */
    @Test
    public void testSetStartDate() {
        System.out.println("StartDate");
        String startDate = "2011/1/09";
        Employee instance = new Employee();
        instance.setStartDate(startDate);
        // TODO review the generated test code and remove the default call to fail.
       //fail("The test case is a prototype.");
    }
    
}
