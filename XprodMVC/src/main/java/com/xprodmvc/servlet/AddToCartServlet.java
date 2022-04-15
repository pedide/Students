package com.xprodmvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xprodmvc.model.Cart;

@WebServlet("/add-to-cart")
public class AddToCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=UTF-8");

		try (PrintWriter out = response.getWriter()) {

			ArrayList<Cart> cartList = new ArrayList<Cart>();
			int id = Integer.parseInt(request.getParameter("id"));

			Cart cn = new Cart();
			// creation du panier
			cn.setId(id);// definit l'id de cn "id"
			cn.setQuantity(1);// d�finit la quantity de cn � 1

			HttpSession session = request.getSession();
			ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart-list");

			if (cart_list == null) {
				cartList.add(cn);
				session.setAttribute("cart-list", cartList);
				// out.println("La session a �t� cr�ee et un �l�menet a �t� ajouter � la
				// liste.");
				// out.println("<h3 style='color : crimon; text-align : center'>Vous avez bien
				// ajout� votre roduit. <a href = 'cart.jsp'>Aller au panier</a></h3>");
				response.sendRedirect("index.jsp");
			} else {
				// out.println("Il existe d�j� !");
				cartList = cart_list;
				boolean exist = false;

				for (Cart c : cart_list) {

					if (c.getId() == id) {// s'il y a qq ds la cart list
						exist = true;
						// out.println("<h3 style='color : crimon; text-align : center'>Vous avez des
						// produits dans votre panier. <a href = 'cart.jsp'>Aller au panier</a></h3>");
						response.sendRedirect("index.jsp");
					}
					if (!exist) {
						cartList.add(cn);
						// System.out.println("Le produit a �t� ajout� !");
						// System.out.flush();
						response.sendRedirect("index.jsp");
						// out.println("<h3 style='color : crimon; text-align : center'>Vous avez des
						// produits dans votre panier. <a href = 'cart.jsp'>Aller au panier</a></h3>");
					}
				}
			}

		} catch (Exception e) {
			System.out.println(e.getMessage());

		}
	}
}
