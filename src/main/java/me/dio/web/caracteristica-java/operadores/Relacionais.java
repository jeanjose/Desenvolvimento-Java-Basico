package me.dio.web.operadores;

public class Relacionais {

    public static void main(String[] args) {

        final var numero = 5;

        /* Operações relacionais (">", "<", ">=", "<=") */
        if(numero > 20){
            System.out.println("O número é maior que 20");
        } else if (numero >= 10){
            System.out.println("O número é maior ou igual a 10");
        } else if ( numero <= 5){
            System.out.println("O número é menor igual a 5");
        } else {
            System.out.println("Nenhuma das respostas anteriores!");
        }
    }
}
