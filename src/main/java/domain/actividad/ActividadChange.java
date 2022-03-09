package domain.actividad;

import co.com.sofka.domain.generic.EventChange;
import domain.actividad.events.ActividadCreada;

import java.util.HashMap;

public class ActividadChange extends EventChange {
    public ActividadChange(Actividad actividad){
        apply( (ActividadCreada event) ->{
                actividad.nombreActividad = event.getNombreActividad();
                actividad.descripcion = event.getDescripcion();
                actividad.horario = event.getHorario();
                actividad.clientes = new HashMap<>();
        });

    }
}
