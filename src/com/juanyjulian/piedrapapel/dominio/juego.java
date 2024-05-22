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
        } else if(seleccion.equalsIgnoreCase("Pistola")) {
            return 4;
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
        }else if(seleccion==4) {
            return "Pistola";
        }
        return null;
    }
    public static String ganador(String seleccion){
        int numeroAleatorio = (int) (Math.random() * 4) + 1;
        System.out.println(numeroAleatorio);
        int resultado = ((selecToInt(seleccion)-numeroAleatorio)+3)%4;
        if (resultado == 2 && selecToInt(seleccion)==4 && numeroAleatorio==1 ){
            derrotasUser++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"!PERDISTE¡ :(";
        }
        else if (resultado == 1 && selecToInt(seleccion)==4 && numeroAleatorio==2 ){
            victoriasUser++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"!GANASTE¡";
        }else if (resultado == 3 && selecToInt(seleccion)==4 && numeroAleatorio==4 ){
            empates++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"Empate";
        } else if (resultado == 3 && selecToInt(seleccion)==3 && numeroAleatorio==3 ){
            empates++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"Empate";
        }else if (resultado == 2 && selecToInt(seleccion)==3 && numeroAleatorio==4 ){
            derrotasUser++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"!PERDISTE¡ :(";
        }else if (resultado == 3 && selecToInt(seleccion)==2 && numeroAleatorio==2 ){
            empates++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"Empate";
        }else if (resultado == 2 && selecToInt(seleccion)==3 && numeroAleatorio==4 ){
            derrotasUser++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"!PERDISTE¡ :(";
        }else if (resultado == 1 && selecToInt(seleccion)==1 && numeroAleatorio==3 ){
            victoriasUser++;
            return "Tu seleccionaste : "+seleccion+".\n"+"La computadora : "+intToSelec(numeroAleatorio)+".\n\n"+"Ganaste";
        }else if (resultado == 3 && selecToInt(seleccion)==1 && numeroAleatorio==1 ) {
            empates++;
            return "Tu seleccionaste : " + seleccion + ".\n" + "La computadora : " + intToSelec(numeroAleatorio) + ".\n\n" + "Empate";
        }else if (resultado==2){
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