/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

/**
 *
 * @author galindo
 */
public class Telcel {
    
    private double msgCost;
    
    public Telcel(){
        this.msgCost = 2.5;
    }

    public Telcel(double c){
        this.msgCost = c;
    }
    
    
    //getters and setters
    
    public double getMsgCost() {
        return msgCost;
    }

    public void setMsgCost(double msgCost) {
        this.msgCost = msgCost;
    }
    
    
}
