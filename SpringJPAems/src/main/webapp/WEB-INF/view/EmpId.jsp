<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
	<h1>!! Employee Form !!</h1>
<!-- 	<form:form action="ById" method="get" modelAttribute="employee">  -->
<!-- 	<table cellpadding="5"> -->
<!-- 	<tr> -->
<!-- 		<td>Id :</td> -->
<!-- 		<td><form:input path="Id"/></td> -->
<!-- 	</tr> -->
<!-- 	<tr> -->
<!-- 		<td colspan="2" align="center"><input type="submit" value="Save"/> -->
<!-- 	</tr> -->
<!-- 	</table> -->
<!-- 	</form:form> -->
	<form action="employeeById" method="get">
		Employee ID : <input type="text" name="Id" id="Id">
		<input type="submit" value="submit"/>
	 
	</form>
	</div>
	
</body>
</html>