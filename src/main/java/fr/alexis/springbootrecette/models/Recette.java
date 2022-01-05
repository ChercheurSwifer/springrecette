package fr.alexis.springbootrecette.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Recette{
    @Id
    private Integer id;

    private String nom;
    private String description;
    private String dateSortie;
    private String auteur;
    private Etape etape;
    private Ingredients ingredients;

}


