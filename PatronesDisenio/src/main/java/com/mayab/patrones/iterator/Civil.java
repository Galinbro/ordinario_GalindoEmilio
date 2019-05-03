/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import com.mayab.patrones.factoryMethod.*;
import com.github.javafaker.Faker;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author galindo
 */
public class Civil {
    private String schoolName;
    private Queue<String> student = new LinkedList<>(); 
    
    public Civil(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            student.add(faker.name().fullName()); 
        }
    }


    public Iterator createIterator() {
        return student.iterator();
    }
    
    public Queue getArrayList(){
        return student;
    }
}
