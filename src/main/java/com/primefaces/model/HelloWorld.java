/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.primefaces.model;

import javax.faces.bean.ManagedBean;
import lombok.Data;

/**
 *
 * @author Chonlakorn
 */
@Data
@ManagedBean
public class HelloWorld {

    private String firstName = "Admin";
    private String lastName = "Test";

    public String showGreeting() {
        return "Hello " + firstName + " " + lastName + "!";
    }
}
