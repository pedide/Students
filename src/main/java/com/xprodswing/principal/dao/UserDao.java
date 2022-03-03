/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswing.principal.dao;

import com.xprodswing.principal.model.Users;
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
 * @author philippe
 */
public class UserDao {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql  = null;
    
    public UserDao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xprodddb","root","");
            st = con.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null," la connexion à la base de données a échouée, une erreur s'est produite"+ex);
        }
    }
    //on va chercher l'identifiant et le mot de passe
    public List rechercherLogin(String username, String password){
        List logLogin = new ArrayList();
        int result;
        sql="select username, password,authorization from user where username='"+username+"' and password = '"+password+"'";
    
        
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
            JOptionPane.showMessageDialog(null, "une erreur s'est prodduite lors du login: \n" +ex);
        }
        
    
    return logLogin;
    
}
}
