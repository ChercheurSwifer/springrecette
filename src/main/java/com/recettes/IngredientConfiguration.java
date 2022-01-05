package com.recettes;

import com.recettes.repositories.IngredientRepository;
import com.recettes.services.IngredientService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IngredientConfiguration {

    @Bean
    public IngredientService ingredientService(IngredientRepository ingredientRepository) {
        return new IngredientService(ingredientRepository);
    }


}
