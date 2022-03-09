package domain.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.actividad.values.Descripcion;
import domain.actividad.values.Horario;
import domain.actividad.values.NombreActividad;

public class ActividadCreada extends DomainEvent {
    private final NombreActividad nombreActividad;
    private final Descripcion descripcion;
    private final Horario horario;

    public ActividadCreada(NombreActividad nombreActividad, Descripcion descripcion, Horario horario) {
        super("gimnasio.actividad.actividadcreada");
        this.nombreActividad = nombreActividad;
        this.descripcion = descripcion;
        this.horario = horario;
    }

    public NombreActividad getNombreActividad() {
        return nombreActividad;
    }

    public Descripcion getDescripcion() {
        return descripcion;
    }

    public Horario getHorario() {
        return horario;
    }
}
