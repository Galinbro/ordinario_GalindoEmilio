package com.mayab.patrones.singleton;

public class UsuarioController {
    public static void main(String[] args) {
        Usuario user1 = Usuario.getInstance();
        System.out.println("User 1 = " + user1.getLogged());
        user1.login();
        System.out.println("User 1 = " + user1.getLogged());
        Usuario user2 = Usuario.getInstance();
        System.out.println("User 2 = " + user2.getLogged());
    }
}
