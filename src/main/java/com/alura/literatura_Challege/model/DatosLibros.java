package com.alura.literatura_Challege.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosLibros (
        @JsonAlias("id") String id,
        @JsonAlias("title") String title,
        @JsonAlias("authors") String authors,
        @JsonAlias("subjects") String subjects,
        @JsonAlias("languages") String languages
)
{

}