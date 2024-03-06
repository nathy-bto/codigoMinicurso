package br.edu.ifba.saj.ads.poo.classes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.ifba.saj.ads.poo.exceptions.EmailInvalidoException;
import br.edu.ifba.saj.ads.poo.exceptions.SenhaFracaExcepion;

public class Usuario{
    private String email;
    private String senha;
    private double saldo;
    private List<Livro> livrosComprados;


    //construtor
    public Usuario(String email, String senha, double saldo) throws SenhaFracaExcepion, EmailInvalidoException {
        if (!email.endsWith("@gmail.com")) {
            throw new EmailInvalidoException("o email deve obedecer o padrão: @gmail.com");
        }if ((senha.length() < 8) ||(!contemMaiuscula(senha) || (!contemCaractereEspecial(senha)))) {
            throw new SenhaFracaExcepion("a senha deve possuir pelo menos 8 carcteres, conter letras maiúsculas e caracteres especiais");
        }
        this.email = email;
        this.senha = senha;
        this.saldo = saldo;
        this.livrosComprados = new ArrayList<>();
    }

    private boolean contemMaiuscula(String senha){
        for (char carcatere : senha.toCharArray()) {
            if (Character.isUpperCase(carcatere)) {
                return true;
            }
        }
        return false;
    }

    private boolean contemCaractereEspecial(String senha){
        String caracteresEspecial = "!@#$%^&*()-_=+[]{}|;:', <.>/?";
        for (char caractere : senha.toCharArray()) {
            if (caracteresEspecial.indexOf(caractere) != -1) {
                //o indexOf retorna a posição de um caractere na string caracteresEspeciais. Se o caractere não for encontrado, ela retorna -1.
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

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodo para debitar do saldo do usuario
    public void debitar(double valor){ //valor seria o preço do livro, melhor seria se esse valor nao fosse digitado pelo usuario ja viesse do livro escilhido
       saldo -= valor;
    }

    
}
