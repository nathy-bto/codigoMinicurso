package br.edu.ifba.saj.ads.poo.classes;
import br.edu.ifba.saj.ads.poo.exceptions.AutenticacaoInvalida;
import br.edu.ifba.saj.ads.poo.exceptions.LivroIndisponivelExcepetion;
import br.edu.ifba.saj.ads.poo.exceptions.SaldoInsuficienteException;
import br.edu.ifba.saj.ads.poo.exceptions.UsuarioInvalido;
import br.edu.ifba.saj.ads.poo.exceptions.AutenticacaoInvalida;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Livraria extends Cadastro{
    private Map<Livro, Integer> estoque;
    private List<Livro> livrosDaLivraria;
    private List<Livro> listaDesejos;
    private List<Categoria> categoriasDaLivraria;
    private List<Autor> autoresDaLivraria;
    private List<Usuario> usuarios;

    //construtor
    public Livraria(List<Livro> livrosDaLivraria, List<Categoria> categoriasDaLivraria,
        List<Autor> autoresDaLivraria, List<Usuario> usuarios) {
        this.livrosDaLivraria = livrosDaLivraria;
        this.categoriasDaLivraria = categoriasDaLivraria;
        this.autoresDaLivraria = autoresDaLivraria;
        this.usuarios = usuarios;
        this.listaDesejos = new ArrayList<>();
    }

    //autenticar usuario, verificar se ele existe no sistema com os dados corretos
    public void autenticar(String email, String senha) throws AutenticacaoInvalida {
        for (Usuario usuario : usuarios) {
            if (usuario.getEmail().equals(email) && usuario.getSenha().equals(senha)) {
                return; //usuario autenticado, isso significa que o usuario foi encontrado na lista e seus dados estao corretos e correspomdem
            }
        }
        throw new AutenticacaoInvalida("o usuário não foi encontrado");
    }

    //metodo para adicionar livros na livraria
    //so vou poder liberar pra aluguel e compra so se o livro estiver adicionado na livraria
    @Override
    public void adicionar(Livro livro) {
        livrosDaLivraria.add(livro);
    }

    //é uma boa prática verificar explicitamente se o livro está na lista antes de realizar operações com ele
    public boolean isDisponivel(Livro livro){
        return livrosDaLivraria.contains(livro);
    }

    //metodo para adicionar um livro na lista de desejos
    public void adicionarLivroListaDesejos(Livro livro, List<Livro> listaDesejos) throws LivroIndisponivelExcepetion{
        if (isDisponivel(livro)) {
            listaDesejos.add(livro);
        }else{
            //tratamento de excessão livro nao esta presente na livraria
            throw new LivroIndisponivelExcepetion("o livro não está presente na livraria");
        }
    }

    //metodo para um usuario comprar um livro
    public void comprarLivro(Usuario usuario, Livro livro) throws LivroIndisponivelExcepetion, SaldoInsuficienteException{
        if (estoque.containsKey(livro)) { //verificando se o livro esta no estoque
            int qntDisponivel = estoque.get(livro); //qntDisponivel agora possui a mesma quantidade de livros do estoque
            if (qntDisponivel > 0) {
                if (usuario.getSaldo() >= livro.getPreco()) {
                    //a compra podera ser realizada
                    usuario.debitar(livro.getPreco()); //chamando o metodo debitar, passando como parametro o preço do livro
                    estoque.put(livro, qntDisponivel - 1); //removendo umm livro das quantidades disponiveis
                }else{
                    //adicionar tratamento de excessao (o saldo é insuficiente)
                    throw new SaldoInsuficienteException("o seu saldo não é suficiente para realizar a compra");
                }
            }else{
                //o livro nao esta disponivel no estoque
                throw new LivroIndisponivelExcepetion("o livro está indisponível no estoque");
            }
        }else{
            //o livro nao esta disponivel na livraria
            throw new LivroIndisponivelExcepetion("o livro não está presente na livraria");
        }
    }

    //metodo para um usuario alugar um livro (tempo dterminado)
    public void alugarLivro(Usuario usuario, Livro livro, int dias) throws SaldoInsuficienteException{
        double valorAluguel = livro.getPrecoAlugulPorDia() * dias;
        if (valorAluguel <= usuario.getSaldo()) {
            usuario.debitar(valorAluguel);
            //data da devolucao baseado np que o usuario vai pagar de aluguel
            LocalDate dataDevolucao = LocalDate.now().plusDays(dias); //data de hoje + qnt de dias que o usuario vai alugar
            //agora a data de devolucao deste livro esta selecionada, falta atribuir
            livro.setDataDevolucao(dataDevolucao); //atribuido a data de devolucao
        }else{
            //saldo indisponivel para compra
            throw new SaldoInsuficienteException("o seu saldo não é suficiente para compra");
        }
    }

    @Override
    public void remover(Livro livro) {
        livrosDaLivraria.remove(livro);
    }


    public void atualizarLivro(Livro livro, String titulo, double preco, Autor autor, String categoria) throws LivroIndisponivelExcepetion{
        for (Livro livroDaLivraria : livrosDaLivraria) {
            if (livroDaLivraria.equals(livro)) {
                livroDaLivraria.setPreco(preco);
                livroDaLivraria.setTitulo(titulo);
                livroDaLivraria.setAutorLivro(autor);
                livroDaLivraria.setCategoroiaLivro(null);
                return;
            }
        }
        //livro nao encontrado
        throw new LivroIndisponivelExcepetion("livro não encontrado");
    }

    public void atualizarUsuario(Usuario usuario, String nome, String email, String senha) throws UsuarioInvalido{
        for (Usuario usuarioDaLista : usuarios) {
            if (usuarioDaLista.equals(usuario)) {
                usuarioDaLista.setSenha(senha);
                usuarioDaLista.setEmail(email);
                usuarioDaLista.setSenha(senha);
                return;
            }
        }
        //usuario nao encontrado na lista
        throw new UsuarioInvalido("usuario não encontrado na lista");

    }
    
}
