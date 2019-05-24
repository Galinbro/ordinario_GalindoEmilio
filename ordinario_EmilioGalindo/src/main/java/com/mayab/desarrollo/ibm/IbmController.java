/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.desarrollo.ibm;

/**
 *
 * @author galindo
 */
public class IbmController {
    public static void main(String[] args) {
        
        
        NewPerson clientHacienda = new HaciendaClient();
        ClientPerson client = new Client();
        NewPerson newHaciendClient = new HaciendaAdapter(client);

        System.out.println("Client ...");
        System.out.println(client.fullName());
                
        System.out.println("Hacienda says ...");
        System.out.println(clientHacienda.name());
        System.out.println(clientHacienda.lastName());
        
        System.out.println("Hacienda client adapter ...");
        System.out.println(newHaciendClient.name());
        System.out.println(newHaciendClient.lastName());
        
        System.out.println("newHaciendClient instanceof NewPerson");
        System.out.println(newHaciendClient instanceof NewPerson);
        System.out.println("newHaciendClient instanceof ClientPerson");
        System.out.println(newHaciendClient instanceof ClientPerson);
    }

}
