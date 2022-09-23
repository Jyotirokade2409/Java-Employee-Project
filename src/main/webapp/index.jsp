<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Portal</title>
</head>
<body>
<div class="container">
<center>
<form style="width:cover;
		height:cover;
		background-color:skyblue;
		border:1px solid black;
		padding:25px;"action="login" method=post>
		<h2 style="color:black;align:center;"><b>LOGIN FORM</b></h2>
		<label>Employee Id:</label>
		<input type="text" name="empid" placeholder="Enter your Employee Id"></br></br>
		<label>Employee Name:</label>
		<input type="text" name="empname" placeholder="Enter your name"></br></br>
		<input style="background-color:Pink"; type="submit" value="login"></br></br>
		<p>Not Register yet? <a href="signup.jsp">Register here</a></p>
</form>   
</center>
</div>
</body>
</html>