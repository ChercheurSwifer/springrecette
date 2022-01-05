package com.recettes.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document
public class Recette {

    @Id
    private String id;
    private String nom;
    private String description;
    private String auteur;

    @DBRef
    @Field("ingredients")
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Number> quantites;

    private class Etape {
        private String E_nom;
        private String E_desc;
        private String E_duree;
    }

    private ArrayList<Etape> etapes;

}
