package model;

import javax.swing.*;

public class Usuario {

    private String email;
    private String senha;

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public boolean realizarLogin(String email, String senha){
        try{
            email = JOptionPane.showInputDialog("E-mail: ");
            senha = JOptionPane.showInputDialog("Senha: ");
        } catch (NullPointerException e){
            JOptionPane.showMessageDialog(null, "Senha incorreta");
        }
        return true;
    }

    public boolean validarSenha(String senha){
        int quantidadeMinima = 4;
        if (this.senha == senha){
            if (senha.length() >= quantidadeMinima){
                return true;
            }
        }
        return false;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
