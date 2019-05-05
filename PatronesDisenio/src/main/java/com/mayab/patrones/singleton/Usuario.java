/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.singleton;

import com.github.javafaker.Faker;

/**
 *
 * @author galindo
 */




public class Usuario {
    
    private String nombre;
    private String apellido;
    private boolean logged=false;
    private static Usuario instance;
    
    private Usuario() {
        Faker faker = new Faker();
        
        nombre = faker.name().firstName();
        apellido = faker.name().lastName();
    }
    
    public static Usuario getInstance() {
        if(Usuario.instance==null) {
            Usuario.instance=new Usuario();
        }
        return Usuario.instance;
    }
    
    public void login() {
        this.logged = true; 
    }
    
    public void logout() {
        this.logged = false; 
    }
    
    public boolean getLogged() {
        return this.logged; 
    }
    
    public String getFullName() {
        return this.nombre + " " + this.apellido; 
    }
    
}