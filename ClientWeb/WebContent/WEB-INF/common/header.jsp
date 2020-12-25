<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="index">BuyYourself</a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
				<li class="nav-item"><a class="nav-link active"
					aria-current="page" href="index">Accueil</a></li>
				<li class="nav-item"><a class="nav-link" href="categories">Cat�gories</a></li>
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle" href="#" id="navbarDropdown"
					role="button" data-bs-toggle="dropdown" aria-expanded="false">Mon Compte</a>
						
					<ul class="dropdown-menu" aria-labelledby="navbarDropdown">
					
					
					<c:choose>
						<c:when test="${connected}">
							<a class="dropdown-item" href="basket">Mon Panier</a>
							<a class="dropdown-item" href="myaccount">G�rer mon compte</a>
							<div class="dropdown-divider"></div>
							<a class="dropdown-item" href="signout">Se d�connecter</a>
						</c:when>

						<c:otherwise>
							<a class="dropdown-item" href="signin">Se connecter</a>
							<a class="dropdown-item" href="signup">Cr�er un Compte</a>
						</c:otherwise>
					</c:choose>
						
						
					</ul></li>
					
			</ul>
			<form class="d-flex" action="search">
				<input class="form-control me-2" type="search" placeholder="Rechercher"
					aria-label="Rechercher">
				<button class="btn btn-outline-secondary" type="submit">Rechercher</button>
			</form>
		</div>
	</div>
</nav>