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
public class Bacon extends Decorator{

    Burger burger;
    
    public Bacon(Burger burger){
        this.burger = burger;
    }
    
    public String getDescription() {
        return burger.getDescription() + ", Bacon";
    }

    
    public double cost() {
        return 15.99 + burger.cost();
    }
    
    
}
