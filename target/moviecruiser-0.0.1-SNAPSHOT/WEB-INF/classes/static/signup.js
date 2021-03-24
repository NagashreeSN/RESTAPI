function validateForm() {

	let x = document.forms["Myform"]["uname"].value;
	let y = document.forms["Myform"]["fname"].value;
	let z = document.forms["Myform"]["lname"].value;
	let a = document.forms["Myform"]["pass"].value;
	let b = document.forms["Myform"]["cpass"].value;

	if (x.length == 0) {
		document.getElementById("error").innerHTML = "Username can not be empty";
		return false;
	}

	if (y.length == 0) {
		document.getElementById("error").innerHTML = "First name can not be empty";
		return false;
	}

	if (z.length == 0) {
		document.getElementById("error").innerHTML = "Last name can not be empty";
		return false;
	}

	if (y.length <= 2 || y.length > 12) {
		document.getElementById("error").innerHTML = "First name should be in between 2 to 12 characters";
		return false;
	}

	if (z.length <= 2 || z.length > 12) {
		document.getElementById("error").innerHTML = "Last name should be in between 2 to 12 characters";
		return false;
	}

	if (!isNaN(x) || !isNaN(y) || !isNaN(z)) {
		document.getElementById("error").innerHTML = "Name cannot be in numbers!";
		return false;
	}

	if (a.length == 0) {
		document.getElementById("error").innerHTML = "Please set your Password!";
		return false;
	}

	if (a === b) {
		alert("Registered Successfully")
		document.forms["Myform"].action = "/login"
		return true;
	}

	else {
		alert("Oops! Re-enter your Password")
		return false;
	}

}