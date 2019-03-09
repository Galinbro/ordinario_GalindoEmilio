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
public class Equilatero extends Triangulo{

   public Equilatero(){
        name = "Equilatero";
    }
   
    void calcularArea() {
        System.out.println("calculando area de equilatero ...");
    }

    void calcularPerimetro() {
        System.out.println("calculando perimetro de equilatero ...");
    }
    
}
