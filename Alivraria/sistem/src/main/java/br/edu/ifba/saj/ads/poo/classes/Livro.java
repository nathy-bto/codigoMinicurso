package br.edu.ifba.saj.ads.poo.classes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private String titulo;
    protected int qntDesteLivro;
    private double preco;
    private double precoAlugulPorDia;
    private LocalDate dataDevolucao;
    private Autor autorLivro;
    private Categoria categoroiaLivro;
    private String editora;
    private List<Livro> Livros;
    
    public Livro(Autor autorLivro, Categoria categoroiaLivro, String editora, List<Livro> livros, int qntDesteLivro, double precoAlugulPorDia, double preco) {
        this.autorLivro = autorLivro;
        this.categoroiaLivro = categoroiaLivro;
        this.editora = editora;
        this.qntDesteLivro = qntDesteLivro;
        this.preco = preco;
        this.precoAlugulPorDia = precoAlugulPorDia;
        livros = new ArrayList<>();
    }

    public double getPreco() {
        return preco;
    }

    public double getPrecoAlugulPorDia() {
        return precoAlugulPorDia;
    }

    public int getQntDesteLivro() {
        return qntDesteLivro;
    }

    public void setQntDesteLivro(int qntDesteLivro) {
        this.qntDesteLivro = qntDesteLivro;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setPrecoAlugulPorDia(double precoAlugulPorDia) {
        this.precoAlugulPorDia = precoAlugulPorDia;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutorLivro(Autor autorLivro) {
        this.autorLivro = autorLivro;
    }

    public void setCategoroiaLivro(Categoria categoroiaLivro) {
        this.categoroiaLivro = categoroiaLivro;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutorLivro() {
        return autorLivro;
    }

    public Categoria getCategoroiaLivro() {
        return categoroiaLivro;
    }

    public String getEditora() {
        return editora;
    }

    

}
