package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaConTarjCred extends Factura{
    private double cashback;

    public FacturaConTarjCred(double valor, String cliente, LocalDate fecha,String medioPago, double cashback) {
        super(valor, cliente, fecha,medioPago);
        this.cashback=cashback;
    }


    protected double cashback(){
        return valor*cashback;}
    @Override
    protected double calcularValor() {
        return valor - cashback();
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
