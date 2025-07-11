/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ian.portfolio.controller;

import com.ian.portfolio.model.Projeto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class ProjetoController {

    @GetMapping("/projetos")
    public String listarProjetos(Model model) {
        List<Projeto> projetos = Arrays.asList(
            new Projeto("Sistema de Biblioteca", "Projeto Java com JavaFX e MySQL.", "https://github.com/ian-martins"),
            new Projeto("Player de Vídeo", "App Java Swing para reprodução de MP4 com VLCJ.", "https://github.com/ian-martins"),
            new Projeto("API de Filmes", "API REST usando Spring Boot com CRUD completo.", "https://github.com/ian-martins")
        );

        model.addAttribute("projetos", projetos);
        return "projetos"; // vai carregar projetos.html
    }   
}
