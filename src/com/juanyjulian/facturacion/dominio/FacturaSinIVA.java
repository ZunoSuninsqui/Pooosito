package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaSinIVA extends Factura{


    public FacturaSinIVA(double valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
        this.valor = valor;
    }
    @Override
    protected double calcularValor() {
        return this.valor;
    }
}
