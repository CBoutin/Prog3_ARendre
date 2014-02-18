</head>
<body>
	<div class="container">
		<form class="form-signin" action="${pageContext.servletContext.contextPath}/AddUser">
			<h2 class="form-signin-heading">Enregistrez-vous</h2>
			<p>Identifiant de connexion</p>
			<input type="text" class="input-block-level"
				placeholder="Identifiant de connexion" name="id">
			<p>Mot de passe</p>
			<input type="password" class="input-block-level"
				placeholder="Mot de passe" name="pswd">
			<p>Mot de passe(confirm)</p>
			<input type="password" class="input-block-level"
				placeholder="Mot de passe(confirm)" name='pswd2'>
			<p>Nom de famille</p>
			<input type="text" class="input-block-level"
				placeholder="Nom de famille" name="surname">
			<p>Prenom</p>
			<input type="text" class="input-block-level" placeholder="Prenom" name="name">
			<p>Adresse (rue)</p>
			<input type="text" class="input-block-level"
				placeholder="Adresse (rue)" name="adress">
			<p>Code postal</p>
			<input type="text" class="input-block-level"
				placeholder="Code postal" name="cp">
			<p>Ville</p>
			<input type="text" class="input-block-level" placeholder="Ville" name="city">

			<p>Pays</p>
			<select class="selectpicker" name="country">
				<option>Mustard</option>
				<option>Ketchup</option>
				<option>Relish</option>
			</select>
			<button class="btn btn-large btn-primary" type="submit" value="submit">Enregistrer</button>
		</form>

	</div>
