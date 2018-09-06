package com.company;

import java.util.ArrayList;

public class SocioVip extends Socio {
//atri
    private Integer valorCuotaMensual;
//cont
    public SocioVip(String nombre, String apellido, Integer numeroDeIdentificacion,Integer valorCuotaMensual) {
        super(nombre, apellido, numeroDeIdentificacion,15);
       this.valorCuotaMensual = valorCuotaMensual;
    }
//getter
    public Integer getCuota() {
        return valorCuotaMensual;
    }
    @Override
    public String getNombre() {
        return null;
    }

    @Override
    public String getApellido() {
        return null;
    }

    @Override
    public Integer getNumeroDeIdentificacion() {
        return null;
    }





}
