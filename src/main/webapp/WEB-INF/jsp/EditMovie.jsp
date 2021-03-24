<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Movie</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
 <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1"
	crossorigin="anonymous">
<link rel="stylesheet" href="style.css">
</head>
<body>
<header>
        <div class="header">
            <a href="movies" class="logo">Movies</a>
            <div class="header-right">
              <a href="menu">Movies</a>
            </div>
          </div>
       </header>
	<div class="container-fluid"> 
	<form method="post" action="editMovie">
		<h1 style="text-align:center;">Edit Movie</h1>
		<table style="margin:auto;">
			<tr class="edit">
				<td class="edit-col">Movie Id</td>
			</tr>
			<tr class="edit">
				<td class="edit-col"><input class="form-control" type="number" id="movieId" name="movieId" required>
				</td>
			</tr>
			<tr class="edit">
				<td class="edit-col">Title</td>
			</tr>
			<tr class="edit">
				<td class="edit-col"><input class="form-control" type="text" id="title" name="title" required>
				</td>
			</tr>
			<tr class="edit">
				<td class="edit-col">Gross</td>
				<td class="edit-col">Active</td>
		   		<td class="edit-col">Date of Launch</td>
				<td class="edit-col">Genre</td>
			</tr>
			<tr class="edit">
				<td class="edit-col-inp"><input class="form-control" type="text" id="boxOffice"
					name="boxOffice" required></td>
				<td class="edit-col-inp"><input type="radio" id="acti"
					name="active"> <label for="acti">Active</label> <input
					type="radio" id="inacti" name="active"> <label for="inacti">Inactive</label>
				</td>
				 <td class="edit-col-inp"><input type="date" id="day" name="day">
				</td>
				<td class="edit-col-inp"><select id="category" id="genre" name="genre">
						<option id="genre" name="genre" value="none" selected disabled hidden></option>
						<option id="genre" name="genre" value="Science Fiction">Science Fiction</option>
						<option id="genre" name="genre" value="Superhero">Superhero</option>
						<option id="genre" name="genre" value="Romance">Romance</option>
						<option id="genre" name="genre" value="Comedy">Comedy</option>
						<option id="genre" name="genre" value="Adventure">Adventure</option>
						<option id="genre" name="genre" value="Thriller">Thriller</option>
				</select></td>
				 
			</tr>
			<tr class="edit">
				<td class="edit-col"><label for="delivery">Has Teaser</label>
				<input type="checkbox" id="delivery"></td>
			</tr> 
			<tr class="edit">
				<td class="edit-col">
					<input type="submit" class="btn btn-primary" value="Save"/>
				</td>
			</tr>
		</table>
	</form>
	</div>
	<!-- Footer Section-->
     <div class="foot">
        <p>
            &copy; Copyright 2019
        </p>  
    </div>  

        <script
		src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW"
		crossorigin="anonymous"></script>
</body>
</html>