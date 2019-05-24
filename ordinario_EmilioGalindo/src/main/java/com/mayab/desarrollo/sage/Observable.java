/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

/**
 *
 * @author galindo
 */
public interface Observable {
    
    public void addTrans(int i, String s, int time);
    
    public void removeObserver(Manager manager);
    
    public void addObserver(Manager manager);
    
    public void notifyObservers(String s);
}
