package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FacturaVencida extends Factura{
    public int valor_dia_vencido = 10_000;

    public FacturaVencida(long valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }

    public int getDiasVencidos(){return (int) ChronoUnit.DAYS.between(fecha, LocalDate.now());}
    public long calcularPrecioPorVencimiento(){
        return (long) valor_dia_vencido *getDiasVencidos();
    }
    @Override
    protected long calcularValor() {
        return valor + calcularPrecioPorVencimiento();
    }

}
