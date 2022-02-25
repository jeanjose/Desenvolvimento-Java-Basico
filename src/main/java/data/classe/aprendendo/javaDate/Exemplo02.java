package data.classe.aprendendo.javaDate;

import java.util.Date;

public class Exemplo02 {
    public static void main(String[] args) {

        /* O epoch timestamp é um padrão largamente aceito para representar uma data
         como um inteiro 32-bits a partir do início do Unix Epoch
         base padrão: 1 de janeiro de 1970 00:00:00 */

        /*O método System.currenteTimeMillis() é para retornar os milissegundos
        * mais próximo da execução do programa com base no sistema operacional */
        Long currenteTimeMillis = System.currentTimeMillis();

        System.out.println(currenteTimeMillis);

        Date novaData = new Date(currenteTimeMillis);
        System.out.println(novaData);


    }
}
