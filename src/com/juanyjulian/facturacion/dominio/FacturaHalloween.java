package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaHalloween extends Factura{

    public FacturaHalloween(double valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }

    @Override
    protected double calcularValor() {
        return 0;
    }
    @Override
    public String toString() {
        return "FacturaHalloween{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
