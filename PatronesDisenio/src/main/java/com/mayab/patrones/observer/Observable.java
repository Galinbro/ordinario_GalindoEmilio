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
public interface Observable{
    
    public String getState(String estado, String sala);
    
    public void removeObserver(Pasajero pasajero);
    
    public void addObserver(Pasajero pasajero);
    
    public void notifyObservers();
   
}
