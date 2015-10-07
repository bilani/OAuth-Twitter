<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form ng-app="loginApp" ng-controller="loginController" 
name="myForm" novalidate method="post" action="">
<div class="col-sm-12">
<p>Name:<br>
<input type="text" name="name" ng-model="user" required>
<span style="color:red" ng-show="myForm.user.$dirty && myForm.name.$invalid">
<span ng-show="myForm.name.$error.required">Name is required.</span>
</span>
</p>
<p>Lastname:<br>
<input type="text" name="Lastname" ng-model="user" required>
<span style="color:red" ng-show="myForm.user.$dirty && myForm.Lastname.$invalid">
<span ng-show="myForm.Lastname.$error.required">Lastname is required.</span>
</span>
</p>
<p>Username:<br>
<input type="text" name="user" ng-model="user" required>
<span style="color:red" ng-show="myForm.user.$dirty && myForm.user.$invalid">
<span ng-show="myForm.user.$error.required">Username is required.</span>
</span>
</p>
<p>Email:<br>
<input type="text" name="email" ng-model="user" required>
<span style="color:red" ng-show="myForm.user.$dirty && myForm.email.$invalid">
<span ng-show="myForm.email.$error.required">Username is required.</span>
</span>
</p>

<p>Password:<br>
<input type="password" name="pass" ng-model="pass" required>
<span style="color:red" ng-show="myForm.pass.$dirty && myForm.pass.$invalid">
<span ng-show="myForm.pass.$error.required">Pass is required.</span>
</span>
</p>

<p>
<input type="submit"
ng-disabled="myForm.user.$dirty && myForm.user.$invalid ||  
myForm.pass.$dirty && myForm.pass.$invalid">
</p>
</div>
</form>
</body>
</html>