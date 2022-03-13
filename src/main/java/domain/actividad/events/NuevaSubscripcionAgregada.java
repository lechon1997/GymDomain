package domain.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.ClienteId;

public class NuevaSubscripcionAgregada extends DomainEvent {
    private final ClienteId clienteId;

    public NuevaSubscripcionAgregada(ClienteId clienteId) {
        super("gym.actividad.nuevasubscripcionagregada");
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
