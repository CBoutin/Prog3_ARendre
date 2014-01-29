<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css"
	href="../../css/bootstrap.min.css" />
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<form class="form-signin">
			<h2 class="form-signin-heading">Enregistrez-vous</h2>
			<p>Identifiant de connexion</p>
			<input type="text" class="input-block-level"
				placeholder="Identifiant de connexion">
			<p>Mot de passe</p>
			<input type="password" class="input-block-level"
				placeholder="Mot de passe">
			<p>Mot de passe(confirm)</p>
			<input type="password" class="input-block-level"
				placeholder="Mot de passe(confirm)">
			<p>Nom de famille</p>
			<input type="text" class="input-block-level"
				placeholder="Nom de famille">
			<p>Prenom</p>
			<input type="text" class="input-block-level" placeholder="Prenom">
			<p>Adresse (rue)</p>
			<input type="text" class="input-block-level"
				placeholder="Adresse (rue)">
			<p>Code postal</p>
			<input type="text" class="input-block-level"
				placeholder="Code postal">
			<p>Ville</p>
			<input type="text" class="input-block-level" placeholder="Ville">

			<p>Pays</p>
			<select class="selectpicker">
				<option>Mustard</option>
				<option>Ketchup</option>
				<option>Relish</option>
			</select>
		</form>
		<button class="btn btn-large btn-primary" type="submit">Enregistrer</button>
	</div>

</body>
</html>