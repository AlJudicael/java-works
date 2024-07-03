import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
      protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Login Form</h2>");
        out.println("<form action='LoginServlet' method='post'>");
        out.println("Username: <input type='text' name='username'><br><br>");
        out.println("Password: <input type='password' name='password'><br><br>");
        out.println("<input type='submit' value='Login'>");
        out.println("</form>");
        out.println("</body></html>");
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Getting form data
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        
        // Setting response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        // Simple validation logic
        if (username == null || username.isEmpty() || password == null || password.isEmpty()) {
            out.println("<html><body>");
            out.println("<h3>Please enter both username and password</h3>");
            out.println("<a href='index.html'>Try again</a>");
            out.println("</body></html>");
        } else if (username.equals("admin") && password.equals("admin123")) {
            out.println("<html><body>");
            out.println("<h3>Welcome, " + username + "!</h3>");
            out.println("</body></html>");
        } else {
            out.println("<html><body>");
            out.println("<h3>Invalid username or password</h3>");
            out.println("<a href='index.html'>Try again</a>");
            out.println("</body></html>");
        }
    }
}
