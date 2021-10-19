<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Enrollment Detail Confirmation</title>

<!-- 
<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
 -->
 
<style type="text/css">
.success {
	position: fixed;
	width: 50%;
	margin-left: 50px;
	margin-top: 20px;
	padding: 20px;
	background-color: #E8E1E1;
	border: 1px solid #ddd;
	border-radius: 4px;
}

.floatRight {
	float: right;
	margin-right: 18px;
}

</style>

</head>
<body>
	<div class="success">
		Confirmation message : ${success} <br><br> 
		Your details: <br><br>
		Name: ${employee.name} <br>
		Salary: ${employee.salary} <br>
		Department: ${employee.department} <br>
		Designation: ${employee.designation} <br>
		Address: ${employee.address} <br>
		
	</div>
</body>
</html>
