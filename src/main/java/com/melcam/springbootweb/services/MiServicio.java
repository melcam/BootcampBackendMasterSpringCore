package com.melcam.springbootweb.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class MiServicio implements IServicio {
    @Override
    public String operacion() {
        return "Ejecutando inyección de dependencias";
    }
}
