/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

import java.util.ArrayList;

/**
 *
 * @author galindo
 */
public class ReportCantidad extends Report{
    
    public ReportCantidad(BankAccount ban){
        bank = ban;
        setSortable(new SortCantidad());
    }
    
}
