package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Correo implements ValueObject<String> {
    private final String correo;

    public Correo(String correo) {
        this.correo = correo;
    }

    @Override
    public String value() {
        return null;
    }

    public String getCorreo() {
        return correo;
    }
}
