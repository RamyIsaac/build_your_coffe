package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import java.io.IOException;
import com.builder.*;
import com.Director.*;
@WebServlet("/addToCart")
public class AddToCartServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve selected coffee drink details from the request parameters
        String drinkId = request.getParameter("drinkId");
        String size = request.getParameter("size");
        String milkType = request.getParameter("milkType");
        String syrup = request.getParameter("syrup");
        String topping = request.getParameter("topping");
        int quantity = Integer.parseInt(request.getParameter("quantity"));

        // Construct a new CoffeeDrink object with the selected options
        CoffeeDrink coffeeDrink = new CoffeeDrink(drinkId, size, milkType, syrup, topping, quantity, null);

        // Add the selected coffee drink to the user's shopping cart
        ShoppingCart.addToCart(coffeeDrink);

        // Redirect the user to the view cart page
        response.sendRedirect(request.getContextPath() + "/viewCart");
    }
}
