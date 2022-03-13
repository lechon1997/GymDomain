package domain.actividad;

import co.com.sofka.domain.generic.EventChange;
import domain.actividad.events.ActividadCreada;
import domain.actividad.events.NuevaSubscripcionAgregada;
import domain.actividad.events.SubscripcionEliminada;

import java.util.HashMap;
import java.util.HashSet;

public class ActividadChange extends EventChange {
    public ActividadChange(Actividad actividad){
        apply( (ActividadCreada event) ->{
                actividad.nombreActividad = event.getNombreActividad();
                actividad.descripcion = event.getDescripcion();
                actividad.horario = event.getHorario();
                actividad.clientes = new HashSet<>();
        });

        apply(((NuevaSubscripcionAgregada event) -> {
            actividad.clientes.add(event.getClienteId());
        }));

        apply((SubscripcionEliminada event) -> {
            actividad.clientes.remove(event.getClienteId());
        });

    }
}
