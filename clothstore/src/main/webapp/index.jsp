<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>YOURS CHOICE</title>
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
 .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;

</style>
</head>
<body>
<div class="container">    
<marquee style="font-family:Book Antiqua; color: red" bgcolor="skyblue"  >
Diwali offers coming soon.. Get updated    
</marquee>
<div class="panel panel-info">
<div class="panel-heading">Welcome to shopping world
<div>
<img src="<c:url value="/resources/logo.png"/>"  class="img-square" alt="Men Clothing" width="300" height="100">
<img src="<c:url value="/resources/menclothing2.jpg"/>" class="img-circle" alt="Men Clothing">
<img src="<c:url value="/resources/womencloth.jpg"/>" class="img-circle" alt="women Clothing" width="100" height="100">
<img src="<c:url value="/resources/babycloth.jpg"/>" class="img-circle" alt="kids Clothing" width="100" height="100">
<img src="<c:url value="/resources/fabrics.jpg"/>" class="img-circle" alt="fabrics Clothing" width="100" height="100">
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
<ul class="nav navbar-nav navbar-right">
<li style="float:right;"><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
<li style="float:right;"><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
</ul>
</div>
</nav>
</div>
</div>
</div>
</div>
<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="<c:url value="/resources/menformalslide.jpg"/>" alt="formal" width="460" height="200">
        <div class="carousel-caption">
          <h3>MENS</h3>
          </div>
      </div>
     

      <div class="item">
        <img src="<c:url value="/resources/Sarees.jpg"/>" alt="sarees" width="460" height="200">
        <div class="carousel-caption">
          <h3>WOMEN</h3>
      </div>
      </div>
    
      <div class="item">
        <img src="<c:url value="/resources/kidsslide.jpg"/>" alt="kids" width="460" height="200">
        <div class="carousel-caption">
          <h3>KIDS</h3>
          </div>
      </div>

      <div class="item">
        <img src="<c:url value="/resources/fabricsslide.jpg"/>" alt="fabrics" width="460" height="200">
        <div class="carousel-caption">
          <h3>BED SHEETS</h3>
      </div>
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>




</body>
</html>
