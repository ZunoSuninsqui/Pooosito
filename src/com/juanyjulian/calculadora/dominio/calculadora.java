package com.juanyjulian.calculadora.dominio;

public class calculadora {
    public static double sumar(double a, double b, boolean redondear) {
        if (redondear) {
            return redondear(a + b);
        } else {
            return a + b;
        }
    }

    public static double restar(double a, double b, boolean redondear) {
        if (redondear) {
            return redondear(a-b);
        } else {
            return a - b;
        }
    }

    public static double multiplicar(double a, double b, boolean redondear) {
        if (redondear) {
            return redondear(a * b);
        } else {
            return a * b;
        }

    }

    public static double dividir(double a, double b, boolean redondear) {
        if (redondear) {
            return redondear(a / b);
        } else {
            return a / b;
        }
    }
    public static double redondear(double value) {
        double scale = Math.pow(10, 4);
        return Math.round(value * scale) / scale;
    }
}
