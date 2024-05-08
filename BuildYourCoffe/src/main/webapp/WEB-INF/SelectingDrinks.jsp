<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Coffee Shop Menu</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Welcome to Our Coffee Shop</h1>
        <h2>Select Your Coffee Drink</h2>
        <ul>
            <c:forEach var="drink" items="${coffeeDrinks}">
                <li>
                    <form action="customize.jsp" method="post">
                        <input type="hidden" name="drinkId" value="${drink.id}">
                        <h3>${drink.name}</h3>
                        <p>${drink.description}</p>
                        <p>${drink.price}</p>
                        <input type="submit" value="Customize">
                    </form>
                </li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>
