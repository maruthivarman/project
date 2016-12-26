<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:include page="/WEB-INF/views/header.jsp" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
<script type="text/javascript">
	var app = angular.module('myApp',[]);
	 app.controller("ProductController",function($scope,$http){
		$scope.getdata = function(){
			$http({
				method : 'GET',
				url : 'viewproductlist'
			}).success(function(data, status ,headers, config){
				$scope.result = data;
				/* alert("success"); */
			}).error(function(data, status, headers, config){
				/* alert("error"); */
			});
		}
	}); 
		
		
</script> 
</head>
<body>
<div ng-app="myApp" ng-controller="ProductController" ng-init="getdata()">
<table class="table table-hover">
<tr>
<th>productid</th>
<th>productname</th>
<th>price</th>
<th>size</th>
<th>categoryname</th>
<th>suppliername</th>
<th>color</th>
<th>description</th>
<th colspan="2"> action</th>
</tr>
<tr ng-repeat="items in result">
<th>{{items.productid}}</th>
<th>{{items.productname}}</th>
<th>{{items.price}}</th>
<th>{{items.size}}</th>
<th>{{items.categoryname}}</th>
<th>{{items.suppliername}}</th>
<th>{{items.color}}</th>
<th>{{items.description}}</th>
<th><a href="editproduct/{{items.productid}}">edit</a></th>
<th><a href="deleteproduct/{{items.productid}}">delete</a></th>
</tr>
</table>
</div>
</body>
</html>