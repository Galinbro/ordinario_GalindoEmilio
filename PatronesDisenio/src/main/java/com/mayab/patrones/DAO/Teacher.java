/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.DAO;

import com.github.javafaker.Faker;
import static com.mayab.patrones.DAO.User.count;

/**
 *
 * @author galindo
 */
public class Teacher extends User{

    private String job;
    
   public Teacher(){
        Faker faker = new Faker();

        this.name = faker.name().fullName();
        this.address = faker.address().streetAddress();
        this.job = faker.job().title();
        id = count.incrementAndGet(); 
        
   }
    
      public void print(){
       System.out.println(id + " - " + name + " - " + address + " - " + job);
   }
      public String printS(){
       return(id + " - " + name + " - " + address + " - " + job);
   }
      
      //getters setters
    public void setId(String job) {
        this.job = job;
    }
    public int getId() {
        return id;
    }
    public void setName(String job) {
        this.job = job;
    }   
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
    
}
