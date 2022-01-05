package fr.alexis.springbootrecette.repositories;

import fr.alexis.springbootrecette.models.Recette;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RecetteRepository extends MongoRepository<Recette, String> {
}
