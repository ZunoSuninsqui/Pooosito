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
    LocalDate halloween = LocalDate.ofYearDay(LocalDate.now().getYear(), 304);

    public Facturacion() {
        this.facturas = new ArrayList<>();
    }

    public void generarFactura(String cliente, double valor, LocalDate fecha,String medioPago) {
        Factura factura = null;
        if (valor < 1000000) {
            if (medioPago.equalsIgnoreCase("tarjeta")){
                factura = new FacturaConTarjCred(valor,cliente, fecha, medioPago);
                System.out.println(factura.cliente + "::: factura con tarjeta");
            }else if (Palindroma(cliente)){
                factura = new FacturaPalindroma(valor, cliente, fecha, medioPago);
                System.out.println(factura.cliente + ":::" + factura);
            }else if (comparacionDias(fecha)){
                if (fecha == halloween){
                    factura =new FacturaHalloween(valor, cliente, fecha, medioPago);
                }else if (cliente.contains("A")){
                    factura = new FacturaConDescuento(valor, cliente, fecha, .20,medioPago);
                    System.out.println(factura.valor+":::Factura con descuento");

                }else {
                    factura = new FacturaVencida(valor,cliente, fecha,medioPago);
                    System.out.println(factura.valor+":::Factura vencida");

                }
            } else{
                factura = new FacturaSinIVA(valor, cliente, fecha,medioPago);
                System.out.println(factura.valor+":::Factura sin iva");
            }
        } else {
            if (comparacionDias(fecha)) {
                if (cliente.contains("A")) {
                    factura = new FacturaConDescuento(valor, cliente, fecha, .20, medioPago);
                    System.out.println(factura.valor + ":::Factura con descuento");

                } else {
                    factura = new FacturaVencida(valor, cliente, fecha, medioPago);
                    System.out.println(factura.valor + ":::Factura vencida");

                }
            } else if (fecha == halloween) {
            } else {
                factura = new FacturaConIVA(valor, cliente, fecha, 0.18, medioPago);
                System.out.println(factura.valor + ":::Factura sin iva");
                System.out.println(factura.calcularValor());
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
        if (30 > (int) ChronoUnit.DAYS.between(fecha,LocalDate.now() )) {
            System.out.println((int) ChronoUnit.DAYS.between(fecha,LocalDate.now())-30);
            System.out.println("Falso");
            return false;
        }else{
            System.out.println((int) ChronoUnit.DAYS.between(fecha,LocalDate.now())-30);
            System.out.println("Verdadero");
            return true;
        }
    }
    public boolean Palindroma(String str) {
        str = str.toLowerCase();
        int left = 0 ;
        int right = str.length()-1;
        while (left<(right/2 )){
            if (str.charAt(left)!= str.charAt(right-left)){
                return false;
            }
            left++;
            // Arepera impares
            // opontootnopo pares
        }
        return true;
    }


}

