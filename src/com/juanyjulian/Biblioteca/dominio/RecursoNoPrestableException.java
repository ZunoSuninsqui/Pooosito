package com.juanyjulian.Biblioteca.dominio;

public class RecursoNoPrestableException extends RuntimeException{
    public RecursoNoPrestableException(String codigo){
        super ("El recurso de código : "+codigo+" No puede ser prestado");
    }
}
