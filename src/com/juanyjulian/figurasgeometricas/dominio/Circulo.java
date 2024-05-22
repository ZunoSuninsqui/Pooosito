package com.juanyjulian.figurasgeometricas.dominio;

import java.util.List;

public class Circulo {
    private double circunferencia;
    private List<Double> puntos;
    private double perimetro;
    private double radio;
    private double diametro;

    public void calcularArea(double radio){

    }
    public void calcularCircunferencia(double radio){

    }

    public double getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(double circunferencia) {
        this.circunferencia = circunferencia;
    }

    public List<Double> getPuntos() {
        return puntos;
    }

    public void setPuntos(List<Double> puntos) {
        this.puntos = puntos;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }
}
