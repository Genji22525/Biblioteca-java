package com.example.demo.model;

@Entity
public class Livro {
    private static final int TOTAL_LIVROS_BIBLIOTECA = 200; // Total de livros na biblioteca
    private static final int LIVROS_ALUGADOS_INICIAL = 25; // Livros já alugados inicialmente
    private int livrosPorSessao = 40;
    private double preco = 23.50;
    private int tempoAluguel = 14;

    public Livro(String s, Long aLong, String cpf) {
    }

    public int getLivrosPorSessao() {
        return livrosPorSessao;
    }

    public void setLivrosPorSessao(int livrosPorSessao) {
        this.livrosPorSessao = livrosPorSessao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getTempoAluguel() {
        return tempoAluguel;
    }

    public void setTempoAluguel(int tempoAluguel) {
        this.tempoAluguel = tempoAluguel;
    }

    public void renovarAluguel() {
        this.tempoAluguel += 14; // Adiciona 2 semanas ao tempo de aluguel
    }

    public int getTotalLivrosBiblioteca() {
        return TOTAL_LIVROS_BIBLIOTECA;
    }

    public int getLivrosAlugadosInicial() {
        return LIVROS_ALUGADOS_INICIAL;
    }

    public Object getId() {

        return null;
    }

}