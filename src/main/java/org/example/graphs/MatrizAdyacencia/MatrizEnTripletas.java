package org.example.graphs.MatrizAdyacencia;

import java.util.ArrayList;
import java.util.List;

//En esta clase instanciamos la clase tripletas para representar una matriz dispersa con la que trabajaremos para representar la matriz de incidencia
public class MatrizEnTripletas {
    private List<Tripleta> tripletas = new ArrayList<Tripleta>();

    public MatrizEnTripletas(Tripleta tripleta) {
        tripletas.add( tripleta );
    }

    public List<Tripleta> retornarFilas(){
        tripletas.forEach(t -> {
            System.out.println("Fila: "+ t.getFila() + "\nColumna: " + t.getColumna() + "\nValor: "+t.getValor());
        });

        return tripletas;
    }
}
