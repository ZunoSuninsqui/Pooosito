package com.juanyjulian.Oftanmologo.dominio;

import java.util.ArrayList;
import java.util.List;

public class Oftanmologo {
    private String nombre;
    private List<Paciente> pacientes;

    public Oftanmologo(String nombre) {
        this.nombre = nombre;
        this.pacientes = new ArrayList<>();
    }

    public Paciente revisarPaciente(String nombre, int edad) {
        Paciente p;
        if (edad < 40 && nombre.toLowerCase().contains("a")) {
            p = new PacienteApto(nombre, edad, nombre.toLowerCase().contains("a"));
        } else {
            p = new PacienteNoApto(nombre, edad, nombre.toLowerCase().contains("a"));
        }
        pacientes.add(p);
        return p;
    }

    public Paciente revisarPaciente2(String nombre, int edad) {
        Paciente p;
        if (nombre.toLowerCase().contains("a")) {
            if (edad < 40) {
                p = new PacienteApto(nombre, edad, true);
            } else {
                p = new PacienteNoApto(nombre, edad, true);
            }
        } else {
            p = new PacienteNoApto(nombre, edad, false);
        }
        pacientes.add(p);
        return p;
    }


    public void operarPacientes() {
        this.getPacientesAOperar().forEach(PacienteApto::operar);
    }

    public List<PacienteApto> getPacientesAOperar() {
        return this.pacientes.stream()
                .filter(Paciente -> Paciente instanceof PacienteApto && Paciente.NecesitaCirugia())
                .map(PacienteApto.class::cast)
                .toList();
    }

}
