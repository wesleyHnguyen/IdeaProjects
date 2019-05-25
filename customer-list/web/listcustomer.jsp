<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: wesley
  Date: 5/24/19
  Time: 3:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>List all customers</title>

    <style>

        body{
            width: 1140px;
        }
        table{
            width: 90%;
            margin: 0 auto;
            text-align: center;
        }

        td{
            border-bottom: 2px solid burlywood;
            height: 50px;
        }

        img{
            width: 120px;
            height: 110px;
        }

    </style>

</head>
<body>

<h1>Customer List</h1>

<table>
    <tr>
        <th>Name</th>
        <th>Date of birth</th>
        <th>Address</th>
        <th>Anh</th>
    </tr>

    <c:forEach var="i" begin="0" end="${list.size() - 1}">
        <tr>
            <td> <c:out value="${list.get(i).getName()}"/> </td>
            <td> <c:out value="${list.get(i).getNgaysinh()}"/> </td>
            <td> <c:out value="${list.get(i).getDiachi()}"/> </td>
            <td><img src="img/${list.get(i).getAnh()}"></td>
        </tr>
    </c:forEach>



</table>

</body>
</html>
