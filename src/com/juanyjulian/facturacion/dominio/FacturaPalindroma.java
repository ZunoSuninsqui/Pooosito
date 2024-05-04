package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaPalindroma extends Factura{
    public FacturaPalindroma(double valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }

    @Override
    protected double calcularValor() {
        return 0;
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
