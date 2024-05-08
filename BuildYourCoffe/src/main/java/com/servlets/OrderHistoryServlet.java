package com.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


import com.builder.CoffeeDrink;
import databaseConnection.DataAccessException;
import databaseConnection.DatabaseConnection;
import databaseConnection.MySqlDatabaseConnection;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrderHistoryServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<CoffeeDrink> orderHistory = getOrderHistoryFromDatabase();

        // Set the order history as a request attribute
        request.setAttribute("orderHistory", orderHistory);

        // Forward the request to a JSP page for rendering the order history
        request.getRequestDispatcher("/WEB-INF/order-history.jsp").forward(request, response);
    }

    private List<CoffeeDrink> getOrderHistoryFromDatabase() {
        List<CoffeeDrink> orderHistory = new ArrayList<>();

        try {
            DatabaseConnection databaseConnection = new MySqlDatabaseConnection(new databaseConnection.DatabaseConfig("jdbc:mysql://localhost:3306/coffeshopmenu", "root", "Ramy2030"));
            Connection connection = databaseConnection.getConnection();

            String query = "SELECT * FROM order_history";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String baseDrink = resultSet.getString("base_drink");
                String size = resultSet.getString("size");
                String milkType = resultSet.getString("milk_type");
                int quantity = resultSet.getInt("quantity");

                CoffeeDrink drink = new CoffeeDrink(baseDrink, size, milkType, null, quantity);
                orderHistory.add(drink);
            }

            connection.close();
        } catch (SQLException e) {
            throw new DataAccessException("Error retrieving order history from the database", e);
        }

        return orderHistory;
    }
}