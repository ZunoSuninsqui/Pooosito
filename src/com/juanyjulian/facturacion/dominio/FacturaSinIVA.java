package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaSinIVA extends Factura{


    public FacturaSinIVA(double valor, String cliente, LocalDate fecha, String mediodepago) {
        super(valor, cliente, fecha,mediodepago);
        this.valor = valor;
    }
    @Override
    protected double calcularValor() {
        return this.valor;
    }
}
