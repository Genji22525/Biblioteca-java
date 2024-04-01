package com.example.demo.service;

import com.example.demo.model.Livro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivroService {

    private List<Livro> livros = new ArrayList<>();

    public List<Livro> listarLivros() {
        return livros;
    }

    public Livro adicionarLivro(Livro livro) {
        livros.add(livro);
        return livro;
    }

    public Livro atualizarLivro(Livro livro) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId().equals(livro.getId())) {
                livros.set(i, livro);
                return livro;
            }
        }
        return null;
    }

    public boolean deletarLivro(Livro livro) {
        return livros.remove(livro);
    }

    public void comprarLivros(int quantidade) {
        // Lógica para compra de livros (adicionar à lista de livros)
        for (int i = 0; i < quantidade; i++) {
            Livro livro = new Livro("Livro " + (livros.size() + 1), Long.valueOf(livros.size() + 1), "CPF");
            livros.add(livro);
        }
    }

    public void registrarLivros(List<Livro> novosLivros) {
        livros.addAll(novosLivros);
    }

    public void renovarAluguel() {
        // Lógica para renovar aluguel de livros (aqui você pode implementar a lógica específica de renovação)
    }
}