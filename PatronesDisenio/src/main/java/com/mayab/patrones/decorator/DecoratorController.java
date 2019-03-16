/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.decorator;

/**
 *
 * @author galindo
 */
public class DecoratorController {
    
    public static void main(String[] args){
        Burger burger = new Angus();
        System.out.println(burger.getDescription() 
				+ " $" + burger.cost());
 
		Burger burger2 = new Veggie();
		burger2 = new Guacamole(burger2);
		burger2 = new Guacamole(burger2);
		burger2 = new Bacon(burger2);
		System.out.println(burger2.getDescription() 
				+ " $" + burger2.cost());
 
		Burger burger3 = new Angus();
		burger3 = new Bacon(burger3);
		burger3 = new Guacamole(burger3);
		System.out.println(burger3.getDescription() 
				+ " $" + burger3.cost());
        
        
    }
}
