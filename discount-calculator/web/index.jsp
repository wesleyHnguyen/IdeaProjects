<%--
  Created by IntelliJ IDEA.
  User: wesley
  Date: 5/22/19
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Discount form</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
<div id="content">
  <h1>Product Calculator</h1>
      <form method="post" action="display_discount">
        <div id="data">
          <label for="name">Product Description:</label>
          <input id="name" type="text" name="description"/><br/>
          <label for="price">List Price:</label>
          <input id="price" type="text" name="price"/><br/>
          <label for="discount">Discount Percent:</label>
          <input id="discount" type="text" name="discount_percent"/>(%)<br/>
        </div>
        <div id="buttons">
          <label>&nbsp;</label>
          <input type="submit" value="Calculate Discount"/>
        </div>
      </form>
</div>
  </body>
</html>
