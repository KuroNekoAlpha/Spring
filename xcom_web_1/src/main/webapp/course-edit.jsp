<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
<title>Edit</title>
</head>
<body>
	<div class="container mt-4">
		<h1>Add New Course</h1>
		<div class="row">
			<div class="col-4">
				<c:url  value="/courses" var="save"/>
				<form action="${save}" method="post">
					<div class="mb-3">
						<label class="form-label">Name</label>
						<input type="text" name="name" required="required" placeholder="Enter class name" class="form-control"/>
					</div>	
					<div class="mb-3">
						<label class="form-label">Duration</label>
						<input type="number" name="duration" required="required" placeholder="Enter class duration" class="form-control"/>
					</div>	
					<div class="mb-3">
						<label class="form-label">Fees</label>
						<input type="number" name="fees" required="required" placeholder="Enter class fees" class="form-control"/>
					</div>	
					<div class="mb-3">	
						<label class="form-label">Description</label>
						<textarea rows="4" cols="40" name="description" class="form-control"></textarea>
					</div>
					<a href="/"> 
					<input type="button" value="Back" class="btn btn-danger" />
					</a>
					<input type="submit" value="Save Course" class="btn btn-primary"/>
				</form>
			
			</div>
		</div>
	</div>

</body>
</html>