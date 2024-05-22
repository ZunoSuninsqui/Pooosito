package com.juanyjulian.facturacion.dominio;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Facturacion {
    private final List<Factura> facturas;
    LocalDate halloween = LocalDate.ofYearDay(LocalDate.now().getYear(), 304);

    public Facturacion() {
        this.facturas = new ArrayList<>();
    }

    public void generarFactura(String cliente, double valor, LocalDate fecha,String medioPago) {
        Factura factura;
        if (comparacionDias(fecha)){
            factura = new FacturaVencida(valor,cliente, fecha,medioPago);
            System.out.println(factura.cliente + ":::" + factura);
        }else if (medioPago.equalsIgnoreCase("tarjeta")){
            factura = new FacturaConTarjCred(valor,cliente, fecha, medioPago,0.3);
            System.out.println(factura.cliente + ":::" + factura);
        }else if(fecha == halloween){
            factura =new FacturaHalloween(valor, cliente, fecha, medioPago);
            System.out.println(factura.cliente + ":::" + factura);
        }else if(Palindroma(cliente)){
            factura = new FacturaPalindroma(valor, cliente, fecha, medioPago,0.20);
            System.out.println(factura.cliente + ":::" + factura);
        }else if (cliente.contains("a")){
            factura = new FacturaConDescuento(valor, cliente, fecha, medioPago,.20);
            System.out.println(factura.cliente + ":::" + factura);
        }else if(valor<1_000_000){
            factura = new FacturaSinIVA(valor, cliente, fecha,medioPago);
            System.out.println(factura.cliente + ":::" + factura);
        }else{
            factura = new FacturaConIVA(valor, cliente, fecha, medioPago, 0.18);
            System.out.println(factura.cliente + ":::" + factura);
            System.out.println(factura.calcularValor());
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

