package me.dio.web.operadores;

public class Incremento {

    public static void main(String[] args) {

        int numero = 1;

        //O operador ++ incrementa 1 na váriavel, resultado = 2
        /* Utilizar o operador a esquerda significa que primeiro eu incremento
         e só depois eu avalio a expressão*/
        System.out.println(++numero);


        var variavel = 10;

        /* Utilizar o operador a direita significa que primeiro eu avalio a expressão
         e depois incremento o valor */
        System.out.println(variavel--);
        System.out.println(variavel);
    }
}
