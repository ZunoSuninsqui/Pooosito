package com.juanyjulian.figurasgeometricas.dominio;
import java.util.List;
public class FigurasGeometricas {
    private List<Double> lados;
    private List<Double> puntos;
    private int NumeroLineas;
    private int numeroCurvas;
    private double area;
    public List<Double> getLados() {
        return lados;
    }

    public void setLados(List<Double> lados) {
        this.lados = lados;
    }

    public List<Double> getPuntos() {
        return puntos;
    }

    public int getNumeroLineas() {
        return NumeroLineas;
    }

    public void setNumeroLineas(int numeroLineas) {
        NumeroLineas = numeroLineas;
    }

    public int getNumeroCurvas() {
        return numeroCurvas;
    }

    public void setNumeroCurvas(int numeroCurvas) {
        this.numeroCurvas = numeroCurvas;
    }

    public void setPuntos(List<Double> puntos) {
        this.puntos = puntos;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
