package com.example.taskmanager.repository;

import com.example.taskmanager.model.Prioridade;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PrioridadeRepository extends JpaRepository<Prioridade, UUID> {
}
