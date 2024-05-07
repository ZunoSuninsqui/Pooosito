package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public abstract class Factura {
    protected double valor;
    protected String cliente;
    protected LocalDate fecha;
    protected String medioPago;

    public Factura(double valor, String cliente, LocalDate fecha, String medioPago) {
        this.valor =valor;
        this.cliente = cliente;
        this.fecha = fecha;
        this.medioPago=medioPago;
    }

    protected abstract double calcularValor();
}
