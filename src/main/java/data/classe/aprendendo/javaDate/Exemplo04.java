package data.classe.aprendendo.javaDate;

import java.util.Date;

public class Exemplo04 {
    public static void main(String[] args) {

        Date dataNoPassado = new Date(1513124807691L);
        //Tue Dec 12 22:26:47 BRST 2017

        Date dataNoFuturo = new Date(1613124807691L);
        //Fri Feb 12 07:13:27 BRT 2021

        Date mesmaDataNoFuturo = new Date(1613124807691L);
        //Fri Feb 12 07:13:27 BRT 2021

        /* Comparando se as datas são iguais */

        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo); //true
        System.out.println(isEquals);

        /*Comparando uma data com a outra*/
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo); //passado -> futuro
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado); //futuro -> passado
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo); // datas equivalentes

        System.out.println(compareCase1); // -1
        System.out.println(compareCase2); // 1
        System.out.println(compareCase3); // 0

    }
}
