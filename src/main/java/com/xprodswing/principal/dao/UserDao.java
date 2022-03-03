/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswing.principal.dao;

import com.xprodswing.princpal.model.Users;
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
 * @author Axel
 */
public class UserDao {
    
    Connection con = null;
    Statement st = null;
    ResultSet rst = null;
    String sql = null;

    public UserDao() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection ("jdbc:mysql://localhost/xproddb","root","");
            st = con.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"La connexion à la base à échouée, une erreur s'est produite" );
        }
    }
   public List rechercherLogin(String username, String password){
       
   List logLogin = new ArrayList();
   int result;
   sql= "select username, password, authorization from user where username='"+username+"' and password= '"+password+"'";
   
        try {
            rst = st.executeQuery(sql);
            while(rst.next()){
                
                Users user = new Users();
                
                user.setUsername(rst.getString("username"));
                user.setPassword(rst.getString("password"));
                user.setAuthorization(rst.getString("authorization"));
                logLogin.add(user);
               
            }
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
return logLogin;   
   } 
    
    
    
    
}
