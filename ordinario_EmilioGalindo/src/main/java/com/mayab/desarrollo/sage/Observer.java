/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author galindo
 */
public interface Observer {
    
    public void update(String name, String trans, int time);
    
}
