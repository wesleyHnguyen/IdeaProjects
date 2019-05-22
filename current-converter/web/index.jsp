<%--
  Created by IntelliJ IDEA.
  User: wesley
  Date: 5/22/19
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
  <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<h2>Currency Converter</h2>
<form action="convert" method="post">
  <label for="rate">Rate: </label><br/>
  <input type="text" name="rate" id="rate" placeholder="RATE" value="22000"/><br/>
  <label for="usd">USD: </label><br/>
  <input type="text" name="usd" id="usd" placeholder="USD" value="0"/><br/>
  <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>
