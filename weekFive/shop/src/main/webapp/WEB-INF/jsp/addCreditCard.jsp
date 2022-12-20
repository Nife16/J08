<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<html>
	<head>
		<meta charset="utf-8">
		<title>Sallys Christmas shop App</title>
		<link rel="stylesheet" href="/css/signUp.css">
	</head>
	<body class="flex-col">
		<div class="out-of-the-box">
			<div class="box">
				<div class="box-content flex-col margin-center">
					<h1 class="box-header">Add Credit Card</h1>
					<p class="">Give Info</p>
					<p class="">Please</p>
					<form:form modelAttribute="creditCard" action="addCreditCard" method="post">
						<div class="flex-col">
							<div class="flex-col">
								<div class="box-input">
									<form:input path="cardName" placeholder="Credit Number" type="text" />
								</div>
								<div class="box-input">
									<form:input path="balance" placeholder="Balance" type="decimal" />
								</div>
								<div class="box-input">
									<form:input path="securityCode" placeholder="Security Code" type="text" />
								</div>
							</div>
							<form:button type="submit" class="result-button">Submit</form:button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</body>
	</html>