<%--
  Created by IntelliJ IDEA.
  User: wesley
  Date: 5/31/19
  Time: 9:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sandwich Condiments</title>
  </head>
  <body>

  <h1>SandWich Condiments </h1>
<form action="condiments" method="post">
  <input type="checkbox" name="condiment" value="lettuce"> <label>Lettuce</label>
  <input type="checkbox" name="condiment" value="tomato"> <label>Tomato</label>
  <input type="checkbox" name="condiment" value="mustard"> <label>Mustard</label>
  <input type="checkbox" name="condiment" value="sprout"> <label>Sprout</label>
  <p></p>
  <input type="submit" value="submit">
</form>
  </body>
</html>
