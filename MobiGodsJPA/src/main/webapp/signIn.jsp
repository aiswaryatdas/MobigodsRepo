<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor=yellow>
<center>
<h1>SignIn</h1>
<form action="/mobigods/signinaction" method="post">
<table>
<tr><td>Name</td><td><input type="text" name="lname" required placeholder="name"></td></tr>
<tr><td>Password</td><td><input type="text" name="lpassword" required placeholder="password"></td></tr>
<tr><td></td><td><input type="submit" value="SignIn"></td></tr>
</table>
</form>
</center>

</body>
</html>