<%@ page import="com.xprodmvc.model.User"%>
<%@ page import="com.xprodmvc.model.Cart"%>
<%@ page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
User auth = (User) request.getSession().getAttribute("auth");
if (auth != null) {
	response.sendRedirect("index.jsp");
}
//je rajoute ma liste de produits
ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");
List<Cart> cartProduct = null;//je cree un panier de produits

if (cart_list != null) {
	//le nb produits s'affiche à coté btn de login
	request.setAttribute("cart_list", cart_list);//on recuper notre liste de produits
}
%>
<!DOCTYPE html>
<html>
<head>
<title>XPROD Login</title>
<%@include file="includes/head.jsp"%>
</head>
<body>
	<%@include file="includes/navbar.jsp"%>
	<div class="container">
		<h1>Xprod Achats</h1>
		<p>Bienvenue à Xprod</p>
		<div class="card w-50 mx-auto my-5">
			<div class="card-header text-center"><h3>User Login</h3></div>
			<div class="card-body">
				<form action="user-login" method="post">
					<div class="form-group">
						<label>Adresse email :</label> <input type="email"
							class="form-control" name="login-mail"
							placeholder="Entrer votre adresse mail" required>
					</div>
					<div class="form-group">
						<label>Mot de passe :</label> <input type="password"
							class="form-control" name="login-password"
							placeholder="***************" required>
					</div>
					<div class="text-center">
						<button type="submit" class="btn btn-primary">Connecter</button>
					</div>
				</form>
				<h4>
					<a href="signup.jsp">S'entregistrer</a>
				</h4>
				<h4>
					<a href="forgotPassword.jsp">Mot de passe oublié</a>
				</h4>
			</div>
		</div>
	</div>
	<div class="whysignLogin">
		<%
		String msg = request.getParameter("msg");
		if("notexist".equals(msg)){//si le msg est not exist
		%>
		<h1>Nom d'utilisateur ou le mot de passe sont incorrects.</h1>
		<% 
		}
		%>
		<% 
		if("invalid".equals(msg)){%>
			<h1>Il y a une erreur. Merci d'essayer à nouveau.</h1>
		<% 
		}
		%>
		
	</div>
	<%@include file="includes/footer.jsp"%>

</body>
</html>