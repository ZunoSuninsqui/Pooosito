package com.juanyjulian.TiendaBicicletasNomina.dominio;

public class Freelance extends Empleado{
    private long valorHora;
    private long horasTrabajadas;

    public Freelance(String nombre,long valorHora,long horasTrabajadas) {
        super(nombre);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }

    @Override
    protected long calcularSalario() {
        return valorHora*horasTrabajadas;
    }
}
