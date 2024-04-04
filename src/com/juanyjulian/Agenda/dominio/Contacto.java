package com.alejandro.taller.punto1.dominio;


import java.util.List;

public class Contacto {
    private String nombre;
    private String apellido;
    private long celular;
    public Contacto(String nombre, String apellido, long celular){
        this.nombre = nombre;
        this.apellido = apellido;
        this.celular = celular;
    }
    public String getNombre(){return this.nombre;}
    public String getApellido(){return this.apellido;}
    public long getCelular(){return this.celular;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setApellido(String apellido){this.apellido = apellido;}
    public void setCelular(long celular){this.celular = celular;}
}
