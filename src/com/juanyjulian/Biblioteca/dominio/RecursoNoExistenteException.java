package com.juanyjulian.Biblioteca.dominio;

public class RecursoNoExistenteException extends RuntimeException {
    public RecursoNoExistenteException(String codigo) {
        super("Recurso no encontrado \nCódigo usado : " + codigo);
    }
}
