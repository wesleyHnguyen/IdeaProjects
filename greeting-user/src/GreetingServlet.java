import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "GreetingServlet",urlPatterns = "/login")
public class GreetingServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("username");
        String pass = request.getParameter("password");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        if("admin".equals(name) && "admin".equals(pass)){
            writer.println("<h1>Welcome "+ name +" to website</h1>");
        } else{
            writer.println("<h1>Login Error</h1>");
        }

        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
