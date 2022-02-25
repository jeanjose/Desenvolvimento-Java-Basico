package data.classe.aprendendo.javaLocalDate;

import java.time.LocalTime;

public class Exemplo14 {
    public static void main(String[] args) {

        //Instânciando uma nova data
        LocalTime horarioAgora = LocalTime.now();

        //Instânciando uma data e adicionando uma hora a mais
        LocalTime maisUmaHora = horarioAgora.plusHours(1);

        System.out.println(horarioAgora);
        System.out.println(maisUmaHora);
    }
}
