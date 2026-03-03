import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/log")
public class LoginServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String login = req.getParameter("login");
        String password = req.getParameter("password");

        if (login == null || password == null || login.isEmpty() || password.isEmpty()) {
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Username and password are required");
            return;
        }

        User user = Base.searche(login, password);
        if (user != null) {
            HttpSession session = req.getSession(true);

            session.setAttribute("login", user.getLogin());
            session.setAttribute("role", user.getRole());

            resp.sendRedirect(req.getContextPath() + "/home");
        } else {
            out.println("Ошибка входа: неверный логин или пароль");
        }
    }
}
