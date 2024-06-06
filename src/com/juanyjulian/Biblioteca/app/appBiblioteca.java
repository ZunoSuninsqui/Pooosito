package com.juanyjulian.Biblioteca.app;

import com.juanyjulian.Biblioteca.dominio.Biblioteca;
import com.juanyjulian.Biblioteca.dominio.Libro;
import com.juanyjulian.Biblioteca.dominio.Revista;
import com.juanyjulian.Biblioteca.dominio.Tesis;

public class appBiblioteca {
    public static void main(String[] args) {


        Biblioteca biblioteca = new Biblioteca();
        Revista revista = new Revista("123","Jueves",0);
        Revista revista2 = new Revista("234","cuatro",0);

        Libro Libro = new Libro("345","cien",0);
        Libro Libro2 = new Libro("456","nueve",0);

        Tesis Tesis = new Tesis("567","doce",0);
        Tesis Tesis2 = new Tesis("678","el numero seis es el diablo loco",0);

        biblioteca.agregarRecurso(revista);
        biblioteca.agregarRecurso(revista2);
        biblioteca.agregarRecurso(Libro);
        biblioteca.agregarRecurso(Libro2);
        biblioteca.agregarRecurso(Tesis);
        biblioteca.agregarRecurso(Tesis2);
        System.out.println(biblioteca.prestar("345"));
        System.out.println(biblioteca.prestar("123"));
        System.out.println(biblioteca.prestar("234"));
        System.out.println(biblioteca.prestar("4756"));
        System.out.println(biblioteca.devolver("345"));
        System.out.println(biblioteca.fotocopiar("678"));
        System.out.println(biblioteca.fotocopiar("678"));
        System.out.println(biblioteca.fotocopiar("678"));
        biblioteca.listarPrestados();
        biblioteca.listarCopiasPorRecurso();
        //biblioteca.prestar("678");

    }
}
