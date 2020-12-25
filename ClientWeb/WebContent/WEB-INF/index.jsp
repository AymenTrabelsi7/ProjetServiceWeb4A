<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@ include file="/WEB-INF/common/include.jsp"%>


<title>BuyYourself | Everything a human needs.</title>
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



						<c:forEach items="${home_products}" var="product">
						
							<div class="col">
							
								<jsp:include page="/WEB-INF/common/product_box.jsp">
									<jsp:param name="nom" value="${product.nom}" />
									<jsp:param name="desc" value="${product.desc}" />
									<jsp:param name="prix" value="${product.prix}" />
									<jsp:param name="id" value="${product.id}" />
								</jsp:include>
								
							</div>
							
							
						</c:forEach>



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