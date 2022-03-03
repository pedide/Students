/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xprodswing.principal.dao;

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
 * @author hedib
 */
public class UserDao {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;
    
    public UserDao(){
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xproddb", "root", "");
            st = con.createStatement();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "La connexion à la base à échoée, une erreur s'est produite "+ex);
        }
    }
    
    //methode qui va permettre de rechercher les utilisateurs et leur mot de passe
    public List rechercherLogin(String username, String password){
        
        List logLogin = new ArrayList();
        int result;
        sql = "select username, password, authorization from user where username='"+username+"' and password= '"+password+"' ";
        //rechercher si le username et password existe ds la base de données

        try {
            rs = st.executeQuery(sql);

            while(rs.next()){
                Users user = new Users();
                user.setUserName(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                user.setAuthorization(rs.getString("authorization"));
                logLogin.add(user);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Une erreur s'est produite lors du login : \n"+ex);
        }
        
        return logLogin;
    }
 
}
