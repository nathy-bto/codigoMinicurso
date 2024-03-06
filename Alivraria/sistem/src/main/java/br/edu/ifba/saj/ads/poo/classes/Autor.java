package br.edu.ifba.saj.ads.poo.classes;

import java.util.List;

public class Autor {
    private String nome;
    private List<Livro> livrosDesteAutor;
    
    public Autor(String nome, List<Livro> livrosDesteAutor) {
        this.nome = nome;
        this.livrosDesteAutor = livrosDesteAutor;
    }
    
    
}
