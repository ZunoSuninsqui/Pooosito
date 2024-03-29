package com.juanyjulian.maquinaexpendedora.app;
import com.juanyjulian.maquinaexpendedora.dominio.MaquinaExpendedora;
public class Main {
    public static void main(String[] args) {
        MaquinaExpendedora maquina1 = new MaquinaExpendedora();
        maquina1.agregarSnack("Papas",7,1.3,"a2");
        maquina1.agregarSnack("CulMan",4, 3.2,"A4");
        maquina1.agregarSnack("ChocoBreak",10, 2.8,"A3");
        maquina1.agregarSnack("Patatita",5,2.3,"d3");

        System.out.println(maquina1.precioMayorAMenor());
        System.out.println(maquina1.cantidadMenorAMayor());



    }
}