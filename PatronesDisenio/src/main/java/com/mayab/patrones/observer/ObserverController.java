/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.observer;

/**
 *
 * @author galindo
 */
public class ObserverController {
 public static void main(String[] args) 
    {
        Vuelo vueloMerida = new Vuelo("Salida", "A tiempo", "Merida", "111");
        
        Pasajero pasajero1 = new Pasajero("Emilio","11" );
        Pasajero pasajero2 = new Pasajero("Alan","11");
        Pasajero pasajero3 = new Pasajero("Karen","11");
        Pasajero pasajero4 = new Pasajero("Bendejamon","11");
        
        vueloMerida.addObserver(pasajero1);
        vueloMerida.addObserver(pasajero2);
        vueloMerida.addObserver(pasajero3);
        vueloMerida.addObserver(pasajero4);
        
        vueloMerida.removeObserver(pasajero1);
        vueloMerida.removeObserver(pasajero2);
        
        vueloMerida.setSalida("Puerta 10");
        
        vueloMerida.setSala("Sala 1");
        
        vueloMerida.setEstado("Atrasado");
    }
    
    
}
