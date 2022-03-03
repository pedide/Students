/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswing.principal.dao;


import com.xprodswing.principal.model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author htake
 */
public class UserDao {
    
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;

    public UserDao() {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
            st= con.createStatement();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"La connection a la base de donnée a échouée, une erreur s'est produit" +ex);
        }
    }
    
    public List rechercherLogin (String username, String password){
     
      
            List logLogin = new ArrayList();
            int result;
            sql = "select username, password,authorization from user where username= '"+ username+"' and password='"+password+ "'";
              try {
            rs = st.executeQuery(sql);
            while(rs.next()){
                User use= new User();
               
                use.setUserName(rs.getString("username"));
                use.setPassword (rs.getString("password"));
                use.setAuthorization(rs.getString("authorization"));
                
                logLogin.add(use);
            
            
            }
            
            
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(null,"une erreur s'est produite lors du login :\n" +ex);
        }
    
              return logLogin;
      
      
        
    }

    
    
}
