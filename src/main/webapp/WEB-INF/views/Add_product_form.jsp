<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <%@include file="./style.jsp" %> 
</head>
<body>


<div class="container mt-3">
	<div class="row">
		<div class="col-md-6  offset-md-3">
		 	<h1 class="text-center mb-3">  Fill the product detail
		 	
		 	</h1>
		 	
		 		<form action="handleproduct"method="post">
		 			<div class="form-group">
		 				<label for="name">Product Name</label>
		 					<input name="name" type="text" id="name" class="form-control" placeholder="Enter the Product Name here">
		 				</div>
		 		
		 			<!-- 	<div class="form-group">
		 					<label for="name">product id</label>
		 						<input name="id" type="number" id="id" class="form-control" placeholder="Enter the Product Id">
		 				</div>
		 				 --> 
		 					<div class="form-group" for="description">
		 					<label for="description">Product Description</label>
		 							<textarea rows="5" id="description"  name="description" class="form-control" placeholder="Enter your Product Description">
		 					</textarea> 
		 					</div>
		 				
		 						<div class="form-group">
		 								<label for="price">Product Price</label>
		 									<input type="number" name="price" id="price" class="form-control" placeholder="Enter the Product Price">
		 						</div>
		 					
		 							<div class="container text-center">
		 								<a  href="" class="btn btn-outline-danger">Back</a>
		 									<button type="submit" class="btn btn-primary">Add</button>
		 							
		 						
		 							</div>			 						
		 		
		 		</form>
		
		</div>
	
	</div>

</div>


</body>
</html>