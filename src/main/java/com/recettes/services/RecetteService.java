package com.recettes.services;

import com.recettes.models.Recette;
import com.recettes.repositories.RecetteRepository;

import java.util.List;

public class RecetteService implements IRecetteService {

    public RecetteRepository recetteRepository;

    public RecetteService(RecetteRepository recetteRepository) {
        this.recetteRepository = recetteRepository;
    }

    public List<Recette> findAll() {
        return this.recetteRepository.findAll();
    }

    public Recette findOneById(String id) {
        return this.recetteRepository.findById(id).orElse(null);
    }


    public Recette save(Recette recette) {
        return this.recetteRepository.save(recette);
    }

    public Recette findByName(String name) {
        return this.recetteRepository.findByName(name);
    }
}
