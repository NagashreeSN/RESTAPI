<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link href='https://fonts.googleapis.com/css?family=Amita'
	rel='stylesheet'>
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="style.css">
</head>
<body>
	<script src="login.js"></script>
	<header>
        <div class="header">
            <a href="truyum" class="logo">Movies</a>
            <div class="header-right">
            </div>
          </div>
       </header>
       
<!-- login form -->
	<div> 
	<form name="Myform" onsubmit="return validateForm()" method="POST">
	<h1 style="padding-left: 460px; margin:auto;">Login</h1>
	<div class="signup-container">
		<label><b>Username</b></label>
		<input type="text" placeholder="Enter Username" name="username" id="username">
		<p id="error" style="color:red;"></p>
		<label><b>Password</b></label>
		<input type="password" placeholder="Enter Password" name="pass" id="pass">
		<p id="passerror" style="color:red;"></p>
		<div class="clearfix">
			<button type="submit" class="login">Login</button>
		</div>
		<div>
			<p>New user?<a href="sign">Sign Up</a></p>
		</div>
	</div>
	</form>
	</div>
<!-- Footer Section-->
     <div class="foot">
        <p>
            &copy; Copyright 2019
        </p>  
    </div> 
</body>
</html>