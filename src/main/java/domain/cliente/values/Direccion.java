package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;

public class Direccion implements ValueObject<String> {
    private final Calle calle1;
    private final Calle calle2;
    private final Numero nro;

    public Direccion(Calle calle1, Calle calle2, Numero nro) {
        this.calle1 = calle1;
        this.calle2 = calle2;
        this.nro = nro;
    }

    @Override
    public String value() {
        return null;
    }

    public Calle getCalle1() {
        return calle1;
    }

    public Calle getCalle2() {
        return calle2;
    }

    public Numero getNro() {
        return nro;
    }
}
