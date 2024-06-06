package com.juanyjulian.Biblioteca.dominio;

public class Revista extends Recurso implements Prestable{
    public Revista(String codigo, String nombre, int nroCopias) {
        super(codigo, nombre, nroCopias);
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }
}
