package data.classe.aprendendo.javaCalendar;

import java.util.Calendar;

public class Exercicio {
    public static void main(String[] args) {

        /* Um cliente tem 10 dias para pagar uma fatura após sua data de vencimento
        * sem que os juros sejam cobrados.
        *
        * Caso essa data caia em um sábado ou domingo, o cliente pode pagar
        * na segunda-feira seguinte.
        *
        * Crie uma estrutura que receba uma data de vencimento e calcule quantos dias
        * ele tem para pagar. */


        String diaDaSemana = "-";
        int restanteDiasPagamento = 10;
        Calendar dataHoje = Calendar.getInstance();
        Calendar dataVencimento = Calendar.getInstance();

        //Adicinando data de vencimento para 10 dias após a data atual
        dataVencimento.add(Calendar.DATE, 10);
        /*Imprimindo só para ver se cairia no sábado ou domingo,
        se sim, a pessoa teria o direito de pagar na segunda*/
        System.out.printf("%tc\n", dataVencimento);

        /* Verificando qual dia caiu a data de vencimento*/
        switch (dataVencimento.get(Calendar.DAY_OF_WEEK)) {
            case Calendar.SUNDAY:
                diaDaSemana = "DOM";
                /* Caso o dai venha cair no domingo, irá acrecentar mais um
                * nos dias restante do pagamento e adicionar mais um DATE
                * para que a data altere para a segunda-feira*/
                dataVencimento.add(Calendar.DATE, 1);
                restanteDiasPagamento +=1;
                break;
            case Calendar.MONDAY:
                diaDaSemana = "SEG";
                break;
            case Calendar.TUESDAY:
                diaDaSemana = "TER";
                break;
            case Calendar.WEDNESDAY:
                diaDaSemana = "QUA";
                break;
            case Calendar.THURSDAY:
                diaDaSemana = "QUI";
                break;
            case Calendar.FRIDAY:
                diaDaSemana = "SEX";
                break;
            case Calendar.SATURDAY:
                diaDaSemana = "SAB";
                /* Caso o dai venha cair no sábado, irá acrecentar mais dois
                 * nos dias restante do pagamento e adicionar mais dois DATE
                 * para que a data altere para a segunda-feira*/
                dataVencimento.add(Calendar.DATE, 2);
                restanteDiasPagamento +=2;
                break;
        }

        System.out.println("O cliente tem " + restanteDiasPagamento + "" +
                " dias para efetuar o pagamento.");
        System.out.printf("Sua data de vencimento é: %tF", dataVencimento);

        }
    }

