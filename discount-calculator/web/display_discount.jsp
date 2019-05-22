<%--
  Created by IntelliJ IDEA.
  User: wesley
  Date: 5/22/19
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

<%
    String descr = request.getParameter("description");
    float price = Float.parseFloat(request.getParameter("price"));
    float discount = Float.parseFloat(request.getParameter("discount_percent"));


    float discount_amount = price * discount *0.01f * 0.1f;
    float discount_price = price - discount_amount;
%>

<div id="content">
    <h1>Product Calculator</h1>
    <label>Product Description:</label>
    <%= descr%> <br>
    <label>Price:</label>
    <%= price%><br>
    <label>Discount Percent:</label>
    <%= discount%><br>
    <label>Discount Amount:</label>
    <%= discount_amount%><br>
    <label>Discount Price:</label>
    <%= discount_price%>

</div>

</body>
</html>
