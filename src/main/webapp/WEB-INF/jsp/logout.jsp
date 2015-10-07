<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Welcome ${twitter.screenName} (${twitter.id})</h1>

		<form action="./post" method="post">
			<textarea cols="80" rows="2" name="text"></textarea>
			<input type="submit" name="post" value="update" />
		</form>
		<a href="./logout">logout</a>
</body>
</html>