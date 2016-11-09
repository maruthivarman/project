<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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

<jsp:include page="/WEB-INF/views/header.jsp" />
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
function formRegister() {
	// Make quick references to our fields
	var username = document.getElementById('username');
	var emailid = document.getElementById('emailid');
	var password = document.getElementById('password');
	var mobilenumber = document.getElementById('mobilenumber');
	var address = document.getElementById('address');

	
	// Check each input in the order that it appears in the form!
	if (notEmpty(username, "Username Should not be empty")) {
    if (isAlphabet(username, "Please enter only letters for Fsername")){
    if (notEmpty(emailid,
		"EmailId Should not be empty")) {
	if (notEmpty(password,
	   "password Should not be empty")) {
	if (isAlphanumeric(password,
		"Numbers and Letters Only for Passwords")) {
	if (notEmpty(mobilenumber,
		"PhoneNumber Should not be empty")) {
	if (isNumeric(mobilenumber,
		"Please enter only number for PhoneNumber")) {
	if (notEmpty(address,
		"Address Should not be empty")) {
		return true;
	}	
	}
	}
	}	
	}
	}
	}
	}
	return false;
}	
	
	function notEmpty(elem, helperMsg) {
		if (elem.value.length == 0) {
			alert(helperMsg);
			elem.focus(); // set the focus to this input
			return false;
		}
		return true;
	}

	function isNumeric(elem, helperMsg) {
		var numericExpression = /^[0-9]+$/;
		if (elem.value.match(numericExpression)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}

	function isAlphabet(elem, helperMsg) {
		var alphaExp = /^[a-z A-Z]+$/;
		if (elem.value.match(alphaExp)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}

	function isAlphanumeric(elem, helperMsg) {
		var alphaExp = /^[0-9a-zA-Z]+$/;
		if (elem.value.match(alphaExp)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
	}

	function emailValidator(elem, helperMsg) {
		var emailExp = /^[\w\-\.\+]+\@[a-zA-Z0-9\.\-]+\.[a-zA-z0-9]{2,4}$/;
		if (elem.value.match(emailExp)) {
			return true;
		} else {
			alert(helperMsg);
			elem.focus();
			return false;
		}
		
	}

</script>
</head>
<body>
<div class="container" >
		<form class="form-horizontal"  method="post" action="newUser" onsubmit="return formRegister()" role="form" >
			<h2>Registration Form</h2>
			<div class="form-group">
				<label for="username" class="col-sm-3 control-label">User
					Name</label>
				<div class="col-sm-9">
					<input type="text" id="username" name="username"   placeholder="User Name"
						class="form-control" autofocus>  
				</div>
			</div>
			<div class="form-group">
				<label for="email" class="col-sm-3 control-label">Email</label>
				<div class="col-sm-9">
					<input type="email" id="emailid" name="emailid"  placeholder="Email"
						class="form-control">
						
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
					<input type="text" id="mobilenumber" name="mobile_number" 
					placeholder="Enter your mobile number" class="form-control" >
					
				</div>
			</div>
			
			<!-- /.form-group -->

			
				<div class="form-group">
				<label for="address" class="col-sm-3 control-label">Address</label>
				<div class="col-sm-9">
					<input type="text" id="address" name="address"  
					placeholder="Your address"
						class="form-control">
		

				</div>
			</div>
 <div class="form-group">
                    <label class="control-label col-sm-3">Gender</label>
                    <div class="col-sm-6">
                        
                            <div class="col-sm-6">
                                <label class="radio inline" for="gender-0">
      <input name="gender" id="gender-0" value="Male" checked="checked" type="radio">
      Male
    </label>
                            </div>
                            <div class="col-sm-6">
                                <label class="radio inline" for="gender-1">
      <input name="gender" id="gender-1" value="Female" type="radio">
      Female
    </label>
                            </div>
                            
                       
                    </div>
                </div>
			<div class="form-group">
				<div class="col-sm-9 col-sm-offset-3">
					<input type="submit" name="submit" class="btn btn-primary btn-block" value="Register">
				</div>
			</div>
		</form>
		<!-- /form -->
	</div>
	<!-- ./container -->
</body>

</html>
