<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<jsp:include page="/WEB-INF/views/header.jsp" />
<head>

<style type="text/css">
body {
	background-color: #eee;
}

*[role="form"] {
	max-width: 530px;
	padding: 15px;
	margin: 0 auto;
	background-color: #fff;
	border-radius: 0.3em;
}

*[role="form"] h2 {
	margin-left: 5em;
	margin-bottom: 1em;
}
</style>

</head>
<body>
	<div class="container">
		<form class="form-horizontal" method="post" role="form" action="../UpdateCategory">
			<h2>Edit Category form</h2>
		<!-- 	<div class="form-group"> 
				<label for="product name" class="col-sm-3 control-label">category Id:</label>
				<div class="col-sm-9">
					
				</div>
			</div> -->
			<input type="hidden" id="categoryname" name="categoryid"  
						class="form-control" value="${category.categoryid }">  
			<div class="form-group">
				<label for="categoryname" class="col-sm-3 control-label">Category Name</label>
				<div class="col-sm-9">
					<input type="text" id="categoryname" name="categoryname"  
						class="form-control" value="${category.categoryname }" autofocus>  
				</div>
			</div>
			
			
				<div class="form-group">
				<label for="description" class="col-sm-3 control-label">description</label>
				<div class="col-sm-9">
					<input type="text" id="description" name="description" 
						class="form-control" value="${category.description }">

				</div>
			</div>
 
			<div class="form-group">
				<div class="col-sm-9 col-sm-offset-3">
					<button type="submit" class="btn btn-primary btn-block">UPDATE</button>
				</div>
			</div>
		</form>
		<!-- /form -->
	</div>
	<!-- ./container -->
</body>
</html>
