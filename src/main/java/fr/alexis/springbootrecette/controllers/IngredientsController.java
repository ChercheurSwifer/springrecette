package fr.alexis.springbootrecette.controllers;

import fr.alexis.springbootrecette.models.Ingredients;
import fr.alexis.springbootrecette.models.Recette;
import fr.alexis.springbootrecette.services.IngredientsService;
import fr.alexis.springbootrecette.services.RecetteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ingredients")
@CrossOrigin
public class IngredientsController {

    private IngredientsService service;

    public IngredientsController(IngredientsService service) {
        this.service = service;
    }

    @GetMapping("")
    public List<Ingredients> findAll() {
        return service.findAll();
    }

    @PostMapping("")
    public Ingredients insert(@RequestBody Ingredients entity) {
        return service.insert(entity);
    }

    @PutMapping("")
    public Ingredients save(@RequestBody Ingredients entity) {
        return service.save(entity);
    }

    @GetMapping("{id}")
    public Ingredients findById(@PathVariable Ingredients id) {
        return service.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Ingredients id) {
        service.deleteById(id);
    }
}
