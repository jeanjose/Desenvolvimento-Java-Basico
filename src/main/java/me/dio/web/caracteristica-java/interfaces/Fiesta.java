package me.dio.web.interfaces;

public class Fiesta implements Carro, Veiculo{

    /*
    Quando uma classe implementa duas interface,
     */

    @Override
    public String marca(){
        return "Ford";
    }

    @Override
    public String registro(){
        return "010203R";
    }

    @Override
    public void ligar(){
        Carro.super.ligar();
    }

    @Override
    public void desligar() {
        Carro.super.desligar();
    }
}
