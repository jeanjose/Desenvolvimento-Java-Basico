package me.dio.web.tipos.wrappers;

public class Wrappers {

    public static void main(String[] args) {
        //Autoboxing

        Byte b1 = 127;          //byte
        Byte b2 = -128;
        Byte nullByte = null; // por ser objeto consigo atribuir null;
        //O byte não permite valores maior que 127 e menor que -128;

        Character c = 'A';          //char
        //É um tipo de variável que só aceita a inserção de um caractere

        Short s1 = 32767;           //short
        Short s2 = -32768;
        //Não é permitido valores maior ou menor do que foram citados acima;

        Integer i = 2147483647;     //int
        Integer i2 = -2147483648;
        //Não é permitido valores maior ou menor do que foram citados acima;

        Long l = 9223372036854775007L;      //long
        Long l2 = -9223372036854775008L;


        /* ---- FLUTUANTES ---- */

        Float f = 65f;              //float 3.402,823,5 E+38 //E = Elevado
        Float f2 = 65.0f;
        Float f3 = -0.5f;           //1.4 E-45
        //Não é permitido valores maior ou menor do que foram citados acima;

        Double d = 1024.99;         //double 1.797,693,134,862,315,7 E+308 //E = Elevado
        Double d2 = 10.2456;        //4.9 E-324
        //Não é permitido valores maior ou menor do que foram citados acima;

        /* ---- BOLEANO ---- */

        Boolean bo = true;
        Boolean bo2 = false;

        Boolean bo3 = Boolean.getBoolean("false"); //ok
        Boolean bo4 = Boolean.valueOf("True");          //ok
        /*  O método valueOf é um método estático que recebe
        um argumento de qualquer tipo e o converte em um objeto String,
        que pode ser então processado por métodos como printf,
        println ou qualquer outro que trabalhe com cadeias de caracteres.
         */


    }
}
