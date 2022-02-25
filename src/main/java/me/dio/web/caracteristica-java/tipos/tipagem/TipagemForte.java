package me.dio.web.tipos.tipagem;

public class TipagemForte {

    public static void main(String[] args) {

        /*Tipagem forte significa que uma vez que eu atribuir um tipo a uma variável
        eu não consigo mudar */

        String texto = "Meu texto";
        //texto = 1000 //ERROR

        Integer numero = Integer.valueOf("1024");
        numero = 512; //OK
    }
}
