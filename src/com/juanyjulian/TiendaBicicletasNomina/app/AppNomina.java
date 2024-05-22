package com.juanyjulian.TiendaBicicletasNomina.app;


import com.juanyjulian.TiendaBicicletasNomina.dominio.*;


public class AppNomina {
    public static void main(String[] args) {
        Nomina nomina = new Nomina();
        System.out.println("\n");
        nomina.calcularNomina();
        System.out.println("\n");
        nomina.listarDirectos();
        System.out.println("\n");
        nomina.listarFreelancers();
        System.out.println("\n");
        nomina.listaPromotores();
        System.out.println("\n");
        //nomina.listarVendedores();
    }
}
