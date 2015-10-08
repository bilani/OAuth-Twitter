<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/" />css/bootstrap.min.css"	rel="stylesheet">
<link href="<c:url value="/resources/" />css/login.css" rel="stylesheet">
<link href="<c:url value="/resources/" />css/bootstrap.min.css"	rel="stylesheet">
<link href="<c:url value="/resources/" />css/style.css" rel="stylesheet">
</head>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script src="<c:url value="/resources/js/SignupController.js" />"></script>
<body>
<section id="login">
<div class="container">
			<div class="row">
				<div class="col-xs-12">
					<div class="form-wrap">
					<h1>Welcome</h1>
	<form ng-app="singupApp" ng-controller="signupController" name="myForm"
		novalidate method="post" action="signupverification">
		<div class="col-sm-12">
			<p>
				Name:<br> <input type="text" name="name" ng-model="name"
					required class="form-control"> <span style="color: red"
					ng-show="myForm.name.$dirty && myForm.name.$invalid"> <span
					ng-show="myForm.name.$error.required">Name is required.</span>
				</span>
			</p>
			<p>
				Lastname:<br> <input type="text" name="lastName"
					ng-model="lastName" required class="form-control"> <span style="color: red"
					ng-show="myForm.lastName.$dirty && myForm.LastName.$invalid"> <span
					ng-show="myForm.LastName.$error.required">Lastname is
						required.</span>
				</span>
			</p>
			<p>
				Username:<br> <input type="text" name="user" ng-model="user"
					required class="form-control"> <span style="color: red"
					ng-show="myForm.user.$dirty && myForm.user.$invalid"> <span
					ng-show="myForm.user.$error.required">Username is required.</span>
				</span>
			</p>
			<p>
				Email:<br> <input type="text" name="email" ng-model="email"
					required class="form-control"> <span style="color: red"
					ng-show="myForm.email.$dirty && myForm.email.$invalid"> <span
					ng-show="myForm.email.$error.required">Username is required.</span>
				</span>
			</p>

			<p>
				Password:<br> <input type="password" name="pass"
					ng-model="pass" required class="form-control"> <span style="color: red"
					ng-show="myForm.pass.$dirty && myForm.pass.$invalid"> <span
					ng-show="myForm.pass.$error.required">Pass is required.</span>
				</span>
			</p>

			<p>
				<input type="submit"
					ng-disabled="myForm.user.$dirty && myForm.user.$invalid ||  
myForm.pass.$dirty && myForm.pass.$invalid" class="btn btn-custom btn-lg btn-block">
			</p>
		</div>
	</form>
	</div>
	</div>
	</div>
	</div>
	</section>
</body>
</html>