<%@ page errorPage="error.jsp" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/home-style.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css" />
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" />
<title>Admin Header</title>
</head>
<!-- Header -->
<br>
<div class ="topnav sticky">

<%String email=session.getAttribute("email").toString(); %>

<center><h2>XROPD Achats Espace de Travail d'Admin </h2></center>
<a href="addNewProduct.jsp">Ajouter un nouveau produit <i class="fas fa-plus-square"></i></a>
<a href="allProductEditProduct.jsp">Tous les produits et Edit produit <i class="fas fa-plus-square"></i></a>
<!-- <a href="">Ajouter un nouveau produit <i class="fab fa-elementor"></i></a>
<a href="">Ajouter un nouveau produit <i class="fas fa-plus-square"></i></a>
<a href="">Ajouter un nouveau produit <i class="fas fa-plus-square"></i></a> -->
</div>
<body>

</body>
</html>