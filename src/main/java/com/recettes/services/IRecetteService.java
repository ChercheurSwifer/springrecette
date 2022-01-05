package com.recettes.services;

import com.recettes.models.Recette;

import java.util.List;

public interface IRecetteService {

    public List<Recette> findAll();
    public Recette findOneById(String id);
    public Recette save(Recette recette);
    public Recette findByName(String nom);

}
