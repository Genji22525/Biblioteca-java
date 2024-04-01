package com.example.demo.controller;


import com.example.demo.model.Livro;
import com.example.demo.service.LivroService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livros")
public class LivroController {

    @Autowired
    private LivroService livroService;

    @GetMapping
    public List<Livro> listarLivros() {
        return livroService.listarLivros();
    }

    @PostMapping
    public ResponseEntity<Livro> adicionarLivro(@Valid @RequestBody Livro livro) {
        Livro novoLivro = livroService.adicionarLivro(livro);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoLivro);
    }

    @PutMapping
    public ResponseEntity<Livro> atualizarLivro(@Valid @RequestBody Livro livro) {
        Livro livroAtualizado = livroService.atualizarLivro(livro);
        if (livroAtualizado != null) {
            return ResponseEntity.ok(livroAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping
    public ResponseEntity<String> deletarLivro(@RequestBody Livro livro) {
        boolean deletado = livroService.deletarLivro(livro);
        if (deletado) {
            return ResponseEntity.ok("Livro deletado com sucesso.");
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/comprar")
    public ResponseEntity<String> comprarLivros(@RequestParam int quantidade) {
        livroService.comprarLivros(quantidade);
        return ResponseEntity.ok("Livros comprados com sucesso.");
    }

    @PostMapping("/registrar")
    public ResponseEntity<String> registrarLivros(@RequestBody List<Livro> novosLivros) {
        livroService.registrarLivros(novosLivros);
        return ResponseEntity.ok("Livros registrados com sucesso.");
    }

    @PostMapping("/renovar")
    public ResponseEntity<String> renovarAluguel() {
        livroService.renovarAluguel();
        return ResponseEntity.ok("Aluguel renovado com sucesso.");
    }
}