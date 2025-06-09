package com.example.taskmanager.service;


import com.example.taskmanager.model.Prioridade;
import com.example.taskmanager.repository.PrioridadeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrioridadeService {

    private final PrioridadeRepository repository;

    public List<Prioridade> listarprioridades(){
        return repository.findAll();
    }


    public void cadastrarprioridade(Prioridade prioridade){
        repository.save(prioridade);
    }



}
