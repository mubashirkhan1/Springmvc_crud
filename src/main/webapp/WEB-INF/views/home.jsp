<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:directive.page isELIgnored="false"/>
     
     <%@include file="./style.jsp" %> 
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



<div class="container mt-3">
	<div class="row">
	
		<div class="col-md-12">
			<h1 class="text-center mb-3"> Welcome to my product App</h1>
			
			
			<table class="table table-striped table-dark">
  <thead>
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Product Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
       <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  
  <c:forEach items="${product1 }" var="p">
    <tr>
      <th scope="row">${p.id}</th>
      <td>${p.name}</td>
      <td>${p.description}</td>
      <td class="font-weight-bold">	&#8377 ${p.price}</td>
      <td> 
      <a href="delete/${p.id }"><i class="far fa-trash-alt text-danger"></i></a>
        <a href="update/${p.id }"><i class="fas fa-pen-nib"></i></a>
      </td>
    </tr>
    </c:forEach>

  </tbody>
</table>

	<div class="container text-center">
	
	<a href="productform" class="btn btn-outline-success" > Add Product</a>
	</div>
		
		</div>
	</div>
</div>	


</body>
</html>