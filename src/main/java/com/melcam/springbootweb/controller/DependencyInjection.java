package com.melcam.springbootweb.controller;

import com.melcam.springbootweb.services.IServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("inyeccion")
public class DependencyInjection {
    @Autowired
    @Qualifier("miServicio")
    private IServicio servicio;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("objeto", servicio.operacion());
        return "injection/index";
    }
}
