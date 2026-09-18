package co.edu.uniquindio.poo.model;

public class configurarSonido implements IConfigurar{
    private final String sonido;

    public configurarSonido(String sonido) {
        this.sonido = sonido;
    }


    @Override
    public Object getValor() {
        return this.sonido;
    }

    @Override
    public String getClave() {
        return "Sonido";
    }
}
