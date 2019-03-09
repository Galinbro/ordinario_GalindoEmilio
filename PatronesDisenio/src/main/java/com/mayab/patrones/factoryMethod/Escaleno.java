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
public class Escaleno extends Triangulo{

    public Escaleno(){
        name = "Escaleno";
    }
    void calcularArea() {
        
        System.out.println("calculando area de escaleno ...");
    }

    void calcularPerimetro() {
        System.out.println("calculando perimetro de escaleno ...");
    }
}
