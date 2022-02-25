package me.dio.web.modificadorAcesso.finals;

public class CasualGamer extends Gamer{

    @Override
    public String keyboard(){
        return "Simple keyboard...";
    }

    //Método não pode ser reescrevido porque foi declarado como "final"
    /* @Override
    public String mouse(){
        return "Simple mouse...";
    }*/


    /* Não consegue adicionar o Rocket League ao game, pois dentro dos parenteses
    o método String game, foi declarado como final. Para conseguir adicionar o valor
     dentro desse método, só tirando o modificador "final" */
    public String play(final String game){
        //game = "Rocket League";
        return "Jogando " + game;
    }

}
