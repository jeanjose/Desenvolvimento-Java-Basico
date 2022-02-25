package me.dio.web.interfaces;

public interface Carro extends Automovel{
    /*
    Na interface também é possível fazer a herança.
    de Interface para interface
     */

    String marca();

    default void ligar(){
        System.out.println("Carro ligado!");
    }

    default void desligar(){
        System.out.println("Carro desligado!");
    }
}
