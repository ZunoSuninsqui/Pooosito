package com.juanyjulian.AgenciaInmobiliaria.dominio;

public class Apartamento extends Inmueble implements Arrendable{
    public Apartamento(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public void arrendar() {

    }

    @Override
    public void devolver() {

    }
    public String toString(){
        return "Direccion del inmueble"+getDireccion()+"\nValor arriendo : "+getValorArriendo()+"\nValor venta : "+getValorVenta();
    }
}
