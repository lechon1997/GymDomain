package domain.actividad.command;

import co.com.sofka.domain.generic.Command;
import domain.actividad.values.ActividadId;
import domain.cliente.values.ClienteId;

public class EliminarSubscripcion extends Command {
    private final ActividadId actividadId;
    private final ClienteId clienteId;

    public EliminarSubscripcion(ActividadId actividadId, ClienteId clienteId) {
        this.actividadId = actividadId;
        this.clienteId = clienteId;
    }

    public ActividadId getActividadId() {
        return actividadId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
