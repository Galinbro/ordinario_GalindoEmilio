/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.observer;

import java.util.ArrayList;
/**
 *
 * @author galindo
 */
public class Vuelo implements Observable{

    public String sala;
    public String salida;
    public String estado;
    public String destino;
    public String codigo;
    public ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
    
    public Vuelo(String sal, String est, String dest, String codi){
        this.sala = "no asignado";
        this.salida = sal;
        this.estado = est;
        this.destino = dest;
        this.codigo = codi;
    }
    
    
    public String getState(String estado, String sala) {
        String state;
        state = "estado: " + estado + " sala: " + sala;
        return state;
    }

     
    public void removeObserver(Pasajero p) {
        pasajeros.remove(p);
        System.out.println("pasajero: " + p.getNombre() + "eliminado");
    }

     
    public void addObserver(Pasajero p) {
        pasajeros.add(p);
        System.out.println("pasajero: " + p.getNombre() + "agregado");
    }

     
    public void notifyObservers() {
        for(Pasajero p : pasajeros){
            p.update(this.sala,this.salida,this.estado);
        }
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
        notifyObservers();
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
        notifyObservers();
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
        notifyObservers();
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
  
    
}
