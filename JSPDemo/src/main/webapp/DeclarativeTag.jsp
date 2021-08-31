<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! int a,b; 
int sampleFunction(int a)
{
	return a;}%>
	<%a=10; %>
	<%b=sampleFunction(100); %>
	<%out.println(b); %>
</body>
</html>