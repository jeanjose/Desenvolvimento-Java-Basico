package me.dio.web.interfaces;

public class Programa {

    public static void main(String[] args) {

        /*
        Trabalhando com interfaces
         */

        final Gol gol = new Gol();
        System.out.println("Marca do Gol:" + gol.marca());
        gol.ligar();
        gol.desligar();

        System.out.println("");
        System.out.println("------");
        /*
        O trator está implementando a interface Veiculo,
        por isso pode ser instânciado como um.
         */
        final Veiculo trator = new Trator();
        System.out.println("Resgistro do trator: " + trator.registro());
        trator.ligar();
        trator.desligar();

        System.out.println("");
        System.out.println("------");
        /*
        O fiesta tem que ser o instânciado pelo próprio tipo,
        pois está implementando duas interfaces.
         */
        final Fiesta fiesta = new Fiesta();
        System.out.println("Marca do Fiesta: " + fiesta.marca());
        System.out.println("Registro do Fiesta: " + fiesta.registro());
        fiesta.ligar();
        fiesta.desligar();
        //Carro.fiesta.ligar(); //Só pode ser acessado por quem está implementando a interface

    }
}
