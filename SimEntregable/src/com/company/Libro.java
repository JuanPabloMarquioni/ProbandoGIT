package com.company;

import java.util.ArrayList;
import java.util.List;

public class Libro {
    //atributos
    private String Nombre;
    private Integer ISNB;
    private String Autor;
    private ArrayList<Ejemplar> listaDeEjemplaresDisponibles = new ArrayList<>();


    //constructor
    public Libro(String nombre, Integer ISNB, String autor) {
        this.Nombre = nombre;
        this.ISNB = ISNB;
        this.Autor = autor;

    }

    //getter
    public String getNombre() {
        return Nombre;
    }

    public Integer getISNB() {
        return ISNB;
    }

    public String getAutor() {
        return Autor;
    }

    public List<Ejemplar> getlistaDeEjemplaresDisponibles() {
        return listaDeEjemplaresDisponibles;
    }


    //resp
    public void agregarEjemplar(Ejemplar unEjemplar) {
        listaDeEjemplaresDisponibles.add(unEjemplar);
    }

    public Boolean tieneEjemplaresDisponibles() {
        return listaDeEjemplaresDisponibles.size() < 0;
    }

    public Ejemplar prestarEjemplar() {
        return listaDeEjemplaresDisponibles.remove(0);

    }

    public void reigresarEjemplar(Ejemplar unEjemplar) {
        listaDeEjemplaresDisponibles.add(unEjemplar);
    }

}
//to String



