package domain.actividad.values;

import co.com.sofka.domain.generic.ValueObject;

public class NombreActividad implements ValueObject<String> {
    private final String nombre;

    public NombreActividad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String value() {
        return null;
    }
}
