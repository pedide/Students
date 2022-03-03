/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.xprodswing.principal.model;

/**
 *
 * @author hedib
 */
public class Users {
    private int idUser;
    private String userName;
    private String password;
    private String authorization;

    
    //constructeur par defaut
    public Users() {
    }

    public Users(int idUser, String userName, String password, String authorization) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.authorization = authorization;
    }

    
    
    
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
