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
public class SageController {
    public static void main(String[] args) {
       
        Telcel telcel = new Telcel();
        
        Manager manager1 = new Manager("msg","mail",8,19,telcel);
        
        manager1.setLimit(100);
//        Manager manager2 = new Manager("msg",6,18,telcel);
//        manager2.setLimit(100);
        
        Client client1 = new Client("coca company");
        
        client1.addObserver(manager1);
        
        client1.addTrans(10000,"coche",10);


        manager1.setMsgString("");
        
        client1.addTrans(20000,"telefono",11);
        
        manager1.setMailString("");
        
        client1.addTrans(12000,"Muebles",12);
        client1.addTrans(430506,"casa",13);
        client1.addTrans(1230504,"bicicleta",14);
        client1.addTrans(3000,"perro",15);
        
        manager1.setMsgString("msg");
        
        client1.addTrans(50000,"vaca",16);
        
        manager1.setMailString("mail");
        
        manager1.clientHitory();
    }
}
