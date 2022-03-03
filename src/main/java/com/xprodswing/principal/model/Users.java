/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswing.principal.model;

/**
 *
 * @author 77011-26-10
 */
public class Users {
    private int idUser;
    private String username;
    private String password;
    private String authorizations;

    public Users(){};

    public Users(int idUser, String username, String password, String authorizations) {
        this.idUser = idUser;
        this.username = username;
        this.password = password;
        this.authorizations = authorizations;
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
     * @return the authorizations
     */
    public String getAuthorizations() {
        return authorizations;
    }

    /**
     * @param authorizations the authorizations to set
     */
    public void setAuthorizations(String authorizations) {
        this.authorizations = authorizations;
    }
}
