package co.edu.uniquindio.poo.model;

import java.util.HashMap;
import java.util.Map;

public class ConfiguracionGlobal {
    private Map<String, Object> opciones;
    private static  ConfiguracionGlobal instance;

    /**
     * metodo de constructor de configuracion global
     *
     */
    public ConfiguracionGlobal() {
        this.opciones = new HashMap<>();
        this.opciones.put("Idioma", "Español");
        this.opciones.put("Sonido", "80");
        this.opciones.put("Dificultad", "Normal");

    }

    /**
     * crea la instancia de configuracion
     * @return instancia
     */
    public static ConfiguracionGlobal getInstance() {
        if (instance == null) {
            instance = new ConfiguracionGlobal();
        }
        return instance;
    }

    /**
     * metodo para aplicar los datos
     * @param opcion actualizado
     */
    public void aplicarOpcion(IConfigurar opcion) {
        if (opcion != null) {
            this.opciones.put(opcion.getClave(), opcion.getValor());
        }
    }

    public Object getOpcion(String clave) {
        return opciones.get(clave);
    }

    public Map<String, Object> getOpciones() {
        return opciones;
    }
}
