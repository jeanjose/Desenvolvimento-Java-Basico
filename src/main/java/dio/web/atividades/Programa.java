package dio.web.atividades;

import dio.web.atividades.imc.CalculadoraDeImc;
import dio.web.atividades.imc.Pessoa;
import java.util.Scanner;

public class Programa {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa ("Jean", 64.0, 1.81);

        final var calculadoraDeImc = new CalculadoraDeImc();
        final var imc = calculadoraDeImc.calcula(pessoa);

        System.out.printf("IMC = %.2f", imc);


    }
}
