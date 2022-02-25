package me.dio.web.usuario;

public class SuperUsuario {

    String name;
    private String login;
    private String senha;

    public SuperUsuario(){
        super();
    }

    public SuperUsuario(String name, final String login, final String senha){
        super();
        this.name=name;
        this.login = login;
        this.senha = senha;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin(){
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getSenha(){
        return senha;
    }

    protected void setSenha(String senha){
        this.senha = senha;
    }


}
