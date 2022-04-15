package com.xprodmvc.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.xprodmvc.connection.DbCon;
import com.xprodmvc.dao.UserDao;
import com.xprodmvc.model.DataEncryption;
import com.xprodmvc.model.User;


@WebServlet("/user-login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public LoginServlet() {}
	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		
		HttpSession session = request.getSession();
		
		try(PrintWriter out = response.getWriter()){
			out.print("This is login servlet. ");
			
			String email = request.getParameter("login-mail");
			String password = request.getParameter("login-password");
			
			String passwordSHA1 = DataEncryption.getSHA1(password);//hash le mdp r�cup�r� ds login de page web
			
			//out.print("There are the infos servlet "+email+" "+password);
			
			//connecter � la base de donn�es
			UserDao udao = new UserDao(DbCon.getConnection());
			User user = udao.userLogin(email, passwordSHA1);
						
			
			if(user != null) {
				if(user.getAuthorization().equals("Administrateur")) {
					request.getSession().setAttribute("auth", user);
				
					session.setAttribute("email",email);
					System.out.println("L'utilisateur connect� est "+user.getName()+ " et son adresse mail est "+email);
					response.sendRedirect("admin/adminHome.jsp");
					
				}else {
					request.getSession().setAttribute("auth", user);//on recupere la session
					
					System.out.println("L'utilisateur connect� est "+user.getName()+ " et son adresse mail est "+email);
					response.sendRedirect("index.jsp");
				}
			}else {
				System.out.println("Il n'y a pas d'utilisateur. Vous n'�tes pas dans la base de donn�e.");
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} 
	}

}
