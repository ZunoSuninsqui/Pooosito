package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConIVA extends Factura{
    private double porcIVA;
    protected FacturaConIVA(double valor, String cliente, LocalDate fecha, double porcIva) {
        super(valor, cliente, fecha);
        this.valor = valor;
        this.porcIVA = porcIva;
    }

    public long calcularIVA(){
        return (long) (valor * porcIVA);
    }
    @Override
    protected double calcularValor() {
        return valor + calcularIVA();
    }

}
