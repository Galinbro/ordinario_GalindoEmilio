/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author galindo
 */
public class Industrial {
    private String schoolName;
    private List<String> student = new ArrayList();
    
    public Industrial(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            student.add(faker.name().fullName());
        }
    }


    public Iterator createIterator() {
        return student.iterator();
    }
    
    public List getArrayList(){
        return student;
    }
    
    public void addItem(String x){
        student.add(x);
    }
    
}
