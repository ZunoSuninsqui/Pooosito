package com.juanyjulian.AgenciaInmobiliaria.dominio;

import java.util.List;

public class Agencia {
    private String nombre;
    public Agencia(String nombre){
        this.nombre = nombre;
    }
    
    public boolean arrendar(Inmueble Arrendable){
        return false;
    }
    public boolean devolver(Inmueble Arrendable) {
        return false;
    }
    public boolean vender( Inmueble inmueble){
        return false;
    }
    public List<Inmueble> getArrendablesDisponibles(){
        return null;
    }
    public List<Inmueble> getArrendados(){
        return null;
    }
}
