package com.juanyjulian.piedrapapel.dominio;

public class juego {
    private static int empates = 0;
    private static int victoriasUser = 0;
    private static int derrotasUser = 0;

    public static int getEmpates() {
        return empates;
    }
    public static int getVictoriasUser() {
        return victoriasUser;
    }
    public static int getDerrotasUser() {
        return derrotasUser;
    }
    public static int selecToInt(String seleccion){
        if (seleccion.equalsIgnoreCase("Piedra")){
            return 1;
        }else if(seleccion.equalsIgnoreCase("Papel")){
            return 2;
        }else if(seleccion.equalsIgnoreCase("Tijeras")) {
            return 3;
        }
        return 0;
    }
    public static String intToSelec(int seleccion){
        if (seleccion==1){
            return "Piedra";
        }else if(seleccion==2){
            return "Papel";
        }else if(seleccion==3) {
            return "Tijeras";
        }
        return null;
    }
    public static String ganador(String seleccion){
        int numeroAleatorio = (int) (Math.random() * 3) + 1;
        System.out.println(numeroAleatorio);
        int resultado = ((selecToInt(seleccion)-numeroAleatorio)+2)%3;
        if (resultado==2){
            empates++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"Empate";
        } else if (resultado == 0){
            victoriasUser++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"!GANASTE¡";
        } else{
            derrotasUser++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"!PERDISTE¡ :(";
        }
    }
}
