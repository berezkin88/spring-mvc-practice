<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 23/06/2017
  Time: 00:38
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<table style="align-items: center">
    <tr>
        <th>First Name</th>
        <th>Last Name</th>
        <th>Position</th>
    </tr>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td><a href="/employee/${employee.name}">${employee.name}</a></td>
            <td>${employee.surname}</td>
            <td>${employee.position}</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>
