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
			<h2>Payment Detail form</h2>
			<div class="form-group">
				<label for="cardholdername" class="col-sm-3 control-label">cardholdername</label>
				<div class="col-sm-9">
					<input type="text" id="cardholdername" name="cardholdername"  
						class="form-control" autofocus>  
				</div>
			</div>
			
			
				<div class="form-group">
				<label for="cardnumber" class="col-sm-3 control-label">cardnumber</label>
				<div class="col-sm-9">
					<input type="text" id="cardnumber" name="cardnumber" 
						class="form-control">

				</div>
			</div>
			
			<div class="form-group">
				<label for="cardtype" class="col-sm-3 control-label">cardtype</label>
				<div class="col-sm-9">
					<input type="text" id="cardtype" name="cardtype" 
						class="form-control">

				</div>
			</div>
			
			<div class="form-group">
				<label for="cvvnumber" class="col-sm-3 control-label">cvv number</label>
				<div class="col-sm-9">
					<input type="password" id="cvvnumber" name="cvvnumber" 
						class="form-control">

				</div>
			</div>
			
			
			
			<div class="form-group">
				<label for="expirydate" class="col-sm-3 control-label">Expirydate</label>
				<div class="col-sm-9">
					<input type="text" id="expirydate" name="expirydate" 
						class="form-control">

				</div>
			</div>
			
			 
			<div class="form-group">
				<div class="col-sm-9 col-sm-offset-3">
					<button type="submit" class="btn btn-primary btn-block" name="_eventId_pay">Back</button>
					<button type="submit" class="btn btn-primary btn-block" name="_eventId_thank">Finish</button>
				</div>
			</div>
		</form>
		<!-- /form -->
	</div>
	<!-- ./container -->
</body>
</html>
