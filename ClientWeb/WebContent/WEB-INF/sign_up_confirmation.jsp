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
					
					<br>
					<h1 class="display-2">Inscription Réussie !</h1>
					<br>
					
					<p class="h4">L'inscription a été réussie, vous pouvez maintenant essayer de vous connecter sur <a href="signin">la page de connexion</a>.</p>



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