package domain.actividad.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.ClienteId;

public class SubscripcionEliminada extends DomainEvent {
    private final ClienteId clienteId;

    public SubscripcionEliminada(ClienteId clienteId) {
        super("gym.actividad.actividadeliminada");
        this.clienteId = clienteId;
    }

    public ClienteId getClienteId() {
        return clienteId;
    }
}
