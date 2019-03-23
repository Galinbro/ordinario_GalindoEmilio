/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author galindo
 */
public class StrategyController {
    public static void main(String[] args) {
        
        BankAccount me = new BankAccount();
        
        Transaction t1 = new Transaction("04/03/95","sams",100,"bienes raices");
        Transaction t2 = new Transaction("04/03/96","soriana",80,"entretenimiento");
        Transaction t3 = new Transaction("04/03/97","recorcholis",450,"mercadotecnia");
        Transaction t4 = new Transaction("04/03/98","aaa",500,"comida");
        
        Report reporte = new ReportCantidad(me);
        
        me.addTransaction(t1);
        me.addTransaction(t2);
        me.addTransaction(t3);
        me.addTransaction(t4);
        
        System.out.println("Sort por cantidad:");
        
        Collections.sort(me.getTransaction(), new SortCantidad()); 
        
        reporte.desplegarT();
        
        System.out.println("\n" + "Sort por categoria:");
        
        Collections.sort(me.getTransaction(), new SortCategoria()); 
        
        Report reporte2 = new ReportCategoria(me);
        
        reporte2.desplegarT();
        
        System.out.println("\n" + "Sort por comercio:");
        
        Collections.sort(me.getTransaction(), new SortComercio());
        
        Report reporte3 = new ReportComercio(me);
        
        reporte3.desplegarT();
        
        System.out.println("\n" + "Sort por fecha:");
        
        Collections.sort(me.getTransaction(), new SortFecha());
        
        Report reporte4 = new ReportFecha(me);
        
        reporte4.desplegarT();
    } 
    
    }
