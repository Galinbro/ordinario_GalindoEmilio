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

public class HaciendaAdapter implements NewPerson{

    ClientPerson clientPerson;
    
    public HaciendaAdapter(ClientPerson clientPerson){
        this.clientPerson = clientPerson;
    }

    @Override
    public String name() {
        return clientPerson.fullName().substring(0, clientPerson.fullName().lastIndexOf(' '));
    }

    @Override
    public String lastName() {
        return clientPerson.fullName().substring(clientPerson.fullName().lastIndexOf(" ")+1);
    }


    
}

