package domain.historial;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.actividad.values.ActividadId;
import domain.historial.values.HistorialId;
import domain.historial.values.Importe;
import domain.historial.values.Registro;

import java.util.List;
import java.util.Objects;

public class Historial extends AggregateEvent<HistorialId> {
    protected List<Registro> registros;

    public Historial(HistorialId entityId) {
        super(entityId);
    }

    public void nuevoRegistro(Importe importe, ActividadId actividadId){
        Objects.requireNonNull(importe);
        Objects.requireNonNull(actividadId);
        //appendChange(new Registro(importe,actividadId)).apply();
    }
}
