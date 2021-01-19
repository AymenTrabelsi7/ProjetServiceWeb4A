<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/common/include.jsp"%>


<title>Votre Panier | BuyYourself</title>
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
					
						<c:choose>
						
							<c:when test="${userBasket.size()==0}"><h2>Votre Panier est vide.</h2></c:when>
							
							<c:otherwise>
							
						<c:forEach items="${userBasket}" var="basketProduct">

							<div class="container-fluid my-5 text-center">

								<div class="row">

									<div class="col-xl-5">

										<a href="product?id=${basketProduct.id}"><img alt=""
											class="img-thumbnail img-box mx-auto"
											src="<%=request.getContextPath()%>/img/${basketProduct.img}"></a>

									</div>

									<div class="col">


										<div class="row mb-3">
											<div class="col-xl-7 basketDescription">
												<c:out value="${basketProduct.description}" />
											</div>

											<div class="col-xl">

												<a href="product?id=${basketProduct.id}"><c:out
														value="${basketProduct.nom}" /></a> <br> Prix :
												<c:out value="${basketProduct.prix}" />
												&euro; <br> Qté :
												<c:out value="${basketProduct.quantite}" />
												<br>

												<div class="text-danger">
													Sous-Total :
													<c:out value="${basketProduct.sousTotal}" />
													&euro;
												</div>

											</div>

										</div>
										
										<hr>

										<div class="row mt-3">
										
											<div class="col-xl">

												

											</div>
											
											<div class="col-xl align-middle">

												<form action="basket" method="post">
												
												<input type="hidden" name="productId" value="${basketProduct.id}">
												
												<button class="btn btn-danger btn-outline-secondary text-light" type="submit">Supprimer</button>
												
												</form>
										
										</div>

									</div>


								</div>
							</div>
							
							</div>
							
							<hr>


							
						</c:forEach>
						
						
						<div class="container-fluid my-5 text-center">
							
							
								<div class="row">
								
								
									<div class="col">
									
										<h2 class="text-dark">Total : <c:out value="${basketTotal}"/>&euro;</h2>
									
									</div>
									
									<div class="col">
									
										<a href="shipping"><button class="btn btn-outline-success btn-lg">Commander</button></a>
									
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
	<%@ include file="/WEB-INF/common/include_script.jsp"%>
</body>
</html>