package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.IOException;
import java.util.List;
import com.builder.*;
import com.Director.*;


@WebServlet("/menu")
public class CoffeeMenuServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to fetch the list of available coffee drinks from the database
        List<CoffeeDrink> coffeeDrinks = CoffeeDrink.getCoffeeDrink();

        // Set the list of coffee drinks as an attribute in the request scope
        request.setAttribute("coffeeDrinks", coffeeDrinks);

        // Forward the request to the menu JSP page
        request.getRequestDispatcher("menu.jsp").forward(request, response);
    }
}
