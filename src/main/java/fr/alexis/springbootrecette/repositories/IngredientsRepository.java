package fr.alexis.springbootrecette.repositories;

import fr.alexis.springbootrecette.models.Ingredients;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IngredientsRepository extends MongoRepository<Ingredients, String>
{
}
