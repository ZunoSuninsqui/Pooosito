package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConDescuento extends FacturaSinIVA {
    private double porcDescuento;

    public FacturaConDescuento(double valor, String cliente, LocalDate fecha,String mediodepago, double porcDescuento) {
        super(valor, cliente, fecha,mediodepago);
        this.valor = valor;
        this.porcDescuento = porcDescuento;
    }


    public double calcularDescuento(){ return  valor * porcDescuento; }
    @Override
    protected double calcularValor() {
        return  valor + calcularDescuento();
    }

}
