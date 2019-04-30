/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.DAO;

import com.github.javafaker.Faker;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author galindo
 */
public class Student extends User{
    
    
    private String uni;
    
   public Student(){
       Faker faker = new Faker();

        this.name = faker.name().fullName();
        this.address = faker.address().streetAddress();
        this.uni = faker.university().name();
        id = count.incrementAndGet(); 
        
   }

    
   //print stundet
   public void print(){
       System.out.println(id + " - " + name + " - " + address + " - " + uni);
   }
      public String printS(){
       return(id + " - " + name + " - " + address + " - " + uni);
   }
   
    
    //getters setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return address;
    }

    public void setAddres(String addres) {
        this.address = addres;
    }

    public int getId() {
        return id;
    }

    public void setId(int idStudent) {
        this.id = idStudent;
    }

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }
    
    
}
