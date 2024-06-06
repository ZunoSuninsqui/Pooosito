package com.juanyjulian.Biblioteca.dominio;

public class RecursoNoPrestadoException extends RuntimeException {
    public RecursoNoPrestadoException(String codigo) {
        super("El recurso de código : " + codigo + " No puede ser evuelto ya que no fue prestado");
    }
}
