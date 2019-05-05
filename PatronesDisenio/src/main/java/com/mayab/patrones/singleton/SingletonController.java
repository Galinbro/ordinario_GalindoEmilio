/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.singleton;

/**
 *
 * @author galindo
 */



public class SingletonController {
    public static void main(String[] args) {
        Usuario user1 = Usuario.getInstance();
        
        System.out.println("User : " + user1.getLogged());
        
        user1.login();
        
        System.out.println("User : " + user1.getLogged());
        
        System.out.println(user1.getFullName());
        
        user1.logout();
        
        /*
            Second intances
        */
        Usuario user2 = Usuario.getInstance();
        
        System.out.println("New User : " + user2.getLogged());
        
        user1.login();
        
        System.out.println("New User : " + user2.getLogged());
        
        System.out.println(user2.getFullName());
    }
}
