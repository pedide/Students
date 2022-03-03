/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author ahaha
 */
public class UserDAO {
    Connection con = null;
    Statement st = null;
    ResultSet rs = null;
    String sql = null;


    public UserDAO(){ 
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/xprod","root","");
           st = con.createStatement();
       }
       catch (ClassNotFoundException ex) {
           Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
       }
       catch (SQLException ex) {
           Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, ex);
           JOptionPane.showMessageDialog(null,"Echouer"+ex);
       }
    } 
    
    public List rechercherLogin(String username, String password){
       List logLogin = new ArrayList();
       int result;
       sql = "select USERNAME,PASSWORD,AUTORISATION from User where USERNAME='"+username+"' and PASSWORD = '"+password+"'";
       try{
          rs = st.executeQuery(sql);
          while(rs.next()){
             Users user = new Users();
             user.setNomUser(rs.getString("username"));
             user.setMdp(rs.getString("password"));
             user.setAutor(rs.getString("autorisation"));
             logLogin.add(user);
          }
       }
       catch (SQLException ex){
           Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, sql);
       }
       return logLogin;
    } 
}
