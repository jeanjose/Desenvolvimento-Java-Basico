package me.dio.web.operadores;

public class Igualdade {

    public static void main(String[] args) {

        final var numero = 11;

        /* O número é igual a 10?*/
        if (numero == 10){
            System.out.println("O número é 10");
        } else {
            System.out.println("O número não é 10");
        }

        /* O número é diferente de 10? */
        if (numero != 10){
            System.out.println("O número não é 10");
        } else {
            System.out.println("O número é 10");
        }


        final var letra = "B";

        /* A letra é igual a (A)?*/
        if ("A".equals(letra)){
            System.out.println("A letra é A");
        } else {
            System.out.println("A letra não é A");
        }

        /* É verdade que á letra não é igual a (A)?*/
        if(!letra.equals("A")){
            System.out.println("A letra não é A");
        } else {
            System.out.println("A letra é A");
        }

        if ("b".equalsIgnoreCase(letra)){
            System.out.println("A letra é B");
        } else {
            System.out.println("A letra não é B");
        }
    }
}
