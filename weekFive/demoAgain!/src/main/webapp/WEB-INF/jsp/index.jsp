<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>Practice</title>
<link rel="stylesheet" href="/css/index.css">
</head>
<body class="flex-col">
	<div class="header">
		<div class="third-width">

		</div>
		<div class="third-width justify-center">
			<input type="text" class="fake-input-box" />
		</div>
		<div class="third-width justify-right">
			<a class="header-links" href="/signUp">Sign Up</a>
			<a class="header-links" href="/">Home</a>
			<a class="header-links" href="/signIn">Sign In</a>
		</div>
	</div>
	<div class="main flex-col">
		<h1>When we have content, it goes here</1>
		<p>and it will be pretty!</p>
		<c:if test="${user != null}">
			<div>
				${user.getUsername()}
			</div>
		</c:if>
	</div>
</body>
</html>
