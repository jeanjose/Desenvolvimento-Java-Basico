package me.dio.web.modificadorAcesso.statics;

public class ProgramaCachorro {

    public static void main(String[] args) {

        final Cachorro pitbull = new Cachorro();
        /* Como a zoologia foi trocada aqui, todos os cachorros
        * serão transformados em "Bipedes", porque o método utilizado
        * dentro da classe cachorro para declarar a variável zoologia foi "static" */
        pitbull.zoologia = "Bipede";

        final Cachorro viraLata = new Cachorro();

        System.out.println(pitbull.zoologia);
        System.out.println(viraLata.zoologia);

    }
}
