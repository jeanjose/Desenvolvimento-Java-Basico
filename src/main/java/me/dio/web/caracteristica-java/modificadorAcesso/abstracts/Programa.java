package me.dio.web.modificadorAcesso.abstracts;

public class Programa {

    public static void main(String[] args) {

        /* Forma geometrica não pode ser instanciada, pois é classe abstrata */
        //final FormaGeometrica formaGeometrica = new FormaGeometrica();

        final FormaGeometrica quadrado = new Quadrado("quadrado", 55.5);

        System.out.println(quadrado);

        System.out.println(quadrado.desenha(12,34));
        System.out.println(quadrado.nome());
        System.out.println(quadrado.area());
    }
}
