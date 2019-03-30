/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.template;

/**
 *
 * @author galindo
 */
public class TemplateController {
    public static void main(String[] args){
    
        Catalogo emilio = new Persona("Emilio","Gran san pedro cholul",21);
        Catalogo iphone = new Producto(012,100);
        
        emilio.update(30);
        emilio.update(10);
        
        iphone.update(200);
        iphone.update(9);
    }
}
