/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswings.principal.dao;

import com.xprodswing.principal.model.Users;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author 77011-26-10
 */
public class UserDao {
    Connection con = null ;
    Statement st = null ; // L'interface Statement représente une instruction SQL.
    ResultSet rs = null; // Les instances de l'interface ResultSet contiennent les résultats d'une requête SQL.
    String sql = null;


    public UserDao(){
        try{ 
            Class.forName("com.mysql.cj.jdbc.Driver");// Chemin vers le driver
            con= DriverManager.getConnection("jdbc:mysql://localhost/xprod","root",""); // connection au driver
            st=con.createStatement(); // creation d'un Statement dans le sql de la base de donnée via la connection
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"La connexion a la base de donnee a echouee, une erreur s'est produite "+ex);
        }
    }
    public List rechercherLogin(String username, String password){
        List logLogin = new ArrayList(); // Creation d'un objet logLogin a partir d'un type liste 
        int result; // declarer entier result
        sql = "select USERNAME,PASSWORD,AUTHORIZATION from user where USERNAME='"+username+"'and PASSWORD='"+password+"'"; // LE string sql prend les informations de la base de donnée grace a select
        try{
            rs = st.executeQuery(sql); // On met dans les ResultSet(données) l'execution du statement du sql ( le sql de la base de donnée)
            while(rs.next()){ // il lit les infos dans le resultset jusqua qu'il n'y ai plus rien
            Users user = new Users(); //creation objet user
            user.setUsername(rs.getString("USERNAME")); // 
            user.setPassword(rs.getString("PASSWORD"));
            user.setAuthorizations(rs.getString("AUTHORIZATION"));
            logLogin.add(user);} // si informations matchent bien ajouter un utilisateur
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"La connexion via le login a echouée "+ex);      
        } 
    return logLogin;
    }
}
