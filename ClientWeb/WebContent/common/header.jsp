<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="">BuyYourself</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link" href="">Accueil</a>
			</li>
			<li class="nav-item"><a class="nav-link" href="categories">Catégories</a>
			</li>
			
			<li class="nav-item dropdown"><a class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
				role="button" data-toggle="dropdown" aria-haspopup="true"
				aria-expanded="false">Mon Compte</a>

				<div class="dropdown-menu" aria-labelledby="navbarDropdown">
					<c:choose>
						<c:when test="${connected}">
							<a class="dropdown-item" href="myaccount">Gérer mon compte</a>
							<a class="dropdown-item" href="basket">Mon Panier</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="signout">Se déconnecter</a>
						</c:when>

						<c:otherwise>
*							<a class="dropdown-item" href="signin">Se connecter</a>
							<a class="dropdown-item" href="signup">Créer un Compte</a>
						</c:otherwise>
					</c:choose>
				</div>
			</li>

		</ul>
	</div>
</nav>