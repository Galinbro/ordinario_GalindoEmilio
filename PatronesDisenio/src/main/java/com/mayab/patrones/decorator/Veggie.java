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
public class Veggie extends Burger{
    
    public Veggie(){
        description = "Vegetarian cheese, 250gr Soya";
    }
    public double cost(){
        return 69.99;
    }
}
