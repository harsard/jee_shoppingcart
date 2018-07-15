/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ijse.shoppingcart.DTO;

import com.ijse.shoppingcart.modal.*;

/**
 *
 * @author Hafees
 */
public class AdminDTO extends SuperDTO{
    private String username;
    private String password;

    public AdminDTO(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public AdminDTO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}