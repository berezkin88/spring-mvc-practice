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
        <th>Phone Number</th>
        <th>Salary</th>
    </tr>
        <tr>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.position}</td>
            <td>${employee.telephoneNumber}</td>
            <td>${employee.salary}</td>
        </tr>
</table>

</body>
</html>
