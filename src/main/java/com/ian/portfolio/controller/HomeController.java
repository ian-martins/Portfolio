/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ian.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author ianma
 */

@Controller
public class HomeController {

    @GetMapping("/")
    public String index() {
        return "index";  // nome do arquivo HTML em templates sem a extensão
    }
}