<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/common/include.jsp"%>


<title>Paiement | BuyYourself</title>
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
						
						<c:if test="${cardError == true}">
							<div class="badge bg-danger my-4 mx-1 py-1 px-2"><h5>Erreur : Les informations de la carte bancaire ne sont pas valides.</h5></div>
						</c:if>
						
						<div class="accordion mb-2" id="card">
						
							<div class="accordion-item">
							
								<div class="accordion-header" id="cardHeading">
								
									<button class="accordion-button" type="button"
													data-bs-toggle="collapse" data-bs-target="#cardCollapse"
													aria-expanded="false" aria-controls="cardCollapse">
													Carte Bancaire <i class="fas fa-credit-card fa-2x mx-2"></i> <i class="fab fa-cc-visa fa-2x mx-2"></i> <i class="fab fa-cc-mastercard fa-2x mx-2"></i> <i class="fab fa-cc-amex fa-2x mx-2"></i></button>
								
								</div>
								
								<div class="accordion-collapse collapse show" id="cardCollapse" aria-labelledby="cardCollapse"> 
								
									<form action="payment" method="post">
									
									<input type="hidden" name="paymentMethod" value="card">
									
									<div class="row">
										<div class="col">
											<div class="mb-3 mx-2 my-2">
												<label class="form-label" for="cardnumber">Numéro de carte</label>
												<input class="form-control" type="text"
													placeholder="Ex : 8651 2589 2020 1718" aria-labelledby="Numéro de carte" name="cardnumber" id="cardnumber">
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col">
											<div class="mb-3 mx-2">
												<label class="form-label" for="name">Titulaire</label>
												<input class="form-control me-2" type="text"
													placeholder="Jean Dupond" aria-labelledby="Titulaire" name="name" id="name">
											</div>
										</div>
									</div>
									
									<div class="row">
									
										<div class="col">
										
											<div class="mb-3 mx-2">
												<label class="form-label" for="expiration">Date d'Expiration</label>
												<input class="form-control me-2" type="text"
													placeholder="01/22" aria-labelledby="Date d'Expiration" name="expiration" id="expiration">
											</div>
										
										</div>
										
										
										<div class="col">
										
											<div class="mb-3 mx-2">
												<label class="form-label" for="cvc">CVC</label>
												<input class="form-control me-2" type="text"
													placeholder="123" aria-labelledby="CVC" name="cvc" id="cvc">
											</div>
										
										</div>
									
									</div>
									
									<div class="row">
										<div class="col">
											<div class="mb-3 mx-2">
												<label class="form-label" for="adress">Adresse de Livraison et de Facturation</label>
												<input class="form-control me-2" type="text"
													placeholder="3 Boulevard des Exemples, 54000 Nancy" aria-labelledby="Adresse de Livraison et de Facturation" name="adress" id="adress">
											</div>
										</div>
									</div>
									
									<div class="row">
									
										<div class="col mx-2 mb-1">
											<button class="btn btn-success mx-2 mb-1" type="submit">Payer &amp; Commander</button>
										</div>
										
										<div class="col mx-2 mb-1">
											<button class="btn btn-danger" type="button">Total commande : ${commandeTotal}&euro;</button>
										</div>
									
									</div>
								</form>
								
									
								
								</div>
							
							</div>
						
						</div>
						
						
						<div class="accordion mt-2" id="paypal">
						
							<div class="accordion-item">
							
								<div class="accordion-header" id="paypalHeading">
								
									<button class="accordion-button" type="button"
													data-bs-toggle="collapse" data-bs-target="#paypalCollapse"
													aria-expanded="false" aria-controls="paypalCollapse">
													Paypal <i class="fab fa-cc-paypal fa-2x mx-2"></i> </button>
								
								</div>
								
								<div class="accordion-collapse collapse show" id="paypalCollapse" aria-labelledby="paypalCollapse"> 
								
									<form action="payment" method="post">
									
									<input type="hidden" name="paymentMethod" value="paypal">
									
									<div class="row">
										<div class="col">
											<div class="mb-3 mx-2 my-2">
												<label class="form-label" for="paypalEmail">Email Paypal</label>
												<input class="form-control me-2" type="text"
													placeholder="exemple@buyyourself.com" aria-labelledby="Email Paypal" name="paypalEmail" id="paypalEmail">
											</div>
										</div>
									</div>
									
									<div class="row">
										<div class="col">
											<div class="mb-3 mx-2">
												<label class="form-label" for="paypalMdp">Mot de Passe Paypal</label>
												<input class="form-control me-2" type="password"
														aria-labelledby="Mot de Passe Paypal" name="paypalMdp" id="paypalMdp">
											</div>
										</div>
									</div>
								
									
									<div class="row">
									
										<div class="col mx-2 mb-1">
											<button class="btn btn-success" type="submit">Payer &amp; Commander</button>
										</div>
										
										<div class="col mx-2 mb-1">
											<button class="btn btn-danger" type="button">Total commande : ${commandeTotal}&euro;</button>
										</div>
									
									</div>
								</form>
								
									
								
								</div>
							
							</div>
						
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
	<%@ include file="/WEB-INF/common/include_script.jsp"%>
</body>
</html>