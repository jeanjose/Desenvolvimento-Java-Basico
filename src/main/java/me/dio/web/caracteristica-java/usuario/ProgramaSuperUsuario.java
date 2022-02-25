package me.dio.web.usuario;

public class ProgramaSuperUsuario {

    public static void main(String[] args) {
        final var superUsuario = new SuperUsuario("Teste","root", "123456");



        System.out.println(superUsuario.getName());
        System.out.println(superUsuario.getLogin());
        System.out.println(superUsuario.getSenha());

    }
}
