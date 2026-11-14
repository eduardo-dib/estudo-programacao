package com.estudo.tarefas.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class TarefaService {

    List<Tarefa> tarefas = new ArrayList<>();
    public List<Tarefa> listarTarefas(){

        tarefas = tarefas.stream().toList();
        return tarefas;
    }

    public Tarefa salvarTarefa(Tarefa tarefa){

        tarefas.add(tarefa);
        return tarefa;
    }
}
