package com.juanyjulian.TiendaBicicletasNomina.dominio;

import java.util.ArrayList;
import java.util.List;

public class Nomina {
    private final List<Empleado> empleados;
    public Nomina(){
        this.empleados = new ArrayList<>();
        Empleado Juan = new Directo("Juan",4_840_000);
        Empleado Julian = new Vendedor("Julián",2_050_000,45_510_000);
        Empleado Johana = new Freelance("Johana",71_000,89);
        Empleado Clauida = new Vendedor("Claudia",1_380_000,39_989_000);
        Empleado David = new Directo("David",3_975_000);
        Empleado Gustavo = new Freelance("Gustavo",42_500,65);
        empleados.add(Juan);
        empleados.add(Julian);
        empleados.add(Johana);
        empleados.add(Clauida);
        empleados.add(David);
        empleados.add(Gustavo);
    }

    public void calcularNomina(){
        long totalNomina = 0;
        for (Empleado empleado : empleados){
            totalNomina+= empleado.calcularSalario();
        }
        System.out.println("La nomina es : "+totalNomina);
    }
    public void listarDirectos(){
        for(Empleado empleado : empleados){
            if ((empleado instanceof Directo)&&!(empleado instanceof Vendedor)) System.out.println("Nombre del empleado Directo : "+empleado.getNombre()+" Salario del empleado Directo: "+empleado.calcularSalario());
        }
    }
    public void listarFreelancers(){
        for(Empleado empleado : empleados){
            if (empleado instanceof Freelance) System.out.println("Nombre del empleado Freelance : "+empleado.getNombre()+" Salario del empleado Freelance: "+empleado.calcularSalario());
        }
    }
    public void listarVendedores(){
        for(Empleado empleado : empleados){
            if ((empleado instanceof Vendedor)) System.out.println("Nombre del empleado Vendedor : "+empleado.getNombre()+" Salario del empleado Vendedor: "+empleado.calcularSalario());
        }
    }
}
