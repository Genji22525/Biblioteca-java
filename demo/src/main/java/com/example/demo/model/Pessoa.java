package com.example.demo.model;

public abstract class Pessoa {
    public String nome;
    Long id;
    private String cpf;

    public Pessoa() {
    }

    public Pessoa(String nome, Long id, String cpf) {
        this.nome = nome;
        this.id = id;
        this.cpf = cpf;
    }

    // Getters e setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}