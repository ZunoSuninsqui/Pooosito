package com.alejandro.taller.punto1.dominio;

import java.util.ArrayList;
import java.util.List;

public class Agenda {
    public static final int CAPACIDAD = 50;
    private List<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public void crearContacto(String nombre, String apellido, long celular) {
        Contacto contacto = new Contacto(nombre, apellido, celular);

        if (this.contactos.size() < CAPACIDAD) {
            if (this.buscar(celular) == null) {
                this.contactos.add(contacto);
            } else {
                System.out.println("El contacto con el celular " + celular + " ya existe.");
            }
        } else {
            System.out.println("La agenda ya está llena.");
        }
    }

    public void eliminarContacto(long celular) {
//        for (Contacto contacto : this.contactos) {
//            if (contacto.getCelular() == celular) {
//                this.contactos.remove(contacto);
//                break;
//            }
//        }

        this.contactos.removeIf(contacto -> contacto.getCelular() == celular);
    }

    public List<Contacto> buscar(String nombre) {
        List<Contacto> contactosBuscados = new ArrayList<>();

        for (Contacto contacto : this.contactos) {
            if (contacto.getNombre().equalsIgnoreCase(nombre)) {
                contactosBuscados.add(contacto);
            }
        }

        return contactosBuscados;
    }

    public List<Contacto> buscarPorApellido(String apellido) {
        return this.contactos.stream().filter(cc -> cc.getApellido().equalsIgnoreCase(apellido)).toList();
    }

    public Contacto buscar(long celular) {
        Contacto contactoBuscado = null;

        for (int i = 0; i < this.contactos.size(); i++) {
            if (this.contactos.get(i).getCelular() == celular) {
                contactoBuscado = this.contactos.get(i);
                break;
            }
        }

        return contactoBuscado;
    }

    public void cambiarCelular(long viejoCelular, long nuevoCelular) {
        Contacto contactoACambiar = this.buscar(viejoCelular);

        if (contactoACambiar != null) {
            contactoACambiar.setCelular(nuevoCelular);
        }
    }

    public List<Contacto> ordenar() {
        this.contactos.sort((c1, c2) -> c1.getNombre().compareToIgnoreCase(c2.getNombre()));
        return this.contactos;
    }

    public int getNumeroDeContactos() { return this.contactos.size();}

    public List<String> getNombreContactos(){
        List<String> contactosNombres = new ArrayList<>();
        for (Contacto contacto : this.contactos){
            String nombre= contacto.getNombre();
            contactosNombres.add(nombre);
        }
        return contactosNombres;
    }
}