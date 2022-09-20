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

    public void destroy() {
    }

}
