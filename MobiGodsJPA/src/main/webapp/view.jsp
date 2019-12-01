<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<center>
<body bgcolor=yellow>

<c:if test="${not empty userList }">
<h1>UserList</h1>
<table border=1>
<tr>
<th>ID</th>
<th>Name</th>
<th>password</th>
<th>Email</th>
<th>PhNo</th>
<th>Address</th>
<th>Action</th>
<th>Action</th>
</tr>
<c:forEach items="${userList}" var="user">
<tr>
<td>${user.id}</td>
<td>${user.name }</td>
<td>${user.password }</td>
<td>${user.email }</td>
<td>${user.phno }</td>
<td>${user.address }</td>
<td><a href="mobigods/update?id=${user.id}">Update</a></td>
<td><a href="mobigods/delete?id=${user.id }">Delete</a></td>
</c:forEach>
</table>
</c:if>


</body>
</center>
</html>