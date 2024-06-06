package com.juanyjulian.Biblioteca.dominio;

public class RecursoPrestadoException extends RuntimeException{
    public RecursoPrestadoException(String codigo){
        super("El recurso de código : "+codigo+" ya fue prestado.");
    }
}
