<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
<center>
<form style="width:cover;
		height:cover;
		background-color:skyblue;
		border:1px solid black;
		padding:25px;"action="register" method=post>
		<h2 style="color:black;align:center;"><b>REGISTERATION FORM</b></h2>
		<label>Employee Id:</label>
		<input type="number" name="empid" placeholder="Enter your Employee Id"></br></br>
		<label>Employee Name:</label>
		<input type="text" name="empname" placeholder="Enter your name"></br></br>
		<label>Contact:</label>
		<input type="number" name="contact" placeholder="Enter your contact number"></br></br>
		<label>Email:</label>
		<input type="email" name="email" placeholder="Enter your email-id"></br></br>
		<input style="background-color:Pink"; type="submit" value="Sign-up"></br></br>
		
	
</form>   
</center>
</div>
</body>
</html>