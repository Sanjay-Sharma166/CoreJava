<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee list</title>

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
</style>

</head>
<body>
	<div class="success">
		 <div align="center">
        <table border="1" cellpadding="5">
            <caption><h2>List of employees</h2></caption>
            <tr>
                <th>Id</th>
                <th>Name</th>
                <th>Salary</th>
                <th>Department</th>
                <th>Designation</th>
                <th>Address</th>
            </tr>
            <c:forEach var="emp" items="${emplist}">
                <tr>
                    <td><c:out value="${emp.id}" /></td>
                    <td><c:out value="${emp.name}" /></td>
                    <td><c:out value="${emp.salary}" /></td>
                    <td><c:out value="${emp.department}" /></td>
                    <td><c:out value="${emp.designation}" /></td>
                    <td><c:out value="${emp.address}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>
	</div>
</body>
</html>