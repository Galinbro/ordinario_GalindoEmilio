/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

/**
 *
 * @author galindo
 */
public class ReportFecha extends Report{
            
    BankAccount bank;
    
    public ReportFecha(BankAccount ban){
        this.bank = ban;
    }

    public void desplegarT(){
        System.out.println("- - - - - - - -");
        for (Transaction str : bank.getTransaction()){
			System.out.println(str.getFecha());
		}
    }
    
}
