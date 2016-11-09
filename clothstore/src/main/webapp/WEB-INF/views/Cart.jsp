<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<jsp:include page="/WEB-INF/views/header.jsp" />

<body ng-app="addToCartApp" ng-controller="addToCartCtrl" ng-init="retrieveCart('${pageContext.request.userPrincipal.name}')">
 <table class="table table-bordered table-striped fs13" >
		  <thead>
			  <tr>
				
				<th>Image</th>
				<th class="width110">Product</th>
				<th >Unit Price</th>
				<th>Quantity</th>
				<th>Price(in Rs.)</th>
				<th>Action</th>
			  </tr>
			</thead>
			<tbody>
				<tr ng-repeat = "items in cart">
					 	<td class="span1"><img src="<c:url value="/resources/productimages/{{items.item.itemId}}.jpg" /> " alt="productimages"/></td> 
					 	 
						<td>{{items.username}}</td>
						<td>{{items.productid}}</td>
						<td>{{items.quantity}}</td>
						<td>{{items.price}}</td>
						<td><a href="#" class="btn btn-danger btnAction" ng-click="removeItemFromCart(items.item.itemId)">
							<span class="glyphicon glyphicon-trash"></span>remove</a></td>
					</tr>
			  <tr>
                    <td></td>
                    <td></td>
					<td></td>
                    <td>Grand Total(in Rs.)</td>
                    <td>{{GrandTotalOfItems()}}</td>
                    <td></th>
                </tr>
               
			</tbody>
		  </table>
		  <div class="container">
		  
		    <td>
                        <button type="button" class="btn btn-info">
                            Continue Shopping<span class="glyphicon glyphicon-play"></span>
                        </button>
                      
                         <a href="order/${pageContext.request.userPrincipal.name}"><button type="button" class="btn btn-info">
                            Buy Now <span class="glyphicon glyphicon-briefcase"></span>
                        </button></a>
                      
                         <button type="button" class="btn btn-danger">
                            Cancel <span class="glyphicon glyphicon-remove"></span>
                        </button>
                        </td>
                        
               
                </div>	
                  
</body>
</html>