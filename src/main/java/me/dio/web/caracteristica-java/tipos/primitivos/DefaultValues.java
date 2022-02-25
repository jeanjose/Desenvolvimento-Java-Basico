package me.dio.web.tipos.primitivos;

public class DefaultValues {

    public static void main(String[] args) {

        final Default d = new Default();

        /*   Como as variáveis não foram inicializadas vai imprimir
        os valores default de inteiro e boolean   */
        System.out.println(d.getI());
        System.out.println(d.isActive());
    }
}

class Default {

    int i;
    boolean active;

    public int getI() { return i; }

    public boolean isActive(){ return active; }
}
