package domain.cliente.events;

import co.com.sofka.domain.generic.DomainEvent;
import domain.cliente.values.Registro;

public class RegistroHistorialAgregado extends DomainEvent {
    private final Registro registro;

    public RegistroHistorialAgregado(Registro registro) {
        super("gym.cliente.historialagregado");
        this.registro = registro;
    }

    public Registro getRegistro() {
        return registro;
    }
}
