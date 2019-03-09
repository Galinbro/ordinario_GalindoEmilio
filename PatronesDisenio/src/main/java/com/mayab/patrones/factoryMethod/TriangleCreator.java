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
public abstract class TriangleCreator{
    
    public abstract Triangulo createTriangle(String string);
    
    public Triangulo calculalMedidas(String string){
        
        Triangulo triangulo = createTriangle(string);
        
        System.out.println("calculando ... " + triangulo.getName() + ".");
        
        triangulo.calcularArea();
        triangulo.calcularPerimetro();
        
        return triangulo;
    }
    
    
}
