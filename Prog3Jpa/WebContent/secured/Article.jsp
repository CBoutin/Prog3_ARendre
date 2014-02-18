<%@page import="JPA.serviceArticle"%>
<%@page import="java.util.ArrayList"%>
<%@page import="JPA.bean.*"%>
</head>
<body>

	<div class="navbar">
		<div class="navbar-inner">
			<ul class="nav">
				<li><a
					href="${pageContext.request.contextPath}/Template/secured/Accueil.jsp">Accueil</a></li>
				<li class="active"><a href="#">Article</a></li>
				<li><a
					href="${pageContext.request.contextPath}/Template/secured/Commande.jsp">Commande</a></li>
			</ul>
			<p class="brand">
				Adherent :
				<%=session.getAttribute("name")%></p>
		</div>
	</div>

	<div class="container">
		<h2>Catalogue des articles</h2>

		<table class="table">
			<tr>
				<th>Code</th>
				<th>Nom</th>
				<th>Prix</th>
				<th>Stock</th>
			</tr>

			<%
				serviceArticle art = new serviceArticle();
				ArrayList<Article> list;	
				list = art.findArticles();
				for (Article a : list) {
			%>
			<tr>
				<td><%=a.getCode()%></td>
				<td><%=a.getNom()%></td>
				<td><%=a.getPrix()%></td>
				<td><%=a.getStock()%></td>
				<td>
					<%
						if (a.getStock() > 0) {
					%> <a
					href='${pageContext.servletContext.contextPath}/AddArticlePanier?codeArticle=<%=a.getCode()%>'>Commander</a>
					<%
						} else {%>
								<p>Indisponible</p>
							<%}
					%>
				</td>
			</tr>
			<%
				}
			%>



		</table>
	</div>