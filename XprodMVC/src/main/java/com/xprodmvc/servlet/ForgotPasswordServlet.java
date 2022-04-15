package com.xprodmvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xprodmvc.connection.DbCon;
import com.xprodmvc.dao.UserDao;
import com.xprodmvc.model.User;


@WebServlet("/forgot-password")
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		try(PrintWriter out = response.getWriter()){
			
			String email = request.getParameter("login-mail");
			String mobileNumber = request.getParameter("mobileNumber");
			
			String securityQuestion = request.getParameter("securityQuestion");
			String answer = request.getParameter("answer");
			String newPasswordSHA1 = request.getParameter("new-password");
			
			
			//connecter � la base de donn�es
			//composant d'acc�s aux donn�es
			UserDao udao = new UserDao(DbCon.getConnection());
			User user = udao.userForgotPassword(email, mobileNumber, securityQuestion, answer, newPasswordSHA1);
			
			System.out.println("L'utilisateur "+email+ " a bien chang� son mot de passe.");
			response.sendRedirect("forgotPassword.jsp?msg=done");
		
		}catch (Exception e) {
			System.out.println("L'utilisateur ne s'est pas enregistr� !");
			response.sendRedirect("forgotPassword.jsp?msg=invalid");
		}
			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
