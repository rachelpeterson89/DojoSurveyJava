<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body class="bg-secondary text-light">
	<div class="col-6 mx-auto my-4 p-4 border border-light rounded">
		<h2 class="text-center">Form Results (Java Lovers)</h2>
		<p>Name: <c:out value="${name}"/></p>
		<p>Dojo Location: <c:out value="${location}"/></p>
		<p>Favorite Language: <c:out value="${language}"/></p>
		<p>Comment: <c:out value="${comment}"/></p>
		<p>How many times form has been submitted: <c:out value="${counter}"/></p>
		<div class="d-flex justify-content-end">
			<a href="/" class="btn btn-info">Back</a>
		</div>
	</div>
</body>
</html>