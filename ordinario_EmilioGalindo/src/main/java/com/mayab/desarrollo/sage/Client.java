/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * @author galindo
 */
public class Client extends Person implements Observable{
    

    
    private ArrayList<Manager>  managers = new ArrayList<Manager>();
    
    
    public Client(String name, String lN, String r){
        super(name,lN,r);
    }
    
    public Client(String r){
        super();
        this.setRol(r);
    }
    
    public Client(){
        super();
    }
    
    public void addTrans(int i, String s,int time) {
        notifyObservers(s + "-" + String.valueOf(i) + "-" + String.valueOf(time));
        
    }

    public void removeObserver(Manager manager) {
        this.managers.remove(manager);
    }

    public void addObserver(Manager manager) {
        this.managers.add(manager);
    }

    public void notifyObservers(String s) {
        for(Manager manager : managers){
                if(splitCantidad(s) >= manager.getLimit())
                manager.update(this.getName(),s,splitTiempo(s));
        }
        
    }

    public int splitCantidad(String s){
        
        String[] parts = s.split("-");
        
        return Integer.valueOf(parts[1]);
    }
    public int splitTiempo(String s){
        
        String[] parts = s.split("-");
        
        return Integer.valueOf(parts[2]);
    }


    
    //getters and setters

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }
    
    
    
}
