/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author galindo
 */
public class SortCantidad implements Comparator<Transaction>{
    
//    ArrayList<Transaction> transaction;
//    String sort;
//    
//    public SortCantidad(ArrayList<Transaction> trans){
//        this.transaction = trans;
//        
//    }


    public int compare(Transaction o1, Transaction o2){ 
        return (o1.getCantidad() - o2.getCantidad());
    } 
} 
    

