package com.company;

import java.util.ArrayList;

public abstract class Socio {
    //atributos
    private String Nombre;
    private String Apellido;
    private Integer NumeroDeIdentificacion;
    private ArrayList<Ejemplar> listaDeEjemplaresRetirados = new ArrayList<>();
    Integer CantidadMaximaARetirar;


//cost.

    public  Socio(String nombre, String apellido, Integer numeroDeIdentificacion,Integer CantidadMaximaARetirar) {
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.NumeroDeIdentificacion = numeroDeIdentificacion;
        this.CantidadMaximaARetirar = CantidadMaximaARetirar;
    }

    public abstract String getNombre();

    public abstract String getApellido();

    public abstract Integer getNumeroDeIdentificacion();

    public ArrayList<Ejemplar> getListaDeEjemplaresRetirados() {
        return listaDeEjemplaresRetirados;
    }

    //metodo
    public boolean tienCupoDisponible(){
        return listaDeEjemplaresRetirados.size() <= CantidadMaximaARetirar;
    }
    public void tomarPrestadoUnEjemplar(Ejemplar unEjemplar){
        listaDeEjemplaresRetirados.add(unEjemplar);

    }
    public void devolverUnEjemplar(Ejemplar unEjemplar){
        listaDeEjemplaresRetirados.remove(unEjemplar);
    }


}

