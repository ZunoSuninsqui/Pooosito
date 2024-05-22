package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaPalindroma extends Factura{
    private double descuento;
    public FacturaPalindroma(double valor, String cliente, LocalDate fecha,String medioPago, double descuento) {
        super(valor, cliente, fecha, medioPago);
        this.descuento =descuento;
    }
    protected double descuento(){
        return valor*descuento;
    }
    @Override
    protected double calcularValor() {
        return valor-descuento();
    }
    @Override
    public String toString() {
        return "FacturaPalindroma{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
