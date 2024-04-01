package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Bibliotecario extends Funcionario {
    private List<Livro> livros = new ArrayList<>();
    private int totalLivrosBiblioteca = 200; // Total de livros na biblioteca
    private int livrosAlugados = 25; // Livros já alugados inicialmente

    public Bibliotecario(String nome, Long id, String cpf, int livrosAlugadosInicial, int alugadosInicial) {
    }

    public Bibliotecario(String nome, Long id, String cpf) {
        super(nome, id, cpf);
    }

    public void comprarLivros(int quantidade) {
        totalLivrosBiblioteca += quantidade;
        System.out.println("Livros comprados com sucesso. Novo total: " + totalLivrosBiblioteca);
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
        totalLivrosBiblioteca++;
        System.out.println("Livro adicionado com sucesso à biblioteca.");
    }

    public void registrarLivros(List<Livro> novosLivros) {
        livros.addAll(novosLivros);
        totalLivrosBiblioteca += novosLivros.size();
        System.out.println("Novos livros registrados com sucesso. Novo total: " + totalLivrosBiblioteca);
    }

    // Outros métodos da classe, se necessário
}