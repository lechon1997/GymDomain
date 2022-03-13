package domain.actividad;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.actividad.events.ActividadCreada;
import domain.actividad.events.NuevaSubscripcionAgregada;
import domain.actividad.events.SubscripcionEliminada;
import domain.actividad.values.ActividadId;
import domain.actividad.values.Descripcion;
import domain.actividad.values.Horario;
import domain.actividad.values.NombreActividad;
import domain.cliente.Cliente;
import domain.cliente.values.ClienteId;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Actividad extends AggregateEvent<ActividadId> {
    protected NombreActividad nombreActividad;
    protected Descripcion descripcion;
    protected Horario horario;
    protected Set<ClienteId> clientes;

    public Actividad(ActividadId entityId, NombreActividad nombreActividad, Descripcion descripcion, Horario horario) {
        super(entityId);
        appendChange(new ActividadCreada(nombreActividad,descripcion,horario)).apply();
    }

    private Actividad(ActividadId entityId){
        super(entityId);
        subscribe(new ActividadChange(this));
    }

    public static Actividad from(ActividadId actividadId, List<DomainEvent> eventList){
        Actividad actividad = new Actividad(actividadId);
        eventList.forEach(actividad::applyEvent);

        return actividad;
    }

    public void nuevaSubscripcion(ClienteId clienteId){
        appendChange(new NuevaSubscripcionAgregada(clienteId)).apply();
    }

    public void eliminarSubscripcion(ClienteId clienteId){
        appendChange(new SubscripcionEliminada(clienteId)).apply();
    }

    public Set<ClienteId> listarSubscripcion(){
        return clientes;
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
