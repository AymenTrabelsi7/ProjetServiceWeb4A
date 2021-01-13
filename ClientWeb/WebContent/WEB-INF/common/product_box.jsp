<div class="card my-4 mx-4" style="width: 18rem;">


		<a href="product?id=${param.id}"><img class = "card-img-top img-box mx-auto" src="<%=request.getContextPath()%>/img/${param.img}"
			alt="${param.nom}"></a>

	
	
	<div class="card-body">
		<h5 class="card-title"><a href="product?id=${param.id}">${param.nom}</a></h5>
		
		<div class="card-text container-fluid my-3">

			<div class="row">
				<div class="col-sm description">${param.desc}</div>
			</div>

		</div>
		
		<h5>${param.prix}&euro;</h5>
			
	</div>
</div>