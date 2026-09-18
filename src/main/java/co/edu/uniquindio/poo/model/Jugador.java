package co.edu.uniquindio.poo.model;

public class Jugador {
    private String nombre;
    private String codigo;

    /**
     * metodo de constructor de jugador
     * @param nombre de jugador
     * @param codigo de jugador
     */
    public Jugador(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", codigo='" + codigo + '\'' +
                '}';
    }
}
