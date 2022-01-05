package com.recettes;

import com.recettes.repositories.RecetteRepository;
import com.recettes.services.RecetteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RecetteConfiguration {

    @Bean
    public RecetteService recetteService(RecetteRepository recetteRepository) {
        return new RecetteService(recetteRepository);
    }






}
