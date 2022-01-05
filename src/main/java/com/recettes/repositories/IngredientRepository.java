package com.recettes.repositories;

import com.recettes.models.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientRepository extends MongoRepository<Ingredient, String> {

    Ingredient findByName(String nom);

}
