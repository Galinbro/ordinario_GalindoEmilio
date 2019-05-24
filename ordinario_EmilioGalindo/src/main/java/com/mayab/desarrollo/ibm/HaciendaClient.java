/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.ibm;

/**
 *
 * @author galindo
 */
public class HaciendaClient implements NewPerson{
    
    String name;
    String lastName;
    
    public HaciendaClient(){
        this.name = "Emilio";
        this.lastName = "Galindo";
    }
    
    public HaciendaClient(String name, String last){
        this.name = name;
        this.lastName = last;
    }
    
    public String name() {
        return this.name;
    }

    public String lastName() {
        return this.lastName;
    }

}
