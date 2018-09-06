package com.company;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> listaDeLibros = new ArrayList<>();
    private ArrayList<Socio> listaDeSocios = new ArrayList<>();
    private ArrayList<Prestamo> listaDePrestamos = new ArrayList<>();

    public Biblioteca(ArrayList<Libro> listaDeLibros, ArrayList<Socio> listaDeSocios, ArrayList<Prestamo> listaDePrestamos) {
        this.listaDeLibros = listaDeLibros;
        this.listaDeSocios = listaDeSocios;
        this.listaDePrestamos = listaDePrestamos;
    }

    public ArrayList<Libro> getListaDeLibros() {
        return listaDeLibros;
    }

    public ArrayList<Socio> getListaDeSocios() {
        return listaDeSocios;
    }

    public ArrayList<Prestamo> getListaDePrestamos() {
        return listaDePrestamos;
    }

    //metodos
    public void prestar(Integer isbn, Integer numeroDeIdentificacion) {
        Libro unlibro = null;
        Socio unSocio = null;

        for (Integer i = 0; i < listaDeLibros.size(); i++) {
            if (listaDeLibros.get(i).getISNB().equals(isbn)) {
                unlibro = listaDeLibros.get(i);
            }
        }

        if (unlibro == null) {
            System.out.println("No se puede prestar porque no hay ejemplares disponibles");
            return;
        }

        for (Integer i = 0; i < listaDeSocios.size(); i++) {
            if (listaDeSocios.get(i).getNumeroDeIdentificacion().equals(numeroDeIdentificacion)) {
                unSocio = listaDeSocios.get(i);
            }
        }

        if (unSocio == null) {
            System.out.println("No se puede prestar porque no existe el socio");
            return;
        }

        if (unlibro.tieneEjemplaresDisponibles() && unSocio.tienCupoDisponible()) {
            Ejemplar ejemplarPrestado = unlibro.prestarEjemplar();
            unSocio.tomarPrestadoUnEjemplar(ejemplarPrestado);
            Prestamo unPrestamo = new Prestamo(ejemplarPrestado, unSocio);
            listaDePrestamos.add(unPrestamo);
            System.out.println("Se presto el libro: " + unlibro + " al cliente " + unSocio);
        } else {
            if (!unSocio.tienCupoDisponible()) {
                System.out.println("El socio no puede retirar mas ejemplares");
            }
            //   if (!unlibro.tieneEjemplaresDisponibles()) {
            //  System.out.println("No se puede prestar porque no hay ejemplares disponibles");
            else {
                System.out.println("No hay ejemplares disponibles para retirar");
            }
        }
    }

    public void devolver(Ejemplar unEjemplar, Integer nuemroDeIdentificacion) {
        Libro unlibro = null;
        Socio unSocio = null;
        for (Integer i = 0; i < listaDeSocios.size(); i++) ;


    }
}