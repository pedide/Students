/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.xprodswing.princpal.model;

/**
 *
 * @author Axel
 */
public class Users {
    private int idUsers;
    private String Username;
    private String Password;
    private String Authorization;

    public Users() {
    }

    public Users(int idUsers, String Username, String Password, String Authorization) {
        this.idUsers = idUsers;
        this.Username = Username;
        this.Password = Password;
        this.Authorization = Authorization;
    }

    /**
     * @return the idUsers
     */
    public int getIdUsers() {
        return idUsers;
    }

    /**
     * @param idUsers the idUsers to set
     */
    public void setIdUsers(int idUsers) {
        this.idUsers = idUsers;
    }

    /**
     * @return the Username
     */
    public String getUsername() {
        return Username;
    }

    /**
     * @param Username the Username to set
     */
    public void setUsername(String Username) {
        this.Username = Username;
    }

    /**
     * @return the Password
     */
    public String getPassword() {
        return Password;
    }

    /**
     * @param Password the Password to set
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * @return the Authorization
     */
    public String getAuthorization() {
        return Authorization;
    }

    /**
     * @param Authorization the Authorization to set
     */
    public void setAuthorization(String Authorization) {
        this.Authorization = Authorization;
    }
    
}
