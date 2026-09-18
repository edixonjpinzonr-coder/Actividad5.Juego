package co.edu.uniquindio.poo.model;

public class ConfigurarIdioma implements IConfigurar {
    private final String idioma;

    public ConfigurarIdioma(String idioma) {
        this.idioma = idioma;
    }


    @Override
    public Object getValor() {
        return this.idioma;
    }

    @Override
    public String getClave() {
        return "Idioma";
    }
}
