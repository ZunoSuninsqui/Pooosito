package com.juanyjulian.TiendaBicicletasNomina.dominio;

public class Vendedor extends Directo{
    private long ventasDelMes;
    public Vendedor(String nombre, long salario, long ventasDelMes) {
        super(nombre,salario);
        this.ventasDelMes = ventasDelMes;
    }
    public long calcularComision(){
        if (getSalario()<=1_500_000) return (long)(ventasDelMes*0.045);
        else return (long)(ventasDelMes*0.035);
    }
    @Override
    protected long calcularSalario() {return getSalario()+calcularComision();}
}
