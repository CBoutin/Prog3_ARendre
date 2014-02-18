<title>Login</title>
</head>
<body>
	 <div class="container" >
		<form method='POST' class="form-signin" action="${pageContext.servletContext.contextPath}/Login">
			<h2 class="form-signin-heading">Login</h2>
			<p>Login</p><input type="text" class="input-block-level" placeholder="Identifiant de connexion" name="id"/> 
			<p>Password</p><input type="password" class="input-block-level" placeholder="Mot de passe" name='password'/>
			<button class="btn btn-large btn-primary" type="submit" value="submit">Ok</button>
		</form>
		<p>pas encore de compte? <a href="${pageContext.servletContext.contextPath}/Template/unsecured/Creation_de_compte.jsp">Creer un compte</a></p>
	</div>
