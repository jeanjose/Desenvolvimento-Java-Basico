package data.classe.aprendendo.javaLocalDate;

import java.time.LocalDate;

public class Exemplo12 {
    public static void main(String[] args) {

        //Instânciando uma data a partir do java8
        LocalDate dataHoje = LocalDate.now();

        /*Estou pegando a data de hoje e atribuindo a uma nova data chamada ontem,
        * e diminuindo o valor -1. O método .minusDays(QTD DIAS), irá diminuir o valor
        * da data atual*/
        LocalDate dataOntem = dataHoje.minusDays(1);

        System.out.println(dataHoje);
        System.out.println(dataOntem);
    }
}
