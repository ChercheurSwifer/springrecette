package fr.alexis.springbootrecette.services;

import fr.alexis.springbootrecette.models.Recette;
import fr.alexis.springbootrecette.repositories.RecetteRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class RecetteService {

    private RecetteRepository repository;

    public RecetteService(RecetteRepository repository) {
        this.repository = repository;
    }


    public List<Recette> findAll() {
        return repository.findAll();
    }


    public Recette insert(Recette entity) {
        return repository.insert(entity);
    }

    public Recette save(Recette entity) {
        return repository.save(entity);
    }

    public Recette findById(String id) {
        return repository.findById(id)
                .orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, "L'id de la recette : "+id+" n'existe pas."));
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }
}
