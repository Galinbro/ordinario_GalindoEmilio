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
public abstract class DataBaseCreator {
    
    
    public abstract DataBase createDataBase(String string,String s);
    
    public DataBase createSentence(String string, String s){
        
        DataBase dataBase = createDataBase(string, s);
        
        System.out.println("Transform sentence: " + dataBase.getSentence() + " to: "+ dataBase.getClass().getSimpleName() + ".");
        
        System.out.println("Create conexion");
        
        System.out.println(dataBase.createSentence(dataBase.getSentence()));
        
        System.out.println("Execute command");
        
        return dataBase;
    }
}
