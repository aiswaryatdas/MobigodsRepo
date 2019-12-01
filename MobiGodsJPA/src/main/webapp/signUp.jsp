<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
</head>
<center>
<body bgcolor=yellow>
<h1>SignUp</h1>

<form action="/mobigods/signupaction" method="post">
<table>
<tr><td>Name</td><td><input type="text" name="name" required placeholder="name"></td></tr>
<tr><td>Password</td><td><input type="text" name="password" required placeholder="password"></td></tr>
<tr><td>Email</td><td><input type="email" name="email" required placeholder="email"></td></tr>
<tr><td>Ph.No</td><td><input type="text" name="phno" required pattern="[987][0-9]{9}" placeholder="Mobile"></td></tr>
<tr><td>Address</td><td><textarea type="text" name="address" required placeholder="address"></textarea></td></tr>
<tr><td></td><td><input type="submit" value="SignUp"></td></tr>

</table>
</form>


</body>
</center>
</html>