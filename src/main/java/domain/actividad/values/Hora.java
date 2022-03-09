package domain.actividad.values;

import co.com.sofka.domain.generic.ValueObject;

public class Hora implements ValueObject<String> {
    private final Integer hora;
    private final Integer minuto;

    public Hora(Integer hora, Integer minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public Integer getHora() {
        return hora;
    }

    public Integer getMinuto() {
        return minuto;
    }

    @Override
    public String value() {
        return null;
    }
}
