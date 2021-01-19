$(document).ready(function(){


   $('.quantity-right-plus').click(function(e){
        
        e.preventDefault();
        var quantity = parseInt($('#quantite').val());
        
            
            $('#quantite').val(quantity + 1);

          
        
    });

     $('.quantity-left-minus').click(function(e){
        e.preventDefault();
        var quantity = parseInt($('#quantite').val());
              
            if(quantity>1){
            $('#quantite').val(quantity - 1);
            }
    });
    
});