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
        Transaction t2 = new Transaction("04/03/98","soriana",80,"entretenimiento");
        Transaction t3 = new Transaction("04/03/92","recorcholis",450,"mercadotecnia");
        Transaction t4 = new Transaction("04/03/91","aaa",500,"comida");
        
        Report reporte = new ReportCantidad(me);
        
        me.addTransaction(t1);
        me.addTransaction(t2);
        me.addTransaction(t3);
        me.addTransaction(t4);
        
        System.out.println("Array of transsactions:");
        
        reporte.desplegarT();
        
        System.out.println("Sort por cantidad:");
        
        reporte.setSortable(new SortCantidad());
        
        reporte.performSort(me.getTransaction());
        
        reporte.desplegarT();
        
        System.out.println("\n" + "Sort por categoria:");
        
        reporte.setSortable(new SortCategoria());
        
        reporte.performSort(me.getTransaction());
        
        reporte.desplegarT();
        
        System.out.println("\n" + "Sort por comercio:");
        
        reporte.setSortable(new SortComercio());
        
        reporte.performSort(me.getTransaction());
        
        reporte.desplegarT();
        
        System.out.println("\n" + "Sort por fecha:");
        
        reporte.setSortable(new SortFecha());
        
        reporte.performSort(me.getTransaction());
        
        reporte.desplegarT();
        
    } 
    
    }
