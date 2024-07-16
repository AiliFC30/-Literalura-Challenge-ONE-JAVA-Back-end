package com.alura.literatura_Challege.principal;

import com.alura.literatura_Challege.model.DatosLibros;
import com.alura.literatura_Challege.model.languages;
import com.alura.literatura_Challege.service.ConvierteDatos;
import com.alura.literatura_Challege.service.consumoApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private Scanner teclado = new Scanner(System.in);
    private consumoApi consumoAPI = new consumoApi();
    private final String URL_BASE = "https://gutendex.com/books";
    private ConvierteDatos conversor = new ConvierteDatos();

    public void muestraMenu() {
        var opcion = -1;
        System.out.println("¡Bienvenidos!\n");
        System.out.println("Biblioteca\n");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
        while (opcion != 6){
            Menu();
            System.out.println("Escriba el número deseado del menú para consultar:");
            var select = Integer.valueOf(teclado.nextLine());
            opcion = select;
            switch (select) {
                case 1:
                    listarLibroTitulo();
                    break;
                case 2:
                    listarLibrosRegistrados();
                    break;
                case 3:
                    listarAutoresRegistrados();
                    break;
                case 4:
                    listarAutoresVivos();
                    break;
                case 5:
                    listarLibrosIdioma();
                    break;
                case 6:
                    System.out.println("Saliendo de la aplicación ....\n");
                    break;
                default:
                    System.out.println("Opción inválida\n");
            }
        }
    }

    private void listarLibrosIdioma() {
        System.out.println("Escribe el idioma de los libros que deseas listar");
        var idioma = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE+"?languages="+idioma);
        var datos = conversor.obtenerDatos(json, DatosLibros.class);
    }

    private void listarAutoresVivos() {
        var json = consumoAPI.obtenerDatos(URL_BASE+"/1");
    }

    private void listarAutoresRegistrados() {
    }

    private void listarLibrosRegistrados() {
    }

    private void listarLibroTitulo() {
        List<languages> languagesList = new ArrayList<>();
        var datos = 35;
        for(int i = 1; i < datos; i++){
			var json = consumoAPI.obtenerDatos("https://gutendex.com/books?languages=en");
			var datosLanguages = conversor.obtenerDatos(json,languages.class);
			languagesList.add(datosLanguages);
		}
		languagesList.forEach(System.out::println);
    }


    private static void Menu() {
        System.out.println("Menu: \n");
        System.out.println("1- Buscar libro por titulo \n");
        System.out.println("2- Listar libros registrados \n");
        System.out.println("3- Listar Autores retegistrados \n");
        System.out.println("4- Listar Autores vivos en un determinado año \n");
        System.out.println("5- Listar libros por idioma  \n");
        System.out.println("6- Salir \n");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------ \n");
    }
}
