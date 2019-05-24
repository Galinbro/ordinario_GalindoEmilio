/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

import com.github.javafaker.Faker;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author galindo
 */
public class Person {
    
    private String name;
    private String lastName;
    private String rol;
    
    
    public Person(String n, String lN, String r){
        this.name = n;
        this.lastName = lN;
        this.rol = r;
    }
    
    public Person(){
        Faker faker = new Faker();
        this.name = faker.name().firstName();
        this.lastName = faker.name().lastName();
        this.rol = "buyer";
    }
    
    //getters setters
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    
}
