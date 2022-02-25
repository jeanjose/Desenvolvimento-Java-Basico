package me.dio.web.tipos.primitivos;

public class Primitivos {

    public static void main(String[] args) {

        /* ---- INTEIROS ---- */

      //byte nullByte = null; - Não é permitido valor null

        byte b;                 //8 bits
        byte b1 = 127;
        byte b2 = -128;
        //byte b3 = 129         //to large
        //O byte não permite valores maior que 127 e menor que -128;

        char c;                 //16 bits
        char c1 = 'A';
        //char c3 'AA';         //nok
        //É um tipo de variável que só aceita a inserção de um caractere

        short s;                //16 bits
        short s1 = 32767;
        short s2 = -32768;
        //Não é permitido valores maior ou menor do que foram citados acima;

        int i = 2147483647;     //32 bits
        int i2 = -2147483648;
        //Não é permitido valores maior ou menor do que foram citados acima;

        long l = 9223372036854775007L;      //64 bits
        long l2 = -9223372036854775008L;


        /* ---- FLUTUANTES ---- */

        float f = 65f;              //32 bits 3.402,823,5 E+38 //E = Elevado
        float f2 = 65.0f;
        float f3 = -0.5f;           //1.4 E-45
        //Não é permitido valores maior ou menor do que foram citados acima;

        double d = 1024.99;         //64 bits 1.797,693,134,862,315,7 E+308 //E = Elevado
        double d2 = 10.2456;        //4.9 E-324
        //Não é permitido valores maior ou menor do que foram citados acima;

        /* ---- BOLEANO ---- */

        boolean bo = true;
        boolean bo2 = false;
        // boolean bo3 = "false";           //NOK
        // boolean bo4 = 'true';            //NOK
        //Só é permitido valores verdadeiros e falsos

        //void = Palavra reservada do java

    }
}
