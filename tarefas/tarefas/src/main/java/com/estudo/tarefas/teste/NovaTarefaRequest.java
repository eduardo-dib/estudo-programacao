package com.estudo.tarefas.teste;

import jakarta.validation.constraints.NotBlank;

public record NovaTarefaRequest(@NotBlank String titulo) {}
