package domain.actividad.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.LocalDate;

public class Fecha implements ValueObject<String> {
    private final LocalDate fecha;

    public Fecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    @Override
    public String value() {
        return null;
    }
}
