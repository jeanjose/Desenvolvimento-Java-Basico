package data.classe.aprendendo.javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo09 {
    public static void main(String[] args) {

        //Nesses exemplos apenas conseguimos falar se queremos padrão longo ou curto para ser exibido
        Date agora = new Date();

        //"Instância" a data através do getInstance() chamando o .format()
        String dateToStr = DateFormat.getInstance().format(agora);
        System.out.println(dateToStr);
        //Dia/Mes/Ano  hora

        /*Nesse método .getDateTimeInstance, a gente pode passar paramêtros e ter
        * um pouco mais de controle com o nosso retorno*/
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
        // dia, mês escrito, ano  hora
    }
}
