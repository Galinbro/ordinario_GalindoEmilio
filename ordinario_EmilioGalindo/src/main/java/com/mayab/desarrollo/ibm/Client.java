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
public class Client implements ClientPerson{

    String fullName;
    
    public Client(){
        this.fullName = "Emilio Galindo";
    }
    
    public Client(String name){
        this.fullName = name;
    }
    
    public String fullName() {
        return this.fullName;
    }

    
}
