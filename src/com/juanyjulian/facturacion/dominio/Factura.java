package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public abstract class Factura {
    protected double valor;
    protected String cliente;
    protected LocalDate fecha;

    public Factura(double valor, String cliente, LocalDate fecha) {
    }

    protected abstract double calcularValor();
}
