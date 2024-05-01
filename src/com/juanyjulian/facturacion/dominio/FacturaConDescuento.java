package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConDescuento extends FacturaSinIVA {
    private double porcDescuento;

    public FacturaConDescuento(long valor, String cliente, LocalDate fecha, double porcDescuento) {
        super(valor, cliente, fecha);
        this.porcDescuento = porcDescuento;
    }

    public long calcularDescuento(){ return (long) (valor * porcDescuento); }
    @Override
    protected long calcularValor() {
        return valor + calcularDescuento();
    }

}
