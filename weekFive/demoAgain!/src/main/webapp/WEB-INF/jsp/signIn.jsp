<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
	<html>

	<head>
		<meta charset="utf-8">
		<title>Dealership App</title>
		<link rel="stylesheet" href="/css/signUp.css">
	</head>

	<body class="flex-col">
		<div class="out-of-the-box">
			<div class="box">
				<div class="box-content flex-col margin-center">
					<h1 class="box-header">Sign In Box</h1>
					<p class="">Sign In For Sallys!</p>
					<p class="">Please</p>
					<form:form modelAttribute="user" action="signIn" method="post">
						<div class="flex-col">
							<div class="flex-row">
								<div class="box-input">
									<form:input path="username" placeholder="Username" type="text" />
								</div>
								<div class="arrow">&</div>
								<div class="box-input">
									<form:input path="password" placeholder="Password" type="password" />
								</div>
							</div>
							<form:button type="submit" class="result-button">
                                Submit
                            </form:button>
						</div>
					</form:form>
				</div>
			</div>
		</div>
	</body>

	</html>