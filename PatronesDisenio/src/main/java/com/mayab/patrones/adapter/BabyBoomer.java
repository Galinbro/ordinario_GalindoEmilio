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
public class BabyBoomer implements OldPerson{

    String name;
    String lastName;
    String date;
    
    public BabyBoomer(){
        this.name = "Persona";
        this.lastName = "vieja";
        this.date = "01/01/60";
    }
    
    public String name() {
        return this.name;
    }

    
    public String lastName() {
        return this.lastName;
    }

   
    public String dateBirth() {
        return this.date;
    }
    
}
