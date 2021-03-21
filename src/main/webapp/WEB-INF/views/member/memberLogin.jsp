<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<nav class="navbar navbar-inverse">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Spring Review</a>
			</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="#">Home</a></li>
				<li><a href="#">Page 1</a></li>
				<li><a href="#">Page 2</a></li>
			</ul>
			<ul class="nav navbar-nav navbar-right">
				<li><a href="/re1/member/memberJoin"><span
						class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="/re1/member/memberLogin"><span
						class="glyphicon glyphicon-log-in"></span> Login</a></li>
			</ul>
		</div>
	</nav>


	<h1>Member Login Page</h1>
	
	<form class="form-inline" action="./memberLogin" method="post">
  <div class="form-group">
    <label for="id">ID:</label>
    <input type="text" class="form-control" id="id">
  </div>
  <div class="form-group">
    <label for="pw">Password:</label>
    <input type="password" class="form-control" id="pw">
  </div>
  <button type="submit" class="btn btn-default">Login</button>
</form>
	
	
</body>
</html>