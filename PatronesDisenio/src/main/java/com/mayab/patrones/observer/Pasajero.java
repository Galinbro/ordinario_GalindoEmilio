/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.observer;

/**
 *
 * @author galindo
 */
public class Pasajero implements Observer{

    public String nombre;
    public String vuelo;
    
    
    public Pasajero(String n, String vue){
        this.nombre = n;
        this.vuelo = vue;
    }
    
    
   public void update(String sala, String salida, String estado) {
		alert(sala,salida,estado);
	}
	
	public void alert(String sala, String salida, String estado) {
		System.out.println(this.nombre +" sala: " + sala 
			+ " salida:  " + salida + " estado: " + estado);
	}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vue) {
        this.vuelo = vue;
    }
    
    
    
}
