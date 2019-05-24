/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.sage;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;

/**
 *
 * @author galindo
 */
public class Manager extends Person implements Observer{
    
    private int minorRange;
    private int mayorRange;
    private ArrayList<Client> clients = new ArrayList<Client>();
    private int limit;
    private Telcel telcel;
    private Notification msg;
    private Notification mail;
    private String msgString;
    private String mailString;
    private Stack<String> transactions = new Stack<String>(); 

    public Manager(String ms, String m, int mR1,int mR2,Telcel t){
        super();
        this.msgString = ms;
        this.mailString = m;
        this.minorRange = mR1;
        this.mayorRange = mR2;
        this.telcel = t;
    }
    
    public Manager(String ms, int mR1,int mR2,Telcel t){
        super();
        if(ms.equalsIgnoreCase("msg")){
            this.msgString = ms;
            this.mailString = "";
        }
        else if(ms.equalsIgnoreCase("mail")){
            this.mailString = ms;
            this.msgString = "";
        }
        
        this.minorRange = mR1;
        this.mayorRange = mR2;
        this.telcel = t;
    }
    public Manager(int mR1,int mR2,Telcel t){
        super();
        this.msgString = "";
        this.mailString = "";
        this.minorRange = mR1;
        this.mayorRange = mR2;
        this.telcel = t;
    }
    // implements observer
     public void update(String name, String trans, int time) {
         addTrans(trans);
        if(time >= minorRange && time <= mayorRange){
                NotificationCreator notification = new VirtualNotification();
                if(!(notification.whichOne(msgString,mailString,false) instanceof Nothing)){
                    try{
                        this.msg = notification.whichOne(msgString,mailString,true);
                        alert(name,trans);
                    }catch(Exception e){
                        System.out.println("Notifiaction type doesn´ exist");
                    }
                    
                }
            }
        }

    
    public void alert(String name,String trans) {
        String[] parts = trans.split("-");
        Object[][] table = new String[1][];
        table[0] = new String[] { name, " Detalle: " + parts[0] + " Cantidad: " + parts[1] , " Hora: " + parts[2] };
        
        for (final Object[] row : table) {
            System.out.format("%15s%15s%10s\n", row);
        }

    }

    public void clientHitory(){
        System.out.println("-------------- \r\nTransacciones:");
        for(String s : transactions){
            System.out.println(s);
        }
        
    }
    
    public void printTrans(){
        System.out.println("Transacciones:");
        for(String i : transactions){
            System.out.println(i);
        }
    }
    public void addTrans(String s){
        transactions.add(s);
    }
    
    //getters and setters
   
    
    public Notification getMsg() {
        return msg;
    }

    public Notification getMail() {
        return mail;
    }

    public int getMinorRange() {
        return minorRange;
    }

    public void setMinorRange(int minorRange) {
        this.minorRange = minorRange;
    }

    public int getMayorRange() {
        return mayorRange;
    }

    public void setMayorRange(int mayorRange) {
        this.mayorRange = mayorRange;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public Telcel getTelcel() {
        return telcel;
    }

    public void setTelcel(Telcel telcel) {
        this.telcel = telcel;
    }

    public String getMsgString() {
        return msgString;
    }

    public void setMsgString(String msgString) {
        this.msgString = msgString;
    }

    public String getMailString() {
        return mailString;
    }

    public void setMailString(String mailString) {
        this.mailString = mailString;
    }
    
    
}
