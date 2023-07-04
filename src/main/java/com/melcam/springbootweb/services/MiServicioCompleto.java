package com.melcam.springbootweb.services;

import org.springframework.stereotype.Component;

@Component("miServicioCompleto")
public class MiServicioCompleto implements  IServicio{
    @Override
    public String operacion() {
        return "Ejecutando tareas desde MiServicioCompleto";
    }
}
