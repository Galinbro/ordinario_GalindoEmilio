/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.persistencia;

/**
 *
 * @author galindo
 */
public class DataBaseSelector extends DataBaseCreator{
    
    public DataBase createDataBase(String string,String s) {
        if(string.equalsIgnoreCase("basea"))
            return new DataBaseA(s);
        else if(string.equalsIgnoreCase("baseb"))
            return new DataBaseB(s);
        else if(string.equalsIgnoreCase("basec"))
            return new DataBaseC(s);
        else 
            return null;
    }
    
}
