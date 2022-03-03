/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswing.principal;

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
 * @author Najat
 */
public class UserDao {
    
    Connection con = null; 
    Statement st  = null;
    ResultSet rs = null;
    String  sql = null;
    
    //créer le constructeur
    
    public UserDao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb", "root", "");
            st = con.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "la connexion à la base de données a échouée, une erreur s'est produite."+ex);
        }
    }
    public List rechercherLogin(String username, String password){
       
            List logLogin = new ArrayList();//liste dynaamique
            int result;
            sql="select username, password, authorization from user where username='"+username+"' and password = '"+password+"'";
            
             try {
            
            rs = st.executeQuery(sql);
            while (rs.next()){
                Users user = new Users();
                user.setUserName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setAuthorization(rs.getString("authorization"));
                logLogin.add(user);
                  
            }
            
              
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "une erreur s'est produite lors du login: \n "+ex);
        }
        return logLogin;
  }      
}