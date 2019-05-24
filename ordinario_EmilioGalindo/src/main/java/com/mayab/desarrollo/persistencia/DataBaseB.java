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
public class DataBaseB extends DataBase{

    public DataBaseB(String s) {
        super(s);
    }


    public String createSentence(String s) {
        String string = s.toLowerCase();
        
        return string;
    }
    
    public String insert(String i) {
        return createSentence(i);
    }

    public String select(String s) {
        return createSentence(s);
    }

    public String delete(String d) {
        return createSentence(d);
    }

    public String update(String u) {
        return createSentence(u);
    }
}
