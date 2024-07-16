package com.alura.literatura_Challege.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class consumoApi {
    public String obtenerDatos(String url){
        final String URL_BASE = url;

        URI direccion = URI.create(URL_BASE );
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;
         try {
                 response = client
                          .send(request, HttpResponse.BodyHandlers.ofString());
         } catch ( InterruptedException | IOException e) {
             throw new RuntimeException(e);
         }

         String json = response.body();
            // System.out.println(json);
         return json;

    }
}
