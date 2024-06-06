package com.juanyjulian.Biblioteca.dominio;

public abstract class Recurso {
    protected String codigo;
    protected String nombre;
    protected boolean prestado;
    protected int nroCopias;

    public Recurso(String codigo, String nombre, int nroCopias){
        this.codigo = codigo;
        this.nombre = nombre;
        this.nroCopias = nroCopias;
    }

    @Override
    public String toString(){
        return "Codigo : "+codigo+" Nombre : "+nombre;
    }
}
