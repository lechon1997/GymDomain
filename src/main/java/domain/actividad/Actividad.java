package domain.actividad;

import co.com.sofka.domain.generic.AggregateEvent;
import domain.actividad.events.ActividadCreada;
import domain.actividad.values.ActividadId;
import domain.actividad.values.Descripcion;
import domain.actividad.values.Horario;
import domain.actividad.values.NombreActividad;
import domain.cliente.Cliente;
import domain.cliente.values.ClienteId;

import java.util.Map;

public class Actividad extends AggregateEvent<ActividadId> {
    protected NombreActividad nombreActividad;
    protected Descripcion descripcion;
    protected Horario horario;
    protected Map<ClienteId, Cliente> clientes;

    public Actividad(ActividadId entityId, NombreActividad nombreActividad, Descripcion descripcion, Horario horario) {
        super(entityId);
        appendChange(new ActividadCreada(nombreActividad,descripcion,horario)).apply();
    }

    private Actividad(ActividadId entityId){
        super(entityId);
        subscribe(new ActividadChange(this));
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
