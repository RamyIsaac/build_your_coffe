package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/checkout")
public class CheckoutServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Logic to process checkout, calculate total price, and place an order
        // This could involve updating database records, sending confirmation emails, etc.

        // Clear the user's shopping cart after checkout
        ShoppingCart.clearCart();

        // Redirect the user to a confirmation page
        response.sendRedirect(request.getContextPath() + "/confirmation.jsp");
    }
}
