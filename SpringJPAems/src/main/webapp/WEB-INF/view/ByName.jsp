<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Data</title>
</head>
<style>
            body {background-color: #00ffff;}
 		</style>
	<div align="center">
		<h1>Employee Details By their Name :</h1>
		<table border="1" cellpadding="5">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>City</th>
			<th>Salary</th>
			<th>Designation</th>
		</tr>
		<c:forEach items="${List}" var="employee" varStatus="status">
		<tr>
			<td>${employee.id}</td>
			<td>${employee.name}</td>
			<td>${employee.city}</td>
			<td>${employee.salary}</td>
			<td>${employee.designation}</td>
		</tr>
		</c:forEach>
		</table>
		<br>
		<br>
		<center><a href="home">Move to Home</a></center>
		
	</div>
	</body>
</html>