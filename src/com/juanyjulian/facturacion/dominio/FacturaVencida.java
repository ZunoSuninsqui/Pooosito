package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FacturaVencida extends Factura{
    public int valor_dia_vencido = 10_000;

    public FacturaVencida(double valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
        this.valor = valor;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getDiasVencidos(){
        System.out.println((int) ChronoUnit.DAYS.between(LocalDate.now(), fecha));
        return (int) ChronoUnit.DAYS.between(LocalDate.now(),fecha);}
    public long calcularPrecioPorVencimiento(){
        return (long) valor_dia_vencido *getDiasVencidos();
    }
    @Override
    protected double calcularValor() {
        return valor + calcularPrecioPorVencimiento();
    }

}
