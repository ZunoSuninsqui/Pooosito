package com.juanyjulian.Biblioteca.dominio;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Recurso> Recursos;

    public Biblioteca() {
        this.Recursos = new ArrayList<>();
    }

    public void agregarRecurso(Recurso r) {
        boolean esta = false;
        for (Recurso rr : Recursos) {
            if (rr.codigo.equals(r.codigo)) {
                esta = true;
                break;
            }
        }
        if (!esta){
            Recursos.add(r);
        }else{
            System.out.println("El recurso ya se encuentra en el catalogo");
        }
    }
    public boolean prestar(String codigo){
        Recurso recursoEncontrado = null;
        recursoEncontrado = this.Recursos.stream()
                .filter(Recurso -> Recurso.codigo.equals(codigo))
                .findFirst()
                .orElseThrow(() -> new RecursoNoExistenteException(codigo));

        if (!(recursoEncontrado instanceof Prestable)){
            throw new RecursoNoPrestableException(codigo);
        } else if (recursoEncontrado.prestado){
            throw new RecursoPrestadoException(codigo);
        } else{
            ((Prestable) recursoEncontrado).prestar();
            return true;
        }

    }
    public boolean devolver(String codigo){
        Recurso recursoEncontrado = null;
        recursoEncontrado = this.Recursos.stream()
                .filter(Recurso -> Recurso.codigo.equals(codigo))
                .findFirst()
                .orElseThrow(() -> new RecursoNoExistenteException(codigo));
        if (!(recursoEncontrado instanceof Prestable)){
            throw new RecursoNoPrestableException(codigo);
        } else if (!recursoEncontrado.prestado){
            throw new RecursoNoPrestadoException(codigo);
        } else{
            ((Prestable) recursoEncontrado).devolver();
            return true;
        }
    }
    public boolean fotocopiar(String codigo){
        Recurso recursoEncontrado = null;
        recursoEncontrado = this.Recursos.stream()
                .filter(Recurso -> Recurso.codigo.equals(codigo))
                .findFirst()
                .orElseThrow(() -> new RecursoNoExistenteException(codigo));

        if (!(recursoEncontrado instanceof Copiable)){
            throw new RecursoNoCopiableException(codigo);
        } else if (recursoEncontrado instanceof Prestable && recursoEncontrado.prestado){
            throw new RecursoPrestadoException(codigo);
        } else{
            ((Copiable) recursoEncontrado).fotocopiar();
            return true;
        }
    }
    public void listarPrestados(){
        for(Recurso rr: Recursos){
            if(rr instanceof Prestable && rr.prestado){
                System.out.println(rr+" Se encuentra prestado ");
            }
        }
    }
    public void listarCopiasPorRecurso(){
        for(Recurso rr : Recursos){
            if (rr instanceof Copiable){
                System.out.println(rr.nombre+" se ha fotocopiado "+rr.nroCopias+" veces.");
            }
        }
    }
}
