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
<title>Restaurapp - Login</title>
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
	</style>
</head>
<body>

<div class="row">
	<div class="col-md-4"></div>
	<div class="col-md-4">
		<form:form action="${pageContext.request.contextPath}/autentifikacija" method="POST">
		
		<c:if test="${param.error !=null}">
			<i class="failed">Invalid data.</i>
		</c:if>
		
		<p>Username: 
			<input type="text" name="korisnicko_ime" class="form-control"/>
		</p>
		
		<p>Password: 
			<input type="password" name="lozinka" class="form-control"/>
		</p>
		
		<div class="centar">
			<input type="submit" class="dugme" value="Log in"/>
		</div>
		</form:form>
	</div>
	<div class="col-md-4"></div>
</div>




<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
</body>
</html>