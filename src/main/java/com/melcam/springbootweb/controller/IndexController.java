package com.melcam.springbootweb.controller;

import com.melcam.springbootweb.models.Usuario;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/app")
public class IndexController {
    @GetMapping({"/index", "/", "/home"})
    public ModelAndView index(ModelAndView model) {
        model.addObject("titulo", "hola mundo desde el controlador");
        model.setViewName("index");
        return model;
    }

    @GetMapping("/perfil")
    public String usuarioPerfil(Model model) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Rommel");
        usuario.setApellido("Melcam");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", "Perfil de usuario ".concat(usuario.getNombre()));
        return "usuarioPerfil";
    }

    @GetMapping("/listar")
    public String listar(Model model) {


        model.addAttribute("titulo", "Lista de usuario");
        //model.addAttribute("usuarios", usuarios);
        return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> poblarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Rommel", "Melcam", "melcam@gmail.com"));
        usuarios.add(new Usuario("Ricardo", "Carvajal", "rica@gmail.com"));
        usuarios.add(new Usuario("Ever", "Rondon", "ever@gmail.com"));
        return usuarios;
    }
}
