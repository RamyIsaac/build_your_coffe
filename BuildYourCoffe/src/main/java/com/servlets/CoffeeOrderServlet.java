package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.builder.*;

import com.Director.CoffeeOrderDirector;



import java.util.HashMap;
import java.util.Map;

public class CoffeeOrderServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String drinkType = request.getParameter("drinkType");
        String size = request.getParameter("size");
        String milkType = request.getParameter("milkType");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        CoffeeOrderDirector director;
        CoffeeDrink drink;

        if ("cappuccino".equalsIgnoreCase(drinkType)) {
            CappuccinoBuilder cappuccinoBuilder = new CappuccinoBuilder();
            director = new CoffeeOrderDirector(cappuccinoBuilder);
        } else if ("espresso".equalsIgnoreCase(drinkType)) {
            EspressoBuilder espressoBuilder = new EspressoBuilder();
            director = new CoffeeOrderDirector(espressoBuilder);
        } else {
            // Handle other drink types
            return;
        }

        Map<String, String> customizationOptions = new HashMap<>();
        // Add customization options based on request parameters

        director.constructCoffeeDrink(drinkType, size, milkType, customizationOptions, quantity);
        drink = director.getCoffeeDrink();

        // Process the coffee order, save to database, etc.

        response.getWriter().println("Your " + drinkType + " order has been processed!");
    }
}