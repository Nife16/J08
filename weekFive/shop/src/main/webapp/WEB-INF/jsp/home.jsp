<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
	<title>Sallys Christmas Gift Shop</title>
    <link rel="stylesheet" href="/css/home.css">
</head>
<body class="flex-col">
	<div class="flex-row header">
        <a class="header-links" href="/signUp">Sign Up</a>
        <a class="header-links" href="/">Home</a>
        <a class="header-links" href="/signIn">Sign In</a>
        <c:if test="${loggedInUser != null}">
            <div class="icon">${loggedInUser.getUsername().toUpperCase().charAt(0)}</div>
        </c:if>
    </div>
	<div class="flex-row main-content">

    </div>
</body>

</html>
