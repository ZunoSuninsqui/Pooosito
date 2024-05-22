package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaHalloween extends Factura{

    public FacturaHalloween(double valor, String cliente, LocalDate fecha, String medioPago) {
        super(valor, cliente, fecha,medioPago);
    }
    protected double descuento(){return valor * 0.15;}

    @Override
    protected double calcularValor() {
        return valor-descuento();
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
