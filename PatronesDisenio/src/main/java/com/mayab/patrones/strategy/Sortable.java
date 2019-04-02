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
public interface Sortable{
    
    public abstract int compare(Transaction o1, Transaction o2);
    public abstract void sort(ArrayList<Transaction> o);
}
