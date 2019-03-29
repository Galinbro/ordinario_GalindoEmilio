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
public class ProxyFile implements File{

    private FileImp file;
    private Usuario usuario;
    
    public ProxyFile(Usuario u){
        FileImp f = new FileImp();
        this.file = f;
        this.usuario = u;
    }
    
    public String borrar() {
        if(usuario.getType() == 1)
        return file.borrar();
        else
            return "no tiene los permisos";
    }

    
    public String escribir() {
        return file.escribir();
    }

    
    public String leer() {
        return file.leer();
    }

    public FileImp getFile() {
        return file;
    }

    public void setFile(FileImp file) {
        this.file = file;
    }
    
    
}
