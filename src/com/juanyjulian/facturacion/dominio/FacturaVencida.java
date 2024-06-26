package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FacturaVencida extends Factura{
    public int valor_dia_vencido = 10_000;

    public FacturaVencida(double valor, String cliente, LocalDate fecha, String medioPago) {
        super(valor, cliente, fecha,medioPago);
        System.out.println(valor);
    }
    public int getDiasVencidos(){
        return (int) ChronoUnit.DAYS.between(fecha,LocalDate.now());}
    public long calcularPrecioPorVencimiento(){
        return (long) valor_dia_vencido *(getDiasVencidos()-30);
    }
    @Override
    protected double calcularValor() {
        return valor + calcularPrecioPorVencimiento();
    }

}
