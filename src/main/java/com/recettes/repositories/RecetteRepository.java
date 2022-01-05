package com.recettes.repositories;

import com.recettes.models.Recette;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecetteRepository extends MongoRepository< Recette, String> {

    Recette findByName(String nom);

}
