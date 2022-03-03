/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswing.principal.model;

/**
 *
 * @author htake
 */
public class User {
    
    private int idUser;
    private String userName;
    private String password;
    private String authorization;

    public User() {
    }

    public User(int idUser, String userName, String password, String authorization) {
        this.idUser = idUser;
        this.userName = userName;
        this.password = password;
        this.authorization = authorization;
    }

    
    
    
    
    
    /**
     * @return the idUser
     */
    public int getIdUser() {
        return idUser;
    }

    /**
     * @param idUser the idUser to set
     */
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the authorization
     */
    public String getAuthorization() {
        return authorization;
    }

    /**
     * @param authorization the authorization to set
     */
    public void setAuthorization(String authorization) {
        this.authorization = authorization;
    }
    
    
}
