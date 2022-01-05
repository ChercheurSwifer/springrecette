package com.recettes.controllers;

import com.recettes.models.Recette;
import com.recettes.services.RecetteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
        value = "recettes"
)
@CrossOrigin
public class RecetteController {

    private RecetteService recetteService;


    public RecetteController(
            RecetteService recetteService
    ) {
        this.recetteService = recetteService;
    }

    @GetMapping("/findAll")
    public List<Recette> findAll() {
        return this.recetteService.findAll();
    }

    @GetMapping("/get/{id}")
    public Recette findOneById(@PathVariable String id) {
        return this.recetteService.findOneById(id);
    }

    @GetMapping("/get/{nom}")
    public Recette findOneByName(@PathVariable String name) {
        return this.recetteService.findByName(name);
    }

}
