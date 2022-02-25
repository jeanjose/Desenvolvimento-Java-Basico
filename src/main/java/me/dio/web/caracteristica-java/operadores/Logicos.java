package me.dio.web.operadores;

public class Logicos {

    public static void main(String[] args) {

        final var numero = 2;
        final var letra = "A";

        //Sort Circuit ( "==", "||", "&&")
        /* Número é menor que cinco e letra é igual a "A"? */
        if (numero < 5 && letra.equals("A")){
            System.out.println("01-A condição '&&' está correta!");
        }

         /* Quando as duas condições precisam ser vedadeira e o if ver que a primeira já é falsa
         ele não verifica a segunda condição */
        // Número é menor que um e letra igual a "A"?
        if (numero < 1 && letra.equals("A")){
            System.out.println("02-A condição '&&' está correta!");
        }

        /*Número é menor que cinco ou letra é igual a A? */
        if (numero < 15 || letra.equals("A")){
            System.out.println("03-A condição 'ou' está correta");
        }

        /* 10 - 5 é menor do que 1 e 5-3 é menor do que um? */
        if (((10 - 5) > 1) && ((5-3) > 1)) {
            System.out.println("04-Lógica maluca...");
        }


        //Non Sort Circuit ("&", "=", "|")

        if (verifica(15) & verifica("A")){
            System.out.println("OK");
        } else {
            System.out.println("Não OK");
        }

    }

    private static boolean verifica(String letra){
        System.out.println("Verificando letra...");
        return letra.equals("A");
    }

    private static boolean verifica(Integer numero){
        System.out.println("Verificando número");
        return numero > 10;
    }
}
