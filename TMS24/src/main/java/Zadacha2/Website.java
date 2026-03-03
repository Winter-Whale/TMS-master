package Zadacha2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/website")
public class Website extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String ageInput = req.getParameter("age");
        int userAge = Integer.parseInt(ageInput);
        if (userAge >= 18) {
            out.println("Вы совершеннолетний");
        } else {
            out.println("Вы несовершеннолетний");
        }
    }
}
