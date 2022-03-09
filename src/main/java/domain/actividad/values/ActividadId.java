package domain.actividad.values;

import co.com.sofka.domain.generic.Identity;
import domain.cliente.values.ClienteId;

public class ActividadId extends Identity {
    public ActividadId(String uuid) {
        super(uuid);
    }

    public ActividadId() {
    }

    public static ActividadId of(String uuid){
        return new ActividadId();
    }
}
