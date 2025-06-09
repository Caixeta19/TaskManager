package com.example.taskmanager.service;

import com.example.taskmanager.model.Prioridade;
import com.example.taskmanager.model.Tarefas;
import com.example.taskmanager.repository.PrioridadeRepository;
import com.example.taskmanager.repository.TarefasRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TarefasService {


    private final TarefasRepository tarefasRepository;
    private final PrioridadeRepository prioridadeRepository;

//    public TarefasService(TarefasRepository tarefasRepository) {
//        this.tarefasRepository = tarefasRepository;
//    } //construtor

    public List<Tarefas> listarTarefas(){
        return tarefasRepository.findAll();
    }

    public void cadastrarTarefas(Tarefas tarefas, UUID prioridadesId) {
        Prioridade prioridade = prioridadeRepository.findById(prioridadesId)
                        .orElseThrow(()-> new RuntimeException("Prioridade inexistente"));
        tarefas.setPrioridade(prioridade);
        tarefasRepository.save(tarefas);
    }

    public void marcarComoConcluido(Long id){
        Tarefas tarefa = tarefasRepository.findById(id).orElseThrow();
        tarefa.setRealizado(!tarefa.isRealizado());
        tarefasRepository.save(tarefa);
    } // esse metodo marca a tarefa como concluida.

}
