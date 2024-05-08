package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve username and password from the request parameters
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Validate username and password (you may use a service or database for validation)

        // For demonstration purposes, let's assume the login is successful
        // Set the user's information in the session
        request.getSession().setAttribute("username", username);

        // Redirect the user to the home page after successful login
        response.sendRedirect(request.getContextPath() + "/home.jsp");
    }
}
