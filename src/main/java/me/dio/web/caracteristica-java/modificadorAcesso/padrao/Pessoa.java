package me.dio.web.modificadorAcesso.padrao;

public class Pessoa {

   /* Modificadores de acesso default, só pode ser acessado pelo menos pacote */
    String nome;

    /*  Modificador de acesso em private ninguém consegue acessar
   mesmo que a classe receba herança */
    private Integer idade;
    private Double peso;

    /* Modificador de acesso public pode ser acesso por qualquer classe ou pacote */
    public Pessoa(){
        super();
    }


    public Pessoa (final Integer idade, final Double peso){
        super();
        this.idade = idade;
        this.peso = peso;
    }

    public Integer getIdade (){
        return idade;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public Double getPeso(){
        return peso;
    }

    public void setPeso(Double peso){
        this.peso = peso;
    }

    /* Modificador de acesso protected só consegue ser acesso
    pelas classes do mesmo pacote */
    protected String getRelatorio() {
        return "Idade: " + idade + " e Peso:" + peso;
    }

}
