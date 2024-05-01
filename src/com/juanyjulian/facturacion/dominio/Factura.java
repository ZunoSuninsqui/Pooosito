package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public abstract class Factura {
    protected long valor;
    protected String cliente;
    protected LocalDate fecha;

    public Factura(long valor, String cliente, LocalDate fecha) {
    }

    protected abstract long calcularValor();
}
