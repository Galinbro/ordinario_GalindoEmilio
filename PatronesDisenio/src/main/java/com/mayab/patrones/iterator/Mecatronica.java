/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import com.github.javafaker.Faker;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author galindo
 */
public class Mecatronica {
    private String schoolName;
    private String[] student = new String[10];
    
    public Mecatronica(){
        Faker faker = new Faker();
        for(int i = 0; i < 10; i++){
            student[i] = (faker.name().fullName()); 
        }
    }


    public Iterator createIterator() {
        return Arrays.asList(student).iterator();
    }
    
    public String[] getArrayList(){
        return student;
    }

}
