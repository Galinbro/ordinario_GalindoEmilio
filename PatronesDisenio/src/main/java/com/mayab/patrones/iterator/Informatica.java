/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import com.github.javafaker.Faker;

/**
 *
 * @author galindo
 */
public class Informatica implements Facultad {
    
    private String schoolName;
    private ArrayList<String> student = new ArrayList();
    
    public Informatica(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            student.add(faker.name().fullName());
        }
    }


    public Iterator createIterator() {
        return student.iterator();
    }
    
    public ArrayList getArrayList(){
        return student;
    }
    
    public void addItem(String x){
        student.add(x);
    }
    
    
}
