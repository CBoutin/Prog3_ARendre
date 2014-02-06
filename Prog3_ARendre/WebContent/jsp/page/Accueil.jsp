<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="../../css/bootstrap.min.css" />
<title>Accueil</title>
</head>
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<ul class="nav">
				<li class="active"><a href="#">Accueil</a></li>
				<li><a
					href="${pageContext.request.contextPath}/jsp/page/Article.jsp">Article</a></li>
				<li><a
					href="${pageContext.request.contextPath}/jsp/page/Commande.jsp">Commande</a></li>
			</ul>
			<p class="brand">Adherent : toto</p>
		</div>
	</div>
	<div class="container">
		<h2>Bienvenu sur le site des adhérents de l'association</h2>
		<ul>
			<li><a
				href="${pageContext.request.contextPath}/jsp/page/Article.jsp">Consulter
					les articles disponnibles</a></li>
			<li><a
				href="${pageContext.request.contextPath}/jsp/page/Commande.jsp">Consulter
					votre commande</a></li>
			<li><a
				href="${pageContext.request.contextPath}/Logout">Deconnexion</a></li>
		</ul>

	</div>
</body>
</html>