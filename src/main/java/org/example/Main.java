package org.example;

import org.example.graphs.LLAdyacencia.LLAdyacencia;
import org.example.graphs.LLAdyacencia.NodoGrafo;

public class Main {
    public static void main(String[] args) {
        NodoGrafo nodoActual;
        LLAdyacencia listaAdyacencia = new LLAdyacencia();

        listaAdyacencia.anadirNodoGrafo(1);
        listaAdyacencia.anadirNodoGrafo(3);
        listaAdyacencia.anadirNodoGrafo(4);
        listaAdyacencia.anadirNodoGrafo(5);

        listaAdyacencia.getLista();
    }
}