/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.persistencia;

/**
 *
 * @author galindo
 */
public abstract class DataBase implements DataBaseDao{
    
    private String sentence;
    
    public DataBase(String s){
        this.sentence = s;
    }

    public abstract String createSentence(String s);
    
    //getters setters
    
    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

}
