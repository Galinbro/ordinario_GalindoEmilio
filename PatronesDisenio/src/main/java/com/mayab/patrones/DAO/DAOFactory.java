/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.DAO;

/**
 *
 * @author galindo
 */
public abstract class DAOFactory {

  // There will be a method for each DAO that can be 
  // created. The concrete factories will have to 
  // implement these methods.
  public static Dao getUserDAO(String type){ 
        if (type.equalsIgnoreCase("student")){
            System.out.println("Here goes the methods to preparation to the database");
            return new StudentDaoImpl();
        }else if(type.equalsIgnoreCase("teacher")){
            System.out.println("Here goes the methods to preparation to the other database");
            return new TeacherDaoImpl();
        }else
            return null;
        
        
        
        
        
    }
}