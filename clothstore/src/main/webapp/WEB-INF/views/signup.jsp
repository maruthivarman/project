<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
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
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
	
<title>SIGN UP</title>

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
<script type="text/javascript">
var app = angular.module('app', ['ngMessages']);
</script>
</head>
<body>

<jsp:include page="/WEB-INF/views/header.jsp" />
	<div class="container">
		<form class="form-horizontal " role="form" action="newUser">
			<h2>Registration Form</h2>
			<div class="form-group">
				<label for="username" class="col-sm-3 control-label">User
					Name</label>
				<div class="col-sm-9">
					<input type="text" id="username" name="username"  ng-model="firstName" required placeholder="User Name"
						class="form-control" autofocus>  <div ng-messages="exampleForm.userFirstName.$error">
      <div ng-message="required">This field is required</div>
    </div>
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-sm-3 control-label">Email</label>
				<div class="col-sm-9">
					<input type="email" id="emailid" name="emailid" placeholder="Email"
						class="form-control"> <span class="help-block">abc@gmail.com</span>
				</div>
			</div>
			<div class="form-group">
				<label for="password" class="col-sm-3 control-label">Password</label>
				<div class="col-sm-9">
					<input type="password" id="password" name="password" placeholder="Password"
						class="form-control"> <span class="help-block">Try
						different from your Username</span>
				</div>
			</div>
			<div class="form-group">
				<label for="mobile number" class="col-sm-3 control-label">Mobile
					Number</label>
				<div class="col-sm-9">
					<input type="text" id="mobile number" name="mobile_number"
						placeholder="Enter your mobile number" class="form-control" >
				</div>
			</div>
			
			<!-- /.form-group -->

			
				<div class="form-group">
				<label for="address" class="col-sm-3 control-label">Address</label>
				<div class="col-sm-9">
					<input type="text" id="address" name="address" placeholder="Your address"
						class="form-control">

				</div>
			</div>
 <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        <div class="row">
                            <div class="col-sm-4">
                                <label class="radio inline" for="gender-0">
      <input name="gender" id="gender-0" value="Male" checked="checked" type="radio">
      Male
    </label>
                            </div>
                            <div class="col-sm-4">
                                <label class="radio inline" for="gender-1">
      <input name="gender" id="gender-1" value="Female" type="radio">
      Female
    </label>
                            </div>
                            
                        </div>
                    </div>
                </div>
			<div class="form-group">
				<div class="col-sm-9 col-sm-offset-3">
					<button type="submit" class="btn btn-primary btn-block">Register</button>
				</div>
			</div>
		</form>
		<!-- /form -->
	</div>
	<!-- ./container -->
</body>
</html>
