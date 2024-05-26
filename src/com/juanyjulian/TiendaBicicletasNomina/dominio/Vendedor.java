package com.juanyjulian.TiendaBicicletasNomina.dominio;

public class Vendedor extends Directo implements Comisioneable{
    private long ventasDelMes;
    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre,salario);
        this.ventasDelMes = ventasDelMes;
    }

    @Override
    protected long calcularSalario() {
        return getSalario()+calcularComision();
    }


    @Override
    public long calcularComision() {

        if (calcularSalario()<1_500_000) return (long)(ventasDelMes*0.045);
        else return (long)(ventasDelMes*0.035);

    }
}
