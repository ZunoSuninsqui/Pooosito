package com.juanyjulian.Biblioteca.dominio;

public class RecursoNoCopiableException extends RuntimeException{
    public RecursoNoCopiableException(String codigo){
        super ("El recurso de código : "+codigo+" No puede ser copiado");
    }
}
