<%--
  Created by IntelliJ IDEA.
  User: wesley
  Date: 5/24/19
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>c: tag if</title>
</head>
<body>

<c:set scope="session" var="salary" value="${2000*2}"  />
<c:if test="${salary > 2000}">
    <p>My salary is: <c:out value="${salary}"/> </p>
</c:if>


</body>
</html>
