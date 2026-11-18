package com.estudo.tarefas.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;


@Component
public class TarefaService {

    private final AtomicLong sequencia = new AtomicLong();
    private final Map<Long, Tarefa> tarefas = new ConcurrentHashMap<>();

    public Tarefa criar(String titulo) {
        Tarefa tarefa = new Tarefa(sequencia.incrementAndGet(), titulo, false);
        tarefas.put(tarefa.id(), tarefa);
        return tarefa;
    }

    public List<Tarefa> listar() {
        return List.copyOf(tarefas.values());
    }
}
