package com.juanyjulian.facturacion.app;

import com.juanyjulian.facturacion.dominio.Facturacion;

import java.time.LocalDate;

public class AppFacturacion {
    public static void main(String[] args) {
        Facturacion facturacion = new Facturacion();
        facturacion.generarFactura("Alejo",500_000, LocalDate.of(2024, 5, 1));
        facturacion.generarFactura("Alejo",1_500_000, LocalDate.of(2024, 7, 1));
        facturacion.generarFactura("Robin",1500_000, LocalDate.of(2024, 5, 1));
        facturacion.generarFactura("Robin",500_000, LocalDate.of(2024, 5, 1));
        //facturacion.generarFactura() // 26-04-2024 _ 26-05-2024
        System.out.println(facturacion.getFacturas()+"\n");
    }
}
