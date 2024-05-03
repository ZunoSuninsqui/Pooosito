package com.juanyjulian.maquinaexpendedora.dominio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class MaquinaExpendedora {
    private static final int CANTIDADSNACKS = 12;
    private List<Snack> Snacks;

    public MaquinaExpendedora() {
        this.Snacks = new ArrayList<>();
    }

    public void agregarSnack(String nombre, int cantidad, double precio, String codigo) {
        Snack snack = new Snack(nombre, cantidad, precio, codigo);
        if (this.Snacks.size() <= CANTIDADSNACKS) {
            Snacks.add(snack);
            System.out.println("Snack Añadido con exito");
        } else {
            System.out.println("Cantidad máxima de snacks alcanzada");
        }
    }

    public void sacarSnackCodigo(String codigo) {
        for (Snack snack : this.Snacks) {
            if (snack.getCodigo().equalsIgnoreCase(codigo)) {
                snack.setCantidad((snack.getCantidad() - 1));
            }
        }
    }

    public void sacarSnackNombre(String nombre)     {
        for (Snack snack : this.Snacks) {
            if (snack.getNombre().equalsIgnoreCase(nombre)) {
                snack.setCantidad((snack.getCantidad() - 1));
            }
        }
    }

    public void aumentarCantidadSnack(String CodiNom, int cantidad) {
        for (Snack snack : this.Snacks) {
            if ((snack.getNombre().equalsIgnoreCase(CodiNom)) || (snack.getCodigo().equalsIgnoreCase(CodiNom))) {
                if (snack.getCantidad() + cantidad <= 12) {
                    snack.setCantidad(snack.getCantidad() + cantidad);
                }
            }
        }
    }

    public void quitarSnack(String CodiNom) {
        this.Snacks.removeIf(snack -> (snack.getNombre().equalsIgnoreCase(CodiNom)) || (snack.getCodigo().equalsIgnoreCase(CodiNom)));
        /*for (Snack snack : this.Snacks){
            if ((snack.getNombre().equalsIgnoreCase(CodiNom))||(snack.getCodigo().equalsIgnoreCase(CodiNom))){
                this.Snacks.remove(snack);
            }
        }*/
    }

    public int cantidadUndSnacks(String CodiNom) {
        int cantidad = 0;
        for (Snack snack : this.Snacks) {
            if ((snack.getNombre().equalsIgnoreCase(CodiNom)) || (snack.getCodigo().equalsIgnoreCase(CodiNom))) {
                cantidad = snack.getCantidad();
                break;
            }
        }
        return cantidad;
    }

    public List<String> nombreSnackOut() {
        List<String> nombres = new ArrayList<>();
        for (Snack snack : this.Snacks) {
            if (snack.getCantidad() == 0) {
                nombres.add(snack.getNombre());
            }
        }
        return nombres;
    }

    public List<String> precioMayorAMenor() {
        ArrayList retorno = new ArrayList<Double>();
        for (Snack snack : this.Snacks) {
            retorno.add(snack.getPrecio());
        }
        Collections.sort(retorno);
        Collections.reverse(retorno);
        return retorno;
    }

    public List<String> cantidadMenorAMayor() {
        ArrayList retorno = new ArrayList<Double>();
        for (Snack snack : this.Snacks) {
            retorno.add(snack.getCantidad());
        }
        Collections.sort(retorno);
        return retorno;
    }

    public List<String> mostrarNombres() {
        List<String> listaNombres = new ArrayList<>();
        for (Snack snack : this.Snacks) {
            listaNombres.add(snack.getNombre());
        }
        return listaNombres;
    }

    public List<Integer> mostrarCantidad() {
        List<Integer> listaCantidad = new ArrayList<>();
        for (Snack snack : this.Snacks) {
            listaCantidad.add(snack.getCantidad());
        }
        return listaCantidad;
    }
}


