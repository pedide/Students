package com.xprodmvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import com.xprodmvc.model.DataEncryption;
import com.xprodmvc.model.User;

//Cette classe sert � faire des requetes � la table User de la base de donn�es
public class UserDao {
	
	private Connection con;
	private String query;
	private PreparedStatement pst;
	private ResultSet rs;//pr stocker le resultat
	private Statement st;
	
	//creation d'un constructeur pour r�cuperer la onnection
	public UserDao(Connection con) {
		this.con = con;
	}
	
	//cette methode prend un mail et un mdp, se connecte � la bd pr verifier les identifiants
	//puis retourne l'utilisateur entier : l'id, le mdp ... c�d un objet User r�cup�r� depuis la base
	public User userLogin(String email, String password) {
		User user = null;
		
		try {
			//on va chercher email et mot de passe de l'utilisateur ds bd lorsqu'il est rentr� ds le formulaire
			//on pr�pare une requete select en mettant des ? � la place des valeurs
			query = "select * from user where email=? and password=?";
			//cette requete doit passer ds un prepareStatement pour remplacer les ? par les valeurs
			pst = this.con.prepareStatement(query);
			
			pst.setString(1, email);//remplace le 1er ? par la valeur de email
			pst.setString(2, password );//remplace le 2eme ? par la valeur de password
			
			rs = pst.executeQuery();//envoie la requete � la bd
			
			//pr chaque ligne du r�sultat renvoy� par la bd
			if(rs.next()) {
				user = new User();//on cr�e un nouveau objet User
				
				//auquel on attribue les valeurs r�cup�r�s de la bd
				user.setId(rs.getInt("iduser"));
				user.setName(rs.getString("username"));
				user.setAuthorization(rs.getString("authorization"));
				user.setEmail(email);
				
				//System.out.println(user);//affiche l'user
			}
			
		} catch (SQLException e) {
			
			System.out.println(e.getMessage());
		}
		
		return user;
	}
	
	
	public User userRegister(String name, String email, String mobileNumber, String passwordSHA1, 
			String securityQuestion, String ansewer, String adresse, String cp, 
			String ville, String departement, String pays) {
		
		User user = null;
		
		try {
			String password = DataEncryption.getSHA1(passwordSHA1);//hash le mdp r�cup�r� ds login de page web
			query = "insert into user (username, email, mobileNumber, password, securityQuestion, answer,adresse,cp, ville, d�partement, pays)value(?,?,?,?,?,?,?,?,?,?,?)";
			pst = this.con.prepareStatement(query);
			
			
			pst.setString(1, name);
			pst.setString(2, email);
			pst.setString(3, mobileNumber);
			pst.setString(4, password);
			pst.setString(5, securityQuestion);
			pst.setString(6, ansewer);
			pst.setString(7, adresse);
			pst.setString(8, cp);
			pst.setString(9, ville);
			pst.setString(10, departement);
			pst.setString(11, pays);
			
			pst.executeUpdate();
			
		}catch (Exception e){
			System.out.println(e.getMessage());
		}
		return user;
	}
	
	public User userForgotPassword (String email, String mobileNumber, String securityQuestion, String answer, String newPasswordSHA1){
		int check = 0;
		User user = null;
		
		try {
			String newPassword = DataEncryption.getSHA1(newPasswordSHA1);
			query = "select * from user where email='"+email+"' and mobileNumber='"+mobileNumber+"' and securityQuestion='"+securityQuestion+"' and answer='"+answer+"' ";
			st = this.con.createStatement();
			rs = st.executeQuery(query);
			
			while(rs.next()) {
				check = 1;
				st.executeUpdate("update user set password='"+newPassword+"' where email='"+email+"'");
				System.out.println("Le mot de passe a �t� mise � jour.");
			}
			if(check == 0) {
				System.out.println("Le mot de passe n'a pas �t� mise � jour !");
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return user;
	}
	
}
