package dio.web.atividades.imc;

import org.jetbrains.annotations.NotNull;

public class CalculadoraDeImc {


    public Double calcula(final Pessoa pessoa){
        final var altura = pessoa.getAltura();
        final var imc = pessoa.getPeso() / Math.pow(altura, 2);
        return imc;
    }
}
