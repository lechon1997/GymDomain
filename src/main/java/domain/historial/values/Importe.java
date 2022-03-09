package domain.historial.values;

import co.com.sofka.domain.generic.ValueObject;

public class Importe implements ValueObject<String> {
    private Double importe;

    public Importe(Double importe) {
        this.importe = importe;
    }

    @Override
    public String value() {
        return null;
    }

    public Double getImporte() {
        return importe;
    }
}
