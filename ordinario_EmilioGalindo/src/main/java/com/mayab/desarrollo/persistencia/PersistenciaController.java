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

public class PersistenciaController {
    public static void main(String[] args) {
       
        DataBaseCreator base = new DataBaseSelector();

        String select = "Select Author,Title from Music Where 1=1";
        String delete = "delete FROM music where Author = 'Galindo'";
        String insert = "INSERT into Customers (CustomerName, ContactName)" + "Values ('Cardinal', 'Tom B. Erichsen'); ";
        String update = "UPDATE Customers ContactName='Emilio' WHERE CustomerName='Hayashi';";
        
        DataBase a = base.createSentence("basea",select);
        System.out.println(a.createSentence(delete));
        System.out.println(a.createSentence(insert));
        System.out.println(a.createSentence(update));
        
        
        a = base.createSentence("baseb",select);
        System.out.println(a.createSentence(delete));
        System.out.println(a.createSentence(insert));
        System.out.println(a.createSentence(update));
       
        
        a = base.createSentence("basec", select);
        System.out.println(a.createSentence(delete));
        System.out.println(a.createSentence(insert));
        System.out.println(a.createSentence(update));
        
    }
}
