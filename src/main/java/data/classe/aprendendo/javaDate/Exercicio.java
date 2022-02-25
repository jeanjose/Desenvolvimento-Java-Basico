package data.classe.aprendendo.javaDate;

import java.util.Date;

public class Exercicio {
    public static void main(String[] args) {

        //Código da data do meu aniversário
        //Thu Nov 12 17:01:00 BRST 1998
        Date dataAniversario = new Date(910897260000L);
        System.out.println(dataAniversario);

        //Código data qualquer
        //Sat May 15 17:03:00 BRT 2010
        Date dataComparacao = new Date(1273953780000L);
        System.out.println(dataComparacao);

        //Fazendo a comparação para ver se a data do meu aniversário é anterior ou superior a ela
        int compareCase = dataAniversario.compareTo(dataComparacao); //-1

        //Se o resultado der -1 = a data comparada é anterior
        //se o resultado der 1 = a data comparada é superior
        //se o resultado der 0 = as datas são iguais

        if(compareCase == -1){
            System.out.println("A data de aniversário é anterior a data selecionada");
        } else {
            System.out.println("A data de aniversário é superior a data selecionada");
        }


    }
}
