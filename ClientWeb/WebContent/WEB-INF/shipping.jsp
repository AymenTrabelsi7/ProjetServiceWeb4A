<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


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
						
							<tr>
							
								<td>
								
									<div class="row">
										
										<div class="col-sm-1"><i class="fas fa-warehouse fa-2x" style="color: DodgerBlue;"></i></div>
										<div class="col text-center">Livraison En Point de Retrait<br><u>Arrivée prévue le ${retrait.date}</u></div>
										<div class="col-md-2 text-danger text-end">${retrait.prix}</div>
										<div class="col text-end"><a href="shipping?choice=retrait"><button class="btn btn-success btn-lg">Choisir</button></a></div>
									
									</div>
									
									
								
								</td>
							
							</tr>
							
							<tr>
							
							<td>
								
									<div class="row">
										
										<div class="col-sm-1"><i class="fas fa-truck fa-2x" style="color: DodgerBlue;"></i></div>
										<div class="col text-center">Livraison à Domicile Standard<br><u>Arrivée prévue le ${standard.date}</u></div>
										<div class="col-md-2 text-danger text-end">${standard.prix}</div>
										<div class="col text-end"><a href="shipping?choice=standard"><button class="btn btn-success btn-lg">Choisir</button></a></div>
									
									</div>
									
									
								
							</td>
							
							</tr>
							
							<tr>
								
							<td>
							
								
									<div class="row">
										
										<div class="col-sm-1"><i class="fas fa-shipping-fast fa-2x" style="color: DodgerBlue;"></i></div>
										<div class="col text-center">Livraison à Domicile Express<br><u>Arrivée prévue le ${express.date}</u></div>
										<div class="col-md-2 text-danger text-end">${express.prix}</div>
										<div class="col text-end"><a href="shipping?choice=express"><button class="btn btn-success btn-lg">Choisir</button></a></div>
									
									</div>
									
									
								
							</td>
							</tr>
							
						
						</tbody>
					
					
					</table>	
					
					
					<h3 class="my-4">Total Commande (sans frais de livraison) : <span class="text-danger">${basketTotal} &euro;</span></h3>
				

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