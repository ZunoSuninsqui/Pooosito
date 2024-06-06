package com.juanyjulian.Biblioteca.dominio;

public class Libro extends Recurso implements Copiable,Prestable {
    public Libro(String codigo, String nombre, int nroCopias) {
        super(codigo, nombre,  nroCopias);
    }

    @Override
    public void fotocopiar() {
        this.nroCopias+=1;
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
