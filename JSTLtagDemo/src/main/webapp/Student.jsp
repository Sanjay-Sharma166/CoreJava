<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
  
<html>  
<head>  
<title>sql:query Tag</title>  
</head>  
<body>  
   
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost:3306/students"
     user="root"  password="root"/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from students;  
</sql:query>  
   
<table border="2" width="100%">  
<tr>  
<th>Student_ID</th>  
<th>Roll_No</th>  
<th>Name</th>  
<th>Age</th>  
<th>City</th>  
</tr>  
<c:forEach var="table" items="${rs.rows}">  
<tr>  
<td><c:out value="${table.Student_ID}"/></td>  
<td><c:out value="${table.Roll_No}"/></td>  
<td><c:out value="${table.Name}"/></td>  
<td><c:out value="${table.Age}"/></td>  
<td><c:out value="${table.City}"/></td>  
</tr>  
</c:forEach>  
</table>  
  
</body>  
</html>  