package data.classe.aprendendo.javaCalendar;

import java.util.Calendar;

public class Exemplo08 {
    public static void main(String[] args) {

        /*Formatação de data*/

        Calendar agora = Calendar.getInstance();

        System.out.printf("01-" + "%tc\n", agora);
        //Dom mês dia hora país ano
        System.out.printf("02-" + "%tF\n", agora);
        //ano, mês, dia
        System.out.printf("03-" + "%tD\n", agora);
        //dia, mês, ano
        System.out.printf("04-" + "%tr\n", agora);
        //hora com AM e PM
        System.out.printf("05-" + "%tT\n", agora);
        //hora 24h
    }
}
