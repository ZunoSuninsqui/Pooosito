package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConIVA extends Factura{
    private double porcIVA;
    protected FacturaConIVA(long valor, String cliente, LocalDate fecha, double porcIva) {
        super(valor, cliente, fecha);
        this.porcIVA = porcIva;
    }

    public long calcularIVA(){
        return (long) (valor * porcIVA);
    }
    @Override
    protected long calcularValor() {
        return valor + calcularIVA();
    }

}
