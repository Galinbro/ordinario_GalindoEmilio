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
public class FactoryMethodController {
     public static void main(String[] args) 
    {
        TriangleCreator equilatero = new EquilateroCreator();
        TriangleCreator isosceles = new IsoscelesCreator();
        TriangleCreator escaleno = new EscalenoCreator();
        
        Triangulo triangulo1 = isosceles.calculalMedidas("isosceles");
        
        Triangulo triangulo2 = escaleno.calculalMedidas("escaleno");
        
        Triangulo triangulo3 = equilatero.calculalMedidas("equilatero");
    }
}
