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
public class Isosceles extends Triangulo{
    
    public Isosceles(){
        name = "Isosceles";
    }
    void calcularArea() {
        System.out.println("calculando area de Isosceles ...");
    }

    void calcularPerimetro() {
        System.out.println("calculando perimetro de Isosceles ...");
    }
}
