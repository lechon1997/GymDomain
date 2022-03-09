package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Numero implements ValueObject<String> {
    private final String numero;

    public Numero(String numero) {
        this.numero = numero;
    }

    @Override
    public String value() {
        return null;
    }

    public String getNumero() {
        return numero;
    }
}
