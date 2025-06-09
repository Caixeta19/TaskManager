package com.example.taskmanager.controller;

import com.example.taskmanager.model.Tarefas;
import com.example.taskmanager.service.PrioridadeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.example.taskmanager.service.TarefasService;

import java.util.UUID;

@Controller
@RequestMapping("/tarefas")
@RequiredArgsConstructor
public class TarefasController {

    private final TarefasService tarefasService;
    private final PrioridadeService prioridadeService;

    @GetMapping
    public String mostrarFormulario(Model model) {
        model.addAttribute("tarefas", tarefasService.listarTarefas());
        model.addAttribute("prioridades", prioridadeService.listarprioridades());
        return "tarefas";
    }

    @PostMapping
    public String salvarTarefa(@ModelAttribute Tarefas tarefas,
                               @RequestParam UUID prioridadeId) {
        tarefasService.cadastrarTarefas(tarefas, prioridadeId);
        return "redirect:/tarefas";
    }

    @PostMapping("/status")
    public String marcarComoConluida(@RequestParam Long id){
        tarefasService.marcarComoConcluido(id);
        return "redirect:/tarefas";
    }
}
