package me.dio.web.enums;

public class Programa {
    public static void main(String[] args) {

        /* O enum não pode ser instânciado */
        //final TipoVeiculo tipoVeiculo = new TipoVeiculo();

        System.out.println(TipoVeiculo.AEREO);
        System.out.println(TipoVeiculo.AQUATICO);

        //Não consegue atribuir valor minusculo, porque foi declarado maisculo
        //System.out.println(TipoVeiculo.valueOf("aero");
        System.out.println(TipoVeiculo.valueOf("TERRESTRE"));

        for (TipoVeiculo tipoVeiculo : TipoVeiculo.values()){
            System.out.println("Tipo: " + tipoVeiculo);
        }

        System.out.println("Código do Status OPEN: " + Status.OPEN.getCod());
        System.out.println("Texto do Status OPEN: " + Status.OPEN.getTexto());
    }
}
