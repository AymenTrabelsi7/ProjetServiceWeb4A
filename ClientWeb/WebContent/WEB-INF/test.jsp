<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
		<div class="row">
			<div class="col-xxl">

			</div>
		</div>

		<div class="row">

			<div class="col-xxl mx-5">
				<jsp:include page="/WEB-INF/common/product_box.jsp">
					<jsp:param name="nom" value="PC" />
					<jsp:param name="desc" value="Un PC normal" />
					<jsp:param name="prix" value="800" />
				</jsp:include>
			</div>

		</div>

		<div class="row">
			<div class="col-xxl">
				<%@ include file="/WEB-INF/common/footer.jsp"%>
			</div>
		</div>
	</div>
<%@ include file="/WEB-INF/common/include_script.jsp"%>
	
</body>
</html>