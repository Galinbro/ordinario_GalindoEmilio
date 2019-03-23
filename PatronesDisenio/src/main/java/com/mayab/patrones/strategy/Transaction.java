/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.strategy;

/**
 *
 * @author galindo
 */
public class Transaction {
    
    String fecha;
    String comercio;
    Integer cantidad;
    String categoria;
    int asciiComercio;
    int asciiCategoria;
    int año;

    public Transaction(String date,String come,Integer canti,String cate){
        this.fecha = date;
        this.comercio = come;
        this.cantidad = canti;
        this.categoria = cate;
        this.asciiComercio = (int) come.charAt(0);
        this.asciiCategoria = (int) cate.charAt(0);
        this.año =  Integer.parseInt(date.length() > 2 ? date.substring(date.length() - 2) : date);
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getComercio() {
        return comercio;
    }

    public void setComercio(String comercio) {
        this.comercio = comercio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public int getAsciiComercio() {
        return asciiComercio;
    }

    public int getAsciiCategoria() {
        return asciiCategoria;
    }

    public int getAño() {
        return año;
    }
    
}
