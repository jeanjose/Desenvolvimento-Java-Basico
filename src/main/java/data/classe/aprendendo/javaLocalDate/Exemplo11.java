package data.classe.aprendendo.javaLocalDate;

import java.time.LocalDate;

public class Exemplo11 {
    public static void main(String[] args) {

        //Vai exibir apenas a data
        //Essas são as formas mais utilizadas depois do java8
        LocalDate dataDeHoje = LocalDate.now();

        System.out.println(dataDeHoje);
        // Ano/mês/dia
    }
}
