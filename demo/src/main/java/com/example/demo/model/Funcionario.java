package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Pessoa {
    private String cpf;
    private List<Livro> livrosRegistrados = new ArrayList<>();

    public Funcionario() {
        super(); // Chamada ao construtor padrão da superclasse Pessoa
    }

    public Funcionario(String nome, Long id, String cpf) {
        super(); // Chamada ao construtor da superclasse Pessoa com os parâmetros nome e id
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void adicionarLivro(Livro livro) {
        livrosRegistrados.add(livro);
        System.out.println("Livro adicionado com sucesso: " + livro);
    }

    public void registrarLivros(List<Livro> livros) {
        livrosRegistrados.addAll(livros);
        System.out.println("Livros registrados com sucesso.");
    }
}