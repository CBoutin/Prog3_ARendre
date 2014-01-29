<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="../../css/bootstrap.min.css" />
<title>Login</title>
</head>
<body>
	<div class="container">
		<form class="form-signin">
			<h2 class="form-signin-heading">Login</h2>
			<input type="text" class="input-block-level" placeholder="Identifiant de connexion" /> 
			<input type="password" class="input-block-level" placeholder="Mot de passe" />
		</form>
		<button class="btn btn-large btn-primary" type="submit">Ok</button>
		<p>pas encore de compte? <a href="${pageContext.request.contextPath}/jsp/page/Creation_de_compte.jsp">Creer un compte</a></p>
		
	</div>
</body>
</html>