<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Movie List</title>
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
	<div class="container-sm">
		<table class="table table-striped">
			<caption>Movies</caption>
			<thead>
				<tr>
					<th>Title</th>
					<th>Box Office</th>
					<th>Active</th>
					<th>Date of Launch</th>
					<th>Genre</th>
					<th>Has Teaser</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${mList}" var="mitem">
					<tr>
						<td>${mitem.title}</td>
						<td>$${mitem.boxOffice}</td>
						<td>${mitem.active}</td>
						<td>${mitem.dateOfLaunch}</td>
						<td>${mitem.genre}</td>
						<td>${mitem.hasTeaser}</td>
						<td><a href="editMovie?movieId=${mitem.movieId}">
                			<button type="button" value="Edit" class="btn btn-primary">Edit</button></a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
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