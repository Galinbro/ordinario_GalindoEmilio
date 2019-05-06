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
public class Producto extends Catalogo{
    
    private int codigoBarra;
    private int precio;
    
    public Producto(int c,int p){
        this.codigoBarra = c;
        this.precio = p;
    }
    
    public boolean validarDatos(int p) {
                if(p > 10)
            return true;
        else
            return false;
    }
    
    public void leerDatos() {
        System.out.println("codigo de barra: " + this.codigoBarra + "precio: " + this.precio);
    }

    public void guardar(int x) {
        this.precio = x;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

}
