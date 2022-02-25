package me.dio.web.ifs;

public class IF {

    public static void main(String[] args) {

        final Boolean condicao = false;

        /* O if é utilizado para fazer condições no código!
        Ex: "Se" a condição for verdadeira eu faço uma coisa "se não" faço outra*/
        if (condicao) {
            System.out.println("A condição é verdadeira!");
        } else {
            System.out.println("A condição é falsa!");
        }

        /* Se a condição do if que eu for colocar der em apenas uma única linhas,
           não é preciso colocar as chaves {} */
        if (condicao) System.out.println("Uma única linha...");

        /*If ternario, vai verificar a condição que está entre o "= e ?",
          se a condição for verdadeira imprimi o que está a direita da interrogação, se não,
          imprimi o que está após os dois pontos */
        final String ternario = condicao ? "é verdadeira" : "é falsa";
        System.out.println(ternario);

    }
}
