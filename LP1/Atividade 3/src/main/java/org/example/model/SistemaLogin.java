package org.example.model;

public class SistemaLogin {

    private String senha;

    public SistemaLogin(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // a senha certa é 1234
    public boolean validar() {
        return senha.equals("1234");
    }
}
