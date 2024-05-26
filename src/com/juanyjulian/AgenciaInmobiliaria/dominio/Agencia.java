package com.juanyjulian.AgenciaInmobiliaria.dominio;

import com.juanyjulian.AgenciaInmobiliaria.Exceptions.InmuebleNoArrendableException;
import com.juanyjulian.AgenciaInmobiliaria.Exceptions.InmuebleNoArrendadoParaDevolucion;
import com.juanyjulian.AgenciaInmobiliaria.Exceptions.InmuebleNoEstaEnLaListaException;
import com.juanyjulian.AgenciaInmobiliaria.Exceptions.InmuebleYaArrendadoException;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String nombre;

    List<Inmueble> inmuebles;

    public Agencia(String nombre){
        this.nombre = nombre;
        this.inmuebles = new ArrayList<>();
    }

    public void agregarInmueble(Inmueble inmueble){
        inmuebles.add(inmueble);
    }
    public boolean arrendar(Inmueble Arrendable){
        if (inmuebles.contains(Arrendable)){
            for(Inmueble inmueble : inmuebles) {
                if (inmueble.equals(Arrendable) && Arrendable instanceof Arrendable) {
                    if (!inmueble.isArrendado()){
                        System.out.println("El inmueble está listo para ser arrendado por un precio de "+inmueble.getValorArriendo());
                        inmueble.setArrendado(true);
                        return true;
                    }else{
                        throw new InmuebleYaArrendadoException(Arrendable);
                    }
                }else{
                    throw new InmuebleNoArrendableException(Arrendable);
                }
            }
        }else{
            throw new InmuebleNoEstaEnLaListaException(Arrendable);
        }
        return false;
    }
    public boolean devolver(Inmueble Arrendable) {
        if (inmuebles.contains(Arrendable)){
            for(Inmueble inmueble : inmuebles) {
                if (inmueble.equals(Arrendable) && Arrendable instanceof Arrendable) {
                    if (inmueble.isArrendado()){
                        System.out.println("El inmueble está listo para ser devuelto");
                        if (inmueble instanceof Casa) ((Casa) inmueble).arrendar();
                        if (inmueble instanceof Apartamento) ((Apartamento) inmueble).arrendar();
                        return true;
                    }else{
                        throw new InmuebleNoArrendadoParaDevolucion(Arrendable);
                    }
                }else{
                    throw new InmuebleNoArrendableException(Arrendable);
                }
            }
        }else{
            throw new InmuebleNoEstaEnLaListaException(Arrendable);
        }
        return false;
    }
    public boolean vender(Inmueble inmueble){
        if (inmuebles.contains(inmueble)){
            for(Inmueble in:inmuebles){
                if (inmueble.equals(in)){
                    if (in instanceof Arrendable && in.isArrendado()){
                        throw new InmuebleYaArrendadoException(in);
                    }else{
                        System.out.println("Inmueble puede ser vendido por "+in.getValorVenta()+"Borrandolo de la lista");
                        inmuebles.remove(in);
                        return true;
                    }
                }
            }
        }else{
            throw new InmuebleNoEstaEnLaListaException(inmueble);
        }
        return false;
    }
    public List<Inmueble> getArrendablesDisponibles(){
        List<Inmueble> aux = null;
        for (Inmueble in : inmuebles){
            if (in instanceof Arrendable && !in.isArrendado()){
                aux.add(in);
            }
        }
        return aux;
    }
    public List<Inmueble> getArrendados(){
        List<Inmueble> aux = null;
        for (Inmueble in : inmuebles){
            if (in instanceof Arrendable && in.isArrendado()){
                aux.add(in);
            }
        }
        return aux;
    }
}
