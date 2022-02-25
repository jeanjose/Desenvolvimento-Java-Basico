package me.dio.web.strings;

import static java.lang.String.format;

public class StringFormat {

    public static void main(String[] args) {

        var nome = "Jean";
        var sobrenome = "José";
        var nomeCompleto = nome + sobrenome;

        System.out.println(nome);
        System.out.println("Nome do cliente:" + nome);
        System.out.println("Nome completo: " + nomeCompleto);

        /*O String.format("Mensagem %s, outra mensagem %s", variável um, variável dois),
        é responsável por "trocar" os (%s || formatador) pelas variáveis escolhidas*/
        final var mensagem = format("O cliente %s possui sobrenome %s" , nome, sobrenome);
        System.out.println(mensagem);

        /*Neste exemplo estamos utilizando outro tipo de formatador.
        Estamos formatando o número e falando que queremos apenas duas casa depois da vírgula*/
        System.out.println(format("Número %.2f", 1.2375d));
    }
}
