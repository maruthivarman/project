<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>YOURS CHOICE</title>
</head>
<body>
<div class="container">    
<marquee style="font-family:Book Antiqua; color: red" bgcolor="yellow"  >
This is an example of front page
</marquee>
<div class="panel panel-primary">
<div class="panel-heading">Welcome to shopping world
<div>
<img src="<c:url value="/Resources/Images/menclothing2.jpg"/>" class="img-circle" alt="Men Clothing">
<img src="C:\Users\welcome\workspace\clothstore\src\main\webapp\WEB-INF\Resources\Images\womencloth.jpg" class="img-circle" alt="women Clothing" width="100" height="100">
<img src="C:\Users\welcome\workspace\clothstore\src\main\webapp\WEB-INF\Resources\Images\babycloth.jpg" class="img-circle" alt="kids Clothing" width="100" height="100">
<img src="C:\Users\welcome\workspace\clothstore\src\main\webapp\WEB-INF\Resources\Images\fabrics.jpg" class="img-circle" alt="fabrics Clothing" width="100" height="100">
<nav class="navbar navbar-default">
<div class="container-fluid">
<div class="navbar-header">
<a class="navbar-brand" href="#">Yours choice</a>
</div>
<ul class="nav navbar-nav">
<style>
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
</style>
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
    <a href="#">Saress</a>
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
    <a href="#">Bedsheets</a>
    <a href="#">Curtains</a>
    <a href="#">Mats and Carpets</a>
  </div>
</div>
</div>
</nav>
</div>
</div>
</div>
<div class="row">
<div class="col-xs-6">



</div>
<div class="col-xs-6">



</div>
</div>
</body>

</html>
