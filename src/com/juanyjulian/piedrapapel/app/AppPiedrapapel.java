package com.juanyjulian.piedrapapel.app;

import com.juanyjulian.calculadora.app.AppCalculadora;
import com.juanyjulian.calculadora.dominio.calculadora;
import com.juanyjulian.piedrapapel.dominio.juego;

import javax.swing.*;

public class AppPiedrapapel {
    private static final int verInstruccionesInt = 0;
    private static final int jugarInt = 1;
    private static final int verResultadosInt = 2;
    private static final String titulo = "POO - Piedra, Papel o Tijera";
    public static Object[] param = {"Ver instrucciones","Jugar","Ver resultados"};

    public static final ImageIcon ICONO = new ImageIcon(calculadora.class.getResource("uco.png"));

    public static void main(String[] args) {
        while (true){
            int opcion = JOptionPane.showOptionDialog(null, "Bienvenid@!\n¿Qué quieres hacer?",
                    "POO - Piedra, Papel o Tijera", 0, JOptionPane.QUESTION_MESSAGE, ICONO,
                    param, null);
            if (opcion == verInstruccionesInt){
                AppCalculadora.mostrarMensaje("Bienvenido al juego de Piedra, Papel o Tijeras. Las reglas son simples:\n\n" +
                                "1. Piedra aplasta a Tijeras (Piedra gana a Tijeras).\n" +
                                "2. Papel cubre a Piedra (Papel gana a Piedra).\n" +
                                "3. Tijeras cortan Papel (Tijeras ganan a Papel).\n\n" +
                                "En cada ronda, selecciona una de las tres opciones: Piedra, Papel o Tijeras.\n" +
                                "El juego continuará hasta que decidas cerrar la ventana o presionar 'Cancelar'.\n\n" +
                                "¡Que te diviertas y buena suerte!", titulo
                );
            } else if (opcion == jugarInt){
                String seleccion = (String) JOptionPane.showInputDialog(null,
                        "¿Que quieres hacer?",
                        titulo,
                        JOptionPane.QUESTION_MESSAGE,
                        ICONO, new Object[]{"Piedra", "Papel", "Tijeras"},
                        null);
                AppCalculadora.mostrarMensaje(juego.ganador(seleccion),titulo);

            }else if (opcion == verResultadosInt){
                AppCalculadora.mostrarMensaje("Tu: "+juego.getVictoriasUser()+" Partidas ganadas.\n"+
                        "La computadora: "+juego.getDerrotasUser()+" Partidas ganadas \n"+"Empates: "+juego.getEmpates()+" Partidas.",titulo);
            }
            if (opcion == JOptionPane.CLOSED_OPTION) {
                break;
            }
        }
    }
}