package com.juanyjulian.AgenciaInmobiliaria.Exceptions;

import com.juanyjulian.AgenciaInmobiliaria.dominio.Inmueble;

public class InmuebleNoArrendadoParaDevolucion extends RuntimeException{
    public InmuebleNoArrendadoParaDevolucion(Inmueble In){
        super("El inmueble : "+ In.toString()+ "No puede ser devuelto porque no ha sido arrendado");
    }
}

