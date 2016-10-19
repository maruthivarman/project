<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.container {
    width: auto;
}

.dropbtn {
    background-color: #4CAF50;
    color: white;
    padding: 16px;
    font-size: 16px;
    border: none;
    cursor: pointer;
}

.dropdown {
    position: relative;
    display: inline-block;
}

.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
}

.dropdown-content a {
    color: black;
    padding: 12px 16px;
    text-decoration: none;
    display: block;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
    display: block;
}

.dropdown:hover .dropbtn {
    background-color: #3e8e41;
}

}

img{
height: 450px;
width: 100%;
object-fit: cover;
}
.bannerContainer {
    position:relative;     
}
.navbar {
    
    top:30px;
    z-index:10;
    background:#fff;
    width:100%;
}
.panel {
    margin-bottom: -17px;
    }
 .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 100%;
      height: 60%;
      margin:0px 0px 0px 0px;
}
/* search */
.search-form .form-group {
  float: right !important;
  transition: all 0.35s, border-radius 0s;
  width: 32px;
  height: 32px;
  background-color: #fff;
  box-shadow: 0 1px 1px rgba(0, 0, 0, 0.075) inset;
  border-radius: 25px;
  border: 1px solid #ccc;
}
.search-form .form-group input.form-control {
  padding-right: 20px;
  border: 0 none;
 
  background: transparent;
  box-shadow: none;
  display:block;
}
.search-form .form-group input.form-control::-webkit-input-placeholder {
  }
.search-form .form-group input.form-control:-moz-placeholder {
  /* Firefox 18- */
  display: none;
}
.search-form .form-group input.form-control::-moz-placeholder {
  /* Firefox 19+ */
  display: none;
}
.search-form .form-group input.form-control:-ms-input-placeholder {
  display: none;
}
.search-form .form-group:hover,
.search-form .form-group.hover {
  width: 40%;
  border-radius: 4px 25px 25px 4px;
}
.search-form .form-group span.form-control-feedback {
  position: absolute;
  top: -1px;
  right: -2px;
  z-index: 2;
  display: block;
  width: 34px;
  height: 34px;
  line-height: 34px;
  text-align: center;
  color: #3596e0;
  left: initial;
  font-size: 14px;
}
.row {
    margin-right: 0px;
    margin-left: 0px;
    margin-bottom: 6px;
    margin-top: -64px;
}
/* button */
.btn3d {
    transition:all .08s linear;
    position:relative;
    outline:medium none;
    -moz-outline-style:none;
    border:0px;
    margin-right:10px;
    margin-top:1px;
}
.btn3d:focus {
    outline:medium none;
    -moz-outline-style:none;
}
.btn3d:active {
    top:9px;
}

 .btn-success {
    box-shadow:0 0 0 1px #5cb85c inset, 0 0 0 2px rgba(255,255,255,0.15) inset, 0 8px 0 0 #4cae4c, 0 8px 0 1px rgba(0,0,0,0.4), 0 8px 8px 1px rgba(0,0,0,0.5);
    background-color:#5cb85c;
}


</style> 
</head>
<body>

<div class="container">    
<marquee style="font-family:Book Antiqua; color: red" bgcolor="skyblue"  >
Diwali offers coming soon.. Get updated    
</marquee>
<div class="panel panel-info">
<div class="panel-heading">Welcome to shopping world
<div class="container">
<div>
<img src="<c:url value="/resources/images/logo.png" />"  class="img-square" alt="logo" width="300" height="100"/>
<img src="<c:url value="/resources/images/menclothing2.jpg" />" class="img-circle" alt="Men Clothing" width="100" height="100" />
<img src="<c:url value="/resources/images/womencloth.jpg"/>" class="img-circle" alt="women Clothing" width="100" height="100" />
<img src="<c:url value="/resources/images/babygirl.jpg"/>" class="img-circle" alt="kids Clothing" width="100" height="100" />
<img src="<c:url value="/resources/images/fabrics.jpg"/>" class="img-circle" alt="fabrics Clothing" width="100" height="100" />
</div>
   
    <div class="row search-form">
                <div class="form-group has-feedback">
            		<label for="search" class="sr-only">Search</label>
            		<input type="text" class="form-control" name="search" id="search" placeholder="search">
              		<span class="glyphicon glyphicon-search form-control-feedback"></span>
            	</div>
          
        </div>
  
  

<nav class="navbar navbar-default">
<div class="container-fluid">
<div class="navbar-header">

<ul class="nav navbar-nav">
</ul>
<a class="navbar-brand" href="#">Yours choice</a>
</div>
<div class="dropdown">
  <button class="dropbtn">ABOUT</button>
  <div class="dropdown-content">
    <a href="#">description</a>
    <a href="#">Contact</a>
   
  </div>
</div>

<div class="dropdown">
  <button class="dropbtn">MEN</button>
  <div class="dropdown-content">
    <a href="#">T-Shirts</a>
    <a href="#">Formal Shirts</a>
    <a href="#">Casual Shirts</a>
    <a href="#">Jeans</a>
    <a href="#">Track Pants</a>
  </div>
</div>

<div class="dropdown">
  <button class="dropbtn">WOMEN</button>
  <div class="dropdown-content">
    <a href="#">Sarees</a>
    <a href="#">Kurtas</a>
    <a href="#">Western Wears</a>
    <a href="#">Coats and Blazers</a>
  </div>
</div>
<div class="dropdown">
  <button class="dropbtn">KIDS</button>
  <div class="dropdown-content">
    <a href="#">Baby Boy</a>
    <a href="#">Baby Girl</a>
    <a href="#">Boy's Casual</a>
    <a href="#">Girl's Casual</a>
  </div>
</div>
<div class="dropdown">
  <button class="dropbtn">FABRICS</button>
  <div class="dropdown-content">
    <a href="#">Bed sheets</a>
    <a href="#">Curtains</a>
    <a href="#">Mats and Carpets</a>
  </div>
</div>

<div class="dropdown">
  <button class="dropbtn">product</button>
  <div class="dropdown-content">
    <a href="getproduct">Add</a>
    <a href="viewproduct">View</a>
    
  </div>
</div>

<div class="dropdown">
  <button class="dropbtn">Category</button>
  <div class="dropdown-content">
    <a href="getController">Add</a>
    <a href="viewcategory">View</a>
  </div>
</div>

<div class="dropdown">
  <button class="dropbtn">Supplier</button>
  <div class="dropdown-content">
    <a href="getsupplier">Add</a>
    <a href="viewsupplier">View</a>
  
  </div>
</div>
<ul class="nav navbar-nav navbar-right">
 <a href="<c:url value="/getlogin" />" ><button type="button" class="btn btn-success btn-lg btn3d"><span class="glyphicon glyphicon-ok"></span>Login</button></a>
 <a href="getsignup"><button type="button" class="btn btn-success btn-lg btn3d"><span class="glyphicon glyphicon-download-alt"></span>Sign up</button></a>
 <button type="button" class="btn btn-success btn-lg btn3d"><span class="glyphicon glyphicon-cloud"></span> Cart</button>
 </ul>

</div>
</nav>
</div>
</div>
</div>
</div>

</body>
</html>