<%@ page import="com.xprodmvc.model.User"%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
	<div class="container">
  <div class="container-fluid">
  <%
  	User auth1 = (User)request.getSession().getAttribute("auth");
  %>
    <a class="navbar-brand" href="#">Xprod</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav ml-auto">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Accueil</a>
        </li>
        <li class="nav-item">
                  <a class="nav-link" href="cart.jsp">Panier
                  <span class="badge badge-danger">${cart_list.size()}</span></a>
        </li>   
        <%if (auth1 != null){
        %> 
        <li class="nav-item">
          <a class="nav-link" href="orders.jsp">Achats</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="log-out">Se déconnecter</a>
        </li>
        <%}else{%>
        <li class="nav-item">
          <a class="nav-link" href="login.jsp">Se Connecter</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="signup.jsp">S'entregistrer</a>
        </li>
        <% }%>
      </ul>     
    </div>
    </div>
  </div>
</nav>