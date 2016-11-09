

<style>
div.img {
    margin: 5px;
    border: 1px solid #ccc;
    float: left;
    width: 180px;
}

div.img:hover {
    border: 1px solid #777;
}

div.img img {
    width: 100%;
   
}

div.desc {
    padding: 15px;
    text-align: center;
}
</style>

<body>

<c:forEach items="${listProduct}" var="p">
<div class="img">
<c:if test="${pageContext.request.userPrincipal.name!=null }">
<a href="user/ProductDesc/${p.productid}" }"><img alt="${p.productid}" src="<c:url value="/resources/ProductImage/${p.productid}.jpg"></c:url>" width="200" height="250"></a>
<input type="hidden" name="id"  value="${p.productid }" />
<div class="desc"><h1>${p.productname }</h1></div>
<li>Amount: ${p.price }</li>
<li>Size  : ${p.size }</li>
<li>Color : ${p.color }</li>
</c:if>
<c:if test="${pageContext.request.userPrincipal.name==null }">
<a href="getlogin" }"><img alt="${p.productid}" src="<c:url value="/resources/ProductImage/${p.productid}.jpg"></c:url>" width="200" height="250"></a>
<input type="hidden" name="id"  value="${p.productid }" />
<div class="desc"><h1>${p.productname }</h1></div>
<li>Amount: ${p.price }</li>
<li>Size  : ${p.size }</li>
<li>Color : ${p.color }</li>
</c:if>
</div>





<%-- <div class="col-sm-4">
 
 
</div>
<div class="col-sm-6 col-sm-offset-2">
<table>
<h1><ul>${p.productname }</ul></h1>
<li>Amount: ${p.price }</li>
<li>Size  : ${p.size }</li>
<li>Color : ${p.color }</li>
</table>
</div> --%>
</c:forEach>
