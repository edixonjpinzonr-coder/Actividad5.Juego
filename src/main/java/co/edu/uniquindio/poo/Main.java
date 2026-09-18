package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.model.*;

public class Main {
    public static void main(String[] args) {

        Juego juego = Juego.getInstance();
        juego.registrarJugador(new Jugador("Edixon", "10"));
        juego.iniciarPartida();

        System.out.println("\n--- Aplicando cambios de configuración ---");

        juego.cambiarConfiguracion(new ConfigurarIdioma("Inglés"));
        juego.cambiarConfiguracion(new ConfigurarDificultad("Dificil"));
        juego.cambiarConfiguracion(new configurarSonido("100"));
        juego.iniciarPartida();
    }
}
