<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	</head>

	<body class="bg-secondary text-light">
		<div class="col-6 mx-auto my-4 p-4 border border-light rounded">
			<h2 class="text-center">Dojo Survey</h2>
			<form class="" method="POST" action="/submitSurvey">
				
				<div class="form-group">
					<label>Your Name:</label>
					<input type="text" class="form-control" name="name">
				</div>
				
				<div class="form-group">
					<label>Dojo Location:</label>
					<select class="form-control" name="location">
						<option>San Jose</option>
						<option>Chicago</option>
						<option>Dallas</option>
						<option>Online</option>
					</select>
				</div>
				
				<div class="form-group">
					<label>Favorite Language:</label>
					<select class="form-control" name="language">
						<option>Python</option>
						<option>C#</option>
						<option>Java</option>
						<option>PHP</option>
					</select>
				</div>
			
				
				<div class="form-group">
					<label>Comment (optional): 
						<textarea class="form-control" cols="80" rows="3" name="comment"></textarea>
					</label>
				</div>
				
				<div class="d-flex justify-content-end">
					<button class="btn btn-info">Submit Survey</button>
				</div>
			</form>
		</div>
	</body>
</html>