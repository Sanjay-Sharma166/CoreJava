<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form</title>
</head>
<body>
	<div align="center">
	<h1>!! Employee Form !!</h1>
	<form:form action="updateemp" method="post" modelAttribute="employee"> 
	<table cellpadding="5">
	<tr>
		<td>Id :</td>
		<td><form:input path="Id"/></td>
	</tr>
	<tr>
		<td>Name :</td>
		<td><form:input path="Name"/></td>
	</tr>
	<tr>
		<td>City :</td>
		<td><form:input path="City"/></td>
	</tr>
	<tr>
		<td>Salary :</td>
		<td><form:input path="Salary"/></td>
	</tr>
	<tr>
		<td>Designation :</td>
		<td><form:input path="Designation"/></td>
	</tr>
	<tr>
		<td colspan="2" align="center"><input type="submit" value="Update"/>
	</tr>
	</table>
	</form:form>
	</div>
</body>
</html>