package com.company;

import java.util.Date;

public class Prestamo  {
    private Ejemplar ejemplar;
    private Socio socio;
    private Date fechaDeldia = new Date();

    public Prestamo(Ejemplar ejemplar, Socio socio) {
        this.ejemplar = ejemplar;
        this.socio = socio;
        this.fechaDeldia = new Date();
    }

}
