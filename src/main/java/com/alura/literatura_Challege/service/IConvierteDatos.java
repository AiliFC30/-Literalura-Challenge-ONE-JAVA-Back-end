package com.alura.literatura_Challege.service;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class <T> clase);
}
