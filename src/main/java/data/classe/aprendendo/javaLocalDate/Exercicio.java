package data.classe.aprendendo.javaLocalDate;

import java.time.LocalDateTime;

public class Exercicio {
    public static void main(String[] args) {

        //Criando uma data e passando por parâmetro a data que eu quero que seja iniciada
        LocalDateTime passado = LocalDateTime.of(2010,05,15,10,00,00);
        System.out.println(passado);

        //Adicionando 11 anos, 9 meses, 4 dias, 1hora, 50m na data "passado"
        LocalDateTime futuro = passado.plusYears(11).plusMonths(9).plusDays(4).plusHours(1).plusMinutes(50);
        System.out.println(futuro);
    }
}
