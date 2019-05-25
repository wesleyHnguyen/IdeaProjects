import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

@WebServlet(name = "CustomerServlet",urlPatterns = "/list_customer")
public class CustomerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> list = new LinkedList<>();

        list.add(new Customer("Mai Van Hoan","1983-08-20","Hanoi","hoan.jpg"));
        list.add(new Customer("Nguyen Van Nam","1983-03-20","Hai Duong","nam.jpeg"));
        list.add(new Customer("Nguyen Mai Hoa","1990-10-08","Hanoi","hoa.jpeg"));
        list.add(new Customer("Tring Dinh Tung","1993-02-09","Bac Giang","tung.jpeg"));
        list.add(new Customer("Tran Dang Khoa","1983-09-09","Ha tay","khoa.jpeg"));


       // Customer customer = new Customer("Nguyen Van An","1995-09-25","Ha Tay", "an.img");



        request.setAttribute("list", list);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("listcustomer.jsp");
        requestDispatcher.forward(request,response);

    }
}
