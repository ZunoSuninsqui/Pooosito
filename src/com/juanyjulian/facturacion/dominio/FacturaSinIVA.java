package com.juanyjulian.facturacion.dominio;

import java.time.LocalDate;

public class FacturaSinIVA extends Factura{


    public FacturaSinIVA(long valor, String cliente, LocalDate fecha) {
        super(valor, cliente, fecha);
    }

    @Override
    protected long calcularValor() {
        return valor;
    }
}
