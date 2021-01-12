<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/common/include.jsp"%>


<title>Connexion | BuyYourself</title>
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

				<div class="container-fluid">

					<div class="row">
						
						<c:if test="${logError == true}">
							<div class="badge bg-danger my-4 mx-1 py-1 px-2"><h5>Erreur : Les identifiants saisis sont incorrects.</h5></div>
						</c:if>			
						
						<form action="signin" method="post">
						

						
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
						
						
						<button class="btn btn-outline-secondary" type="submit">Connexion</button>
					</form>



					</div>


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