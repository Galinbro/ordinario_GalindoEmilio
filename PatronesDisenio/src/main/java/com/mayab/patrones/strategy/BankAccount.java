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
public class BankAccount {
    
    ArrayList<Transaction> transaction = new ArrayList<Transaction>();
    Integer saldo;
    
    BankAccount(){
        saldo = 0;
    }

    public ArrayList<Transaction> getTransaction() {
        return transaction;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void addTransaction(Transaction transactio) {
        this.transaction.add(transactio);
        this.saldo += transactio.getCantidad();
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }
    
    
}
