<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome Page</title>
</head>
<style>
            body {background-color: #00ffff;}
 		</style>
	<div align="center">
		<h1>Employee Details :</h1>
		<table border="1" cellpadding="5">
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>City</th>
			<th>Salary</th>
			<th>Designation</th>
			<th>Action</th>
		</tr>
		<c:forEach items="${List}" var="employee" varStatus="status">
		<tr>
			<td>${status.index + 1}</td>
			<td>${employee.name}</td>
			<td>${employee.city}</td>
			<td>${employee.salary}</td>
			<td>${employee.designation}</td>
			<td><a href="update">Update</a>/<a href="delete?id=${employee.id }">Delete</a></td>
		</tr>
		</c:forEach>
		</table>
	</div>
</body>
</html>