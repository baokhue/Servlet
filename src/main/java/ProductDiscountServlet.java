import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ProductDiscountServlet", value = "/display_discount")
public class ProductDiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double price = Double.parseDouble(request.getParameter("price"));
        double percent = Double.parseDouble(request.getParameter("percent"));

        double amount = price * percent * 0.01;
        double discountPrice = price * percent;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<td>Discount Amount: </td>");
        writer.println("<td>" + amount + "</td>");
        writer.println("</tr>");
        writer.println("<tr>");
        writer.println("<td>Discount Price: </td>");
        writer.println("<td>" + discountPrice + "</td>");
        writer.println("</tr>");
        writer.println("</html>");
    }
}
