package com.estudo.tarefas.teste;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    TarefaService tarefasService;

    @GetMapping
    public List<Tarefa> listarTarefas(){
        return tarefasService.listarTarefas();
    }

    @PostMapping
    public Tarefa salvarTarefa(Tarefa tarefa){
        return tarefasService.salvarTarefa(tarefa);
    }


}
