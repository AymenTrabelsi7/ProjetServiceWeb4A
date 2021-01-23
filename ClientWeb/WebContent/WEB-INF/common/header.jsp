<nav class="navbar navbar-expand-md navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="index"><img class = "img-fluid" style="max-width:50px;height:auto;" src="<%=request.getContextPath()%>/logo.png"></a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<div class="navbar-nav">
				<div class="nav-item"><a class="nav-link active"
					aria-current="page" href="index"><i class="fas fa-home fa-lg align-middle"></i> Accueil</a></div>
				<div class="nav-item"><a class="nav-link" href="categories"><i class="fas fa-book fa-lg align-middle"></i> Catégories</a></div>
				<div class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="accountDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-user-circle fa-lg align-middle"></i> 
					<c:if test="${connected}"><c:out value="${username}" /></c:if>
					<c:if test="${!connected}">Mon Compte</c:if>
				
				</a>

					<div class="dropdown-menu" aria-labelledby="accountDropdown">


						<c:choose>
							<c:when test="${connected}">
								<a class="dropdown-item" href="myorders">Mes Commandes</a>
								<a class="dropdown-item" href="myaccount">Gérer mon compte</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="signout"><i class="fas fa-sign-out-alt fa-lg align-middle"></i> Se déconnecter</a>
							</c:when>

							<c:otherwise>
								<a class="dropdown-item" href="signin"><i class="fas fa-sign-in-alt fa-lg align-middle"></i> Se connecter</a>
								<a class="dropdown-item" href="signup">Créer un Compte</a>
							</c:otherwise>
						</c:choose>


					</div></div>


				<div class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="basketDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false"><i class="fas fa-shopping-cart fa-lg align-middle"></i> Mon
						Panier</a>

					<c:choose>
						<c:when test="${connected}"><div class="dropdown-menu" aria-labelledby="basketDropdown" style="width: 500px;"></c:when>
					
						<c:otherwise><div class="dropdown-menu" aria-labelledby="basketDropdown"></c:otherwise>
					</c:choose>
					 


						<c:choose>
							<c:when test="${connected}">
								
								<c:choose>
									<c:when test="${userBasket.size()==0 || userBasket == null}">
									
										<div class="dropdown-item">Votre panier est vide.</div>
									
									
									</c:when>
									
									<c:otherwise>
									
									
									<c:if test="${userBasket.size()>=3}"><div class="container" style="height:300px;overflow-y: scroll;"></c:if>
									<c:if test="${userBasket.size()<3}"><div class="container"></c:if>
								
								
										<c:forEach items="${userBasket}" var="basketProduct">
								
										<div class="dropdown-item">

											<div class="row">

												<div class="col-xl-4 text-center">
													
														<a href="product?id=${basketProduct.id}"><img alt=""
															class="img-thumbnail mx-auto" style="max-height:100px;width:auto;"
															src="<%=request.getContextPath()%>/img/${basketProduct.img}"></a>
													
												</div>

												<div class="col-xl">

													<a href="product?id=${basketProduct.id}"><c:out
															value="${basketProduct.nom}" /></a> <br>

													Prix : <c:out value="${basketProduct.prixString}" />&euro;
													<br>

													Qté : <c:out value="${basketProduct.quantite}" />
													<br>

													<div class="text-danger">Sous-Total : <c:out value="${basketProduct.sousTotalString}" />&euro;</div>

												</div>
											</div>
										</div>
									
								
									<div class="dropdown-divider"></div>

								</c:forEach>
								</div>
								
								
								
								
								<div class="dropdown-item text-danger text-end"><h3>Total : <c:out value="${basketTotalString}" />&euro;</h3></div>
								
								<div class="dropdown-divider"></div>
								
								<a class="dropdown-item text-primary text-center" href="basket">Voir les détails du Panier</a>
								
								<div class="dropdown-divider"></div>
								
								<div class="dropdown-item text-center"><a href="shipping"><button type="button" class="btn btn-success">Commander</button></a></div>
									
									
									</c:otherwise>
								</c:choose>
								
								
								
								
								
								
		</c:when>

		<c:otherwise>
			<a class="dropdown-item" href="signin"><i class="fas fa-sign-in-alt fa-lg align-middle"></i> Se connecter</a>
		</c:otherwise>
		</c:choose>
		</div>


		</div>
		</div>

			
			
				
				
			<div class="nav-item ms-4">			
				<form class="d-flex" action="search" method="post">
				<input class="form-control me-2" type="text" placeholder="Rechercher"
					aria-label="Rechercher" name="q" id="q">
				<button class="btn btn-outline-secondary" type="submit" style="width: 200px;"><i class="fas fa-search fa-sm"></i> Rechercher</button>
				</form>
			</div>
			
			
		</div>
		




	</div>
	

	</div>
</nav>