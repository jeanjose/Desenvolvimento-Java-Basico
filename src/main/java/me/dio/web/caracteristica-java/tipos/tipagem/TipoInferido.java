package me.dio.web.tipos.tipagem;

public class TipoInferido {

    public static void main(String[] args) {

        /* Tipo inferido significa que eu consigo atribuir
        um valor a variável sem expecificar seu tipo,
        utilizando apenas a palavra "var" */

        var numero = Integer.valueOf("123456");
        var texto = "O Numero é: ";
        //System.out.println(text + numero);
    }
}
