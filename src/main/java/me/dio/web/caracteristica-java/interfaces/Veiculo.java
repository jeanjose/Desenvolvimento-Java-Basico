package me.dio.web.interfaces;

public interface Veiculo {

    String registro();

    default void ligar(){
        System.out.println("Carro ligado!");
    }

    default void desligar(){
        System.out.println("Carro desligado!");
    }

}
