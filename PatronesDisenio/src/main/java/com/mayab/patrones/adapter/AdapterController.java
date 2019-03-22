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
public class AdapterController {
    public static void main(String[] args) {
        OldPerson old = new BabyBoomer();
        NewPerson me = new Millenian();
        OldPerson oldMe = new NewPersonAdapter(me);
        
        System.out.println("New person says ...");
        System.out.println(me.name());
        System.out.println(me.age());
        
        System.out.println("old person says ...");
        testPerson(old);
        
        System.out.println("new person says ...");
        testPerson(oldMe);
        
    }
    
    static void testPerson(OldPerson old){
        System.out.println(old.name());
        System.out.println(old.lastName());
        System.out.println(old.dateBirth());
    }
}
