package com.juanyjulian.AgenciaInmobiliaria.Exceptions;

import com.juanyjulian.AgenciaInmobiliaria.dominio.Inmueble;

public class InmuebleNoArrendableException extends RuntimeException{
    public InmuebleNoArrendableException(Inmueble In){
        super("El inmueble : "+In.toString()+"No puede ser arrendado");
    }

}
