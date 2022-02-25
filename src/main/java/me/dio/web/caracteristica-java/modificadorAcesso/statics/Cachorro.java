package me.dio.web.modificadorAcesso.statics;

public class Cachorro {

    //public String zoologia = "Quadrupede"; //Afetará apenas uma instância.

    /* O método static quando utilizado, definirá que todas as vezes
    * que cachorro (classe) for instânciado, será Quadrupede e caso seja alterado
    * a sua instância, todos também serão alterados juntos */
    public static String zoologia = "Quadrupede"; //Afetará todas as instâncias
}
