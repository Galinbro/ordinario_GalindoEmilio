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
public abstract class NotificationCreator {
    
    
    
    public abstract Notification createNotification(String msg, String mail);
    
    public Notification whichOne(String msg, String mail, boolean x){
        
            Notification notification = createNotification(msg, mail);
        
        if(x)
            System.out.println(notification.getType());
        
        return notification;
        
    }
    
    
}
