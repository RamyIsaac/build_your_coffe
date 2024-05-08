package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.builder.*;

import java.io.IOException;

@WebServlet("/customize")
public class CustomizeCoffeeServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve selected coffee drink ID from the request parameters
        String drinkId = request.getParameter("id");

        // Fetch the coffee drink details based on the ID from the database or a service
        CoffeeDrink coffeeDrink = CoffeeDrink.getCoffeeDrinkById(drinkId);

        // Set the selected coffee drink as an attribute in the request scope
        request.setAttribute("coffeeDrink", coffeeDrink);

        // Forward the request to the customization JSP page
        request.getRequestDispatcher("customize.jsp").forward(request, response);
    }
}
