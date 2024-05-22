package com.juanyjulian.TiendaBicicletasNomina.dominio;

public class Directo extends Empleado{

    private long salario;

    public Directo(String nombre, long salario) {
        super(nombre);
        this.salario = salario;
    }
    public long calcularSalud(){
        return (long) (salario*0.057);
    }
    public long calcularPension(){
        return (long)(salario*0.065);
    }
    public long calcularAporte(){
        return calcularPension()+calcularSalud();
    }
    public long getSalario(){return this.salario;}
    @Override
    protected long calcularSalario() {
        return salario -calcularAporte();
    }
}
