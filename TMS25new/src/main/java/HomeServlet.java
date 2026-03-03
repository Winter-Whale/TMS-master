import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/home")
public class HomeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        HttpSession session = req.getSession(false);


        if (session == null || session.getAttribute("login") == null) {
            resp.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Ошибка входа, пожалуйста авторизируйтесь");
        } else {

            String login = (String) session.getAttribute("login");
            String role = (String) session.getAttribute("role");


            resp.setContentType("text/html");
            PrintWriter out = resp.getWriter();
            out.println(login + " Welcome to Website");
            out.println("Your role: " + role);
        }
    }
}
