package com.company;

public class Ejemplar {
    //atributos
    private Libro libro;
    private Integer numeroDeEdicion;
    private String ubicacion;
//const
    public Ejemplar(Libro libro, Integer numeroDeEdicion, String ubicacion) {
        this.libro = libro;
        this.numeroDeEdicion = numeroDeEdicion;
        this.ubicacion = ubicacion;
    }

    public Libro getLibro() {
        return libro;
    }

    public Integer getNumeroDeEdicion() {
        return numeroDeEdicion;
    }

    public String getUbicacion() {
        return ubicacion;
    }
}