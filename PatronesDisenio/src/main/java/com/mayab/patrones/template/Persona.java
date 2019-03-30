/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.template;

/**
 *
 * @author galindo
 */
public class Persona extends Catalogo{
    
    private String name;
    private String direccion;
    private int edad;
    
    public Persona(String n, String d, int e){
        this.name = n;
        this.direccion = d;
        this.edad = e;
    }

    public boolean validarDatos(int p) {
        if(p > 18)
            return true;
        else
            return false;
    }
    
    public void leerDatos() {
        System.out.println("name: " + this.name + "direccion: " + direccion + "edad: " + edad);
    }

    public void guardar(int x) {
        this.edad = x;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
}
