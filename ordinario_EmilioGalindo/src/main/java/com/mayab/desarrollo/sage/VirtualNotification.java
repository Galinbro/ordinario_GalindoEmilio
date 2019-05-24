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
public class VirtualNotification extends NotificationCreator{
    
    public Notification createNotification(String msg, String mail) {
        if(msg.equalsIgnoreCase("msg") && mail.equalsIgnoreCase("mail"))
            return new Both();
        else if(mail.equalsIgnoreCase("mail") && msg.equalsIgnoreCase(""))
            return new Mail();
        else if(msg.equalsIgnoreCase("msg") && mail.equalsIgnoreCase(""))
            return new Msg();
        else if(mail.equalsIgnoreCase("") && msg.equalsIgnoreCase(""))
            return new Nothing();
        else 
            return null;
    }

}
