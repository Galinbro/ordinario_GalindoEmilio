/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author galindo
 */
public abstract class Report extends BankAccount{
    Sortable sortable;
    BankAccount bank;
    
    public void desplegarT(){
        System.out.println("- - - - - - - -");
        for (Transaction str : bank.getTransaction()){
			System.out.printf("%-15s-%s-","fecha: " + str.getFecha(), " comercio: " + str.getComercio());
                        System.out.printf("%-15s-%s\n"," cantidad: " + str.getCantidad() , " categoria: " + str.getCategoria());
		}
    }
    

	public void setSortable(Sortable fb) {
		this.sortable = fb;
	}
        
        public void performSort(ArrayList<Transaction> o){
            sortable.sort(o);
        }
}
