<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/common/include.jsp"%>

<c:if test="${selectedCat == null}"><title>Catégories | BuyYourself</title></c:if>
<c:if test="${selectedCat != null}"><title><c:out value="${selectedCat}" /> | BuyYourself</title></c:if>
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
						
							<c:when test="${selectedCat == null}">
							
								<div class="container-fluid">
								
									<div class="row">
									
										<div class="col">
											<nav aria-label="breadcrumb">
											  <ol class="breadcrumb">
											    <li class="breadcrumb-item"><h5><a href="#">Categories</a></h5></li>
											  </ol>
											</nav>
										</div>
									
									</div>
									
									<div class="row">
									
											<c:forEach items="${categories}" var="cat">
						
												<div class="col">
												
													<jsp:include page="/WEB-INF/common/categorie_box.jsp">
														<jsp:param name="nom" value="${cat.nom}" />
														<jsp:param name="img" value="${cat.img}" />
													</jsp:include>
													
												</div>
											
											
											</c:forEach>
										
									</div>
								
								</div>
							
							</c:when>
							
							<c:otherwise>
							
								<div class="container-fluid">
									
										<div class="row">
										
											<div class="col">
												<nav aria-label="breadcrumb">
												  <ol class="breadcrumb">
												    <li class="breadcrumb-item"><h6><a href="categories">Categories</a></h6></li>
												    <li class="breadcrumb-item"><h6><a href="#"><c:out value="${selectedCat}"/></a></h6></li>
												  </ol>
												</nav>
											</div>
										
										</div>
										
										
										<div class="row">



											<c:forEach items="${catProducts}" var="product">
											
												<div class="col">
												
													<jsp:include page="/WEB-INF/common/product_box.jsp">
														<jsp:param name="nom" value="${product.nom}" />
														<jsp:param name="desc" value="${product.description}" />
														<jsp:param name="prix" value="${product.prix}" />
														<jsp:param name="id" value="${product.id}" />
														<jsp:param name="img" value="${product.img}" />
													</jsp:include>
													
												</div>
												
												
											</c:forEach>



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