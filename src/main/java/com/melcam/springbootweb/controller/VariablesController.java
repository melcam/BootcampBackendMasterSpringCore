package com.melcam.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("variables")
public class VariablesController {
    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("titulo", "Enviando parametros a la ruta");

        return "variables/index";
    }

    @GetMapping("/string/{texto}")
    public String variables(@PathVariable String texto, Model model) {
        model.addAttribute("titulo", "Recibir parametros de la ruta");
        model.addAttribute("resultado", "El texto enviado por la ruta es " + texto);

        return "variables/ver";
    }

    @GetMapping("/string/{texto}/{numero}")
    public String variables(@PathVariable String texto,@PathVariable Integer numero, Model model) {
        model.addAttribute("titulo", "Recibir parametros de la ruta");
        model.addAttribute("resultado", "El texto enviado por la ruta es " + texto+ " con el numero "+numero);

        return "variables/ver";
    }
}
