package com.estudo.tarefas.teste;

import jakarta.validation.constraints.NotBlank;

public record Tarefa(Long id, @NotBlank String titulo, boolean concluida) {
    public Tarefa(Long id, String titulo) {
        this(id, titulo, false);
    }
}
