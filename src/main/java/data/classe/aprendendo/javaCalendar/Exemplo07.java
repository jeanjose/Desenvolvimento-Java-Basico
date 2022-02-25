package data.classe.aprendendo.javaCalendar;

import java.util.Calendar;

public class Exemplo07 {
    public static void main(String[] args) {


        Calendar agora = Calendar.getInstance();

        System.out.println("A data atual é: " + agora.getTime());
        // A data corrente é: data atual

        //Estamos indo na data e adicionando -15 do dia atual
        agora.add(Calendar.DATE, -15);
        System.out.println("15 dias atrás: " + agora.getTime());
        //Vai imprimir a data de 15 dias atrás

        //Estamos indo no mês e adicionando +4 do mês atual
        agora.add(Calendar.MONTH, 4);
        System.out.println("4 Meses depois: " + agora.getTime());
        //Vai imprimir 4 meses depois da data atual

        //Estamos indo no ano e adicionando +2 do ano atual
        agora.add(Calendar.YEAR, 2);
        System.out.println("2 anos depois: " + agora.getTime());
        //Vai imprimir dois anos depois

    }
}
