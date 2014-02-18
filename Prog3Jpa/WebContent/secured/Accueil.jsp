<title>Accueil</title>
</head>
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<ul class="nav">
				<li class="active"><a href="#">Accueil</a></li>
				<li><a
					href="${pageContext.request.contextPath}/Template/secured/Article.jsp">Article</a></li>
				<li><a
					href="${pageContext.request.contextPath}/Template/secured/Commande.jsp">Commande</a></li>
			</ul>
			<p class="brand">Adherent : <%=session.getAttribute("name") %></p>
		</div>
	</div>
	<div class="container">
		<h2>Bienvenu sur le site des adherents de l'association</h2>
		<ul>
			<li><a
				href="${pageContext.request.contextPath}/Template/secured/Article.jsp">Consulter
					les articles disponnibles</a></li>
			<li><a
				href="${pageContext.request.contextPath}/Template/secured/Commande.jsp">Consulter
					votre commande</a></li>
			<li><a
				href="${pageContext.request.contextPath}/Logout">Deconnexion</a></li>
		</ul>

	</div>