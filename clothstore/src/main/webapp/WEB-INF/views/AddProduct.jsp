<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	
	
<title>ADD PRODUCT</title>

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
		<form class="form-horizontal " role="form" action="newProduct">
			<h2>Add Product form</h2>
			<div class="form-group">
				<label for="product name" class="col-sm-3 control-label">Product Name</label>
				<div class="col-sm-9">
					<input type="text" id="productname" name="productname"  
						class="form-control" autofocus>  
				</div>
			</div>
			<div class="form-group">
				<label for="price" class="col-sm-3 control-label">price</label>
				<div class="col-sm-9">
					<input type="text" id="price" name="price" 
						class="form-control"> 
				</div>
			</div>
			<div class="form-group">
				<label for="size" class="col-sm-3 control-label">size</label>
				<div class="col-sm-9">
					<input type="text" id="size" name="size" 
						class="form-control"> 
				</div>
			</div>
			<div class="form-group">
				<label for="color" class="col-sm-3 control-label">color</label>
				<div class="col-sm-9">
					<input type="text" id="color" name="color"
						 class="form-control" >
				</div>
			</div>
			
			<div class="form-group">
				<label for="categoryid" class="col-sm-3 control-label">categoryid</label>
				<div class="col-sm-9">
					<input type="text" id="categoryid" name="categoryid"
						 class="form-control" >
				</div>
			</div>
			
			<div class="form-group">
				<label for="supplierid" class="col-sm-3 control-label">supplierid</label>
				<div class="col-sm-9">
					<input type="text" id="supplierid" name="supplierid"
						 class="form-control" >
				</div>
			</div>
			<!-- /.form-group -->

			
				<div class="form-group">
				<label for="description" class="col-sm-3 control-label">description</label>
				<div class="col-sm-9">
					<input type="text" id="description" name="description" 
						class="form-control">

				</div>
			</div>
 
			<div class="form-group">
				<div class="col-sm-9 col-sm-offset-3">
					<button type="submit" class="btn btn-primary btn-block">ADD</button>
				</div>
			</div>
		</form>
		<!-- /form -->
	</div>
	<!-- ./container -->
</body>
</html>
