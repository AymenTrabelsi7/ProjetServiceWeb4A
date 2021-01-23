<div class="container-fluid my-5 text-center">

								<div class="row">

									<div class="col">
										<h2>Commande N°${param.id}</h2> <br>
										<h4>Commandé le ${param.dateCommande}</h4> <br>
										<h4>Statut : ${param.statut}</h4>
									</div>

									<div class="col">

										<c:forEach items="${param.produits}" var="p">
											<jsp:include page="/WEB-INF/common/ligne_commande_box.jsp">
												<jsp:param name="qte" value="${p.qte}" />
												<jsp:param name="id" value="${p.idProduit}" />
												<jsp:param name="nom" value="${p.nom}" />
												<jsp:param name="sousTotString" value="${p.sousTotString}" />
											</jsp:include>
										</c:forEach>

										


								</div>
								
								<div class="col text-danger">
								
									<h2>Total : ${param.totalTtc}&euro;</h2>
								
								</div>
							</div>
							
</div>
