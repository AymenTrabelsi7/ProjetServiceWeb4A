<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/common/include.jsp"%>


<title>Vos Commandes | BuyYourself</title>
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
						
							<c:when test="${commandes.size()==0}"><h2>Vous n'avez pas de commandes.</h2></c:when>
							
							<c:otherwise>
							
								<c:forEach items="${commandes}" var="c">
		
										<jsp:include page="/WEB-INF/common/commande_box.jsp">
											<jsp:param name="id" value="${c.id}" />
											<jsp:param name="dateCommande" value="${c.dateCommande}" />
											<jsp:param name="statut" value="${c.statut}" />
											<jsp:param name="produits" value="${c.produits}" />
											<jsp:param name="totalTtc" value="${c.totalTtc}" />
										</jsp:include>
									
									<hr>
		
								</c:forEach>
												
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