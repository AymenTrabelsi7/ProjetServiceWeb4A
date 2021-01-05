<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/common/include.jsp"%>


<title><c:out value="${produit.nom}"/> | BuyYourself</title>
</head>
<body>
	<div class="container-xxl">
		<div class="row mb-4">
			<div class="col-xxl">
				<%@ include file="/WEB-INF/common/header.jsp"%>
			</div>
		</div>

		<div class="row">

			<div class="col-xxl mx-auto">

				<div class="container-fluid">

					<div class="row">

						<c:choose>

							<c:when test="${produit.id == -1}">

								<p>Désolé, ce produit n'existe pas.</p>

							</c:when>

							<c:otherwise>

								<div class="container-fluid">
									<div class="content-wrapper">
										<div class="item-container">
											<div class="container-fluid">
												<div class="col-md-10 my-4">
													<img class="img-fluid "id="item-display"
														src="<%=request.getContextPath()%>/img/test.png" alt=""></img>
												</div>

												<div class="col-md-7">
													<div class="product-title"><h4><c:out value="${produit.nom}"/></h4></div>
													<div class="product-desc"><h5><c:out value="${produit.description}"/></h5></div>
													<hr>
													<div class="product-price"><h3><c:out value="${produit.prix}"/> &euro;</h3></div>
													<h4>
													<c:choose>
													
														<c:when test="${produit.stock > 5}">
															<div class="badge bg-success">En Stock</div>
														</c:when>
														
														<c:when test="${produit.stock <= 5 && produit.stock > 0}">
															<div class="badge bg-warning">Plus que <c:out value="${produit.stock}"/> en stock !</div>
														</c:when>
														
														<c:otherwise>
															<div class="badge bg-danger">Non Disponible</div>
														</c:otherwise>
													
													</c:choose>
													</h4>
													<hr>
													<c:choose>
														<c:when test="${produit.stock > 0}">												<div class="btn-group cart">
														<button type="button" class="btn btn-success">
															Ajouter au panier</button>
														</div>
														</c:when>
													</c:choose>

												</div>
											</div>
										</div>
									</div>
								</div>

							</c:otherwise>

						</c:choose>




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