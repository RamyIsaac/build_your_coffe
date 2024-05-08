<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Shopping Cart</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
    <div class="container">
        <h1>Shopping Cart</h1>
        
        <table>
            <thead>
                <tr>
                    <th>Drink</th>
                    <th>Size</th>
                    <th>Milk Type</th>
                    <th>Syrup</th>
                    <th>Topping</th>
                    <th>Quantity</th>
                    <th>Price</th>
                </tr>
            </thead>
            <tbody>
                <!-- Loop through the cart items and display them in the table -->
            </tbody>
        </table>

        <form action="checkout" method="post">
            <input type="submit" value="Proceed to Checkout">
        </form>
    </div>
</body>
</html>
