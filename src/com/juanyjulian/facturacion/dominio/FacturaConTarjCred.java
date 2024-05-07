package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConTarjCred extends Factura{


    public FacturaConTarjCred(double valor, String cliente, LocalDate fecha,String medioPago) {
        super(valor, cliente, fecha,medioPago);
    }


    @Override
    protected double calcularValor() {
        return 0;
    }
    @Override
    public String toString() {
        return "FacturaConTarjCred{" +
                "valor=" + valor +
                ", cliente='" + cliente + '\'' +
                ", fecha=" + fecha +
                '}';
    }
}
