<%--
  Created by IntelliJ IDEA.
  User: Alexander
  Date: 18/06/2017
  Time: 17:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Hello World! It is now: ${currentTime}</h1>
<a href="employee">Get all employees</a>
<br/><br/>

<a href="menu">Get all menus</a>
<br/><br/>


<c:url var="search" value="/employee/search"/>
<form:form action="${search}" method="get">
    <table>
        <tr>
            <td><spring:message text="Enter name or surname"/></td>
            <td><input id="txt" name="target"></td>
        </tr>
    </table>
</form:form>

<c:url var="search" value="/menu/search"/>
<form:form action="${search}" method="get">
    <table>
        <tr>
            <td><spring:message text="Enter menu title"/></td>
            <td><input id="txt1" name="title"></td>
        </tr>
    </table>
</form:form>

</body>
</html>
