package domain.cliente.values;

import co.com.sofka.domain.generic.ValueObject;
import domain.actividad.values.ActividadId;

public class Registro implements ValueObject<String> {
    private final Importe importe;
    private final ActividadId actividadId;

    public Registro(Importe importe, ActividadId actividadId) {
        this.importe = importe;
        this.actividadId = actividadId;
    }

    public Importe getImporte() {
        return importe;
    }

    public ActividadId getActividadId() {
        return actividadId;
    }

    @Override
    public String value() {
        return null;
    }
}
