package com.example.taskmanager.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tarefas")
public class Tarefas {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String titulo;

 private String descricao;

 private boolean realizado;

 @OneToOne
 @JoinColumn(name = "prioridades_id")
 private Prioridade prioridade;

}


