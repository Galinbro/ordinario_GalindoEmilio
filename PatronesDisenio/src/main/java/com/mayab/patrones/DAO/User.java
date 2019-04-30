/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.DAO;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author galindo
 */
public abstract class User {
    protected int id;
    protected String name;
    protected String address;
    protected static final AtomicInteger count = new AtomicInteger(-1); 
    
    public abstract void print();
    
    public abstract String printS();
 
    public abstract int getId();
    
    public abstract String getName();
    
    public abstract void setName(String n);
}
