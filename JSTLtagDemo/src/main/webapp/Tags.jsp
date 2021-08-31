<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml" prefix="x" %>  

  

<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Demo</title>
</head>
<body>
	<c:out value="${'Welcome to JSTL'}"/>
	<br>
	<c:set var="number" scope="session" value="${30000}"/>
	<c:out value="${number}"/>
	<c:if test="${number<=20000}">
	<p>number is<c:out value="${number}"/>
	</c:if>
	
	<br>
	<br>
	<c:choose>
	<c:when test="${number<=10000}">
	Number is less than 10000</c:when>
	<c:when test="${number>=10000}">
	Number is greater than 10000</c:when>
	<c:otherwise>
	Invalid Data
	</c:otherwise>
	</c:choose>
	
	<br>
	<br>
	<c:forEach var="i" begin="1" end="10">
	Integers<c:out value="${i}"/><p>
	</c:forEach>
	<br>
	<br>
	<c:remove var="number"/>
	<p>After remove number is:<c:out value="${number}"/></p>
	<br>
	<c:set var="name" value="Hello welcome to jstl"/>
	<p>The name is:<c:out value="${name}"/></p>
	<br>
	<br>
	<c:if test="${fn:containsIgnoreCase(name,'Welcome')}"/>
	<p>welcome is found</p>
	
	<br>
	<c:set var="date" value="<%=new java.util.Date()%>"/>
	<c:out value="${date}"/>
	<br>
	<br>
	<fmt:formatNumber value="${Date}"/>
	<br>
	<fmt:formatDate type="both" dateStyle="long" timeStyle="long"  value="${Date}" />  
</body>
</html>