<nav class="navbar navbar-expand-md navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="index">BuyYourself</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<div class="navbar-nav">
				<div class="nav-item"><a class="nav-link active"
					aria-current="page" href="index">Accueil</a></div>
				<div class="nav-item"><a class="nav-link" href="categories">Catégories</a></div>
				<div class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="accountDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">Mon
						Compte</a>

					<div class="dropdown-menu" aria-labelledby="accountDropdown">


						<c:choose>
							<c:when test="${connected}">
								<a class="dropdown-item" href="myorders">Mes Commandes</a>
								<a class="dropdown-item" href="myaccount">Gérer mon compte</a>
								<div class="dropdown-divider"></div>
								<a class="dropdown-item" href="signout">Se déconnecter</a>
							</c:when>

							<c:otherwise>
								<a class="dropdown-item" href="signin">Se connecter</a>
								<a class="dropdown-item" href="signup">Créer un Compte</a>
							</c:otherwise>
						</c:choose>


					</div></div>


				<div class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="basketDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">Mon
						Panier</a>

					<c:choose>
						<c:when test="${connected}"><div class="dropdown-menu" aria-labelledby="basketDropdown" style="width: 500px;"></c:when>
					
						<c:otherwise><div class="dropdown-menu" aria-labelledby="basketDropdown"></c:otherwise>
					</c:choose>
					 


						<c:choose>
							<c:when test="${connected}">
								
								<c:choose>
									<c:when test="${userBasket.size()==0}">
									
										<div class="dropdown-item">Votre panier est vide.</div>
									
									
									</c:when>
									
									<c:otherwise>
									
									
									<c:if test="${userBasket.size()>=3}"><div class="container" style="height:300px;overflow-y: scroll;"></c:if>
									<c:if test="${userBasket.size()<3}"><div class="container"></c:if>
								
								
										<c:forEach items="${userBasket}" var="basketProduct">
								
										<div class="dropdown-item">

											<div class="row">

												<div class="col-xl-5">
													
														<a href="product?id=${basketProduct.id}"><img alt=""
															class="img-thumbnail img-basket mx-auto"
															src="<%=request.getContextPath()%>/img/${basketProduct.img}"></a>
													
												</div>

												<div class="col-xl">

													<a href="product?id=${basketProduct.id}"><c:out
															value="${basketProduct.nom}" /></a> <br>

													Prix : <c:out value="${basketProduct.prix}" />&euro;
													<br>

													Qté : <c:out value="${basketProduct.quantite}" />
													<br>

													<div class="text-danger">Sous-Total : <c:out value="${basketProduct.sousTotal}" />&euro;</div>

												</div>
											</div>
										</div>
									
								
									<div class="dropdown-divider"></div>

								</c:forEach>
								</div>
								
								
								
								
								<div class="dropdown-item text-danger text-end"><h3>Total : <c:out value="${basketTotal}" />&euro;</h3></div>
								
								<div class="dropdown-divider"></div>
								
								<a class="dropdown-item text-primary text-center" href="basket">Voir les détails du Panier</a>
								
								<div class="dropdown-divider"></div>
								
								<div class="dropdown-item text-center"><a href="order"><button type="button" class="btn btn-success">Commander</button></a></div>
									
									
									</c:otherwise>
								</c:choose>
								
								
								
								
								
								
		</c:when>

		<c:otherwise>
			<a class="dropdown-item" href="signin">Se connecter</a>
		</c:otherwise>
		</c:choose>
		</div>


		</div>
		</div>

			
			<c:if test="${connected}"><div class="nav-item navbar-text text-light ms-4">Bonjour, <c:out value="${username}" /> !</div></c:if>
				
				
			<div class="nav-item ms-4">			
				<form class="d-flex" action="search" method="post">
				<input class="form-control me-2" type="text" placeholder="Rechercher"
					aria-label="Rechercher" name="q" id="q">
				<button class="btn btn-outline-secondary" type="submit">Rechercher</button>
				</form>
			</div>
			
			
		</div>
		




	</div>
	

	</div>
</nav>