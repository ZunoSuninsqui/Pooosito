package com.juanyjulian.AgenciaInmobiliaria.App;

import com.juanyjulian.AgenciaInmobiliaria.dominio.*;

public class App {
    public static void main(String[] args) {
        Inmueble Casa1 = new Casa("Transversal casa 123",300,3,false);
        Inmueble Casa2 = new Casa("Calle casa 123",450,6,true);
        Inmueble Casa3 = new Casa("Carrera casa 123",500,9,false);

        Inmueble Apto1 = new Apartamento("Transversal apto 456",300,3,false);
        Inmueble Apto2 = new Apartamento("Calle apto 456",450,6,true);
        Inmueble Apto3 = new Apartamento("Carrera apto 456",500,9,false);

        Inmueble Lote1 = new Lote("Transversal lote 789",600);
        Inmueble Lote2 = new Lote("Calle lote 789",550);
        Inmueble Lote3 = new Lote("Carrera lote 789",900);

        Agencia Agencia = new Agencia("VentaQuemada");
        Agencia.agregarInmueble(Casa1);Agencia.agregarInmueble(Casa2);Agencia.agregarInmueble(Casa3);
        Agencia.agregarInmueble(Apto1);Agencia.agregarInmueble(Apto2);Agencia.agregarInmueble(Apto3);
        Agencia.agregarInmueble(Lote1);Agencia.agregarInmueble(Lote2);Agencia.agregarInmueble(Lote3);

        Agencia.arrendar(Casa1);/*Agencia.arrendar(Casa2);Agencia.arrendar(Lote2);*/

        Agencia.devolver(Casa2);Agencia.devolver(Casa3);Agencia.devolver(Lote1);

        System.out.println(Agencia.getArrendablesDisponibles());
        System.out.println(Agencia.getArrendados());

    }
}
