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
        <a class="header-links" href="/product">Products</a>
        <c:choose>
            <c:when test="${loggedInPerson != null}">
                <a class="header-links" href="/">Home</a>
                <div class="icon">${loggedInUser.getUsername().toUpperCase().charAt(0)}</div>
            </c:when>    
            <c:otherwise>
                <a class="header-links" href="/signUp">Sign Up</a>
                <a class="header-links" href="/">Home</a>
                <a class="header-links" href="/signIn">Sign In</a>
            </c:otherwise>
        </c:choose>
    </div>
	<div class="flex-row main-content">
        THANKS FOR THE MONEY, ${loggedInUser.getUsername()}!!!!!!!!
        <div class="flex-row center full-width">
            <c:forEach var="product" items="${purchasedProducts}">
                <div class="list-item">
                    <!-- <div>${product.getName()}</div>
                    <div>${product.getPrice()}</div>
                    <div>${product.getDescription()}</div> -->
                    <!-- <img src="${product.getImages()}" /> -->
                </div>
                <!-- <div>TOTAL PRICE: ${price}</div> -->
            </c:forEach>
        </div>
    </div>
</body>

</html>
