/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author galindo
 */
public class IteratorController {
     public static void main(String[] args) {
         Informatica inf = new Informatica();
         Industrial ind = new Industrial();
         Mecatronica mec = new Mecatronica();
         Civil civ = new Civil();
         
         System.out.println("Students");
         
         System.out.println("Informatica\n-------");
         ArrayList<String> students = inf.getArrayList();
         
         for(String s: students){
             String student = (String) s;
             System.out.println(student);
         }
         
         System.out.println("\nIndustrial\n-------");
         
         List<String> students2 = inf.getArrayList();
         
         for(String s: students2){
             String student = (String) s;
             System.out.println(student);
         }
         
         System.out.println("\nMecatronica\n-------");
          String students3 [] = mec.getArrayList();
         
         for(String s: students3){
             String student = (String) s;
             System.out.println(student);
         }
         
         System.out.println("\nCivil\n-------");
          Queue students4 = civ.getArrayList();
         
          System.out.println(students4);
          
//         for(String s: students4){
//             String student = (String) s;
//             System.out.println(student);
//         }
      
        System.out.println("--------\nSTUDENTS (with iterators)\n---------");
        
        System.out.println("Informatica\n-------");
        Iterator student = inf.createIterator();
	print(student);
        
        System.out.println("\nIndustrial\n-------");
        student = ind.createIterator();
	print(student);
        
        System.out.println("\nMecatronica\n-------");
        student = mec.createIterator();
	print(student);
        
        System.out.println("\nCivil\n-------");
        student = civ.createIterator();
	print(student);
        
     }
     
     private static void print(Iterator i) {
		while (i.hasNext()) {
			String student = (String)i.next();
			System.out.println(student);

		}
	}
}
