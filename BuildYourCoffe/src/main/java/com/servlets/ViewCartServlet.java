package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import com.builder.*;
import com.Director.*;

@WebServlet("/viewCart")
public class ViewCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve the user's shopping cart from the session
        ShoppingCart cart = (ShoppingCart) request.getSession().getAttribute("cart");

        // If the cart is null or empty, redirect the user to an empty cart page
        if (cart == null || cart.isEmpty()) {
            response.sendRedirect(request.getContextPath() + "/emptyCart.jsp");
            return;
        }

        // Otherwise, forward the request to the view cart JSP page
        request.getRequestDispatcher("viewCart.jsp").forward(request, response);
    }
}
