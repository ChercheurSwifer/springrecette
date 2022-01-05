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
public class Etape
{
    @Id
    private Integer id;

    private Integer numero;
    private String description;
    private String duree;
}
