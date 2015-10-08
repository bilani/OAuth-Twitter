<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="tag" tagdir="/WEB-INF/tags"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta content="text/html; charset=utf-8" http-equiv="Content-Type" />
<link href="<c:url value="/resources/" />css/bootstrap.min.css"	rel="stylesheet">
<link href="<c:url value="/resources/" />css/style.css" rel="stylesheet">
<title>Sign in with Twitter example</title>
<link href="<c:url value="/resources/" />css/bootstrap.min.css"	rel="stylesheet">
<link href="<c:url value="/resources/" />css/login.css" rel="stylesheet">
</head>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
<script src="<c:url value="/resources/js/LogInController.js" />"></script>


<body>
	<section id="login">
		<div class="container">
			<div class="row">
				<div class="col-xs-12">
					<div class="form-wrap">
						<h1>Log in with your ID</h1>
						
						<form ng-app="loginApp" ng-controller="loginController"
							name="myForm" novalidate id="login-form" action="verify"  method="POST">
							<div class="col-sm-12">
								<p>
									Username:<br> <input type="text" name="user"
										ng-model="user" required class="form-control"> <span
										style="color: red"
										ng-show="myForm.user.$dirty && myForm.user.$invalid"> <span
										ng-show="myForm.user.$error.required">Username is
											required.</span>
									</span>
								</p>

								<p>
									Password:<br> <input type="password" name="pass"
										ng-model="pass" required class="form-control"> <span
										style="color: red"
										ng-show="myForm.pass.$dirty && myForm.pass.$invalid"> <span
										ng-show="myForm.pass.$error.required">Pass is required.</span>
									</span>
								</p>

								<p>
									<input type="submit"
										ng-disabled="myForm.user.$dirty && myForm.user.$invalid ||myForm.pass.$dirty && myForm.pass.$invalid"
										class="btn btn-custom btn-lg btn-block" value="Log in">
								</p>
							</div>
						</form>
						<div class="col-sm-12">
							
								<a href="signin"><img
									src="./images/Sign-in-with-Twitter-darker.png" /></a>
							
						</div>
						<div class="col-sm-12">
							
								<a href="SingUp"><img
									src="./images/Signup.png" width="80" height="50" /></a>
							
						</div>
						<h2>${alertMsg}</h2>
					</div>
				</div>
			</div>
		</div>
	</section>
	
<%-- 		<h1>Welcome ${twitter.screenName} (${twitter.id})</h1>

		<form action="./post" method="post">
			<textarea cols="80" rows="2" name="text"></textarea>
			<input type="submit" name="post" value="update" />
		</form>
		<a href="./logout">logout</a> --%>
	
</body>

</html>

