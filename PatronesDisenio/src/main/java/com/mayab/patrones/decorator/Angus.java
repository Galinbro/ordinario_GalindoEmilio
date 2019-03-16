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
public class Angus extends Burger{
    
    public Angus(){
        description = "Cheese, 250gr sirlon";
    }
    public double cost(){
        return 49.99;
    }
}
