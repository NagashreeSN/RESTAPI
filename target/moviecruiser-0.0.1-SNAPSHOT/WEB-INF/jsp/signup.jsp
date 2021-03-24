<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign Up</title>
<link href='https://fonts.googleapis.com/css?family=Amita'
	rel='stylesheet'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="signup.css">
</head>
<body>
	<script src="signup.js"></script>
	<header>
        <div class="header">
            <a href="truyum" class="logo">Movies</a>
            <div class="header-right">
              <a href="menu">Movies</a>
              <a href="login">Login</a>
            </div>
          </div>
       </header>
       
<!-- signup form -->
       <div>  
	<form name="Myform" onsubmit="return validateForm()" method="POST">
		<table>
			<h1 style="padding-left: 30px;">SignUp</h1>
			<tr class="su">
				<td class="col-s">Username</td>
			</tr>
			<tr class="su">
				<td class="col-s"><input type="text" id="uname" name="uname"
					placeholder="Enter Username"></td>
			</tr>
			<tr class="su">
				<td class="col-s">First Name</td>
				<td class="col-s">Last Name</td>
			</tr>
			<tr class="su">
				<td class="col-s"><input type="text" id="fname" name="fname"
					placeholder="Enter First Name"></td>
				<td class="col-s"><input type="text" id="lname" name="lname"
					placeholder="Enter Last Name"></td>
			</tr>
			<tr class="su">
				<td class="col-s">Password</td>
				<td class="col-s">Confirm Password</td>
			</tr>
			<tr class="su">
				<td class="col-s"><input type="password" id="pass" name="pass"
					placeholder="Enter Password"></td>
				<td class="col-s"><input type="password" id="cpass"
					name="cpass" placeholder="Enter confirm Password"></td>
			</tr>
			<tr class="su">
				<td class="col-s">
					<button id="sbut">SignUp</button>
				</td>
			</tr>
		</table>
		<div id="error" id="error">
			<p></p>
		</div>
	</form>
	<!-- Footer Section-->
     <div class="foot">
        <p>
            &copy; Copyright 2019
        </p>  
    </div>   
</body>
</html>