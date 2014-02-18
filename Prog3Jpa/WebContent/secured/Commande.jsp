<%@page import="JPA.serviceArticle"%>
<%@page import="java.util.ArrayList"%>
<%@page import="JPA.bean.*"%>
<title>Commande</title>
</head>
<body>
	<div class="navbar">
		<div class="navbar-inner">
			<ul class="nav">
				<li><a
					href="${pageContext.request.contextPath}/Template/secured/Accueil.jsp">Accueil</a></li>
				<li><a
					href="${pageContext.request.contextPath}/Template/secured/Article.jsp">Article</a></li>
				<li class="active"><a href="#">Commande</a></li>
			</ul>
			<p class="brand">
				Adherent :
				<%=session.getAttribute("name") %></p>
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
			<% 
			@SuppressWarnings("unchecked")
			ArrayList<String> ar = (ArrayList<String>)(session.getAttribute("commande"));
			if(ar !=null)
			{
				serviceArticle recup= new serviceArticle();
				for(String code : ar )
				{
					Article a = recup.getArticle(code);
					
			%>
			<tr>
				<td><%=code %></td>
				<td><%=a.getNom() %></td>
				<td><%=a.getPrix() %></td>
			</tr>
			<% }
			}else{%>
			
				<tr><td colspan='3' style='text-align:center'>Aucun article selectionne</td></tr>
		<%} %>
		</table>
		<a href='${pageContext.request.contextPath}/AnnulerCommande'>Annuler
			la commande</a>
			
		<br/>
		
		<a href='${pageContext.request.contextPath}/AddCommande'>Valider
			la commande</a>
	</div>