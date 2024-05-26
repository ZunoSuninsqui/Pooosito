package com.juanyjulian.AgenciaInmobiliaria.dominio;

public class Lote extends Inmueble{
    public Lote(String direccion, long valorVenta) {
        super(direccion, valorVenta, 0, false);
    }
    public String toString(){
        return "Direccion del inmueble"+getDireccion()+"\nValor venta : "+getValorVenta();
    }
}
