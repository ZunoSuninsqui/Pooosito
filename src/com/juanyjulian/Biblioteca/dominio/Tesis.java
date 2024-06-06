package com.juanyjulian.Biblioteca.dominio;

public class Tesis extends Recurso implements Copiable{

    public Tesis(String codigo, String nombre, int nroCopias) {
        super(codigo, nombre, nroCopias);
    }

    @Override
    public void fotocopiar() {
        this.nroCopias+=1;
    }
}
