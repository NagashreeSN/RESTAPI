<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Favorites</title>
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
              <a href="customerMovieList">Movies</a>
            </div>
          </div>
       </header>
<div class="container">
		<div class="table">
			<h1>Favorites</h1>
			<form action="">
			<table  class="table table-striped">
				<thead>
					<tr class="su">
						<th class="col-s">Id</th>
						<th class="col-s">Title</th>
						<th class="col-s">Box Office</th>
						<th class="col-s">Genre</th>
						<th class="col-s">Action</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${movies}" var="item">
						<tr class="su">
							<td class="col-s">${item.movieId}</td>
							<td class="col-s">${item.title}</td>
							<td class="col-s">${item.boxOffice}</td>
							<td class="col-s">${item.genre}</td>
							<td class="col-s"><a href="deleteFavorites?movieId=${item.movieId}">
							<button type="button" value="Delete Item">Delete</button> </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			</form>
			<div>
				<p style="text-align:center;font-size:1.5em;">No.Of favorites is :${total}</p>
			</div>
		</div>
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