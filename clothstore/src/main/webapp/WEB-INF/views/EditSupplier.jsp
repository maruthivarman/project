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
	
	
<title>ADD SUPPLIER</title>

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
		<form class="form-horizontal " method="post" role="form" action="../UpdateSupplier">
			<h2>Add Supplier form</h2>
			
			<input type="hidden" id="supplierid" name="supplierid"  
						class="form-control" value="${supplier.supplierid }">
			
			<div class="form-group">
				<label for="suppliername" class="col-sm-3 control-label">Supplier Name</label>
				<div class="col-sm-9">
					<input type="text" id="suppliername" name="suppliername"  
						class="form-control" value="${supplier.suppliername }" autofocus>  
				</div>
			</div>
			<div class="form-group">
				<label for="companyname" class="col-sm-3 control-label">Company Name</label>
				<div class="col-sm-9">
					<input type="text" id="companyname" name="companyname" 
						class="form-control" value="${supplier.companyname }"> 
				</div>
			</div>
			<div class="form-group">
				<label for="address" class="col-sm-3 control-label">Address</label>
				<div class="col-sm-9">
					<input type="text" id="address" name="address" 
						class="form-control" value="${supplier.address }"> 
				</div>
			</div>
			<div class="form-group">
				<label for="emailid" class="col-sm-3 control-label">E-mail ID</label>
				<div class="col-sm-9">
					<input type="text" id="emailid" name="emailid"
						 class="form-control" value="${supplier.emailid }">
				</div>
			</div>
			
			<div class="form-group">
				<label for="mobilenumber" class="col-sm-3 control-label">Mobile Number</label>
				<div class="col-sm-9">
					<input type="text" id="mobilenumber" name="mobilenumber"
						 class="form-control" value="${supplier.mobilenumber }">
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
