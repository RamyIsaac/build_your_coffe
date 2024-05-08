<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Order Summary</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Order Summary</h1>
        
        <h2>Selected Coffee Drinks:</h2>
        <ul>
            <c:forEach var="orderItem" items="${orderItems}">
                <li>
                    <strong>${orderItem.drinkName}</strong>
                    <ul>
                        <li>Size: ${orderItem.size}</li>
                        <li>Milk Type: ${orderItem.milkType}</li>
                        <li>Syrup: ${orderItem.syrup}</li>
                        <li>Topping: ${orderItem.topping}</li>
                        <li>Quantity: ${orderItem.quantity}</li>
                        <li>Price: $${orderItem.price}</li>
                    </ul>
                </li>
            </c:forEach>
        </ul>

        <h2>Total Price: $${totalPrice}</h2>

        <form action="checkout.jsp" method="post">
            <input type="submit" value="Proceed to Checkout">
        </form>
    </div>
</body>
</html>
