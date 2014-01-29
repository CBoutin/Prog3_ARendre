<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="../../css/bootstrap.min.css" />
<title>Commande</title>
</head>
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<ul class="nav">
				<li><a href="${pageContext.request.contextPath}/jsp/page/Accueil.jsp">Accueil</a></li>
				<li><a href="${pageContext.request.contextPath}/jsp/page/Article.jsp">Article</a></li>
				<li class="active"><a href="#">Commande</a></li>
			</ul>
			<p class="brand">Adherent : toto</p>
		</div>
	</div>
	
	<div class="container">
		<h2>Votre Commande</h2>
		<table class="table">
			<tr>
				<td>Code</td>
				<td>Nom</td>
				<td>Prix</td>
			</tr>
			<tr>
				<td>T1</td>
				<td>bite</td>
				<td>chatte</td>
			</tr>
		</table>
		<a>annuler la commande</a>
	</div>
</body>
</html>