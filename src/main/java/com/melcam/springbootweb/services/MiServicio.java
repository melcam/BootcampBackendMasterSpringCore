package com.melcam.springbootweb.services;

import org.springframework.stereotype.Service;

//@Service("miServicio")
public class MiServicio implements IServicio {
    @Override
    public String operacion() {
        return "Ejecutando inyección de dependencias";
    }
}
