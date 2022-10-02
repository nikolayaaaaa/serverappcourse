package ru.arkhipov.hw1;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "helloWorldServlet", value = "/hello-world-servlet")
public class HelloWorldServlet {
    private String message;

    public void init() {
        message = "Hello World Servlet!";
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {

        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }

}
