<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/common/include.jsp"%>


<title><c:out value="${client.username}"/> | BuyYourself</title>
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

						<div class="container">
				
					<c:choose>									
					
						<c:when test="${modifSuccess == false}"><div class="badge bg-danger my-4 mx-1 py-1 px-2"><h5>Erreur : La modification n'a pas réussi. Veuillez rééssayer.</h5></div></c:when>										
						
						<c:when test="${noFill == true}"><div class="badge bg-danger my-4 mx-1 py-1 px-2"><h5>Erreur : Veuillez compléter au moins un champ.</h5></div></c:when>
					
					</c:choose>

					<form action="myaccount" method="post">
					
					
						<div class="mb-3">
						
							
									<div class="accordion" id="username">

										<div class="accordion-item">
											<h2 class="accordion-header" id="headingOne">
												<button class="accordion-button" type="button"
													data-bs-toggle="collapse" data-bs-target="#collapseOne"
													aria-expanded="true" aria-controls="collapseOne">
													Nom d'Utilisateur : <c:out value="${client.username}" /></button>
											</h2>
											<div id="collapseOne"
												class="accordion-collapse collapse show"
												aria-labelledby="headingOne"
												data-bs-parent="#accordionExample">
												<div class="accordion-body">
													Vous ne pouvez pas changer votre nom d'utilisateur.
												</div>
											</div>
										</div>

									</div>
						</div>
					
						
						<div class="mb-3">
						
									<c:choose>									
												
										<c:when test="${nomSuccess == true}"><div class="badge bg-success my-4 mx-1 py-1 px-2"><h5>Le nom a été modifié avec succès !</h5></div></c:when>										
																						
									</c:choose>
									
									<div class="accordion" id="nom">

										<div class="accordion-item">
											<h2 class="accordion-header" id="headingTwo">
												<button class="accordion-button" type="button"
													data-bs-toggle="collapse" data-bs-target="#collapseTwo"
													aria-expanded="true" aria-controls="collapseTwo">
													Nom : <c:out value="${client.nom}" /></button>
											</h2>
											<div id="collapseTwo"
												class="accordion-collapse collapse show"
												aria-labelledby="headingTwo"
												data-bs-parent="#accordionExample">
												<div class="accordion-body">
													<label for="nom" class="form-label">Changer le Nom</label>
													<input class="form-control me-2" type="text"
													placeholder="Nom" aria-label="Nom" name="nom" id="nom">
												</div>
											</div>
										</div>

									</div>
						</div>
							
						<div class="mb-3">	
						
							<c:choose>									
												
								<c:when test="${prenomSuccess == true}"><div class="badge bg-success my-4 mx-1 py-1 px-2"><h5>Le prénom a été modifié avec succès !</h5></div></c:when>										
																						
							</c:choose>
						
							<div class="accordion" id="prenom">

										<div class="accordion-item">
											<h2 class="accordion-header" id="headingThree">
												<button class="accordion-button" type="button"
													data-bs-toggle="collapse" data-bs-target="#collapseThree"
													aria-expanded="true" aria-controls="collapseThree">
													Prénom : <c:out value="${client.prenom}" /></button>
											</h2>
											<div id="collapseThree"
												class="accordion-collapse collapse show"
												aria-labelledby="headingThree"
												data-bs-parent="#accordionExample">
												<div class="accordion-body">
													<label for="prenom" class="form-label">Changer le Prénom</label>
													<input class="form-control me-2" type="text"
													placeholder="Prénom" aria-label="Prénom" name="prenom" id="prenom">
												</div>
											</div>
										</div>

							</div>
						</div>
								
								<c:choose>									
												
										<c:when test="${emailSuccess == true}"><div class="badge bg-success my-4 mx-1 py-1 px-2"><h5>L'email a été modifié avec succès !</h5></div></c:when>
										
										<c:when test="${emailMatchError == true}"><div class="badge bg-danger my-4 mx-1 py-1 px-2"><h5>Erreur : les emails ne correspondent pas.</h5></div></c:when>																												
																						
								</c:choose>
								
								
								<div class="mb-3">	
									<div class="accordion" id="email">

										<div class="accordion-item">
											<h2 class="accordion-header" id="headingFour">
												<button class="accordion-button" type="button"
													data-bs-toggle="collapse" data-bs-target="#collapseFour"
													aria-expanded="false" aria-controls="collapseFour">
													Email :
													<c:out value="${client.email}" />
												</button>
											</h2>
											<div id="collapseFour"
												class="accordion-collapse collapse show"
												aria-labelledby="headingFour"
												data-bs-parent="#accordionExample">
												<div class="accordion-body">


													<div class="mb-3">
														<label class="form-label" for="email">Changer l'Email</label> <input
															class="form-control me-2" type="email"
															placeholder="Email" aria-label="Email" name="email"
															id="email">
													</div>
													<br>

													<div class="mb-3">
														<label class="form-label" for="email">Confirmer
															l'Email</label> <input class="form-control me-2" type="email"
															placeholder="exemple@domaine.com"
															aria-label="Confirmer l'Email" name="emailConf"
															id="emailConf">
													</div>
													<br>


												</div>
											</div>
										</div>

									</div>
								</div>
								
								
								<div class="mb-3">	
								
								<c:choose>									
												
										<c:when test="${mdpSuccess == true}"><div class="badge bg-success my-4 mx-1 py-1 px-2"><h5>Le mot de passe a été modifié avec succès !</h5></div></c:when>
										
										<c:when test="${mdpMatchError == true}"><div class="badge bg-danger my-4 mx-1 py-1 px-2"><h5>Erreur : les mots de passe ne correspondent pas.</h5></div></c:when>																												
																						
								</c:choose>
								
								
									<div class="accordion" id="mdp">

										<div class="accordion-item">
											<h2 class="accordion-header" id="headingFive">
												<button class="accordion-button" type="button"
													data-bs-toggle="collapse" data-bs-target="#collapseFive"
													aria-expanded="false" aria-controls="collapseFive">
													Mot de Passe
												</button>
											</h2>
											<div id="collapseFive"
												class="accordion-collapse collapse show"
												aria-labelledby="headingFive"
												data-bs-parent="#accordionExample">
												<div class="accordion-body">


													<div class="mb-3">
														<label class="form-label" for="mdp">Changer le Mot de Passe</label> <input
															class="form-control me-2" type="password"
															placeholder="Mot de Passe" aria-label="Mot de Passe" name="mdp"
															id="mdp">
													</div>
													<br>

													<div class="mb-3">
														<label class="form-label" for="mdpConf">Confirmer le Mot de Passe</label> 
														<input class="form-control me-2" type="password"
															placeholder="Confirmer le Mot de Passe"
															aria-label="Confirmer le Mot de Passe" name="mdpConf"
															id="mdpConf">
													</div>
													<br>


												</div>
											</div>
										</div>

									</div>
								</div>
						
						
						<button class="btn btn-outline-secondary" type="submit">Modifier</button>
					</form>


				</div>



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