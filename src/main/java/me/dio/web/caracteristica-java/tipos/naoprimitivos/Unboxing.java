package me.dio.web.tipos.naoprimitivos;

public class Unboxing {

    public static void main(String[] args) {

        /* É chamado Unboxing, porque construímos o objeto
        e atribuimos a um tipo primitivo */

        //int i = new Integer(i:3);

        int inteiro = Integer.valueOf(1024);

        //boolean b = new Boolean(true);
        boolean b2 = Boolean.TRUE;
        boolean b3 = Boolean.getBoolean("false");

    }
}
