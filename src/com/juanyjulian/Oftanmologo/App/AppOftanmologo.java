package com.juanyjulian.Oftanmologo.App;

import com.juanyjulian.Oftanmologo.dominio.Oftanmologo;
import com.juanyjulian.Oftanmologo.dominio.Paciente;
import com.juanyjulian.Oftanmologo.dominio.PacienteApto;

public class AppOftanmologo {
    public static void main(String[] args) {
        Oftanmologo ofta = new Oftanmologo("Oftanmología la más mirona");
        ofta.revisarPaciente("Juanes",30);
        ofta.revisarPaciente("Alejo",30);
        ofta.revisarPaciente("Alex",45);
        ofta.revisarPaciente("Duxo",20);
        ofta.revisarPaciente("Rollito",45);
        System.out.println(ofta.getPacientesAOperar());
        ofta.operarPacientes();
        System.out.println(ofta.getPacientesAOperar());
    }
}
