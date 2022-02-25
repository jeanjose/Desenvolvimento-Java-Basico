package me.dio.web.modificadorAcesso.padrao;

public class ProgramaPessoaFisica {

    public static void main(String[] args) {

       //Scanner input = new Scanner(System.in);
       PessoaFisica pf = new PessoaFisica(23, 64.5);

       System.out.println("PessoaFisica " + pf.getRelatorio());
       /* Só consigo acessar o relatório porque está no mesmo pacote,
        já que o modificador de acesso utilizado é o protected */

    }
}
