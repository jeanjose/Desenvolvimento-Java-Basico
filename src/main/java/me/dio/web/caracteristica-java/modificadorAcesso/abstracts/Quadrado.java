package me.dio.web.modificadorAcesso.abstracts;

public class Quadrado extends FormaGeometrica{

    private String nome;
    private Double area;

    public Quadrado(){
        super();
    }

    public Quadrado(final String nome, final Double area){
        super();
        this.nome = nome;
        this.area = area;
    }

    /* Reescrevendo os métodos da classe abstrata */
    @Override
    public String nome() {
        return nome;
    }

    @Override
    public Double area(){
        return area;
    }

    public String toString(){
        return "Quadrado [ nome = " + nome + " | area = " + area + "]";
    }
}
