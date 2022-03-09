package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Calle implements ValueObject<String> {
    private final String calle;

    public Calle(String calle) {
        this.calle = calle;
    }

    @Override
    public String value() {
        return null;
    }

    public String getCalle() {
        return calle;
    }
}
