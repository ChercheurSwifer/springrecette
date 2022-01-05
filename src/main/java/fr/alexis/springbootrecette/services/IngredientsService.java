package fr.alexis.springbootrecette.services;

import fr.alexis.springbootrecette.models.Ingredients;
import fr.alexis.springbootrecette.models.Recette;
import fr.alexis.springbootrecette.repositories.IngredientsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class IngredientsService {

    private IngredientsRepository repository;

    public IngredientsService(IngredientsRepository repository) {
        this.repository = repository;
    }


    public List<Ingredients> findAll() {
        return repository.findAll();
    }


    public Ingredients insert(Ingredients entity) {
        return repository.insert(entity);
    }

    public Ingredients save(Ingredients entity) {
        return repository.save(entity);
    }

    public Ingredients findById(Ingredients id) {
        return repository.findById(String.valueOf(id))
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "L'id de la recette : "+id+" n'existe pas."));
    }

    public void deleteById(Ingredients id) {
        repository.deleteById(String.valueOf(id));
    }
}
