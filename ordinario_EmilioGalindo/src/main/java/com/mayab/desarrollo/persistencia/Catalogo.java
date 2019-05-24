/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.persistencia;

/**
 *
 * @author galindo
 */
public abstract class Catalogo {
    
    final public void update(String x){
        
        conexion();
        
        validarDatos(x);
                
        guardar();

    }
    
    public void conexion(){
        System.out.println("Creating conexion");
    }
    
    public abstract String validarDatos(String x);
    
    public void guardar(){
        System.out.println("closing conexion");
    }
    
}