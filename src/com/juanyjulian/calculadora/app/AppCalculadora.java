package com.juanyjulian.calculadora.app;
import com.juanyjulian.calculadora.dominio.calculadora;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppCalculadora {
    public static final int SUMAR = 0;
    public static final int RESTAR = 1;
    public static final int MULTIPLICAR = 2;
    public static final int DIVIDIR = 3;
    public static final int IGUAL = 4;
    public static final String SUMARSTR = "+";
    public static final String RESTARSTR = "-";
    public static final String MULTIPLICARSTR = "x";
    public static final String DIVIDIRSTR = "÷";
    public static final String IGUALSTR = "=";
    public static final String titulo = "POO - Calculadora";
    static JCheckBox checkBox = new JCheckBox("¿Redondear?");
    public static final ImageIcon ICONO = new ImageIcon(calculadora.class.getResource("uco.png"));
    public static Object[] param = {SUMARSTR,RESTARSTR,MULTIPLICARSTR,DIVIDIRSTR,IGUALSTR,checkBox};
    //Arrays.asList("Sumar", "Restar", "Multiplicar", "Dividir", checkBox).toArray()
    public static void main(String[] args) {
        mostrarMensaje("Calculadora N números", titulo);
        double resultado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer valor:"));
        boolean continuar = true;

        while (continuar) {
            int opcion = JOptionPane.showOptionDialog(null, "Selecciona una operación",
                    "POO - Calculadora", 0, JOptionPane.QUESTION_MESSAGE, ICONO,
                    param, null);

            if (opcion == JOptionPane.CLOSED_OPTION) {
                break;
            }

            if (opcion == IGUAL) {
                mostrarMensaje("El resultado es " + resultado,titulo);
                break;
            }

            double numero = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el siguiente valor:"));
            boolean redondear = checkBox.isSelected();

            switch (opcion) {
                case SUMAR:
                    resultado = calculadora.sumar(resultado, numero, redondear);
                    break;
                case RESTAR:
                    resultado = calculadora.restar(resultado, numero, redondear);
                    break;
                case MULTIPLICAR:
                    resultado = calculadora.multiplicar(resultado, numero, redondear);
                    break;
                case DIVIDIR:
                    resultado = calculadora.dividir(resultado, numero, redondear);
                    break;
                default:
                    mostrarMensaje("Operación no válida.",titulo);
                    break;
            }
        }
    }
    public static void mostrarMensaje(String mensaje, String titulo) {
        JOptionPane.showMessageDialog(null, mensaje,
                titulo, JOptionPane.ERROR_MESSAGE, ICONO);
    }
}
