<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product Details</title>
</head>
<body align="center">
<h3>Products Details Page</h3>
<c:set var="product" value="${obj }"></c:set>
Name: ${product.name } <br>
<br>
Price: ${product.price } <br>


<h2>Enter product details to update</h2>

<form action="success">

<label>Enter Product Id</label>
<input type="text" name="id" placeholder="Enter product id"><br><br>
<label>Enter Product Name</label>
<input type="text" name="pname" placeholder="Enter product name"><br><br>
<label>Enter Product Price</label>
<input type="text" name="price" placeholder="Enter product price"><br><br>
<input type="submit" value="submit">
</form>
</body>
</html>