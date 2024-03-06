package br.edu.ifba.saj.ads.poo.classes;

public abstract class Cadastro {
    private String nome;

    public abstract void adicionar(Livro livro);
    //metodo atualizar (qur pode ser gerdado por usuario, por ex, pois ele pode atualizar seus dados)
    //metodo remover (segue o mesmo raciocinio de cima) | obs: remover da lista de desejos tbm
    public abstract void remover(Livro livro);
    

}
