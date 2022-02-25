package me.dio.web.strings;

public class BuilderDeString {

    public static void main(String[] args) {
        
        var nome = "Jean";

        /*Está atribuindo "nome" a builder, através da instância do StringBuilder*/
        final var builder = new StringBuilder(nome);

        /*o método builder.append("texto") é a forma de atruibuir mais "texto" a variável.
        Ex: Adicionamos Luis a varíavel nome*/
        System.out.println(builder.append("Luis"));

        /*o método .reverse() vai fazer a string ficar de trás para frente*/
        final var reverse = builder.reverse();
        System.out.println(reverse);

        /*o .insert(1ºposição, 2ºposição) serve para inserir as coisas na String.
        Ex: Estou inserindo na posição "0|zero" o caracter "#|Jogo da Velha"
        E como o .length retorna o tamanho do valor da variável, estámos dizendo que ná última posição,
        Também vamos inserir o jogo da velha*/
        final var insert = reverse.insert(0, "#").insert(reverse.length(), "#");
        System.out.println(insert);
    }
}
