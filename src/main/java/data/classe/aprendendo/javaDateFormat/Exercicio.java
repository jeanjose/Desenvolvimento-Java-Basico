package data.classe.aprendendo.javaDateFormat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercicio {
    public static void main(String[] args) {

        Date dataAtual = new Date();

        SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss:mmm");
        String dataFormatada = formatter.format(dataAtual);
        System.out.println(dataFormatada);
    }
}
