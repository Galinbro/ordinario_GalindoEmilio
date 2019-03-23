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




public class Usuario {
    private String Nombre;
    private String Apellido;
    private boolean Logged=false;
    private static Usuario instance;
    
    private Usuario() {}
    
    public static Usuario getInstance() {
        if(Usuario.instance==null) {
            Usuario.instance=new Usuario();
        }
        return Usuario.instance;
    }
    
    public void login() {
        this.Logged=true; 
    }
    
    public boolean getLogged() {
        return this.Logged; 
    }
    
    public String getName() {
        return this.Nombre; 
    }
    
    public String getLast() {
        return this.Apellido; 
    }
}