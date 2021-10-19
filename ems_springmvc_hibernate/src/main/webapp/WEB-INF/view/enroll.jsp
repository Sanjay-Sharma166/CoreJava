<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Registration Form</title>

<!--  
<link href="<c:url value='/static/css/bootstrap.css' />"rel="stylesheet"></link>
<link href="<c:url value='/static/css/custom.css' />" rel="stylesheet"></link>
-->

<style>

.form-container {
	position: fixed;
	width: 50%;
	margin-left: 20px;
	margin-top: 20px;
	margin-bottom: 20px;
	
	padding: 20px;
	background-color: #c0c0c0;
	border: 1px solid #ddd;
	border-radius: 4px;
}

.floatRight {
	float: right;
	margin-right: 18px;
}

.has-error {
	color: red;
}

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
	<div class="form-container">
		<h1>Registration Form</h1>
		<form:form method="POST" modelAttribute="employee"
			class="form-horizontal">
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="name">Name</label>
					<div class="col-md-7">
						<form:input type="text" path="name" id="name"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="name" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="salary">Salary</label>
					<div class="col-md-7">
						<form:input type="number" path="salary" id="salary"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="salary" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="section">Department</label>
					<div class="col-md-7" class="form-control input-sm">
						<form:radiobuttons path="department" items="${department}" />
						<div class="has-error">
							<form:errors path="department" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="email">Designation</label>
					<div class="col-md-7">
						<form:input type="text" path="designation" id="designation"
							class="form-control input-sm" />
						<div class="has-error">
							<form:errors path="designation" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			

			<div class="row">
				<div class="form-group col-md-12">
					<label class="col-md-3 control-lable" for="address">Address</label>
					<div class="col-md-7">
						<form:select path="address" id="address"
							class="form-control input-sm">
							<form:option value="">Select Country</form:option>
							<form:options items="${countries}" />
						</form:select>
						<div class="has-error">
							<form:errors path="address" class="help-inline" />
						</div>
					</div>
				</div>
			</div>
			
			<div class="row">
				<div class="form-actions floatRight">
					<input type="submit" value="Register"
						class="btn btn-primary btn-sm">
				</div>
			</div>
		</form:form>
	</div>
</body>
</html>