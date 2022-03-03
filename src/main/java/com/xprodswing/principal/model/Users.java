/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswing.principal.model;





/**
 *
 * @author Najat
 */
public class Users {
    private int idUser;
    private String UserName;
    private String password;
    private String authorization;

    public Users(int idUser, String UserName, String password, String authorization) {
        this.idUser = idUser;
        this.UserName = UserName;
        this.password = password;
        this.authorization = authorization;
    }

    public Users() {
    }
    
    


    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAuthorization() {
        return authorization;
    }

    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
}
    
    
    

