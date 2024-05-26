package com.juanyjulian.AgenciaInmobiliaria.Exceptions;

import com.juanyjulian.AgenciaInmobiliaria.dominio.Inmueble;

public class InmuebleYaArrendadoException extends RuntimeException{
    public InmuebleYaArrendadoException(Inmueble Arrendado){
        super("El inmueble : "+Arrendado.toString()+"Ya está arrendado");
    }
}
