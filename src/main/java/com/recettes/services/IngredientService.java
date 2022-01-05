package com.recettes.services;

import com.recettes.models.Ingredient;
import com.recettes.repositories.IngredientRepository;

import java.util.List;

public class IngredientService implements IIngredientService{

    public IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> findAll() {
        return this.ingredientRepository.findAll();
    }

    public Ingredient findOneById(String id) {
        return this.ingredientRepository.findById(id).orElse(null);
    }

    public Ingredient save(Ingredient ingredient) {
        return this.ingredientRepository.save(ingredient);
    }

    public Ingredient findByName(String nom) {
        return this.ingredientRepository.findByName(nom);
    }
}
