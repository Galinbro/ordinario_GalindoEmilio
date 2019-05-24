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
public interface DataBaseDao {
    
    public String insert(String i);
    public String select(String s);
    public String delete(String d);
    public String update(String u);
}
