package co.edu.uniquindio.poo.model;

import java.util.ArrayList;
import java.util.List;

public final class Juego {
    private String nombre;
    private List<Jugador> listaJugadores;
    public ConfiguracionGlobal configuracionGlobal;
    public IConfigurar iConfigurar;
    public static Juego instance;

    /**
     * metodo constructor de Juego
     * @param nombre de juego
     */
    public Juego(String nombre) {
        this.nombre = nombre;
        this.listaJugadores = new ArrayList<>();
        this.configuracionGlobal = configuracionGlobal;
    }

    /**
     * metodo para instanciar el juego
     * @return instancia de juego
     */
    public static Juego getInstance(){
        if(instance == null){
            instance = new Juego("dragon ball");
        }
       return instance;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(List<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    @Override
    public String toString() {
        return "Juego{" +
                "nombre='" + nombre + '\'' +
                ", listaJugadores=" + listaJugadores +
                ", configuracionGlobal=" + configuracionGlobal +
                ", iConfigurar=" + iConfigurar +
                '}';
    }

    /**
     * metodo para agregar jugadores al juego
     * @param jugador
     * @return lista de jugadores
     */
    public List<Jugador> registrarJugador(Jugador jugador) {
        if(jugador.getCodigo()!=null){
            boolean yaExiste = this.listaJugadores.stream().anyMatch(jugador1 -> jugador1.getCodigo().equals(jugador.getCodigo()));
            if(!yaExiste){
                listaJugadores.add(jugador);
            }else{
                System.out.println("Jugador existente");
            }
        }
        return listaJugadores;
    }

    /**
     * se aplican cambios al juego
     * @param opcion
     */

    public void cambiarConfiguracion(IConfigurar opcion) {
        ConfiguracionGlobal.getInstance().aplicarOpcion(opcion);
    }

    /**
     * inicializa el juego y muestra los datos
     * returna todos los datos actualizados
     */
    public void iniciarPartida() {
        ConfiguracionGlobal config = ConfiguracionGlobal.getInstance();
        System.out.println("iniciando juego: "+ nombre);
        System.out.println("Idioma actual: " + config.getOpcion("Idioma"));
        System.out.println("Dificultad actual: " + config.getOpcion("Dificultad"));
        System.out.println("Sonido actual: " + config.getOpcion("Sonido"));
        System.out.println("Jugadores conectados: " + listaJugadores.size());
    }
}

