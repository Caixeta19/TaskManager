package com.example.taskmanager.repository;

import com.example.taskmanager.model.Tarefas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefasRepository extends JpaRepository<Tarefas,Long> {
}
