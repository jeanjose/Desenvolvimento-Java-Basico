package me.dio.web.modificadorAcesso.finals;

public class Gamer {


    /*
    O modificador final quando aplicado na classe, não permite estender,
    nos métodos impede que o mesmo seja sobrescrito (overriding) na subclasse,
     e nos valores de variáveis não pode ser alterado depois que já tenha
     sido atribuído um valor
     */
    public String keyboard(){
        return "Keyboard Gamer!";
    }

    public final String mouse(){
        return "Mouse Gamer!";
    }
}
