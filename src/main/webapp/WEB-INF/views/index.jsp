<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ page contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>Restaurapp - Home</title>
<link href='<spring:url value="/resources/css/style.css"/>' rel="stylesheet" />
<link href="style.css" rel="stylesheet"/>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.6.1/css/all.css"
	integrity="sha384-gfdkjb5BdAXd+lj+gudLWI+BXq4IuLW5IT+brZEZsLFm++aCMlF1V92rMkPaX4PP"
	crossorigin="anonymous">

	<style>
		   @import url('https://fonts.googleapis.com/css?family=Anton');
		   @import url('https://fonts.googleapis.com/css?family=Lobster');
		   @import url('https://fonts.googleapis.com/css?family=Saira+Extra+Condensed');
		   @import url('https://fonts.googleapis.com/css?family=Roboto');
		   @import url('https://fonts.googleapis.com/css2?family=Sacramento&display=swap');
		   @import url('https://fonts.googleapis.com/css2?family=Rajdhani:wght@300&display=swap');
		   @import url('https://fonts.googleapis.com/css2?family=Xanh+Mono&display=swap');
		   @import url('https://fonts.googleapis.com/css2?family=Montserrat:wght@200&display=swap');
		   @import url('https://fonts.googleapis.com/css2?family=Parisienne&display=swap');
		   
		   .failed{
		   		color:red;
		   }
	</style>
</head>
<body>
<div class="container-fluid">

	<div class="row logo-pozadina">
		<div class="col-md-4 p-0 m-0">
		</div>
		<div class="col-md-4 p-0 m-0">
			<img src="images/fire.png" class="img-fluid" alt="Fire"/>
		</div>
		<div class="col-md-4 p-0 m-0">
		</div>
	</div>
	
	<security:authorize access="isAnonymous()">
		<div class="row login-warning">
			<div class="col-md-12 centar">
				<p>You are not logged in.</p>
				<a href="${pageContext.request.contextPath}/login"><input type="submit" class="dugme" value="Log in"/></a>
			</div>
		</div>
	</security:authorize>
	
	<security:authorize access="isAuthenticated()">
		<div class="row login-warning">
			<div class="col-md-12 centar">
				<p>User: <security:authentication property="principal.username"/></p>
				<a href="${pageContext.request.contextPath}/logout"><input type="submit" class="dugme" value="Log out"/></a>
				<p>${message}</p>
			</div>
		</div>
	</security:authorize>
	
	<security:authorize access="hasAuthority('ADMIN')">
		<div class="row category-bg">
			<div class="col-md-4 category-rectangle">
				<h1>Menu</h1>
			</div>
			<div class="col-md-4 category-rectangle">
				<h1>Card of drinks</h1>
			</div>
			<div class="col-md-4 category-rectangle">
				<h1>Employees</h1>
			</div>
		</div>
		<div class="row category-bg">
			<div class="col-md-4 category-rectangle">
				<h1>Tables</h1>
			</div>
			<div class="col-md-4 category-rectangle">
				<h1>Statistics</h1>
			</div>
			<div class="col-md-4 category-rectangle" onclick="window.location.href='${pageContext.request.contextPath}/registration'">
				<h1>New user</h1>
			</div>
		</div>
	</security:authorize>
	
	<security:authorize access="hasAuthority('WAITER')">
		<div class="row category-bg">
			<div class="col-md-4 category-rectangle">
				<h1>Orders</h1>
			</div>
			<div class="col-md-4 category-rectangle">
				<h1>Billing</h1>
			</div>
			<div class="col-md-4 category-rectangle">
				<h1>Tables</h1>
			</div>
		</div>
	</security:authorize>
	
	

</div>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>