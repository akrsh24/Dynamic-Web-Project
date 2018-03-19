<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="./css/style.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="page-header">Student Information Portal</div>
		<hr />
		<br />
		<form action="add-students" method="post">

			<div class="row">
				<div class="col-25">
					<label for="rollno">Roll No:</label>
				</div>
				<div class="col-75">
					<input type="number" id="rollno" name="rollno"
						placeholder="Your roll no...">
				</div>
			</div>

			<div class="row">
				<div class="col-25">
					<label for="name">Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="name" name="name" placeholder="Your name..">
				</div>
			</div>

			<div class="row">
				<div class="col-25">
					<label for="country">Country</label>
				</div>
				<div class="col-75">
					<select id="country" name="country">
						<option value="australia">Australia</option>
						<option value="canada">Canada</option>
						<option value="usa">USA</option>
					</select>
				</div>
			</div>

			<div class="row">
				<div class="col-25">
					<label for="department">Department</label>
				</div>
				<div class="col-75">
					<select id="department" name="department">
						<option value="cse">CSE</option>
						<option value="ece">ECE</option>
						<option value="me">ME</option>
					</select>
				</div>
			</div>
			<br />
			<div class="row">
				<input type="submit" value="Submit">
			</div>
		</form>
	</div>
	 <script src="./node_modules/jquery/dist/jquery.js"></script>
    <script src="./app.js"></script>
</body>
</html>