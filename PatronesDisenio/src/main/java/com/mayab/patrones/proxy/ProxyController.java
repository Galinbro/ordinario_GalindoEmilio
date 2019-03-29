/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mayab.patrones.proxy;

/**
 *
 * @author galindo
 */
public class ProxyController{
    public static void main(String[] args) {
    
    Usuario emilio = new Usuario("emilio",1);
    Usuario pony = new Usuario("pony",0);
    
    ProxyFile f = new ProxyFile(emilio);
    
    System.out.println(f.escribir());
    System.out.println(f.leer());
    System.out.println(f.borrar());
    
    System.out.println(" - - - - - - -");
    
    ProxyFile f2 = new ProxyFile(pony);
    
    System.out.println(f2.escribir());
    System.out.println(f2.leer());
    System.out.println(f2.borrar());
    
    }
}
