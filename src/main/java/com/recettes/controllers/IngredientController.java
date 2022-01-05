package com.recettes.controllers;

import com.recettes.models.Ingredient;
import com.recettes.services.IngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(
        value = "ingredients"
)
@CrossOrigin
public class IngredientController {

    private IngredientService ingredientService;


    public IngredientController(
            IngredientService ingredientService
    ) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/findAll")
    public List<Ingredient> findAll() {
        return this.ingredientService.findAll();
    }

    @GetMapping("/get/{id}")
    public Ingredient findOneById(@PathVariable String id) {
        return this.ingredientService.findOneById(id);
    }

    @GetMapping("/get/{nom}")
    public Ingredient findOneByName(@PathVariable String name) {
        return this.ingredientService.findByName(name);
    }

}
