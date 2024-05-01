package com.juanyjulian.facturacion.dominio;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import static java.time.LocalDate.*;

public class Facturacion {
    private List<Factura> facturas;

    public Facturacion() {
        this.facturas = new ArrayList<>();
    }

    public void generarFactura(String cliente, long valor, LocalDate fecha) {
        Factura factura = null;

        if (valor < 1000000) {
            if (cliente.contains("A")){
                if (comparacionDias(fecha)){
                    factura = new FacturaVencida(valor,cliente, fecha);
                }else {
                    factura = new FacturaConDescuento(valor, cliente, fecha, .20);
                }
            } else{
                factura = new FacturaSinIVA(valor, cliente, fecha);
            }
        } else if (valor >= 1000000) {
            if (cliente.contains("A")){
                if (comparacionDias(fecha)){
                    factura = new FacturaVencida(valor,cliente, fecha);
                }else {
                    factura = new FacturaConDescuento(valor, cliente, fecha, .20);
                }
            } else{
                factura = new FacturaConIVA(valor, cliente, fecha,0.19);
            }
        }
        facturas.add(factura);
    }

    public List<Factura> getFacturas() {
        return facturas;
    }
    public long getTotalFacturación(){
        return facturas.stream().mapToLong(v -> v.calcularValor()).sum();
    }
    public Factura getFacturaMasCara(){
        return facturas.stream().max(Comparator.comparing(Factura::calcularValor)).orElse(null);
    }
    public List<Factura> getFacturasConIVA(){
        return facturas.stream()
                .filter(v -> v instanceof FacturaConIVA)
                .collect(Collectors.toList());
    }
    public boolean comparacionDias(LocalDate fecha){
        if (30.0 > (int) ChronoUnit.DAYS.between(fecha, LocalDate.now())){
            return false;
        }else{
            return true;
        }

    }
}
