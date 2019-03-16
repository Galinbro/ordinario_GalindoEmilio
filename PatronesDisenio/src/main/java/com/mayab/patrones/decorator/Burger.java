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
public abstract class Burger {
    public String description = "Uknown burger";
    
    public String getDescription(){
        return this.description;
    }
    
    public abstract double cost();
}
