<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>update</title>
</head>
<body>
<form action="/mobigods/updateAction" method="post">
<table>
<tr><td><input type="hidden" name="name" value="${user.name}>
<tr><td>password<td><input type="text" name="password">
<tr><td>Email<td><input type="text" name="email">
<tr><td>PhNo<td><input type="text" name="phno">
<tr><td>Address<td<input type="text" name="address">
<tr><td><td><input type="submit" value="submit">
</table>
</form>


</body>
</html>