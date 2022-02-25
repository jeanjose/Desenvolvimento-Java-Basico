package me.dio.web.modificadorAcesso.abstracts;

public abstract class FormaGeometrica {

    /*
    Esse modificador de acesso não pe aplicado nas variáveis,
    apenas em classes e métodos. Uma classe abstrata
    não pode ser instanciada. Se houver alguma declaração
    de um método como abtract (abstrato), a classe também deve
    ser marcada como abstratc.
     */

    /* Métodos abstratos não tem corpo/contéudo */
    public abstract String nome();
    public abstract Double area();

    /*Esse método não é abstrato por isso tem corpo*/
    public String desenha(int x, int y){
        return "Desenhando as coordenadas X=" + x + " Y=" + y;
    }
}
