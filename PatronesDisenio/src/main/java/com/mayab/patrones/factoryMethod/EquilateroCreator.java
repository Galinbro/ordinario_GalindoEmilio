/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.factoryMethod;

/**
 *
 * @author galindo
 */
public class EquilateroCreator extends TriangleCreator{

    
    public Triangulo createTriangle(String string) {
        if(string.equalsIgnoreCase("equilatero"))
            return new Equilatero();
        else return null;
    }

   
}
