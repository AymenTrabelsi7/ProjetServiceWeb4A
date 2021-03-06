<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/common/include.jsp"%>


<title>Livraison | BuyYourself</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row mb-4">
			<div class="col-xxl">
				<%@ include file="/WEB-INF/common/header.jsp"%>
			</div>
		</div>

		<div class="row">

			<div class="col-xxl">

				<div class="container-fluid">
				
					<h3 class="mb-4 mt-2">Mode de Livraison</h3>

				
					<table class="table table-hover table-borderless">
					
					
						<tbody>
							
							<c:forEach items="${shippings}" var="s">
							

								<tr>
								
									<td>
										<fmt:parseNumber var="prixNum" value="${s.prix}" type="number"/>
										<c:choose>										
											<c:when test="${prixNum>0}"><c:set var="prixString" value="${s.prixString}&euro;"/></c:when>
											<c:otherwise><c:set var="prixString" value="Gratuit"/></c:otherwise>
										</c:choose>
										
										<jsp:include page="/WEB-INF/common/shipping_box.jsp">
											<jsp:param name="id" value="${s.idShipping}" />
											<jsp:param name="nom" value="${s.nomComplet}" />
											<jsp:param name="icon" value="${s.icon}" />
											<jsp:param name="varNom" value="${s.nomVar}" />
											<jsp:param name="prixString" value="${prixString}" />
											<jsp:param name="prix" value="${s.prix}" />
											<jsp:param name="date" value="${s.date}" />
										</jsp:include>
									
									</td>
								
								</tr>
							
							
							</c:forEach>
						
						</tbody>
					
					
					</table>	
					
					
					<h3 class="my-4">Total Commande (sans frais de livraison) : <span class="text-danger">${basketTotalString} &euro;</span></h3>
				

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