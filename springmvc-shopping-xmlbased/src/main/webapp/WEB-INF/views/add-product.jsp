<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<b> Add Product</b>
	<form action="addnewproduct" method="post">
		<table>
			<tr>
				<td>Enter the Product id</td>
				<td><input type="text" name="productid" value=""/></td>
			</tr>
			<tr>
				<td>Enter the Product Name</td>
				<td><input type="text" name="productname" value=""/></td>
			</tr>
			<tr>
				<td>Enter the Quantity</td>
				<td><input type="text" name="quantity" value=""/></td>
			</tr>
			<tr>
				<td>Enter the Price</td>
				<td><input type="text" name="price" value=""/></td>
			</tr>
			<tr>
				<td><input type="submit" value="Add Product"/></td>
				<td><input type="reset" value="Cancel Product"/></td>
			</tr>
		</table>
	</form>
</body>
</html>