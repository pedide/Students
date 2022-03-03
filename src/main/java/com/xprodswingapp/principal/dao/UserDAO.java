/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswingapp.principal.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import com.xprodswingapp.principal.model.Users;

/**
 *
 * @author prisk
 */
public class UserDAO {
    
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;
    
    public UserDAO() {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb","root","");
                st = con.createStatement();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "La connection à la base de données a échouée, une erreur s'est produite"+ex);
            }
    }
    
    public List rechercherLogin(String username, String password){
        
        List logLogin = new ArrayList();
        int result;
        sql="select USERNAME, PASSWORD, AUTHORIZATION from user where USERNAME='"+username+"'and PASSWORD='"+password+"'";
        try {
            rs = st.executeQuery(sql);
            while(rs.next()){
            Users user = new Users();
            user.setUsername(rs.getString("username"));
            user.setPassword(rs.getString("password"));
            user.setAuthorization(rs.getString("authorization"));
            logLogin.add(user);
     
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Une errreur s'est produite LORS DU lOGIN userDAO");

        }
        return logLogin;
    }
}
