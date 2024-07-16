package com.alura.literatura_Challege;

import com.alura.literatura_Challege.model.DatosAutores;
import com.alura.literatura_Challege.model.DatosLibros;
import com.alura.literatura_Challege.model.languages;
import com.alura.literatura_Challege.principal.Principal;
import com.alura.literatura_Challege.service.ConvierteDatos;
import com.alura.literatura_Challege.service.consumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LiteraturaChallegeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaChallegeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
        Principal principlal = new Principal();



	}
}
