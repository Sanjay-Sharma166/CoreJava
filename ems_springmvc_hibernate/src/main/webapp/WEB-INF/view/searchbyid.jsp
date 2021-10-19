<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
		<form:form method="POST" modelAttribute="employee"
			class="form-horizontal">
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="name">Enter Id</label>
					<div class="col-md-7">
						<form:input type="number" path="id" id="id"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="name" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Search"
						class="btn btn-primary btn-sm">
				</div>
			</div>
			
		</form:form>
	</div>
</body>
</html>