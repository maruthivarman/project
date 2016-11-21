var cartApp = angular.module ("addToCartApp", []);

cartApp.controller("addToCartCtrl", function ($scope, $http){
	
	 $scope.retrieveCart = function (username) {
	        $scope.username = username;
	        $scope.refreshCartItems(username);
	    };
	    
	    $scope.refreshCartItems = function () {
	        $http.get('http://localhost:8080/clothstore/refreshcart/'+$scope.username).success(function (data) {
	           $scope.cart=data;
	        });
	    };
	    
	    $scope.addtocart = function(itemId){
	    	 $http.put('http://localhost:8080/clothstore/addtocart/'+itemId).success(function () {
	             alert("Item added to the cart!")
	         });
	    }
	    
	    $scope.removeItemFromCart=function(cartid){
	    	$http.delete('http://localhost:8080/clothstore/removeItemFromCart/' +cartid).success(function(){
	    		alert("Item removed from cart")
	    		$scope.refreshCartItems();
	    	});
	    }
	 $scope.GrandTotalOfItems = function () {
		 var grandTotal=0;
		 
		 for (var i=0; i<$scope.cart.length; i++){
			 grandTotal+=$scope.cart[i].price;
			 console.log(grandTotal);
		 }
		 return grandTotal;
	 };
});