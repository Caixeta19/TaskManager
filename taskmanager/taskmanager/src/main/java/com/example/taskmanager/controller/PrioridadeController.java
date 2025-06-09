package com.example.taskmanager.controller;

import com.example.taskmanager.model.Prioridade;
import com.example.taskmanager.service.PrioridadeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prioridades")
@RequiredArgsConstructor
public class PrioridadeController {

    private final PrioridadeService service;

    @GetMapping
    public String listarprioridades(Model model){
        model.addAttribute("prioridades",service.listarprioridades());
        return "prioridades";
    }

    @PostMapping
    public String cadastrarprioridade(@ModelAttribute Prioridade prioridade){
        service.cadastrarprioridade(prioridade);
        return "redirect:/prioridades";
    }











}
