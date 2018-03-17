<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html >
<%@page import="java.util.*,com.sapient.pm.model.*"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bootstrap.css">
<title>Product-Management</title>

</head>
<body>
	<div class="container">
	
		<div class="page-header">PM-v1</div>
		<button id="new-btn" class="btn btn-primary">New</button>
		
		<hr/>
        <div class="row" id="product-form">
			<div class="col-xs-8 col-sm-6 col-md-6">
				<div class="panel panel-default">					
					<div class="panel-heading">Product Form</div>
					<div class="panel-body">
						<form action="save-product" method="post">
							<div class="form-group">
								<label>Name:</label> <input name="name" class="form-control">
							</div>
							<div class="form-group">
								<label>Price:</label> <input type="number" name="price"
									class="form-control">
							</div>
							<div class="form-group">
								<label>Make-Date:</label> <input type="date" name="make_date"
									class="form-control">
							</div>
							<div class="form-group">
								<label>Description:</label>
								<textarea name="description" rows="5" cols="35"
									class="form-control"></textarea>
							</div>
							<button class="btn btn-primary">save</button>
							<button id="cancel-btn" type="button" class="btn btn-danger">cancel</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		<div class="panel panel-default">
			<div class="panel-heading">All Products</div>
			<div class="panel body">
				<table class="table">
					<thead>
						<tr>
							<th>Id</th>
							<th>Name</th>
							<th>Price</th>
							<th>Make-Date</th>
							<th>Description</th>
						</tr>
					</thead>

					<tbody>
						<%
							List<Product> products = (List<Product>) request.getAttribute("products");
						%>
						<%
							for (Product product : products) {
						%>
						<tr>
							<td><%=product.getId()%></td>
							<td><%=product.getName()%></td>
							<td>&#8377;<%=product.getPrice()%></td>
							<td><%=product.getMakedate()%></td>
							<td><%=product.getDesc()%></td>
							<td><a href><i class="glyphicon glyphicon-edit"></i></a></td>
							<td><a href="delete-product?id=<%=product.getId()%>"><i
									class="glyphicon glyphicon-trash"></i></a></td>
						</tr>
						<%
							}
						%>
					</tbody>
				</table>
			</div>
		</div>

		<hr />


	</div>
	<script src="./jquery-3.3.1.js"></script>
    <script src="./action.js"></script>
</body>
</html>
