package com.example.demo.service;

import com.example.demo.model.Funcionario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService {

    private List<Funcionario> funcionarios = new ArrayList<>();
    private Long proximoId = 1L;

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public Funcionario criar(Funcionario funcionario) {
        funcionario.setId(proximoId++);
        funcionarios.add(funcionario);
        return funcionario;
    }

    public Funcionario atualizar(Long id, Funcionario funcionarioAtualizado) {
        Funcionario funcionarioExistente = buscarPorId(id);
        if (funcionarioExistente != null) {
            funcionarioExistente.setNome(funcionarioAtualizado.getNome());
            funcionarioExistente.setCpf(funcionarioAtualizado.getCpf());
            // Outros atributos a serem atualizados, se necessário

            return funcionarioExistente;
        }
        return null;
    }

    public boolean deletar(Long id) {
        Funcionario funcionario = buscarPorId(id);
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            return true;
        }
        return false;
    }

    public Funcionario buscarPorId(Long id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId().equals(id)) {
                return funcionario;
            }
        }
        return null;
    }

    public int qtdFuncionarios() {
        return funcionarios.size();
    }
}