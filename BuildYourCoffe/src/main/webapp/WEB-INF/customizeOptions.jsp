<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customize Your Coffee Drink</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Customize Your Coffee Drink</h1>
        <form action="confirmOrder.jsp" method="post">
            <input type="hidden" name="drinkId" value="${param.drinkId}">
            <label for="size">Size:</label>
            <select name="size" id="size">
                <option value="Small">Small</option>
                <option value="Medium">Medium</option>
                <option value="Large">Large</option>
            </select>
            <label for="milkType">Milk Type:</label>
            <select name="milkType" id="milkType">
                <option value="Regular">Regular</option>
                <option value="Skimmed">Skimmed</option>
                <option value="Soy">Soy</option>
            </select>
            <label for="syrup">Syrup:</label>
            <input type="text" name="syrup" id="syrup">
            <label for="topping">Topping:</label>
            <input type="text" name="topping" id="topping">
            <label for="quantity">Quantity:</label>
            <input type="number" name="quantity" id="quantity" value="1" min="1">
            <input type="submit" value="Add to Cart">
        </form>
    </div>
</body>
</html>
