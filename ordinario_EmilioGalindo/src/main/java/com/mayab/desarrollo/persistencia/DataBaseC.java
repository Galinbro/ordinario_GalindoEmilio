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
public class DataBaseC extends DataBase{

    public DataBaseC(String s) {
        super(s);
    }

    public String createSentence(String s) {
        return s;
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
