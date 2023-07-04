package com.melcam.springbootweb;

import com.melcam.springbootweb.services.IServicio;
import com.melcam.springbootweb.services.MiServicio;
import com.melcam.springbootweb.services.MiServicioCompleto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean("miServicio")
    public IServicio registrarMiServicio() {

        return new MiServicio();
    }

    @Bean("miServicioCompleto")
    public IServicio registrarMiServicioCompleto() {

        return new MiServicioCompleto();
    }

}
