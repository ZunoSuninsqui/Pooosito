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

    public void generarFactura(String cliente, double valor, LocalDate fecha) {
        Factura factura = null;

        if (valor < 1000000) {
            if (cliente.contains("A")){
                if (comparacionDias(fecha)){
                    factura = new FacturaVencida(valor,cliente, fecha);
                    System.out.println(factura.valor+":::Factura vencida");
                }else {
                    factura = new FacturaConDescuento(valor, cliente, fecha, .20);
                    System.out.println(factura.valor+":::Factura con descuento");
                }
            } else{
                factura = new FacturaSinIVA(valor, cliente, fecha);
                System.out.println(factura.valor+":::Factura sin iva");
            }
        } else {
            if (cliente.contains("A")){
                if (comparacionDias(fecha)){
                    factura = new FacturaVencida(valor,cliente, fecha);
                    System.out.println(factura.valor+":::Factura vencida");
                }else {
                    factura = new FacturaConDescuento(valor, cliente, fecha, .20);
                    System.out.println(factura.valor+":::Factura con descuento");
                }
            } else{
                factura = new FacturaConIVA(valor, cliente, fecha,0.19);
                System.out.println(factura.valor+":::Factura con iva");
            }
        }
        facturas.add(factura);
    }

    public List<Factura> getFacturas() {
        return facturas;
    }
    public List<Double> getFacturasValor() {
        return facturas.stream()
                .map(Factura::calcularValor)
                .collect(Collectors.toList());
    }

    public double getTotalFacturacion() {
        return facturas.stream().mapToDouble(Factura::calcularValor).sum();
    }

    public Factura getFacturaMasCara(){
        return facturas.stream().max(Comparator.comparing(Factura::calcularValor)).orElse(null);
    }
    public List<Factura> getFacturasSinIVA(){
        return facturas.stream()
                .filter(v -> v instanceof FacturaSinIVA)
                .collect(Collectors.toList());
    }
    public boolean comparacionDias(LocalDate fecha){
        if (30 > (int) ChronoUnit.DAYS.between(LocalDate.now(), fecha)) {
            System.out.println((int) ChronoUnit.DAYS.between(LocalDate.now(), fecha));
            System.out.println("Falso");
            return false;
        }else{
            System.out.println("Verdadero");
            return true;
        }
    }


}

