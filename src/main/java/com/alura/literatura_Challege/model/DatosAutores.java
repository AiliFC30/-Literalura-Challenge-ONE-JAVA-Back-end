package com.alura.literatura_Challege.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosAutores
        (
                @JsonAlias("name") String name,
                @JsonAlias("birth_year") String birth_year,
                @JsonAlias("death_year") String death_year
        )
{

}
