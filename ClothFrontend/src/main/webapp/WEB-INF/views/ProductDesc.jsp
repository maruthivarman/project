<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="/WEB-INF/views/header.jsp" %>
<script src="<c:url value="/resources/js/CartController.js"/>" type="text/javascript">
</script>
<style type="text/css">
.add-to-cart, .like {
  background: #ff9f1a;
  padding: 1.2em 1.5em;
  border: none;
  text-transform: UPPERCASE;
  font-weight: bold;
  color: #fff;
  -webkit-transition: background .3s ease;
          transition: background .3s ease;
      }
  .add-to-cart:hover, .like:hover
   {
    background: #b36800;
    color: #fff; }
</style>
<div ng-app="addToCartApp">
<div ng-controller="addToCartCtrl">
<div class="img">
<img alt="${p.productid}" src="<c:url value="/resources/ProductImage/${p.productid}.jpg"></c:url>" width="200" height="250">
<input type="hidden" name="id"  value="${p.productid }" />
</div>
<div class="desc"><h1>${p.productname }</h1></div>
<li>Amount: ${p.price }</li>
<li>Size  : ${p.size }</li>
<li>Color : ${p.color }</li>
<li>Description : ${p.description }</li>
	<div class="action">
<button class="add-to-cart btn btn-default" ng-click="addtocart('${ p.productid}')" type="button">Add to cart</button>
</div>
</div>
</div>
</body>
</html>