package com.alejandro.taller.punto1.app;
import com.alejandro.taller.punto1.dominio.Contacto;

import java.util.ArrayList;
import java.util.List;
public class AppAgenda {
    public static void main(String[] args){
        Contacto alejandro = new Contacto("alejandro","Ramirez",3004123);
        Contacto Jhoana = new Contacto("Jhoana","Chabelo",300504121);
        List<Contacto> contactos = new ArrayList<>();
        contactos.add(alejandro);
        contactos.add(Jhoana);
        System.out.println(contactos.size());
        System.out.println(contactos);

        for (Contacto cc : contactos){
            System.out.println(cc.getNombre());
        }
    }

}
