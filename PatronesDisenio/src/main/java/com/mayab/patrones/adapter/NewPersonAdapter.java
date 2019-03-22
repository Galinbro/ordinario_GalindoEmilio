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

public class NewPersonAdapter implements OldPerson{

    NewPerson newPerson;
    
    public NewPersonAdapter(NewPerson newPerson){
        this.newPerson = newPerson;
    }
    
    public String name() {
        
        String input = newPerson.name();

        int i = input.indexOf(' ');
        String word = input.substring(0, i);
        return word;
    }

   
    public String lastName() {
        String fullName = newPerson.name();
        String name=fullName.split(" ")[fullName.split(" ").length-1];
        return name;
    }

    
    public String dateBirth() {
        return newPerson.age();
    }
    
}

