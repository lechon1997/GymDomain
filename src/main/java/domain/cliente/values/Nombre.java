package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<String> {
    private String nombre;
    private String apellido;

    @Override
    public String value() {
        return null;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
}
