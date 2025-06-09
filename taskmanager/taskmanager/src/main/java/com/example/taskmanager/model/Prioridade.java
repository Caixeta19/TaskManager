package com.example.taskmanager.model;

import com.example.taskmanager.model.Enum.NiveisPrioridade;
import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;


@Entity
@Data
public class Prioridade {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String descricao;

    @Enumerated(EnumType.STRING)
    private NiveisPrioridade preferencia;

    @OneToOne(mappedBy = "prioridade")
    private Tarefas tarefas;
}
