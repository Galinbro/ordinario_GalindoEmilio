/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.proxy;

/**
 *
 * @author galindo
 */
public class FileImp implements File{

    private String name;
    
    public FileImp(){
        this.name = "Test";
    }
    
    public String borrar() {
        return "borrando";
    }

    
    public String escribir() {
        return "escribiendo";
    }

    
    public String leer() {
        return "leyendo";
    }
    
}
