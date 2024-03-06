package br.edu.ifba.saj.ads.poo.classes;

import java.util.ArrayList;
import java.util.List;

public class Categoria extends Cadastro{
    private String nome;
    private List<Livro> livrosDestaCategoria;

    
    //construtor
    public Categoria(String nome) {
        this.nome = nome;
        this.livrosDestaCategoria = new ArrayList<>();
    }

    
    //metodo para adicionar livros na categoria dele
    @Override
    public void adicionar(Livro livro) {
        livrosDestaCategoria.add(livro);
       
    }


    @Override
    public void remover(Livro livro) {
        livrosDestaCategoria.remove(livro);
    }


    
}
