import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display_discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String descr = request.getParameter("description");
        float price = Float.parseFloat(request.getParameter("price"));
        float discount = Float.parseFloat(request.getParameter("discount_percent"));


        float discount_amount = price * discount *0.01f * 0.1f;
        float discount_price = price - discount_amount;


        request.setAttribute("discount_amount",discount_amount);
        request.setAttribute("discount_price", discount_price);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("display_discount.jsp");
        requestDispatcher.forward(request,response);



//        PrintWriter writer = response.getWriter();
//
//        writer.println("<html>");
//        writer.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"css/style.css\">");
//
//
//        writer.println("<div id='content'>");
//        writer.println("<h1> Product Discount Calculator </h1>");
//
//        writer.println("<h2>Product Description:" + descr  +   "</h2>");
//
//        writer.println("<h2>Price: " + price  +   "</h2>");
//        writer.println("<h2>Discount Percent: " + discount  +   "% </h2>");
//        writer.println("<h2>Discount Amount: " + discount_amount  +   "</h2>");
//        writer.println("<h2>Discount Price: " + discount_price  +   "</h2>");
//        writer.println("</div>");
//
//        writer.println("</html>");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
