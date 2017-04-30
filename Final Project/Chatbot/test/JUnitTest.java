import PL.loginServlet;
import PL.Chat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.*;
import org.junit.Test;
import org.mockito.Mock;
 

public class JUnitTest {

    public JUnitTest() {
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

    @Mock
    HttpServletRequest request;
    @Mock
    HttpServletResponse response;
    @Mock
    HttpSession session;

    @Mock
    RequestDispatcher rd;
 
    @Test
    public void testServlet() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        RequestDispatcher rd = mock(RequestDispatcher.class);

        request.setAttribute("user", "Admin");
        request.setAttribute("pass", "admin");
        request.setAttribute("userType_Id", "admin");
        when(request.getParameter("user")).thenReturn("Admin");
        when(request.getParameter("pass")).thenReturn("admin");
        when(request.getParameter("userType_Id")).thenReturn("admin");
        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("/Admin.jsp")).thenReturn(rd);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        when(response.getWriter()).thenReturn(pw);

        new loginServlet().doPost(request, response);

        //Verify the session attribute value
        verify(session).setAttribute("Admin", "admin");

        verify(rd).forward(request, response);

        String result = sw.getBuffer().toString().trim();

        System.out.println("Result: " + result);

        assertEquals("Login successfull...", result);
    }

    @Test
    public void testServletChat() throws Exception {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        RequestDispatcher rd = mock(RequestDispatcher.class);

        when(request.getParameter("chattext")).thenReturn("chattext");

        when(request.getSession()).thenReturn(session);
        when(request.getRequestDispatcher("/Home.jsp")).thenReturn(rd);

        StringWriter sw = new StringWriter();
        PrintWriter pw = new PrintWriter(sw);

        when(response.getWriter()).thenReturn(pw);

        new Chat().doPost(request, response);

        request.setAttribute("chattxt", request.getParameter("chattext"));

        verify(rd).forward(request, response);

        String result = sw.getBuffer().toString().trim();
        assertEquals("Chat Module Successfull...", result);
    }

}
