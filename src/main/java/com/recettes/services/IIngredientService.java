package com.recettes.services;

import com.recettes.models.Ingredient;

import java.util.List;

public interface IIngredientService {

    public List<Ingredient> findAll();
    public Ingredient findOneById(String id);
    public Ingredient save(Ingredient recette);
    public Ingredient findByName(String nom);

}
