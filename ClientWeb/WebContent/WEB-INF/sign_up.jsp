<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/common/include.jsp"%>


<title>Create Account | BuyYourself</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row mb-4">
			<div class="col-xxl">
				<%@ include file="/WEB-INF/common/header.jsp"%>
			</div>
		</div>

		<div class="row">

			<div class="col-xxl mx-auto">

				<div class="container">
				
					<c:choose>
					
						<c:when test="${signUpSuccess == false}"><div class="badge bg-danger my-4 mx-1 py-1 px-2"><h5>Erreur : L'inscription n'a pas réussi. Veuillez rééssayer.</h5></div></c:when>										
					
						<c:when test="${usernameExist == true}"><div class="badge bg-danger my-4 mx-1 py-1 px-2"><h5>Erreur : Le Nom d'Utilisateur est déjà utilisé.</h5></div></c:when>										
					
						<c:when test="${matchError == true}"><div class="badge bg-danger my-4 mx-1 py-1 px-2"><h5>Erreur : Les champs de confirmation ne correspondent pas.</h5></div></c:when>										
					
						<c:when test="${unfilledError == true}"><div class="badge bg-danger my-4 mx-1 py-1 px-2"><h5>Erreur : Certains champs ne sont pas remplis.</h5></div></c:when>										
					
					</c:choose>

					<form action="signup" method="post">
						
						<div class="mb-3">
						<label for="nom" class="form-label">Nom</label>
						<input class="form-control me-2" type="text"
							placeholder="Nom" aria-label="Nom" name="nom" id="nom">
						</div><br>
							
						<div class="mb-3">					
						<label class="form-label" for="prenom">Prénom</label>
						<input class="form-control me-2" type="text"
							placeholder="Prénom" aria-label="Prénom" name="prenom" id="prenom">
						</div><br>
						
						<div class="mb-3">
						<label class="form-label" for="email">Email</label>
						<input class="form-control me-2" type="email"
							placeholder="Email" aria-label="Email" name="email" id="email">
						</div><br>
						
						<div class="mb-3">
						<label class="form-label" for="email">Confirmer l'Email</label>
						<input class="form-control me-2" type="email"
							placeholder="exemple@domaine.com" aria-label="Confirmer l'Email" name="emailConf" id="emailConf">
						</div><br>
						
						<div class="mb-3">
						<label class="form-label" for="username">Nom d'Utilisateur</label>
						<input class="form-control me-2" type="text"
							placeholder="Nom d'Utilisateur" aria-label="Nom d'Utilisateur" name="username" id="username">
						</div><br>
						
						<div class="mb-3">
						<label class="form-label" for="nom">Mot de Passe</label>
						<input class="form-control me-2" type="password"
							placeholder="Mot de Passe" aria-label="Mot de Passe" name="mdp" id="mdp">
						</div><br>
						
						<div class="mb-3">
						<label class="form-label" for="nom">Confirmer le Mot de Passe</label>
						<input class="form-control me-2" type="password"
							placeholder="Confirmation du Mot de Passe" aria-label="Confirmation du Mot de Passe" name="mdpConf" id="mdpConf">
						</div><br>
						
						
						<button class="btn btn-outline-secondary" type="submit">Inscription</button>
					</form>


				</div>

			</div>

		</div>

		<div class="row mt-4">
			<div class="col-xxl">
				<%@ include file="/WEB-INF/common/footer.jsp"%>
			</div>
		</div>
	</div>
	<script type="text/javascript"
		src="<%=request.getContextPath()%>/lib/bootstrap/js/bootstrap.min.js"></script>
</body>
</html>