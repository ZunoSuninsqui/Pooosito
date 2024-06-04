package com.juanyjulian.Oftanmologo.dominio;

public abstract class Paciente {
    private String nombre;
    private int edad;
    private boolean necesitaCirugia;
    public Paciente(String nombre, int edad, boolean necesitaCirugia) {
        this.nombre = nombre;
        this.edad = edad;
        this.necesitaCirugia = necesitaCirugia;
    }

    public boolean NecesitaCirugia() {
        return necesitaCirugia;
    }
    public String getNombrePaciente(){
        return this.nombre;
    }
    public void setNecesitaCirugia(boolean necesitaCirugia) {
        this.necesitaCirugia = necesitaCirugia;
    }
    @Override
    public String toString(){
        return getNombrePaciente();
    }
}
