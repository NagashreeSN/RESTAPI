function validateForm() {

	let x = document.forms["Myform"]["username"].value;
	let y = document.forms["Myform"]["pass"].value;

	if (x.length == 0) {
		document.getElementById("error").innerHTML = "Username can not be empty";
		return false;
	}

	if (x.length <= 2 || x.length > 15) {
		document.getElementById("error").innerHTML = "Username should be in between 2 to 15 characters";
		return false;
	}

	if (!isNaN(x)) {
		document.getElementById("error").innerHTML = "Username cannot be in numbers!";
		return false;
	}

	if (y.length == 0) {
		document.getElementById("error").innerHTML = "Password cannot be empty!!";
		return false;
	}

	if (x == "admin" && y == "admin123") {
		document.forms["Myform"].action = "/adminMovieList"
		return true;
	}

	if (x == "user" && y == "user123") {
		document.forms["Myform"].action = "/customerMovieList"
		return true;
	}

	else {
		alert("Oops! Incorrect username or password")
		return false;
	}
}