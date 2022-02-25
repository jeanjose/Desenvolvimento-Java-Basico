package data.classe.aprendendo.javaLocalDate;

import java.time.LocalTime;

public class Exemplo13 {
    public static void main(String[] args) {

        //Instânciando um novo horário a partir do java8 (Método mais utilizado)
        LocalTime horarioAgora = LocalTime.now();

        System.out.println(horarioAgora);
        // hora:minuto:segundo:nanosegundo
    }
}
