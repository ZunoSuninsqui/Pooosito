package com.juanyjulian.TiendaBicicletasNomina.dominio;

public abstract class Empleado {
    private String nombre;

    public Empleado(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){return this.nombre;}
    protected abstract long calcularSalario();
}
