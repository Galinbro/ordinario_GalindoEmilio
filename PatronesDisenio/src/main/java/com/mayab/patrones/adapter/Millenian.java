/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.adapter;

/**
 *
 * @author galindo
 */
public class Millenian implements NewPerson{
    
    String nombreApellido;
    String date;
    
    public Millenian(){
        this.nombreApellido = "Emilio Galindo";
        this.date = "04/03/98";
    }
    
    public Millenian(String name, String date){
        this.nombreApellido = name;
        this.date = date;
    }
    
    public String name() {
        return this.nombreApellido;
    }

    
    public String age() {
        return this.date;
    }
    
}
