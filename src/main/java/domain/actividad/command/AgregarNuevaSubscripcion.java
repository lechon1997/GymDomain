package domain.actividad.command;

import co.com.sofka.domain.generic.Command;
import domain.actividad.values.ActividadId;
import domain.cliente.values.ClienteId;

public class AgregarNuevaSubscripcion extends Command {
    private final ActividadId actividadId;
    private final ClienteId clienteId;

    public AgregarNuevaSubscripcion(ActividadId actividadId, ClienteId clienteId) {
        this.actividadId = actividadId;
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }

    public ActividadId getActividadId() {
        return actividadId;
    }
}
