package co.edu.uniquindio.poo.model;

public class ConfigurarDificultad implements IConfigurar {
    private final String dificultad;

    public ConfigurarDificultad(String dificultad) {
        this.dificultad = dificultad;
    }


    @Override
    public Object getValor() {
          return this.dificultad;
    }

    @Override
    public String getClave() {
        return "Dificultad";
    }
}
