package domain.actividad.command;

import co.com.sofka.domain.generic.Command;
import domain.actividad.values.ActividadId;
import domain.actividad.values.Descripcion;
import domain.actividad.values.Horario;
import domain.actividad.values.NombreActividad;

public class CrearActividad extends Command {
    private final ActividadId actividadId;
    private final NombreActividad nombreActividad;
    private final Descripcion descripcion;
    private final Horario horario;


    public CrearActividad(ActividadId actividadId, NombreActividad nombreActividad, Descripcion descripcion, Horario horario) {
        this.actividadId = actividadId;
        this.nombreActividad = nombreActividad;
        this.descripcion = descripcion;
        this.horario = horario;
    }

    public ActividadId getActividadId() {
        return actividadId;
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
