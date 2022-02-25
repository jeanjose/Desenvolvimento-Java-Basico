package data.classe.aprendendo.javaLocalDate;

import java.time.LocalDateTime;

public class Exemplo15 {
    public static void main(String[] args) {

        //Instânciando um novo tempo (Data e Hora juntos)
        LocalDateTime tempoAgora = LocalDateTime.now();

        System.out.println(tempoAgora);

        /* Adicinando uma hora, dois dias e 20s para o tempo atual criado a cima*/
        LocalDateTime futuro = tempoAgora.plusHours(1).plusDays(2).plusSeconds(20);

        System.out.println(futuro);
    }
}
