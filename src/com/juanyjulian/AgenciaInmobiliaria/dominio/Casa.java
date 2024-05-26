package com.juanyjulian.AgenciaInmobiliaria.dominio;

public class Casa extends Inmueble implements Arrendable{
    public Casa(String direccion, long valorVenta, long valorArriendo, boolean arrendado) {
        super(direccion, valorVenta, valorArriendo, arrendado);
    }

    @Override
    public void arrendar() {
        setArrendado(true);
    }

    @Override
    public void devolver() {
        setArrendado(false);
    }
    @Override
    public String toString(){
        return "Direccion del inmueble"+getDireccion()+"\nValor arriendo : "+getValorArriendo()+"\nValor venta : "+getValorVenta();
    }
}
