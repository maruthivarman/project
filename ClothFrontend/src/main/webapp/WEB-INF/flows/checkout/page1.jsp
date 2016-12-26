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
		<form class="form-horizontal " role="form" method="post">
			<h2>Shipping Detail form</h2>
			<div class="form-group">
				<label for="username" class="col-sm-3 control-label">Username</label>
				<div class="col-sm-9">
					<input type="text" id="username" name="username"  
						class="form-control" autofocus>  
				</div>
			</div>
			
			
				<div class="form-group">
				<label for="productname" class="col-sm-3 control-label">Productname</label>
				<div class="col-sm-9">
					<input type="text" id="productname" name="productname" 
						class="form-control">

				</div>
			</div>
			
			<div class="form-group">
				<label for="emailid" class="col-sm-3 control-label">Emailid</label>
				<div class="col-sm-9">
					<input type="text" id="emailid" name="emailid" 
						class="form-control">

				</div>
			</div>
			
			<div class="form-group">
				<label for="phonenumber" class="col-sm-3 control-label">phonenumber</label>
				<div class="col-sm-9">
					<input type="text" id="phonenumber" name="phonenumber" 
						class="form-control">

				</div>
			</div>
			
			<div class="form-group">
				<label for="status" class="col-sm-3 control-label">status</label>
				<div class="col-sm-9">
					<input type="text" id="status" name="status" 
						class="form-control">

				</div>
			</div>
			
			<div class="form-group">
				<label for="price" class="col-sm-3 control-label">Amount</label>
				<div class="col-sm-9">
					<input type="text" id="price" name="price" 
						class="form-control">

				</div>
			</div>
			
			<div class="form-group">
				<label for="address" class="col-sm-3 control-label">Address</label>
				<div class="col-sm-9">
					<input type="text" id="address" name="address" 
						class="form-control">

				</div>
			</div>
			
			<div class="form-group">
				<label for="zipcode" class="col-sm-3 control-label">zipcode</label>
				<div class="col-sm-9">
					<input type="text" id="zipcode" name="zipcode" 
						class="form-control">

				</div>
			</div>
 
			<div class="form-group">
				<div class="col-sm-9 col-sm-offset-3">
					<button type="submit" class="btn btn-primary btn-block" name="_eventId_pay">Proceed</button>
				</div>
			</div>
		</form>
		<!-- /form -->
	</div>
	<!-- ./container -->
</body>
</html>
