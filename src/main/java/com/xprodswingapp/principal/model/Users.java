/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswingapp.principal.model;

/**
 *
 * @author Priska DELORME
 */
public class Users {
    
    
private int idUser;
private String username;
private String password;
private String authorization;

    public Users() {
    }

    public Users(int idUser, String username, String password, String authorization) {
        this.idUser = idUser;
        this.username = username;
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
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the pasword
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param pasword the pasword to set
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
