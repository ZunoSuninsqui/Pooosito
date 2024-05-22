package com.juanyjulian.TiendaBicicletasNomina.dominio;

public class Promotor extends Empleado{
    private int volantesRepartidos;
    private long valorVolante;
    private int comprasPorVolante;

    public Promotor(String nombre,int volantesRepartidos,long valorVolante,int comprasPorVolante) {
        super(nombre);
        this.volantesRepartidos = volantesRepartidos;
        this.valorVolante = valorVolante;
        this.comprasPorVolante = comprasPorVolante;
    }

    @Override
    protected long calcularSalario() {
        return valorVolante*volantesRepartidos+(12900L*comprasPorVolante);
    }
}