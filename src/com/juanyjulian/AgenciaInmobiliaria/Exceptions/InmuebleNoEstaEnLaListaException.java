package com.juanyjulian.AgenciaInmobiliaria.Exceptions;

import com.juanyjulian.AgenciaInmobiliaria.dominio.Inmueble;

public class InmuebleNoEstaEnLaListaException extends RuntimeException{
    public InmuebleNoEstaEnLaListaException(Inmueble in){
        super("El inmueble  : "+in.toString()+"No está en la lista de inmuebles de la agencia");
    }
}
